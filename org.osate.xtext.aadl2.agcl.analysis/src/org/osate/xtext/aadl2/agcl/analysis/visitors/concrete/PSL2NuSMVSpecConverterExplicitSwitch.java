/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.visitors.concrete;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.osate.xtext.aadl2.agcl.agcl.AgclFactory;
import org.osate.xtext.aadl2.agcl.agcl.BooleanConstant;
import org.osate.xtext.aadl2.agcl.agcl.Input;
import org.osate.xtext.aadl2.agcl.agcl.Output;
import org.osate.xtext.aadl2.agcl.agcl.Var;
import org.osate.xtext.aadl2.agcl.analysis.visitors.PSLHomomorphismExplicitSwitch;

/**
 * This visitor transforms {@link Input} and {@link Output} atomic propositions into {@link Var} so that they can
 * all be serialized as NuSMV state variables.
 * 
 * @author Ernesto Posse
 *
 */
public class PSL2NuSMVSpecConverterExplicitSwitch extends PSLHomomorphismExplicitSwitch {

	public EObject caseBooleanConstant(BooleanConstant obj) {
		String result = obj.getVal().toUpperCase();
		BooleanConstant newObj = AgclFactory.eINSTANCE.createBooleanConstant();
		newObj.setVal(result);
		return newObj;
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

}
