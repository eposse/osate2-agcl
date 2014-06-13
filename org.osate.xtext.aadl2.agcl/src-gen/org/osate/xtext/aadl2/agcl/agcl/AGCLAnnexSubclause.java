/**
 */
package org.osate.xtext.aadl2.agcl.agcl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.AnnexSubclause;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AGCL Annex Subclause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause#getBehaviour <em>Behaviour</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause#getContracts <em>Contracts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getAGCLAnnexSubclause()
 * @model
 * @generated
 */
public interface AGCLAnnexSubclause extends EObject, AnnexSubclause
{
  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.agcl.agcl.AGCLPropertyDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getAGCLAnnexSubclause_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<AGCLPropertyDecl> getDeclarations();

  /**
   * Returns the value of the '<em><b>Behaviour</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behaviour</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behaviour</em>' containment reference.
   * @see #setBehaviour(AGCLBehaviour)
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getAGCLAnnexSubclause_Behaviour()
   * @model containment="true"
   * @generated
   */
  AGCLBehaviour getBehaviour();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause#getBehaviour <em>Behaviour</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Behaviour</em>' containment reference.
   * @see #getBehaviour()
   * @generated
   */
  void setBehaviour(AGCLBehaviour value);

  /**
   * Returns the value of the '<em><b>Contracts</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.agcl.agcl.AGCLContract}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contracts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contracts</em>' containment reference list.
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getAGCLAnnexSubclause_Contracts()
   * @model containment="true"
   * @generated
   */
  EList<AGCLContract> getContracts();

} // AGCLAnnexSubclause
