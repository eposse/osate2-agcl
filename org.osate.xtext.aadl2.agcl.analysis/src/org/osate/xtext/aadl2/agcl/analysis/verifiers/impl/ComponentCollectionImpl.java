/**
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
	 * <!-- end-user-doc -->
	 * @return 
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
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeComponent(String componentName) {
		getComponents().remove(getComponent(componentName));
	}

	/**
	 * <!-- begin-user-doc -->
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
