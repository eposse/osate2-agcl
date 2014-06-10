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
import org.osate.xtext.aadl2.agcl.agcl.PSLExpression;
import org.osate.xtext.aadl2.agcl.agcl.PSLImplication;
import org.osate.xtext.aadl2.agcl.agcl.PSLNegation;
import org.osate.xtext.aadl2.agcl.agcl.PSLNext;
import org.osate.xtext.aadl2.agcl.agcl.PSLSpec;
import org.osate.xtext.aadl2.agcl.agcl.PSLUntil;
import org.osate.xtext.aadl2.agcl.agcl.Var;

/**
 * An explicit serializer for PSL formulas. We need it because the NuSMV parser uses different precedence for
 * certain operators and the standard Xtext serializer cannot be customized to emit parenthesis in the appropriate places.
 * 
 * @author Ernesto Posse
 *
 */
public class PSLSerializerExplicit extends AgclProcessingSwitch<String> {
	
	public String serialize(PSLExpression expr) {
		return doSwitch(expr);
	}

	public String caseBooleanConstant(BooleanConstant obj) {
		return obj.getVal();
	}

	public String caseVar(Var ap) {
		return ap.getName();
	}
	
	public String caseInput(Input ap) {
		return "in_" + ap.getLink() + "_" + ap.getEvent();
	}
	
	public String caseOutput(Output ap) {
		return "out_" + ap.getLink() + "_" + ap.getEvent();
	}
	
	public String casePSLNegation(PSLNegation obj) {
		 return "! (" + doSwitch(obj.getSubterm()) + ")"; 
	}
	
	public String casePSLNext(PSLNext obj) {
		 return "X (" + doSwitch(obj.getSubterm()) + ")"; 
	}
	
	public String casePSLEventually(PSLEventually obj) {
		 return "F (" + doSwitch(obj.getSubterm()) + ")"; 
	}
	
	public String casePSLAlways(PSLAlways obj) {
		 return "G (" + doSwitch(obj.getSubterm()) + ")"; 
	}
	
	public String casePSLUntil(PSLUntil obj) {
		 return "[(" + doSwitch(obj.getLeft()) + ") U (" + doSwitch(obj.getRight()) + ")]"; 
	}
	
	public String casePSLConjunction(PSLConjunction obj) {
		 return "(" + doSwitch(obj.getLeft()) + ") && (" + doSwitch(obj.getRight()) + ")"; 
	}

	public String casePSLDisjunction(PSLDisjunction obj) {
		 return "(" + doSwitch(obj.getLeft()) + ") || (" + doSwitch(obj.getRight()) + ")"; 
	}
	
	public String casePSLImplication(PSLImplication obj) {
		 return "(" + doSwitch(obj.getLeft()) + ") -> (" + doSwitch(obj.getRight()) + ")"; 
	}
	
	public String casePSLBiconditional(PSLBiconditional obj) {
		 return "(" + doSwitch(obj.getLeft()) + ") <-> (" + doSwitch(obj.getRight()) + ")"; 
	}
	
	public String casePSLSpec(PSLSpec obj) {
		 return "(" + doSwitch(obj.getExpr()) + ")"; 
	}

}
