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
public class PSL2NuSMVSpecConverterExplicitSwitch extends PSLHomomorphismExplicitSwitch {

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
