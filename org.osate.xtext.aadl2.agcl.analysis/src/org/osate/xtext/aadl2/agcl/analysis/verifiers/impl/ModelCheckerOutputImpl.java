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
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationResult;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Checker Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ModelCheckerOutputImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ModelCheckerOutputImpl#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ModelCheckerOutputImpl extends MinimalEObjectImpl.Container implements ModelCheckerOutput {
	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected VerificationResult result;
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected ModelCheckerInput input;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelCheckerOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VerifiersPackage.Literals.MODEL_CHECKER_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationResult getResult() {
		if (result != null && result.eIsProxy()) {
			InternalEObject oldResult = (InternalEObject)result;
			result = (VerificationResult)eResolveProxy(oldResult);
			if (result != oldResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VerifiersPackage.MODEL_CHECKER_OUTPUT__RESULT, oldResult, result));
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationResult basicGetResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(VerificationResult newResult) {
		VerificationResult oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.MODEL_CHECKER_OUTPUT__RESULT, oldResult, result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelCheckerInput getInput() {
		if (input != null && input.eIsProxy()) {
			InternalEObject oldInput = (InternalEObject)input;
			input = (ModelCheckerInput)eResolveProxy(oldInput);
			if (input != oldInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VerifiersPackage.MODEL_CHECKER_OUTPUT__INPUT, oldInput, input));
			}
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelCheckerInput basicGetInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(ModelCheckerInput newInput, NotificationChain msgs) {
		ModelCheckerInput oldInput = input;
		input = newInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VerifiersPackage.MODEL_CHECKER_OUTPUT__INPUT, oldInput, newInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(ModelCheckerInput newInput) {
		if (newInput != input) {
			NotificationChain msgs = null;
			if (input != null)
				msgs = ((InternalEObject)input).eInverseRemove(this, VerifiersPackage.MODEL_CHECKER_INPUT__OUTPUT, ModelCheckerInput.class, msgs);
			if (newInput != null)
				msgs = ((InternalEObject)newInput).eInverseAdd(this, VerifiersPackage.MODEL_CHECKER_INPUT__OUTPUT, ModelCheckerInput.class, msgs);
			msgs = basicSetInput(newInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.MODEL_CHECKER_OUTPUT__INPUT, newInput, newInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VerifiersPackage.MODEL_CHECKER_OUTPUT__INPUT:
				if (input != null)
					msgs = ((InternalEObject)input).eInverseRemove(this, VerifiersPackage.MODEL_CHECKER_INPUT__OUTPUT, ModelCheckerInput.class, msgs);
				return basicSetInput((ModelCheckerInput)otherEnd, msgs);
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
			case VerifiersPackage.MODEL_CHECKER_OUTPUT__INPUT:
				return basicSetInput(null, msgs);
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
			case VerifiersPackage.MODEL_CHECKER_OUTPUT__RESULT:
				if (resolve) return getResult();
				return basicGetResult();
			case VerifiersPackage.MODEL_CHECKER_OUTPUT__INPUT:
				if (resolve) return getInput();
				return basicGetInput();
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
			case VerifiersPackage.MODEL_CHECKER_OUTPUT__RESULT:
				setResult((VerificationResult)newValue);
				return;
			case VerifiersPackage.MODEL_CHECKER_OUTPUT__INPUT:
				setInput((ModelCheckerInput)newValue);
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
			case VerifiersPackage.MODEL_CHECKER_OUTPUT__RESULT:
				setResult((VerificationResult)null);
				return;
			case VerifiersPackage.MODEL_CHECKER_OUTPUT__INPUT:
				setInput((ModelCheckerInput)null);
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
			case VerifiersPackage.MODEL_CHECKER_OUTPUT__RESULT:
				return result != null;
			case VerifiersPackage.MODEL_CHECKER_OUTPUT__INPUT:
				return input != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelCheckerOutputImpl
