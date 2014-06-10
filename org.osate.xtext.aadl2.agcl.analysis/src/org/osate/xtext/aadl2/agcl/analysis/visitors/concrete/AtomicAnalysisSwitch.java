package org.osate.xtext.aadl2.agcl.analysis.visitors.concrete;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.aadl2.Classifier;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause;
import org.osate.xtext.aadl2.agcl.agcl.AGCLBehaviour;
import org.osate.xtext.aadl2.agcl.agcl.AGCLContract;
import org.osate.xtext.aadl2.agcl.agcl.AgclFactory;
import org.osate.xtext.aadl2.agcl.agcl.PSLConjunction;
import org.osate.xtext.aadl2.agcl.agcl.PSLExpression;
import org.osate.xtext.aadl2.agcl.agcl.PSLImplication;
import org.osate.xtext.aadl2.agcl.agcl.PSLSpec;
import org.osate.xtext.aadl2.agcl.agcl.util.AgclSwitch;
import org.osate.xtext.aadl2.agcl.analysis.util.AGCLSyntaxUtil;
import org.osate.xtext.aadl2.agcl.analysis.util.AGCLUtil;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModelChecker;
import org.osate.xtext.aadl2.agcl.analysis.visitors.CommonAGCLAnalysisSwitch;
import org.osate.xtext.aadl2.agcl.analysis.visitors.ViewpointContext;

/**
 * This class implements the main algorithm for A/G analysis of atomic capsules, i.e. thread 
 * implementations.
 *  
 * <p>A thread implementation must have an AGCL annex with a 'behaviour' clause B and a 'contract' clause C with 
 * assumption A and guarantee G, all given as PSL expressions. 
 * 
 * <p> The analysis performed by this class consists of verifying that the behaviour B satisfies the 
 * contract C. This is done by constructing the formula
 * 
 * <p>
 *      B & A -> G
 * 
 * <p>(B and A imply G). Then, this formula is sent to a model-checker to verify if it is a *valid* formula,
 * i.e., true in every possible model (execution). Validity checking is performed by giving the model-checker
 * a "universal model" that contains all possible executions. 
 * 
 * <p>Note: The default model-checker used is NuSMV, which has limited support for PSL: NuSMV translates PSL
 * formulas into LTL formulas, but since PSL is strictly more expressive than LTL, some PSL formulas may not
 * be checked or may give incorrect results.
 * 
 * <p>This analysis, and in particular the {@link #checkBehaviourSatisfiesContract(AGCLBehaviour, AGCLContract, String, String)}
 * implements Algorithm 4 of 
 * 
 * <p> Ernesto Posse, <em>Contract-based compositional analysis for reactive systems in RTEdge, an
 * AADL-based language</em>, Technical Report 2013-607, School of Computing, Queen's University. Sept. 2013.
 * <a href="http://sites.cs.queensu.ca/tr/">http://sites.cs.queensu.ca/tr/</a>
 * 
 * @author Ernesto Posse
 *
 */
public class AtomicAnalysisSwitch extends CommonAGCLAnalysisSwitch {

	/**
	 * @param pm				a progress monitor
	 * @param viewpointContext	a viewpoint context specifying which viewpoints to verify
	 */
	public AtomicAnalysisSwitch(IProgressMonitor pm, ViewpointContext viewpointContext) {
		super(pm, viewpointContext);
	}
//	public AtomicAnalysisSwitch(IProgressMonitor pm, ViewpointContext viewpointContext, AnalysisResults analysisResults) {
//		super(pm, viewpointContext, analysisResults);
//	}

	@Override
	protected void initAGCLSwitch() {
		agclSwitch = new AgclSwitch<Void>() {
			public Void caseAGCLAnnexSubclause(AGCLAnnexSubclause obj) {
				//monitor.subTask("AGCLAnnexSubclause" + obj.getName());
				Classifier component = obj.getContainingClassifier();
				String componentName = component.getName();
				Logger.getLogger(getClass()).info("processing AGCL annex subclause for '" + componentName + "'");
				// Get the component's behaviour specified in this annex sub-clause
				AGCLBehaviour behaviour = obj.getBehaviour();
				// Go through all contracts in this annex  sub-clause...
				for (AGCLContract contract : obj.getContracts()) {
					String viewpointName = contract.getName();
					if (viewpointContext.containsViewpointToVerify(viewpointName)) {
						// We verify only the contracts which belong to a viewpoint marked for verification 
//						VerificationResult result = checkBehaviourSatisfiesContract(behaviour, contract, viewpointName, componentName);
//						analysisResults.recordResult(viewpointName, componentName, result);
						checkBehaviourSatisfiesContract(behaviour, contract, viewpointName, componentName);
					}
				}
				//monitor.worked(1);
				return null;
			}
		};
	}
	
	/**
	 * Checks whether a behaviour B, given as a temporal-logic (PSL) specification, satisfies the given
	 * contract C with assumption A and guarantee G (also temporal-logic specifications).
	 * 
	 * <p> This verification is realized by verifying that the formula:
	 * 
	 * <p> B & A -> G
	 * 
	 * <p>is a *valid* formula in the temporal-logic, i.e., that it holds for all models. Validity
	 * checking is performed by model-checking the formula for a <em>universal model</em>, a model that
	 * contains all possible behaviours. 
	 * 
	 * <p>This method implements, roughly (*), Algorithm 4 of 
	 * 
	 * <p> Ernesto Posse, <em>Contract-based compositional analysis for reactive systems in RTEdge, an
	 * AADL-based language</em>, Technical Report 2013-607, School of Computing, Queen's University. Sept. 2013.
	 * <a href="http://sites.cs.queensu.ca/tr/">http://sites.cs.queensu.ca/tr/</a>
	 * 
	 * <p>(*) In the Tech. Report the input to the algorithm is an implementation of the component, which then
	 * is translated into a behaviour specification in PSL. Here we already get that behaviour as input.
	 * 
	 * @param behaviour 	a temporal-logic specification of the behaviour of a thread implementation
	 * @param contract		an assume/guarantee contract 
	 */
	public void checkBehaviourSatisfiesContract(AGCLBehaviour behaviour, AGCLContract contract, String viewpointName, String componentName) {
		Logger.getLogger(getClass()).info("checking behaviour w.r.t. a contract");
		PSLSpec behaviourSpec  = behaviour.getSpec();
		PSLSpec assumptionSpec = contract.getAssumption().getSpec();
		PSLSpec guaranteeSpec  = contract.getGuarantee().getSpec();
		Logger.getLogger(getClass()).info("behaviour  = '" + serializer.serialize(behaviourSpec) + "' ast = " + AGCLSyntaxUtil.astStr(behaviourSpec));
		Logger.getLogger(getClass()).info("assumption = '" + serializer.serialize(assumptionSpec) + "' ast = " + AGCLSyntaxUtil.astStr(assumptionSpec));
		Logger.getLogger(getClass()).info("guarantee  = '" + serializer.serialize(guaranteeSpec) + "' ast = " + AGCLSyntaxUtil.astStr(guaranteeSpec));
		PSLSpec combinedSpec = makeCombinedFormula(behaviourSpec, assumptionSpec, guaranteeSpec);
		Logger.getLogger(getClass()).debug("combined = '" + serializer.serialize(combinedSpec) + "' ast = " + AGCLSyntaxUtil.astStr(combinedSpec));
		NuSMVModelChecker theChecker = (NuSMVModelChecker) checker;  // TODO: make it independent of NuSMV
		theChecker.checkSpecValidity(combinedSpec, viewpointName, componentName, "atomic");
	}
	
	/**
	 * @param behaviourSpec     a PSL behaviour spec B
	 * @param assumptionSpec	a PSL assumption spec A
	 * @param guaranteeSpec		a PSL guarantee spec G
	 * @return a combined PSL spec of the form B && A -> G
	 */
	private PSLSpec makeCombinedFormula(PSLSpec behaviourSpec, PSLSpec assumptionSpec, PSLSpec guaranteeSpec) {
		PSLExpression behaviourExpr   = behaviourSpec.getExpr();
		PSLExpression assumptionrExpr = assumptionSpec.getExpr();
		PSLExpression guaranteeExpr   = guaranteeSpec.getExpr();
		PSLSpec newSpec = AgclFactory.eINSTANCE.createPSLSpec();
		PSLImplication newExpr = AgclFactory.eINSTANCE.createPSLImplication();
		PSLConjunction newPremise = AgclFactory.eINSTANCE.createPSLConjunction();
		newPremise.setLeft(behaviourExpr);
		newPremise.setRight(assumptionrExpr);
		newExpr.setLeft(newPremise);
		newExpr.setRight(guaranteeExpr);
		newSpec.setExpr(newExpr);
		return newSpec;
	}

}