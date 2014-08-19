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
package org.osate.xtext.aadl2.agcl.analysis.misc;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.ISerializer;
import org.osate.xtext.aadl2.agcl.agcl.AgclFactory;
import org.osate.xtext.aadl2.agcl.agcl.AtomicProposition;
import org.osate.xtext.aadl2.agcl.agcl.Var;
import org.osate.xtext.aadl2.agcl.analysis.AGCLAnalysisPlugin;

/**
 * This class transforms a PSL specification from the AGCL meta-model to a string representation compatible with
 * NuSMV
 * 
 * @author Ernesto Posse
 *
 */
@Deprecated
public class PSL2NuSMVSpecConverterSwitch extends AgclTransform<EObject> {
	
	private ISerializer serializer = AGCLAnalysisPlugin.getDefault().getSerializer();
	
	public EObject caseAtomicProp(AtomicProposition ap) {
		String result = "ap(" + serializer.serialize(ap) + ")";
		Var newVar = AgclFactory.eINSTANCE.createVar();
		newVar.setName(result);
		Logger.getLogger(getClass()).debug(result);
		return newVar;
	}

	
}
