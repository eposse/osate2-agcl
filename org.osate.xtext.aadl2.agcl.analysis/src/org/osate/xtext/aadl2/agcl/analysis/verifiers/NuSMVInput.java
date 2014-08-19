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

import org.eclipse.core.resources.IFile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nu SMV Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVInput#getModelFileName <em>Model File Name</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVInput#getSessionScriptFileName <em>Session Script File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getNuSMVInput()
 * @model
 * @generated
 */
public interface NuSMVInput extends ModelCheckerInput {
	/**
	 * Returns the value of the '<em><b>Model File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model File Name</em>' attribute.
	 * @see #setModelFileName(String)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getNuSMVInput_ModelFileName()
	 * @model extendedMetaData="processing='skip'"
	 * @generated
	 */
	String getModelFileName();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVInput#getModelFileName <em>Model File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model File Name</em>' attribute.
	 * @see #getModelFileName()
	 * @generated
	 */
	void setModelFileName(String value);

	/**
	 * Returns the value of the '<em><b>Session Script File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session Script File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Script File Name</em>' attribute.
	 * @see #setSessionScriptFileName(String)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getNuSMVInput_SessionScriptFileName()
	 * @model extendedMetaData="processing='skip'"
	 * @generated
	 */
	String getSessionScriptFileName();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVInput#getSessionScriptFileName <em>Session Script File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Script File Name</em>' attribute.
	 * @see #getSessionScriptFileName()
	 * @generated
	 */
	void setSessionScriptFileName(String value);
	
	IFile getModelFile();
	
	void setModelFile(IFile file);
	
	IFile getSessionScriptFile();
	
	void setSessionScriptFile(IFile file);

} // NuSMVInput
