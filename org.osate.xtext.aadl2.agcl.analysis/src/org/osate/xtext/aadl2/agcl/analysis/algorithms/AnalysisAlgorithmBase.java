/**
 * Copyright (c) 2014 Ernesto Posse
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 * @author Ernesto Posse
 * @version 0.1 
 */
package org.osate.xtext.aadl2.agcl.analysis.algorithms;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.xtext.serializer.ISerializer;
import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.ComponentImplementation;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAssumption;
import org.osate.xtext.aadl2.agcl.agcl.AGCLContract;
import org.osate.xtext.aadl2.agcl.agcl.AGCLGuarantee;
import org.osate.xtext.aadl2.agcl.agcl.AgclFactory;
import org.osate.xtext.aadl2.agcl.agcl.BooleanConstant;
import org.osate.xtext.aadl2.agcl.agcl.PSLConjunction;
import org.osate.xtext.aadl2.agcl.agcl.PSLExpression;
import org.osate.xtext.aadl2.agcl.agcl.PSLImplication;
import org.osate.xtext.aadl2.agcl.agcl.PSLSpec;
import org.osate.xtext.aadl2.agcl.analysis.AGCLAnalysisPlugin;
import org.osate.xtext.aadl2.agcl.analysis.util.AGCLSyntaxUtil;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModelChecker;
import org.osate.xtext.aadl2.agcl.analysis.visitors.ViewpointContext;
import org.osate.xtext.aadl2.agcl.analysis.visitors.concrete.PSLTransformAssumptionAtomicPropositionsSwitch;
import org.osate.xtext.aadl2.agcl.analysis.visitors.concrete.PSLTransformGuaranteeAtomicPropositionsSwitch;

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
	 * @param contract1		contract C1 of component1
	 * @param contract2		contract C2 of component2
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
		PSLSpec assumption1spec = AGCLSyntaxUtil.deepCopy(assumption1.getSpec());
		PSLSpec assumption2spec = AGCLSyntaxUtil.deepCopy(assumption2.getSpec());
		PSLSpec guarantee1spec = AGCLSyntaxUtil.deepCopy(guarantee1.getSpec());
		PSLSpec guarantee2spec = AGCLSyntaxUtil.deepCopy(guarantee2.getSpec());
		Logger.getLogger(getClass()).debug("assumption1 = '" + serializer.serialize(assumption1spec) + " ast = " + AGCLSyntaxUtil.astStr(assumption1spec));
		Logger.getLogger(getClass()).debug("assumption2 = '" + serializer.serialize(assumption2spec) + " ast = " + AGCLSyntaxUtil.astStr(assumption2spec));
		Logger.getLogger(getClass()).debug("guarantee1 = '" + serializer.serialize(guarantee1spec) + " ast = " + AGCLSyntaxUtil.astStr(guarantee1spec));
		Logger.getLogger(getClass()).debug("guarantee2 = '" + serializer.serialize(guarantee2spec) + " ast = " + AGCLSyntaxUtil.astStr(guarantee2spec));

//		The following commented lines were supposed to adjust the atomic propositions of specs, but that is only necessary for composite analysis.

//		ComponentClassifier container = getContainingComponent(component1);
//		PSLSpec adjustedAssumption1spec = adjustAssumption(component1, container, assumption1spec);
//		PSLSpec adjustedGuarantee1spec = adjustGuarantee(component1, container, guarantee1spec);
//		PSLSpec adjustedAssumption2spec = adjustAssumption(component1, container, assumption2spec);
//		PSLSpec adjustedGuarantee2spec = adjustGuarantee(component1, container, guarantee2spec);
//		Logger.getLogger(getClass()).info("adjusted assumption1 = '" + serializer.serialize(adjustedAssumption1spec) + "' ast = " + AGCLSyntaxUtil.astStr(adjustedAssumption1spec));
//		Logger.getLogger(getClass()).info("adjusted assumption2 = '" + serializer.serialize(adjustedAssumption2spec) + "' ast = " + AGCLSyntaxUtil.astStr(adjustedAssumption2spec));
//		Logger.getLogger(getClass()).info("adjusted guarantee1  = '" + serializer.serialize(adjustedGuarantee1spec) + "' ast = " + AGCLSyntaxUtil.astStr(adjustedGuarantee1spec));
//		Logger.getLogger(getClass()).info("adjusted guarantee2  = '" + serializer.serialize(adjustedGuarantee2spec) + "' ast = " + AGCLSyntaxUtil.astStr(adjustedGuarantee2spec));
//
//		PSLSpec assumptionsImplication = makeImplication(adjustedAssumption2spec, adjustedAssumption1spec);
//		PSLSpec guaranteesImplication = makeImplication(adjustedGuarantee1spec, adjustedGuarantee2spec);

		PSLSpec assumptionsImplication = makeImplication(assumption2spec, assumption1spec);
		PSLSpec guaranteesImplication = makeImplication(guarantee1spec, guarantee2spec);
		PSLSpec combined = makeConjunction(assumptionsImplication, guaranteesImplication);
		NuSMVModelChecker theChecker = (NuSMVModelChecker) checker;  // TODO: make it independent of NuSMV
		Logger.getLogger(getClass()).debug("checking '" + serializer.serialize(combined) + "'");
		theChecker.checkSpecValidity(combined, viewpointName, componentName, "refinement");
	}

	/**
	 * @param spec1	a PSL spec S1 
	 * @param spec2	a PSL spec S2
	 * @return a combined PSL spec of the form S1 -> S2
	 */
	protected PSLSpec makeImplication(PSLSpec spec1, PSLSpec spec2) {
		PSLExpression expr1 = spec1.getExpr();
		PSLExpression expr2 = spec2.getExpr();
		PSLSpec newSpec = AgclFactory.eINSTANCE.createPSLSpec();
		PSLImplication newExpr = AgclFactory.eINSTANCE.createPSLImplication();
		newExpr.setLeft(expr1);
		newExpr.setRight(expr2);
		newSpec.setExpr(newExpr);
		return newSpec;
	}
	
	/**
	 * @param spec1	a PSL spec S1 
	 * @param spec2	a PSL spec S2
	 * @return a combined PSL spec of the form S1 & S2
	 */
	protected PSLSpec makeConjunction(PSLSpec spec1, PSLSpec spec2) {
		PSLExpression expr1 = spec1.getExpr();
		PSLExpression expr2 = spec2.getExpr();
		PSLSpec newSpec = AgclFactory.eINSTANCE.createPSLSpec();
		PSLConjunction newExpr = AgclFactory.eINSTANCE.createPSLConjunction();
		newExpr.setLeft(expr1);
		newExpr.setRight(expr2);
		newSpec.setExpr(newExpr);
		return newSpec;
	}
	
	/**
	 * @param specs	a list of PSL specs S1, S2, ..., Sn
	 * @return a combined PSL spec of the form ( ...((S1 & S2) & ... ) & Sn
	 */
	protected PSLSpec makeNaryConjunction(List<PSLSpec> specs) {
		PSLSpec newSpec = AgclFactory.eINSTANCE.createPSLSpec();
		List<PSLExpression> expressions = new ArrayList<PSLExpression>();
		for (PSLSpec spec : specs) {
			expressions.add(spec.getExpr());
		}
		PSLExpression newExpr = makeNaryExprConjunction(expressions);
		newSpec.setExpr(newExpr);
		return newSpec;
	}

	protected PSLExpression makeNaryExprConjunction(List<PSLExpression> expressions) {
		if (expressions.isEmpty()) {
			BooleanConstant newConstant = AgclFactory.eINSTANCE.createBooleanConstant();
			newConstant.setVal("TRUE");
			return newConstant;
		}
		else if (expressions.size() == 1) {
			return AGCLSyntaxUtil.deepCopy(expressions.get(0));   // should I deep copy?
		}
		else {
			PSLExpression newExpr = AGCLSyntaxUtil.deepCopy(expressions.get(0));
			for (PSLExpression subexpression : expressions.subList(1, expressions.size())) {
				PSLConjunction newConjunction = AgclFactory.eINSTANCE.createPSLConjunction();
				newConjunction.setLeft(newExpr);
				newConjunction.setRight(AGCLSyntaxUtil.deepCopy(subexpression));
				newExpr = newConjunction;
			}
			return newExpr;
		}
	}

	/**
	 * Transforms an assumption specification's atomic propositions to refer to connectors instead of ports.
	 * @param component		the classifier context
	 * @param pslSpec		a PSL specification according to the AGCL meta-model
	 * @return a copy of the transformed spec.
	 */
	public PSLSpec adjustAssumption(ComponentClassifier component, ComponentImplementation container, PSLSpec assumptionSpec) {
		PSLTransformAssumptionAtomicPropositionsSwitch transformer = 
				new PSLTransformAssumptionAtomicPropositionsSwitch(component, container);
		return (PSLSpec) transformer.doSwitch(assumptionSpec);
	}

	/**
	 * Transforms a guarantee specification's atomic propositions to refer to connectors instead of ports.
	 * @param component		the classifier context
	 * @param pslSpec		a PSL specification according to the AGCL meta-model
	 * @return a copy of the transformed spec.
	 */
	public PSLSpec adjustGuarantee(ComponentClassifier component, ComponentImplementation container, PSLSpec guaranteeSpec) {
		PSLTransformGuaranteeAtomicPropositionsSwitch transformer = 
				new PSLTransformGuaranteeAtomicPropositionsSwitch(component, container);
		return (PSLSpec) transformer.doSwitch(guaranteeSpec);
	}

}
