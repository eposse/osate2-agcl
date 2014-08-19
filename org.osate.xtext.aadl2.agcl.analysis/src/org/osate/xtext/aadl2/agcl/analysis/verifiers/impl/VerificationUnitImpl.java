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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.xtext.aadl2.agcl.analysis.verifiers.Component;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Model;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Viewpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verification Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerificationUnitImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerificationUnitImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerificationUnitImpl#getViewpoint <em>Viewpoint</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerificationUnitImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerificationUnitImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VerificationUnitImpl extends MinimalEObjectImpl.Container implements VerificationUnit {
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Model model;

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
	 * The cached value of the '{@link #getViewpoint() <em>Viewpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewpoint()
	 * @generated
	 * @ordered
	 */
	protected Viewpoint viewpoint;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected Component component;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerificationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VerifiersPackage.Literals.VERIFICATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (Model)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VerifiersPackage.VERIFICATION_UNIT__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		Model oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.VERIFICATION_UNIT__MODEL, oldModel, model));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VerifiersPackage.VERIFICATION_UNIT__SPECIFICATION, oldSpecification, specification));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.VERIFICATION_UNIT__SPECIFICATION, oldSpecification, specification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Viewpoint getViewpoint() {
		if (viewpoint != null && viewpoint.eIsProxy()) {
			InternalEObject oldViewpoint = (InternalEObject)viewpoint;
			viewpoint = (Viewpoint)eResolveProxy(oldViewpoint);
			if (viewpoint != oldViewpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VerifiersPackage.VERIFICATION_UNIT__VIEWPOINT, oldViewpoint, viewpoint));
			}
		}
		return viewpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Viewpoint basicGetViewpoint() {
		return viewpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewpoint(Viewpoint newViewpoint) {
		Viewpoint oldViewpoint = viewpoint;
		viewpoint = newViewpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.VERIFICATION_UNIT__VIEWPOINT, oldViewpoint, viewpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (Component)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VerifiersPackage.VERIFICATION_UNIT__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		Component oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.VERIFICATION_UNIT__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.VERIFICATION_UNIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VerifiersPackage.VERIFICATION_UNIT__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case VerifiersPackage.VERIFICATION_UNIT__SPECIFICATION:
				if (resolve) return getSpecification();
				return basicGetSpecification();
			case VerifiersPackage.VERIFICATION_UNIT__VIEWPOINT:
				if (resolve) return getViewpoint();
				return basicGetViewpoint();
			case VerifiersPackage.VERIFICATION_UNIT__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
			case VerifiersPackage.VERIFICATION_UNIT__NAME:
				return getName();
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
			case VerifiersPackage.VERIFICATION_UNIT__MODEL:
				setModel((Model)newValue);
				return;
			case VerifiersPackage.VERIFICATION_UNIT__SPECIFICATION:
				setSpecification((Specification)newValue);
				return;
			case VerifiersPackage.VERIFICATION_UNIT__VIEWPOINT:
				setViewpoint((Viewpoint)newValue);
				return;
			case VerifiersPackage.VERIFICATION_UNIT__COMPONENT:
				setComponent((Component)newValue);
				return;
			case VerifiersPackage.VERIFICATION_UNIT__NAME:
				setName((String)newValue);
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
			case VerifiersPackage.VERIFICATION_UNIT__MODEL:
				setModel((Model)null);
				return;
			case VerifiersPackage.VERIFICATION_UNIT__SPECIFICATION:
				setSpecification((Specification)null);
				return;
			case VerifiersPackage.VERIFICATION_UNIT__VIEWPOINT:
				setViewpoint((Viewpoint)null);
				return;
			case VerifiersPackage.VERIFICATION_UNIT__COMPONENT:
				setComponent((Component)null);
				return;
			case VerifiersPackage.VERIFICATION_UNIT__NAME:
				setName(NAME_EDEFAULT);
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
			case VerifiersPackage.VERIFICATION_UNIT__MODEL:
				return model != null;
			case VerifiersPackage.VERIFICATION_UNIT__SPECIFICATION:
				return specification != null;
			case VerifiersPackage.VERIFICATION_UNIT__VIEWPOINT:
				return viewpoint != null;
			case VerifiersPackage.VERIFICATION_UNIT__COMPONENT:
				return component != null;
			case VerifiersPackage.VERIFICATION_UNIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //VerificationUnitImpl
