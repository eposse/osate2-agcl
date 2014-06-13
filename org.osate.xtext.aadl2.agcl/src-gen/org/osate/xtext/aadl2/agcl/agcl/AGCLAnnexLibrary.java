/**
 */
package org.osate.xtext.aadl2.agcl.agcl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.AnnexLibrary;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AGCL Annex Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexLibrary#getViewpoints <em>Viewpoints</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexLibrary#getEnforceclauses <em>Enforceclauses</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getAGCLAnnexLibrary()
 * @model
 * @generated
 */
public interface AGCLAnnexLibrary extends EObject, AnnexLibrary
{
  /**
   * Returns the value of the '<em><b>Viewpoints</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.agcl.agcl.AGCLViewpoint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Viewpoints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Viewpoints</em>' containment reference list.
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getAGCLAnnexLibrary_Viewpoints()
   * @model containment="true"
   * @generated
   */
  EList<AGCLViewpoint> getViewpoints();

  /**
   * Returns the value of the '<em><b>Enforceclauses</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.agcl.agcl.AGCLEnforce}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enforceclauses</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enforceclauses</em>' containment reference list.
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getAGCLAnnexLibrary_Enforceclauses()
   * @model containment="true"
   * @generated
   */
  EList<AGCLEnforce> getEnforceclauses();

} // AGCLAnnexLibrary
