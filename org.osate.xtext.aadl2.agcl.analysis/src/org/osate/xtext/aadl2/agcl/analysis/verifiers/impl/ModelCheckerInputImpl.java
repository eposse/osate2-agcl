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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerInput;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerOutput;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Checker Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ModelCheckerInputImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ModelCheckerInputImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ModelCheckerInputImpl#getVerificationUnit <em>Verification Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ModelCheckerInputImpl extends MinimalEObjectImpl.Container implements ModelCheckerInput {
	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected Specification specification;
	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected ModelCheckerOutput output;

	/**
	 * The cached value of the '{@link #getVerificationUnit() <em>Verification Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationUnit()
	 * @generated
	 * @ordered
	 */
	protected VerificationUnit verificationUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelCheckerInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VerifiersPackage.Literals.MODEL_CHECKER_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification getSpecification() {
		if (specification != null && specification.eIsProxy()) {
			InternalEObject oldSpecification = (InternalEObject)specification;
			specification = (Specification)eResolveProxy(oldSpecification);
			if (specification != oldSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VerifiersPackage.MODEL_CHECKER_INPUT__SPECIFICATION, oldSpecification, specification));
			}
		}
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification basicGetSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(Specification newSpecification) {
		Specification oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.MODEL_CHECKER_INPUT__SPECIFICATION, oldSpecification, specification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelCheckerOutput getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject)output;
			output = (ModelCheckerOutput)eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VerifiersPackage.MODEL_CHECKER_INPUT__OUTPUT, oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelCheckerOutput basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(ModelCheckerOutput newOutput, NotificationChain msgs) {
		ModelCheckerOutput oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VerifiersPackage.MODEL_CHECKER_INPUT__OUTPUT, oldOutput, newOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(ModelCheckerOutput newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject)output).eInverseRemove(this, VerifiersPackage.MODEL_CHECKER_OUTPUT__INPUT, ModelCheckerOutput.class, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject)newOutput).eInverseAdd(this, VerifiersPackage.MODEL_CHECKER_OUTPUT__INPUT, ModelCheckerOutput.class, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.MODEL_CHECKER_INPUT__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationUnit getVerificationUnit() {
		if (verificationUnit != null && verificationUnit.eIsProxy()) {
			InternalEObject oldVerificationUnit = (InternalEObject)verificationUnit;
			verificationUnit = (VerificationUnit)eResolveProxy(oldVerificationUnit);
			if (verificationUnit != oldVerificationUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VerifiersPackage.MODEL_CHECKER_INPUT__VERIFICATION_UNIT, oldVerificationUnit, verificationUnit));
			}
		}
		return verificationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationUnit basicGetVerificationUnit() {
		return verificationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerificationUnit(VerificationUnit newVerificationUnit) {
		VerificationUnit oldVerificationUnit = verificationUnit;
		verificationUnit = newVerificationUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.MODEL_CHECKER_INPUT__VERIFICATION_UNIT, oldVerificationUnit, verificationUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VerifiersPackage.MODEL_CHECKER_INPUT__OUTPUT:
				if (output != null)
					msgs = ((InternalEObject)output).eInverseRemove(this, VerifiersPackage.MODEL_CHECKER_OUTPUT__INPUT, ModelCheckerOutput.class, msgs);
				return basicSetOutput((ModelCheckerOutput)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VerifiersPackage.MODEL_CHECKER_INPUT__OUTPUT:
				return basicSetOutput(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VerifiersPackage.MODEL_CHECKER_INPUT__SPECIFICATION:
				if (resolve) return getSpecification();
				return basicGetSpecification();
			case VerifiersPackage.MODEL_CHECKER_INPUT__OUTPUT:
				if (resolve) return getOutput();
				return basicGetOutput();
			case VerifiersPackage.MODEL_CHECKER_INPUT__VERIFICATION_UNIT:
				if (resolve) return getVerificationUnit();
				return basicGetVerificationUnit();
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
			case VerifiersPackage.MODEL_CHECKER_INPUT__SPECIFICATION:
				setSpecification((Specification)newValue);
				return;
			case VerifiersPackage.MODEL_CHECKER_INPUT__OUTPUT:
				setOutput((ModelCheckerOutput)newValue);
				return;
			case VerifiersPackage.MODEL_CHECKER_INPUT__VERIFICATION_UNIT:
				setVerificationUnit((VerificationUnit)newValue);
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
			case VerifiersPackage.MODEL_CHECKER_INPUT__SPECIFICATION:
				setSpecification((Specification)null);
				return;
			case VerifiersPackage.MODEL_CHECKER_INPUT__OUTPUT:
				setOutput((ModelCheckerOutput)null);
				return;
			case VerifiersPackage.MODEL_CHECKER_INPUT__VERIFICATION_UNIT:
				setVerificationUnit((VerificationUnit)null);
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
			case VerifiersPackage.MODEL_CHECKER_INPUT__SPECIFICATION:
				return specification != null;
			case VerifiersPackage.MODEL_CHECKER_INPUT__OUTPUT:
				return output != null;
			case VerifiersPackage.MODEL_CHECKER_INPUT__VERIFICATION_UNIT:
				return verificationUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelCheckerInputImpl
