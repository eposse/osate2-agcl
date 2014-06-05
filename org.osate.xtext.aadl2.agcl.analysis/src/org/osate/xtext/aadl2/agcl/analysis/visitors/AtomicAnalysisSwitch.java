package org.osate.xtext.aadl2.agcl.analysis.visitors;

import java.util.Map.Entry;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.ISerializer;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.DefaultAnnexSubclause;
import org.osate.aadl2.Element;
import org.osate.aadl2.modelsupport.modeltraversal.AadlProcessingSwitchWithProgress;
import org.osate.aadl2.util.Aadl2Switch;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause;
import org.osate.xtext.aadl2.agcl.agcl.AGCLBehaviour;
import org.osate.xtext.aadl2.agcl.agcl.AGCLContract;
import org.osate.xtext.aadl2.agcl.agcl.AgclFactory;
import org.osate.xtext.aadl2.agcl.agcl.AtomicProp;
import org.osate.xtext.aadl2.agcl.agcl.PSLBooleanExpression;
import org.osate.xtext.aadl2.agcl.agcl.PSLConjunction;
import org.osate.xtext.aadl2.agcl.agcl.PSLDisjunction;
import org.osate.xtext.aadl2.agcl.agcl.PSLExpression;
import org.osate.xtext.aadl2.agcl.agcl.PSLNegation;
import org.osate.xtext.aadl2.agcl.agcl.PSLSpec;
import org.osate.xtext.aadl2.agcl.agcl.util.AgclSwitch;
import org.osate.xtext.aadl2.agcl.analysis.AGCLAnalysisPlugin;
import org.osate.xtext.aadl2.agcl.analysis.util.AGCLSyntaxUtil;
import org.osate.xtext.aadl2.agcl.analysis.util.SetFactory;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Negative;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModelChecker;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Positive;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationResult;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersFactory;

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
 * @author Ernesto Posse
 *
 */
public class AtomicAnalysisSwitch extends AadlProcessingSwitchWithProgress {

	private AgclSwitch<Void> agclSwitch;
	private final ViewpointContext viewpointContext;
	private final AnalysisResults analysisResults;
	private final ISerializer serializer;
	private final ModelChecker checker;

	/**
	 * @param pm				a progress monitor
	 * @param viewpointContext	a viewpoint context specifying which viewpoints to verify
	 * @param analysisResults	an object to record the analysis results
	 */
	public AtomicAnalysisSwitch(IProgressMonitor pm, ViewpointContext viewpointContext, AnalysisResults analysisResults) {
		super(pm);
		this.viewpointContext = viewpointContext;
		this.analysisResults = analysisResults;
		this.serializer = AGCLAnalysisPlugin.getDefault().getSerializer();
		this.checker = AGCLAnalysisPlugin.getDefault().getActiveModelChecker();
	}

	@Override
	protected void initSwitches() {
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
						VerificationResult result = checkBehaviourSatisfiesContract(behaviour, contract, viewpointName, componentName);
						analysisResults.recordResult(viewpointName, componentName, result);
					}
				}
				//monitor.worked(1);
				return null;
			}
		};
		aadl2Switch = new Aadl2Switch<String>() {
			public String caseAnnexSubclause(AnnexSubclause obj) {
				monitor.subTask("AnnexSubclause " + obj.getName());
				Logger.getLogger(getClass()).debug("visiting: " + obj);
				if (obj instanceof DefaultAnnexSubclause) 
					return "";
				Logger.getLogger(getClass()).debug("visiting non-default annex subclause: " + obj);
				if (!(obj instanceof AGCLAnnexSubclause))
					return "";
				Logger.getLogger(getClass()).debug("visiting AGCL annex subclause: " + obj);
				if (obj.getName().equals("AGCL")) {
					agclSwitch.caseAGCLAnnexSubclause((AGCLAnnexSubclause) obj);
				}
				monitor.worked(1);
				return obj.toString();
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
	 * @param behaviour 	a temporal-logic specification of the behaviour of a thread implementation
	 * @param contract		an assume/guarantee contract 
	 * @return a {@link VerificationResult} which is {@link Positive} if the behaviour satisfies the
	 * 			contract, and {@link Negative} otherwise.
	 */
	public VerificationResult checkBehaviourSatisfiesContract(AGCLBehaviour behaviour, AGCLContract contract, String viewpointName, String componentName) {
		Logger.getLogger(getClass()).info("checking behaviour w.r.t. a contract");
		PSLSpec behaviourSpec  = behaviour.getSpec();
		PSLSpec assumptionSpec = contract.getAssumption().getSpec();
		PSLSpec guaranteeSpec  = contract.getGuarantee().getSpec();
		Logger.getLogger(getClass()).info("behaviour  = " + serializer.serialize(behaviourSpec));
		Logger.getLogger(getClass()).info("assumption = " + serializer.serialize(assumptionSpec));
		Logger.getLogger(getClass()).info("guarantee  = " + serializer.serialize(guaranteeSpec));
		PSLSpec combinedSpec = makeCombinedFormula(behaviourSpec, assumptionSpec, guaranteeSpec);
		Logger.getLogger(getClass()).debug("combined = " + serializer.serialize(combinedSpec));
		NuSMVModelChecker theChecker = (NuSMVModelChecker) checker;  // TODO: make it independent of NuSMV
		VerificationResult result = theChecker.checkSpecValidity(combinedSpec, "atomic_" + viewpointName + "_" + componentName);
		return result;
		
	}
	
	/**
	 * @param behaviourSpec     a PSL behaviour spec B
	 * @param assumptionSpec	a PSL assumption spec A
	 * @param guaranteeSpec		a PSL guarantee spec G
	 * @return a combined PSL spec of the form B && A -> G
	 */
	private PSLSpec makeCombinedFormula(PSLSpec behaviourSpec, PSLSpec assumptionSpec, PSLSpec guaranteeSpec) {
		PSLSpec newSpec = AgclFactory.eINSTANCE.createPSLSpec();
		PSLExpression newExpr = AgclFactory.eINSTANCE.createPSLExpression();
		PSLExpression behaviourExpr   = behaviourSpec.getExpr();
		PSLExpression assumptionrExpr = assumptionSpec.getExpr();
		PSLExpression guaranteeExpr   = guaranteeSpec.getExpr();
		PSLBooleanExpression behaviourBoolExpr   = AGCLSyntaxUtil.getBooleanExpressionFromExpression(behaviourExpr);
		PSLBooleanExpression assumptionrBoolExpr = AGCLSyntaxUtil.getBooleanExpressionFromExpression(assumptionrExpr);
		PSLBooleanExpression guaranteeBoolExpr   = AGCLSyntaxUtil.getBooleanExpressionFromExpression(guaranteeExpr);
		// Build "B & A -> G"
		// newCond = B & A
		PSLDisjunction newCond = AgclFactory.eINSTANCE.createPSLDisjunction();
		PSLConjunction newCondLeft = AgclFactory.eINSTANCE.createPSLConjunction();
		newCondLeft.getFactors().add(behaviourBoolExpr);
		newCondLeft.getFactors().add(assumptionrBoolExpr);
		// newCondLeft = 'B & A'
		newCond.getTerms().add(newCondLeft);
		// newCond = 'B & A'
		newExpr.setCondition(newCond);
		newExpr.setConclusion(guaranteeBoolExpr);
		newExpr.setImplication(true);
		// newExpr = 'B & A -> G'
		newSpec.setExpr(newExpr);
		return newSpec;
	}

}
