package org.osate.xtext.aadl2.agcl.analysis.algorithms;

import org.apache.log4j.Logger;
import org.eclipse.xtext.serializer.ISerializer;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAssumption;
import org.osate.xtext.aadl2.agcl.agcl.AGCLContract;
import org.osate.xtext.aadl2.agcl.agcl.AGCLGuarantee;
import org.osate.xtext.aadl2.agcl.agcl.AgclFactory;
import org.osate.xtext.aadl2.agcl.agcl.PSLExpression;
import org.osate.xtext.aadl2.agcl.agcl.PSLImplication;
import org.osate.xtext.aadl2.agcl.agcl.PSLSpec;
import org.osate.xtext.aadl2.agcl.analysis.AGCLAnalysisPlugin;
import org.osate.xtext.aadl2.agcl.analysis.util.AGCLSyntaxUtil;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModelChecker;
import org.osate.xtext.aadl2.agcl.analysis.visitors.ViewpointContext;

/**
 * This class is intended to provide common attributes and functionality for the concrete algorithm classes.
 * 
 * <p>The main method provided is {@link #checkContractRefinement(AGCLContract, AGCLContract, String, String)}.
 * 
 * @author Ernesto Posse
 *
 */
public abstract class AnalysisAlgorithmBase {

	protected final ViewpointContext viewpointContext;
	protected final ISerializer serializer;
	protected final ModelChecker checker;

	public AnalysisAlgorithmBase(ViewpointContext viewpointContext) {
		this.viewpointContext = viewpointContext;
		this.serializer = AGCLAnalysisPlugin.getDefault().getSerializer();
		this.checker = AGCLAnalysisPlugin.getDefault().getActiveModelChecker();
	}
	
	/**
	 * Checks whether a contract C1 is a refinement of another contract C2, this is, whether the following
	 * PSL specifications are valid:
	 * 
	 *  <p> A2 -> A1, and
	 *  <p> G1 -> G2
	 *  
	 *  <p>where A1 and A2 are the assumptions of C1 and C2 respectively, and G1 and G2 are their guarantees.
	 *  
	 *  <p> Note the implications are contra-variant on the assumptions and co-variant on the guarantees.
	 *  
	 *  <p> The result is collected in the model-checker's results collection ({@link ModelChecker#getResults()})
	 *  
	 * @param contract1		contract C1
	 * @param contract2		contract C2
	 * @param viewpointName	the name of the analysis viewpoint under verification
	 * @param componentName	the name of the component for which this analysis is being performed. Usually it should be
	 * 		the name of the component owning contract C1, for child/parent checks, or the name of the component
	 * 		that owns contract C2, for compositional analysis.
	 */
	public void checkContractRefinement(AGCLContract contract1, AGCLContract contract2, String viewpointName, String componentName) {
		AGCLAssumption assumption1 = contract1.getAssumption();
		AGCLAssumption assumption2 = contract2.getAssumption();
		AGCLGuarantee guarantee1 = contract1.getGuarantee();
		AGCLGuarantee guarantee2 = contract2.getGuarantee();
		PSLSpec assumption1spec = assumption1.getSpec();
		PSLSpec assumption2spec = assumption2.getSpec();
		PSLSpec guarantee1spec = guarantee1.getSpec();
		PSLSpec guarantee2spec = guarantee2.getSpec();
		Logger.getLogger(getClass()).debug("assumption1 = '" + serializer.serialize(assumption1spec) + " ast = " + AGCLSyntaxUtil.astStr(assumption1spec));
		Logger.getLogger(getClass()).debug("assumption2 = '" + serializer.serialize(assumption2spec) + " ast = " + AGCLSyntaxUtil.astStr(assumption2spec));
		Logger.getLogger(getClass()).debug("guarantee1 = '" + serializer.serialize(guarantee1spec) + " ast = " + AGCLSyntaxUtil.astStr(guarantee1spec));
		Logger.getLogger(getClass()).debug("guarantee2 = '" + serializer.serialize(guarantee2spec) + " ast = " + AGCLSyntaxUtil.astStr(guarantee2spec));
		PSLSpec assumptionsImplication = makeCombinedFormula(assumption2spec, assumption1spec);
		PSLSpec guaranteesImplication = makeCombinedFormula(guarantee1spec, guarantee2spec);
		NuSMVModelChecker theChecker = (NuSMVModelChecker) checker;  // TODO: make it independent of NuSMV
		Logger.getLogger(getClass()).debug("checking '" + serializer.serialize(assumptionsImplication) + "'");
		theChecker.checkSpecValidity(assumptionsImplication, viewpointName, componentName, "refinement_assumptions");
		Logger.getLogger(getClass()).debug("checking '" + serializer.serialize(guaranteesImplication) + "'");
		theChecker.checkSpecValidity(guaranteesImplication, viewpointName, componentName, "refinement_guarantees");
	}

	/**
	 * @param spec1	a PSL spec S1 
	 * @param spec2	a PSL spec S2
	 * @return a combined PSL spec of the form S1 -> S2
	 */
	private PSLSpec makeCombinedFormula(PSLSpec spec1, PSLSpec spec2) {
		PSLExpression expr1 = spec1.getExpr();
		PSLExpression expr2 = spec2.getExpr();
		PSLSpec newSpec = AgclFactory.eINSTANCE.createPSLSpec();
		PSLImplication newExpr = AgclFactory.eINSTANCE.createPSLImplication();
		newExpr.setLeft(expr1);
		newExpr.setRight(expr2);
		newSpec.setExpr(newExpr);
		return newSpec;
	}

}
