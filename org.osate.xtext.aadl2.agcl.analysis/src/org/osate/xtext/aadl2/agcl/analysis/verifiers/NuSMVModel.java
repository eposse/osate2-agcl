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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nu SMV Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModel#getVars <em>Vars</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModel#getInit <em>Init</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModel#getTrans <em>Trans</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getNuSMVModel()
 * @model
 * @generated
 */
public interface NuSMVModel extends Model {

	/**
	 * Returns the value of the '<em><b>Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vars</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vars</em>' attribute.
	 * @see #setVars(Object)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getNuSMVModel_Vars()
	 * @model
	 * @generated
	 */
	Object getVars();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModel#getVars <em>Vars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vars</em>' attribute.
	 * @see #getVars()
	 * @generated
	 */
	void setVars(Object value);

	/**
	 * Returns the value of the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' attribute.
	 * @see #setInit(Object)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getNuSMVModel_Init()
	 * @model
	 * @generated
	 */
	Object getInit();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModel#getInit <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' attribute.
	 * @see #getInit()
	 * @generated
	 */
	void setInit(Object value);

	/**
	 * Returns the value of the '<em><b>Trans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trans</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trans</em>' attribute.
	 * @see #setTrans(Object)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getNuSMVModel_Trans()
	 * @model
	 * @generated
	 */
	Object getTrans();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModel#getTrans <em>Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trans</em>' attribute.
	 * @see #getTrans()
	 * @generated
	 */
	void setTrans(Object value);

	String variablesText();

	String initText();

	String transText();

} // NuSMVModel
