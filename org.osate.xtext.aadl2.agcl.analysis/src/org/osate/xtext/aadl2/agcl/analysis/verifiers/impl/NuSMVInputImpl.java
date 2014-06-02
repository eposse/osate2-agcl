/**
 */
package org.osate.xtext.aadl2.agcl.analysis.verifiers.impl;

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
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVInputImpl#getModelSourceFile <em>Model Source File</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVInputImpl#getSessionScript <em>Session Script</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NuSMVInputImpl extends ModelCheckerInputImpl implements NuSMVInput {
	/**
	 * The default value of the '{@link #getModelSourceFile() <em>Model Source File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelSourceFile()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_SOURCE_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelSourceFile() <em>Model Source File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelSourceFile()
	 * @generated
	 * @ordered
	 */
	protected String modelSourceFile = MODEL_SOURCE_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSessionScript() <em>Session Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionScript()
	 * @generated
	 * @ordered
	 */
	protected static final String SESSION_SCRIPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSessionScript() <em>Session Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionScript()
	 * @generated
	 * @ordered
	 */
	protected String sessionScript = SESSION_SCRIPT_EDEFAULT;

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
	public String getModelSourceFile() {
		return modelSourceFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelSourceFile(String newModelSourceFile) {
		String oldModelSourceFile = modelSourceFile;
		modelSourceFile = newModelSourceFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.NU_SMV_INPUT__MODEL_SOURCE_FILE, oldModelSourceFile, modelSourceFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSessionScript() {
		return sessionScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionScript(String newSessionScript) {
		String oldSessionScript = sessionScript;
		sessionScript = newSessionScript;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.NU_SMV_INPUT__SESSION_SCRIPT, oldSessionScript, sessionScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VerifiersPackage.NU_SMV_INPUT__MODEL_SOURCE_FILE:
				return getModelSourceFile();
			case VerifiersPackage.NU_SMV_INPUT__SESSION_SCRIPT:
				return getSessionScript();
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
			case VerifiersPackage.NU_SMV_INPUT__MODEL_SOURCE_FILE:
				setModelSourceFile((String)newValue);
				return;
			case VerifiersPackage.NU_SMV_INPUT__SESSION_SCRIPT:
				setSessionScript((String)newValue);
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
			case VerifiersPackage.NU_SMV_INPUT__MODEL_SOURCE_FILE:
				setModelSourceFile(MODEL_SOURCE_FILE_EDEFAULT);
				return;
			case VerifiersPackage.NU_SMV_INPUT__SESSION_SCRIPT:
				setSessionScript(SESSION_SCRIPT_EDEFAULT);
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
			case VerifiersPackage.NU_SMV_INPUT__MODEL_SOURCE_FILE:
				return MODEL_SOURCE_FILE_EDEFAULT == null ? modelSourceFile != null : !MODEL_SOURCE_FILE_EDEFAULT.equals(modelSourceFile);
			case VerifiersPackage.NU_SMV_INPUT__SESSION_SCRIPT:
				return SESSION_SCRIPT_EDEFAULT == null ? sessionScript != null : !SESSION_SCRIPT_EDEFAULT.equals(sessionScript);
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
		result.append(" (modelSourceFile: ");
		result.append(modelSourceFile);
		result.append(", sessionScript: ");
		result.append(sessionScript);
		result.append(')');
		return result.toString();
	}

} //NuSMVInputImpl
