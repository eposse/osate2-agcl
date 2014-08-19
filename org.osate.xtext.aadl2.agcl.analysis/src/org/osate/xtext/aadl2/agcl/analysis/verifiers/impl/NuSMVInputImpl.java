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
package org.osate.xtext.aadl2.agcl.analysis.verifiers.impl;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVInput;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nu SMV Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVInputImpl#getModelFileName <em>Model File Name</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVInputImpl#getSessionScriptFileName <em>Session Script File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NuSMVInputImpl extends ModelCheckerInputImpl implements NuSMVInput {
	/**
	 * The default value of the '{@link #getModelFileName() <em>Model File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelFileName() <em>Model File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelFileName()
	 * @generated
	 * @ordered
	 */
	protected String modelFileName = MODEL_FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSessionScriptFileName() <em>Session Script File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionScriptFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String SESSION_SCRIPT_FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSessionScriptFileName() <em>Session Script File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionScriptFileName()
	 * @generated
	 * @ordered
	 */
	protected String sessionScriptFileName = SESSION_SCRIPT_FILE_NAME_EDEFAULT;

	private IFile modelFile;
	private IFile sessionScriptFile;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NuSMVInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VerifiersPackage.Literals.NU_SMV_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelFileName() {
		return modelFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelFileName(String newModelFileName) {
		String oldModelFileName = modelFileName;
		modelFileName = newModelFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.NU_SMV_INPUT__MODEL_FILE_NAME, oldModelFileName, modelFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSessionScriptFileName() {
		return sessionScriptFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionScriptFileName(String newSessionScriptFileName) {
		String oldSessionScriptFileName = sessionScriptFileName;
		sessionScriptFileName = newSessionScriptFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.NU_SMV_INPUT__SESSION_SCRIPT_FILE_NAME, oldSessionScriptFileName, sessionScriptFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VerifiersPackage.NU_SMV_INPUT__MODEL_FILE_NAME:
				return getModelFileName();
			case VerifiersPackage.NU_SMV_INPUT__SESSION_SCRIPT_FILE_NAME:
				return getSessionScriptFileName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VerifiersPackage.NU_SMV_INPUT__MODEL_FILE_NAME:
				setModelFileName((String)newValue);
				return;
			case VerifiersPackage.NU_SMV_INPUT__SESSION_SCRIPT_FILE_NAME:
				setSessionScriptFileName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VerifiersPackage.NU_SMV_INPUT__MODEL_FILE_NAME:
				setModelFileName(MODEL_FILE_NAME_EDEFAULT);
				return;
			case VerifiersPackage.NU_SMV_INPUT__SESSION_SCRIPT_FILE_NAME:
				setSessionScriptFileName(SESSION_SCRIPT_FILE_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VerifiersPackage.NU_SMV_INPUT__MODEL_FILE_NAME:
				return MODEL_FILE_NAME_EDEFAULT == null ? modelFileName != null : !MODEL_FILE_NAME_EDEFAULT.equals(modelFileName);
			case VerifiersPackage.NU_SMV_INPUT__SESSION_SCRIPT_FILE_NAME:
				return SESSION_SCRIPT_FILE_NAME_EDEFAULT == null ? sessionScriptFileName != null : !SESSION_SCRIPT_FILE_NAME_EDEFAULT.equals(sessionScriptFileName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (modelFileName: ");
		result.append(modelFileName);
		result.append(", sessionScriptFileName: ");
		result.append(sessionScriptFileName);
		result.append(')');
		return result.toString();
	}

	/**
	 * @return the modelFile
	 */
	public IFile getModelFile() {
		return modelFile;
	}

	/**
	 * @param modelFile the modelFile to set
	 */
	public void setModelFile(IFile modelFile) {
		this.modelFile = modelFile;
	}

	/**
	 * @return the sessionScriptFile
	 */
	public IFile getSessionScriptFile() {
		return sessionScriptFile;
	}

	/**
	 * @param sessionScriptFile the sessionScriptFile to set
	 */
	public void setSessionScriptFile(IFile sessionScriptFile) {
		this.sessionScriptFile = sessionScriptFile;
	}

} //NuSMVInputImpl
