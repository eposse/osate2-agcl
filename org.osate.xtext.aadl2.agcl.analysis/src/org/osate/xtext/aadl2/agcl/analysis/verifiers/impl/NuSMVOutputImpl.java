/**
 */
package org.osate.xtext.aadl2.agcl.analysis.verifiers.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVOutput;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nu SMV Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVOutputImpl#getOutputFile <em>Output File</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVOutputImpl#getCounterExampleFile <em>Counter Example File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NuSMVOutputImpl extends ModelCheckerOutputImpl implements NuSMVOutput {
	/**
	 * The default value of the '{@link #getOutputFile() <em>Output File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFile()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputFile() <em>Output File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFile()
	 * @generated
	 * @ordered
	 */
	protected String outputFile = OUTPUT_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCounterExampleFile() <em>Counter Example File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterExampleFile()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTER_EXAMPLE_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCounterExampleFile() <em>Counter Example File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterExampleFile()
	 * @generated
	 * @ordered
	 */
	protected String counterExampleFile = COUNTER_EXAMPLE_FILE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NuSMVOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VerifiersPackage.Literals.NU_SMV_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCounterExampleFile() {
		return counterExampleFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounterExampleFile(String newCounterExampleFile) {
		String oldCounterExampleFile = counterExampleFile;
		counterExampleFile = newCounterExampleFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.NU_SMV_OUTPUT__COUNTER_EXAMPLE_FILE, oldCounterExampleFile, counterExampleFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputFile() {
		return outputFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputFile(String newOutputFile) {
		String oldOutputFile = outputFile;
		outputFile = newOutputFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.NU_SMV_OUTPUT__OUTPUT_FILE, oldOutputFile, outputFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VerifiersPackage.NU_SMV_OUTPUT__OUTPUT_FILE:
				return getOutputFile();
			case VerifiersPackage.NU_SMV_OUTPUT__COUNTER_EXAMPLE_FILE:
				return getCounterExampleFile();
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
			case VerifiersPackage.NU_SMV_OUTPUT__OUTPUT_FILE:
				setOutputFile((String)newValue);
				return;
			case VerifiersPackage.NU_SMV_OUTPUT__COUNTER_EXAMPLE_FILE:
				setCounterExampleFile((String)newValue);
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
			case VerifiersPackage.NU_SMV_OUTPUT__OUTPUT_FILE:
				setOutputFile(OUTPUT_FILE_EDEFAULT);
				return;
			case VerifiersPackage.NU_SMV_OUTPUT__COUNTER_EXAMPLE_FILE:
				setCounterExampleFile(COUNTER_EXAMPLE_FILE_EDEFAULT);
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
			case VerifiersPackage.NU_SMV_OUTPUT__OUTPUT_FILE:
				return OUTPUT_FILE_EDEFAULT == null ? outputFile != null : !OUTPUT_FILE_EDEFAULT.equals(outputFile);
			case VerifiersPackage.NU_SMV_OUTPUT__COUNTER_EXAMPLE_FILE:
				return COUNTER_EXAMPLE_FILE_EDEFAULT == null ? counterExampleFile != null : !COUNTER_EXAMPLE_FILE_EDEFAULT.equals(counterExampleFile);
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
		result.append(" (outputFile: ");
		result.append(outputFile);
		result.append(", counterExampleFile: ");
		result.append(counterExampleFile);
		result.append(')');
		return result.toString();
	}

} //NuSMVOutputImpl
