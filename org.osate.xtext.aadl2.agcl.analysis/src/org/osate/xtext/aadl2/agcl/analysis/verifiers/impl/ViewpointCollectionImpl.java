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
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersFactory;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Viewpoint;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ViewpointCollection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Viewpoint Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ViewpointCollectionImpl#getViewpoints <em>Viewpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewpointCollectionImpl extends MinimalEObjectImpl.Container implements ViewpointCollection {
	/**
	 * The cached value of the '{@link #getViewpoints() <em>Viewpoints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Viewpoint> viewpoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewpointCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VerifiersPackage.Literals.VIEWPOINT_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Viewpoint> getViewpoints() {
		if (viewpoints == null) {
			viewpoints = new EObjectContainmentEList<Viewpoint>(Viewpoint.class, this, VerifiersPackage.VIEWPOINT_COLLECTION__VIEWPOINTS);
		}
		return viewpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Viewpoint getViewpoint(String viewpointName) {
		Viewpoint result = null;
		EList<Viewpoint> viewpoints = getViewpoints();
		for (Viewpoint v : viewpoints) {
			if (v.getName().equals(viewpointName)) {
				result = v;
				break;
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Adds a new viewpoint if it is not already in the collection.
	 * 
	 * @return the existing {@link Viewpoint} if it was already in the collection, or the newly created instance if it was not.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Viewpoint addViewpoint(String viewpointName, Object object) {
		Viewpoint viewpoint = getViewpoint(viewpointName);
		if (viewpoint == null) {
			viewpoint = VerifiersFactory.eINSTANCE.createViewpoint();
			viewpoint.setName(viewpointName);
			viewpoint.setObject(object);
			getViewpoints().add(viewpoint);
		}
		return viewpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Removes the viewpoint of the given name if present in the collection.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeViewpoint(String viewpointName) {
		getViewpoints().remove(getViewpoint(viewpointName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * @return {@code true} iff the collection contains a viewpoint with the given name
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean containsViewpoint(String viewpointName) {
		boolean result = false;
		EList<Viewpoint> viewpoints = getViewpoints();
		for (Viewpoint v : viewpoints) {
			if (v.getName().equals(viewpointName)) {
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
			case VerifiersPackage.VIEWPOINT_COLLECTION__VIEWPOINTS:
				return ((InternalEList<?>)getViewpoints()).basicRemove(otherEnd, msgs);
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
			case VerifiersPackage.VIEWPOINT_COLLECTION__VIEWPOINTS:
				return getViewpoints();
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
			case VerifiersPackage.VIEWPOINT_COLLECTION__VIEWPOINTS:
				getViewpoints().clear();
				getViewpoints().addAll((Collection<? extends Viewpoint>)newValue);
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
			case VerifiersPackage.VIEWPOINT_COLLECTION__VIEWPOINTS:
				getViewpoints().clear();
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
			case VerifiersPackage.VIEWPOINT_COLLECTION__VIEWPOINTS:
				return viewpoints != null && !viewpoints.isEmpty();
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
			case VerifiersPackage.VIEWPOINT_COLLECTION___GET_VIEWPOINT__STRING:
				return getViewpoint((String)arguments.get(0));
			case VerifiersPackage.VIEWPOINT_COLLECTION___ADD_VIEWPOINT__STRING_OBJECT:
				return addViewpoint((String)arguments.get(0), arguments.get(1));
			case VerifiersPackage.VIEWPOINT_COLLECTION___REMOVE_VIEWPOINT__STRING:
				removeViewpoint((String)arguments.get(0));
				return null;
			case VerifiersPackage.VIEWPOINT_COLLECTION___CONTAINS_VIEWPOINT__STRING:
				return containsViewpoint((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ViewpointCollectionImpl
