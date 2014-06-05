/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.visitors;

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
 * This class implements the core of any homomorphic map over PSL expressions. 
 * Subclasses should override the caseX methods for specific constructs.
 * 
 * @author Ernesto Posse
 *
 */
public class PSLHomomorphismExplicitSwitch extends AgclProcessingSwitch<EObject> {

	public EObject defaultCase(EObject obj) {
		return EcoreUtil.copy(obj);
	}

	public EObject caseVar(Var ap) {
		Var newVar = AgclFactory.eINSTANCE.createVar();
		newVar.setName(ap.getName());
		return newVar;
	}
	
	public EObject caseInput(Input ap) {
		Input newInput = AgclFactory.eINSTANCE.createInput();
		newInput.setLink(ap.getLink());
		newInput.setEvent(ap.getEvent());
		return newInput;
	}
	
	public EObject caseOutput(Output ap) {
		Output newOutput = AgclFactory.eINSTANCE.createOutput();
		newOutput.setLink(ap.getLink());
		newOutput.setEvent(ap.getEvent());
		return newOutput;
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
