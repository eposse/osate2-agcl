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

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Component;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ComponentCollection;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersFactory;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ComponentCollectionImpl#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentCollectionImpl extends MinimalEObjectImpl.Container implements ComponentCollection {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VerifiersPackage.Literals.COMPONENT_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, VerifiersPackage.COMPONENT_COLLECTION__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @return the {@link Component} of the given name if present, or {@code null} otherwise.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Component getComponent(String componentName) {
		Component result = null;
		EList<Component> components = getComponents();
		for (Component c : components) {
			if (c.getName().equals(componentName)) {
				result = c;
				break;
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Adds a new component if it is not already in the collection.
	 * 
	 * @return the existing {@link Component} if it was already in the collection, or the newly created instance if it was not.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Component addComponent(String componentName, Object object) {
		Component component = getComponent(componentName);
		if (component == null) {
			component = VerifiersFactory.eINSTANCE.createComponent();
			component.setName(componentName);
			component.setObject(object);
			getComponents().add(component);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Removes the component of the given name if present in the collection.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeComponent(String componentName) {
		getComponents().remove(getComponent(componentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * @return {@code true} iff the collection contains a component with the given name
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean containsComponent(String componentName) {
		boolean result = false;
		EList<Component> components = getComponents();
		for (Component c : components) {
			if (c.getName().equals(componentName)) {
				result = true;
				break;
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VerifiersPackage.COMPONENT_COLLECTION__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
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
			case VerifiersPackage.COMPONENT_COLLECTION__COMPONENTS:
				return getComponents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VerifiersPackage.COMPONENT_COLLECTION__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
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
			case VerifiersPackage.COMPONENT_COLLECTION__COMPONENTS:
				getComponents().clear();
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
			case VerifiersPackage.COMPONENT_COLLECTION__COMPONENTS:
				return components != null && !components.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case VerifiersPackage.COMPONENT_COLLECTION___GET_COMPONENT__STRING:
				return getComponent((String)arguments.get(0));
			case VerifiersPackage.COMPONENT_COLLECTION___ADD_COMPONENT__STRING_OBJECT:
				return addComponent((String)arguments.get(0), arguments.get(1));
			case VerifiersPackage.COMPONENT_COLLECTION___REMOVE_COMPONENT__STRING:
				removeComponent((String)arguments.get(0));
				return null;
			case VerifiersPackage.COMPONENT_COLLECTION___CONTAINS_COMPONENT__STRING:
				return containsComponent((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ComponentCollectionImpl
