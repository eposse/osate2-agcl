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

import org.osate.xtext.aadl2.agcl.analysis.verifiers.CounterExample;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Negative;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Negative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NegativeImpl#getCounterexample <em>Counterexample</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NegativeImpl extends MinimalEObjectImpl.Container implements Negative {
	/**
	 * The cached value of the '{@link #getCounterexample() <em>Counterexample</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterexample()
	 * @generated
	 * @ordered
	 */
	protected CounterExample counterexample;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegativeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VerifiersPackage.Literals.NEGATIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CounterExample getCounterexample() {
		return counterexample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCounterexample(CounterExample newCounterexample, NotificationChain msgs) {
		CounterExample oldCounterexample = counterexample;
		counterexample = newCounterexample;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VerifiersPackage.NEGATIVE__COUNTEREXAMPLE, oldCounterexample, newCounterexample);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounterexample(CounterExample newCounterexample) {
		if (newCounterexample != counterexample) {
			NotificationChain msgs = null;
			if (counterexample != null)
				msgs = ((InternalEObject)counterexample).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VerifiersPackage.NEGATIVE__COUNTEREXAMPLE, null, msgs);
			if (newCounterexample != null)
				msgs = ((InternalEObject)newCounterexample).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VerifiersPackage.NEGATIVE__COUNTEREXAMPLE, null, msgs);
			msgs = basicSetCounterexample(newCounterexample, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.NEGATIVE__COUNTEREXAMPLE, newCounterexample, newCounterexample));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VerifiersPackage.NEGATIVE__COUNTEREXAMPLE:
				return basicSetCounterexample(null, msgs);
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
			case VerifiersPackage.NEGATIVE__COUNTEREXAMPLE:
				return getCounterexample();
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
			case VerifiersPackage.NEGATIVE__COUNTEREXAMPLE:
				setCounterexample((CounterExample)newValue);
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
			case VerifiersPackage.NEGATIVE__COUNTEREXAMPLE:
				setCounterexample((CounterExample)null);
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
			case VerifiersPackage.NEGATIVE__COUNTEREXAMPLE:
				return counterexample != null;
		}
		return super.eIsSet(featureID);
	}

} //NegativeImpl
