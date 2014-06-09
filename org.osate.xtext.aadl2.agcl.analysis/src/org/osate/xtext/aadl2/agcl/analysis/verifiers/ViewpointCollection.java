/**
 */
package org.osate.xtext.aadl2.agcl.analysis.verifiers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viewpoint Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ViewpointCollection#getViewpoints <em>Viewpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getViewpointCollection()
 * @model
 * @generated
 */
public interface ViewpointCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Viewpoints</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Viewpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Viewpoints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewpoints</em>' containment reference list.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getViewpointCollection_Viewpoints()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Viewpoint> getViewpoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Viewpoint getViewpoint(String viewpointName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Viewpoint addViewpoint(String viewpointName, Object object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeViewpoint(String viewpointName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean containsViewpoint(String viewpointName);

} // ViewpointCollection
