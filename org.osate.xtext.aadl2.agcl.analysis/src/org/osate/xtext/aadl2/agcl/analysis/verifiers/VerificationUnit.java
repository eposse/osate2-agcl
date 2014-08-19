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
 * A representation of the model object '<em><b>Verification Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit#getModel <em>Model</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit#getViewpoint <em>Viewpoint</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit#getComponent <em>Component</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getVerificationUnit()
 * @model
 * @generated
 */
public interface VerificationUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getVerificationUnit_Model()
	 * @model
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

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
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getVerificationUnit_Specification()
	 * @model
	 * @generated
	 */
	Specification getSpecification();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit#getSpecification <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(Specification value);

	/**
	 * Returns the value of the '<em><b>Viewpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Viewpoint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewpoint</em>' reference.
	 * @see #setViewpoint(Viewpoint)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getVerificationUnit_Viewpoint()
	 * @model
	 * @generated
	 */
	Viewpoint getViewpoint();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit#getViewpoint <em>Viewpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viewpoint</em>' reference.
	 * @see #getViewpoint()
	 * @generated
	 */
	void setViewpoint(Viewpoint value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Component)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getVerificationUnit_Component()
	 * @model
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getVerificationUnit_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
	
} // VerificationUnit
