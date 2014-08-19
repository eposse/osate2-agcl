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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Checker Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerOutput#getResult <em>Result</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerOutput#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getModelCheckerOutput()
 * @model abstract="true"
 * @generated
 */
public interface ModelCheckerOutput extends EObject {

	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' reference.
	 * @see #setResult(VerificationResult)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getModelCheckerOutput_Result()
	 * @model
	 * @generated
	 */
	VerificationResult getResult();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerOutput#getResult <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(VerificationResult value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerInput#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(ModelCheckerInput)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getModelCheckerOutput_Input()
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerInput#getOutput
	 * @model opposite="output"
	 * @generated
	 */
	ModelCheckerInput getInput();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerOutput#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(ModelCheckerInput value);
} // ModelCheckerOutput
