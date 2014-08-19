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
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVOutput;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nu SMV Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVOutputImpl#getOutputFileName <em>Output File Name</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVOutputImpl#getCounterExampleFileName <em>Counter Example File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NuSMVOutputImpl extends ModelCheckerOutputImpl implements NuSMVOutput {
	/**
	 * The default value of the '{@link #getOutputFileName() <em>Output File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputFileName() <em>Output File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFileName()
	 * @generated
	 * @ordered
	 */
	protected String outputFileName = OUTPUT_FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCounterExampleFileName() <em>Counter Example File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterExampleFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTER_EXAMPLE_FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCounterExampleFileName() <em>Counter Example File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterExampleFileName()
	 * @generated
	 * @ordered
	 */
	protected String counterExampleFileName = COUNTER_EXAMPLE_FILE_NAME_EDEFAULT;

	private IFile outputFile;
	private IFile counterexampleFile;
	
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
	public String getOutputFileName() {
		return outputFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputFileName(String newOutputFileName) {
		String oldOutputFileName = outputFileName;
		outputFileName = newOutputFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.NU_SMV_OUTPUT__OUTPUT_FILE_NAME, oldOutputFileName, outputFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCounterExampleFileName() {
		return counterExampleFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounterExampleFileName(String newCounterExampleFileName) {
		String oldCounterExampleFileName = counterExampleFileName;
		counterExampleFileName = newCounterExampleFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.NU_SMV_OUTPUT__COUNTER_EXAMPLE_FILE_NAME, oldCounterExampleFileName, counterExampleFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VerifiersPackage.NU_SMV_OUTPUT__OUTPUT_FILE_NAME:
				return getOutputFileName();
			case VerifiersPackage.NU_SMV_OUTPUT__COUNTER_EXAMPLE_FILE_NAME:
				return getCounterExampleFileName();
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
			case VerifiersPackage.NU_SMV_OUTPUT__OUTPUT_FILE_NAME:
				setOutputFileName((String)newValue);
				return;
			case VerifiersPackage.NU_SMV_OUTPUT__COUNTER_EXAMPLE_FILE_NAME:
				setCounterExampleFileName((String)newValue);
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
			case VerifiersPackage.NU_SMV_OUTPUT__OUTPUT_FILE_NAME:
				setOutputFileName(OUTPUT_FILE_NAME_EDEFAULT);
				return;
			case VerifiersPackage.NU_SMV_OUTPUT__COUNTER_EXAMPLE_FILE_NAME:
				setCounterExampleFileName(COUNTER_EXAMPLE_FILE_NAME_EDEFAULT);
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
			case VerifiersPackage.NU_SMV_OUTPUT__OUTPUT_FILE_NAME:
				return OUTPUT_FILE_NAME_EDEFAULT == null ? outputFileName != null : !OUTPUT_FILE_NAME_EDEFAULT.equals(outputFileName);
			case VerifiersPackage.NU_SMV_OUTPUT__COUNTER_EXAMPLE_FILE_NAME:
				return COUNTER_EXAMPLE_FILE_NAME_EDEFAULT == null ? counterExampleFileName != null : !COUNTER_EXAMPLE_FILE_NAME_EDEFAULT.equals(counterExampleFileName);
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
		result.append(" (outputFileName: ");
		result.append(outputFileName);
		result.append(", counterExampleFileName: ");
		result.append(counterExampleFileName);
		result.append(')');
		return result.toString();
	}

	/**
	 * @return the outputFile
	 */
	public IFile getOutputFile() {
		return outputFile;
	}

	/**
	 * @param outputFile the outputFile to set
	 */
	public void setOutputFile(IFile outputFile) {
		this.outputFile = outputFile;
	}

	/**
	 * @return the counterexampleFile
	 */
	public IFile getCounterexampleFile() {
		return counterexampleFile;
	}

	/**
	 * @param counterexampleFile the counterexampleFile to set
	 */
	public void setCounterexampleFile(IFile counterexampleFile) {
		this.counterexampleFile = counterexampleFile;
	}

} //NuSMVOutputImpl
