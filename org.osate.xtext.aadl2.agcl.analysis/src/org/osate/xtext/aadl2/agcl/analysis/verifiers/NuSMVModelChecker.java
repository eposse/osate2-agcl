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
package org.osate.xtext.aadl2.agcl.analysis.verifiers;

import org.osate.aadl2.Classifier;
import org.osate.xtext.aadl2.agcl.agcl.PSLSpec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nu SMV Model Checker</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getNuSMVModelChecker()
 * @model
 * @generated
 */
public interface NuSMVModelChecker extends ModelChecker {

	public void checkSpecValidity(PSLSpec pslSpec, String viewpointName, String componentName, String label);

} // NuSMVModelChecker
