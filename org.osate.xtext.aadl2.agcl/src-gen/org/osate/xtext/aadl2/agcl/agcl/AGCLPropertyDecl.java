/**
 */
package org.osate.xtext.aadl2.agcl.agcl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AGCL Property Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.AGCLPropertyDecl#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.AGCLPropertyDecl#getParams <em>Params</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.AGCLPropertyDecl#getSpec <em>Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getAGCLPropertyDecl()
 * @model
 * @generated
 */
public interface AGCLPropertyDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getAGCLPropertyDecl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLPropertyDecl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.agcl.agcl.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getAGCLPropertyDecl_Params()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParams();

  /**
   * Returns the value of the '<em><b>Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Spec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spec</em>' containment reference.
   * @see #setSpec(PSLSpec)
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getAGCLPropertyDecl_Spec()
   * @model containment="true"
   * @generated
   */
  PSLSpec getSpec();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLPropertyDecl#getSpec <em>Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Spec</em>' containment reference.
   * @see #getSpec()
   * @generated
   */
  void setSpec(PSLSpec value);

} // AGCLPropertyDecl
