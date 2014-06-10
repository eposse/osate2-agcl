/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.visitors;

import org.osate.xtext.aadl2.agcl.agcl.BooleanConstant;
import org.osate.xtext.aadl2.agcl.agcl.Input;
import org.osate.xtext.aadl2.agcl.agcl.Output;
import org.osate.xtext.aadl2.agcl.agcl.PSLAlways;
import org.osate.xtext.aadl2.agcl.agcl.PSLBiconditional;
import org.osate.xtext.aadl2.agcl.agcl.PSLConjunction;
import org.osate.xtext.aadl2.agcl.agcl.PSLDisjunction;
import org.osate.xtext.aadl2.agcl.agcl.PSLEventually;
import org.osate.xtext.aadl2.agcl.agcl.PSLImplication;
import org.osate.xtext.aadl2.agcl.agcl.PSLNegation;
import org.osate.xtext.aadl2.agcl.agcl.PSLNext;
import org.osate.xtext.aadl2.agcl.agcl.PSLSpec;
import org.osate.xtext.aadl2.agcl.agcl.PSLUntil;
import org.osate.xtext.aadl2.agcl.agcl.Var;

/**
 * This class is intended to return a serialized version of the AST of a PSL formula.
 * 
 * @author Ernesto Posse
 *
 */
public class PSLASTPrinter extends AgclProcessingSwitch<String> {

	
	public String caseBooleanConstant(BooleanConstant obj) {
		return obj.getVal();
	}

	public String caseVar(Var ap) {
		return "Var('" + ap.getName() + "')";
	}
	
	public String caseInput(Input ap) {
		return "Input('" + ap.getLink() + "', '" + ap.getEvent() + "')";
	}
	
	public String caseOutput(Output ap) {
		return "Output('" + ap.getLink() + "', '" + ap.getEvent() + "')";
	}
	
	public String casePSLNegation(PSLNegation obj) {
		 return "Negation(" + doSwitch(obj.getSubterm()) + ")"; 
	}
	
	public String casePSLNext(PSLNext obj) {
		 return "Next(" + doSwitch(obj.getSubterm()) + ")"; 
	}
	
	public String casePSLEventually(PSLEventually obj) {
		 return "Eventually(" + doSwitch(obj.getSubterm()) + ")"; 
	}
	
	public String casePSLAlways(PSLAlways obj) {
		 return "Always(" + doSwitch(obj.getSubterm()) + ")"; 
	}
	
	public String casePSLUntil(PSLUntil obj) {
		 return "Until(" + doSwitch(obj.getLeft()) + ", " + doSwitch(obj.getRight()) + ")"; 
	}
	
	public String casePSLConjunction(PSLConjunction obj) {
		 return "Conjunction(" + doSwitch(obj.getLeft()) + ", " + doSwitch(obj.getRight()) + ")"; 
	}

	public String casePSLDisjunction(PSLDisjunction obj) {
		 return "Disjunction(" + doSwitch(obj.getLeft()) + ", " + doSwitch(obj.getRight()) + ")"; 
	}
	
	public String casePSLImplication(PSLImplication obj) {
		 return "Implication(" + doSwitch(obj.getLeft()) + ", " + doSwitch(obj.getRight()) + ")"; 
	}
	
	public String casePSLBiconditional(PSLBiconditional obj) {
		 return "Biconditional(" + doSwitch(obj.getLeft()) + ", " + doSwitch(obj.getRight()) + ")"; 
	}
	
	public String casePSLSpec(PSLSpec obj) {
		 return "Spec(" + doSwitch(obj.getExpr()) + ")"; 
	}

}
