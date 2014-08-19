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
package org.osate.xtext.aadl2.agcl.analysis.visitors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osate.xtext.aadl2.agcl.agcl.AgclFactory;
import org.osate.xtext.aadl2.agcl.agcl.BooleanConstant;
import org.osate.xtext.aadl2.agcl.agcl.Input;
import org.osate.xtext.aadl2.agcl.agcl.Output;
import org.osate.xtext.aadl2.agcl.agcl.PSLAlways;
import org.osate.xtext.aadl2.agcl.agcl.PSLBiconditional;
import org.osate.xtext.aadl2.agcl.agcl.PSLConjunction;
import org.osate.xtext.aadl2.agcl.agcl.PSLDisjunction;
import org.osate.xtext.aadl2.agcl.agcl.PSLEventually;
import org.osate.xtext.aadl2.agcl.agcl.PSLExpression;
import org.osate.xtext.aadl2.agcl.agcl.PSLImplication;
import org.osate.xtext.aadl2.agcl.agcl.PSLNegation;
import org.osate.xtext.aadl2.agcl.agcl.PSLNext;
import org.osate.xtext.aadl2.agcl.agcl.PSLSpec;
import org.osate.xtext.aadl2.agcl.agcl.PSLUntil;
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
	
	public EObject caseBooleanConstant(BooleanConstant obj) {
		BooleanConstant newConst = AgclFactory.eINSTANCE.createBooleanConstant();
		newConst.setVal(obj.getVal());
		return newConst;
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
		PSLExpression subTerm = obj.getSubterm();
		PSLExpression newSubTerm = (PSLExpression) doSwitch(subTerm); 
		newObj.setSubterm(newSubTerm);
		return newObj;
	}
	
	public EObject casePSLNext(PSLNext obj) {
		PSLNext newObj = AgclFactory.eINSTANCE.createPSLNext();
		PSLExpression subTerm = obj.getSubterm();
		PSLExpression newSubTerm = (PSLExpression) doSwitch(subTerm); 
		newObj.setSubterm(newSubTerm);
		return newObj;
	}
	
	public EObject casePSLEventually(PSLEventually obj) {
		PSLEventually newObj = AgclFactory.eINSTANCE.createPSLEventually();
		PSLExpression subTerm = obj.getSubterm();
		PSLExpression newSubTerm = (PSLExpression) doSwitch(subTerm); 
		newObj.setSubterm(newSubTerm);
		return newObj;
	}
	
	public EObject casePSLAlways(PSLAlways obj) {
		PSLAlways newObj = AgclFactory.eINSTANCE.createPSLAlways();
		PSLExpression subTerm = obj.getSubterm();
		PSLExpression newSubTerm = (PSLExpression) doSwitch(subTerm); 
		newObj.setSubterm(newSubTerm);
		return newObj;
	}
	
	public EObject casePSLUntil(PSLUntil obj) {
		PSLUntil newObj = AgclFactory.eINSTANCE.createPSLUntil();
		PSLExpression left = obj.getLeft();
		PSLExpression right = obj.getRight();
		PSLExpression newLeft = (PSLExpression) doSwitch(left);
		PSLExpression newRight = (PSLExpression) doSwitch(right);
		newObj.setLeft(newLeft);
		newObj.setRight(newRight);
		return newObj;
	}
	
	public EObject casePSLConjunction(PSLConjunction obj) {
		PSLConjunction newObj = AgclFactory.eINSTANCE.createPSLConjunction();
		PSLExpression left = obj.getLeft();
		PSLExpression right = obj.getRight();
		PSLExpression newLeft = (PSLExpression) doSwitch(left);
		PSLExpression newRight = (PSLExpression) doSwitch(right);
		newObj.setLeft(newLeft);
		newObj.setRight(newRight);
		return newObj;
	}

	public EObject casePSLDisjunction(PSLDisjunction obj) {
		PSLDisjunction newObj = AgclFactory.eINSTANCE.createPSLDisjunction();
		PSLExpression left = obj.getLeft();
		PSLExpression right = obj.getRight();
		PSLExpression newLeft = (PSLExpression) doSwitch(left);
		PSLExpression newRight = (PSLExpression) doSwitch(right);
		newObj.setLeft(newLeft);
		newObj.setRight(newRight);
		return newObj;
	}
	
	public EObject casePSLImplication(PSLImplication obj) {
		PSLImplication newObj = AgclFactory.eINSTANCE.createPSLImplication();
		PSLExpression left = obj.getLeft();
		PSLExpression right = obj.getRight();
		PSLExpression newLeft = (PSLExpression) doSwitch(left);
		PSLExpression newRight = (PSLExpression) doSwitch(right);
		newObj.setLeft(newLeft);
		newObj.setRight(newRight);
		return newObj;
	}

	public EObject casePSLBiconditional(PSLBiconditional obj) {
		PSLBiconditional newObj = AgclFactory.eINSTANCE.createPSLBiconditional();
		PSLExpression left = obj.getLeft();
		PSLExpression right = obj.getRight();
		PSLExpression newLeft = (PSLExpression) doSwitch(left);
		PSLExpression newRight = (PSLExpression) doSwitch(right);
		newObj.setLeft(newLeft);
		newObj.setRight(newRight);
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
