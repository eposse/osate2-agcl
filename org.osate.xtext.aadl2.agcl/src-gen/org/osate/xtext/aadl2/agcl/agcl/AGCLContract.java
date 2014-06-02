/**
 */
package org.osate.xtext.aadl2.agcl.agcl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AGCL Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.AGCLContract#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.AGCLContract#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.AGCLContract#getAssumption <em>Assumption</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.AGCLContract#getGuarantee <em>Guarantee</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.AGCLContract#getEname <em>Ename</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getAGCLContract()
 * @model
 * @generated
 */
public interface AGCLContract extends EObject
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
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getAGCLContract_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLContract#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getAGCLContract_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<AGCLPropertyDecl> getDeclarations();

  /**
   * Returns the value of the '<em><b>Assumption</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assumption</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assumption</em>' containment reference.
   * @see #setAssumption(AGCLAssumption)
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getAGCLContract_Assumption()
   * @model containment="true"
   * @generated
   */
  AGCLAssumption getAssumption();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLContract#getAssumption <em>Assumption</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assumption</em>' containment reference.
   * @see #getAssumption()
   * @generated
   */
  void setAssumption(AGCLAssumption value);

  /**
   * Returns the value of the '<em><b>Guarantee</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guarantee</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guarantee</em>' containment reference.
   * @see #setGuarantee(AGCLGuarantee)
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getAGCLContract_Guarantee()
   * @model containment="true"
   * @generated
   */
  AGCLGuarantee getGuarantee();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLContract#getGuarantee <em>Guarantee</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guarantee</em>' containment reference.
   * @see #getGuarantee()
   * @generated
   */
  void setGuarantee(AGCLGuarantee value);

  /**
   * Returns the value of the '<em><b>Ename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ename</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ename</em>' attribute.
   * @see #setEname(String)
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getAGCLContract_Ename()
   * @model
   * @generated
   */
  String getEname();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLContract#getEname <em>Ename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ename</em>' attribute.
   * @see #getEname()
   * @generated
   */
  void setEname(String value);

} // AGCLContract
