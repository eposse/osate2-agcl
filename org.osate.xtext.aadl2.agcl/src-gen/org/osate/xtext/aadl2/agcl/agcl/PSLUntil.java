/**
 */
package org.osate.xtext.aadl2.agcl.agcl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PSL Until</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.PSLUntil#getLeft <em>Left</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.PSLUntil#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getPSLUntil()
 * @model
 * @generated
 */
public interface PSLUntil extends PSLExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(PSLExpression)
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getPSLUntil_Left()
   * @model containment="true"
   * @generated
   */
  PSLExpression getLeft();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.agcl.PSLUntil#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(PSLExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(PSLExpression)
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getPSLUntil_Right()
   * @model containment="true"
   * @generated
   */
  PSLExpression getRight();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.agcl.PSLUntil#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(PSLExpression value);

} // PSLUntil
