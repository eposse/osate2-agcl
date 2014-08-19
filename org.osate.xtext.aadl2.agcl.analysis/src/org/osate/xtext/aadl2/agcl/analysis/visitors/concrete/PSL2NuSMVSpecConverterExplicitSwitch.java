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
