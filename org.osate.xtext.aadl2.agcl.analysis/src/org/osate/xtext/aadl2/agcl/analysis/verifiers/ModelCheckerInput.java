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
 * A representation of the model object '<em><b>Model Checker Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerInput#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerInput#getOutput <em>Output</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerInput#getVerificationUnit <em>Verification Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getModelCheckerInput()
 * @model abstract="true"
 * @generated
 */
public interface ModelCheckerInput extends EObject {

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' reference.
	 * @see #setSpecification(Specification)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getModelCheckerInput_Specification()
	 * @model
	 * @generated
	 */
	Specification getSpecification();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerInput#getSpecification <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(Specification value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerOutput#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(ModelCheckerOutput)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getModelCheckerInput_Output()
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerOutput#getInput
	 * @model opposite="input"
	 * @generated
	 */
	ModelCheckerOutput getOutput();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerInput#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(ModelCheckerOutput value);

	/**
	 * Returns the value of the '<em><b>Verification Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verification Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification Unit</em>' reference.
	 * @see #setVerificationUnit(VerificationUnit)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getModelCheckerInput_VerificationUnit()
	 * @model
	 * @generated
	 */
	VerificationUnit getVerificationUnit();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerInput#getVerificationUnit <em>Verification Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Unit</em>' reference.
	 * @see #getVerificationUnit()
	 * @generated
	 */
	void setVerificationUnit(VerificationUnit value);
} // ModelCheckerInput
