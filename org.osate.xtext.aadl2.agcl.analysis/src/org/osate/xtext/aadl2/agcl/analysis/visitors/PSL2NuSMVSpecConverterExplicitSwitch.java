/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.visitors;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osate.xtext.aadl2.agcl.agcl.AgclFactory;
import org.osate.xtext.aadl2.agcl.agcl.Input;
import org.osate.xtext.aadl2.agcl.agcl.Output;
import org.osate.xtext.aadl2.agcl.agcl.PSLAtom;
import org.osate.xtext.aadl2.agcl.agcl.PSLBooleanExpression;
import org.osate.xtext.aadl2.agcl.agcl.PSLConjunction;
import org.osate.xtext.aadl2.agcl.agcl.PSLDisjunction;
import org.osate.xtext.aadl2.agcl.agcl.PSLExpression;
import org.osate.xtext.aadl2.agcl.agcl.PSLNegation;
import org.osate.xtext.aadl2.agcl.agcl.PSLSpec;
import org.osate.xtext.aadl2.agcl.agcl.Var;

/**
 * @author Ernesto Posse
 *
 */
public class PSL2NuSMVSpecConverterExplicitSwitch extends
		AgclProcessingSwitch<EObject> {

	public EObject defaultCase(EObject obj) {
		return EcoreUtil.copy(obj);
	}

	public EObject caseVar(Var ap) {
		Var newVar = AgclFactory.eINSTANCE.createVar();
		newVar.setName(ap.getName());
		return newVar;
	}
	
	public EObject caseInput(Input ap) {
		String result = "in_" + ap.getLink() + "_" + ap.getEvent();
		Var newVar = AgclFactory.eINSTANCE.createVar();
		newVar.setName(result);
		Logger.getLogger(getClass()).debug(result);
		return newVar;
	}
	
	public EObject caseOutput(Output ap) {
		String result = "out_" + ap.getLink() + "_" + ap.getEvent();
		Var newVar = AgclFactory.eINSTANCE.createVar();
		newVar.setName(result);
		Logger.getLogger(getClass()).debug(result);
		return newVar;
	}
	
	public EObject casePSLNegation(PSLNegation obj) {
		PSLNegation newObj = AgclFactory.eINSTANCE.createPSLNegation();
		PSLBooleanExpression subTerm = obj.getNegated(); 
		PSLBooleanExpression newSubTerm = (PSLBooleanExpression) doSwitch(subTerm); 
		newObj.setNegated(newSubTerm);
		return newObj;
	}
	
	public EObject casePSLConjunction(PSLConjunction obj) {
		PSLConjunction newObj = AgclFactory.eINSTANCE.createPSLConjunction();
		for (PSLAtom subTerm : obj.getFactors()) {
			PSLAtom newAtom = (PSLAtom) doSwitch(subTerm);
			newObj.getFactors().add(newAtom);			
		}
		return newObj;
	}

	public EObject casePSLDisjunction(PSLDisjunction obj) {
		PSLDisjunction newObj = AgclFactory.eINSTANCE.createPSLDisjunction();
		for (PSLConjunction subTerm : obj.getTerms()) {
			PSLConjunction newPSLConjunction = (PSLConjunction) doSwitch(subTerm);
			newObj.getTerms().add(newPSLConjunction);			
		}
		return newObj;
	}
	
	public EObject casePSLExpression(PSLExpression obj) {
		PSLExpression newObj = AgclFactory.eINSTANCE.createPSLExpression();
		PSLBooleanExpression condition = obj.getCondition();
		PSLBooleanExpression newCondition = (PSLBooleanExpression) doSwitch(condition); 
		newObj.setCondition(newCondition);
		newObj.setImplication(false);
		newObj.setBiconditional(false);
		if (obj.isImplication()) {
			newObj.setImplication(true);
			PSLBooleanExpression conclusion = obj.getConclusion();
			PSLBooleanExpression newConclusion = (PSLBooleanExpression) doSwitch(conclusion);
			newObj.setConclusion(newConclusion);
		}
		else if (obj.isBiconditional()) {
			newObj.setBiconditional(true);
			PSLBooleanExpression other = obj.getOther();
			PSLBooleanExpression newOther = (PSLBooleanExpression) doSwitch(other);
			newObj.setOther(newOther);
		}
		return newObj;
	}
	
	public EObject casePSLSpec(PSLSpec obj) {
		PSLSpec newObj = AgclFactory.eINSTANCE.createPSLSpec();
		PSLExpression expr = obj.getExpr();
		PSLExpression newExpr = (PSLExpression) doSwitch(expr);
		newObj.setExpr(newExpr);
		return newObj;
	}
	
}
