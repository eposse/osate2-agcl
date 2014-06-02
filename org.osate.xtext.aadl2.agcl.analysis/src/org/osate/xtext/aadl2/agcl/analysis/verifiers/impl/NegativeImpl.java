/**
 */
package org.osate.xtext.aadl2.agcl.analysis.verifiers.impl;

import org.eclipse.emf.common.notify.Notification;

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
	 * The cached value of the '{@link #getCounterexample() <em>Counterexample</em>}' reference.
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
		if (counterexample != null && counterexample.eIsProxy()) {
			InternalEObject oldCounterexample = (InternalEObject)counterexample;
			counterexample = (CounterExample)eResolveProxy(oldCounterexample);
			if (counterexample != oldCounterexample) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VerifiersPackage.NEGATIVE__COUNTEREXAMPLE, oldCounterexample, counterexample));
			}
		}
		return counterexample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CounterExample basicGetCounterexample() {
		return counterexample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounterexample(CounterExample newCounterexample) {
		CounterExample oldCounterexample = counterexample;
		counterexample = newCounterexample;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.NEGATIVE__COUNTEREXAMPLE, oldCounterexample, counterexample));
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
				if (resolve) return getCounterexample();
				return basicGetCounterexample();
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
