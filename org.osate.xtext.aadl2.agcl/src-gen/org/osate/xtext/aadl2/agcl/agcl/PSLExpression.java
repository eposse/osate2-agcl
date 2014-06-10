/**
 */
package org.osate.xtext.aadl2.agcl.agcl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PSL Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getSubterm <em>Subterm</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getPSLExpression()
 * @model
 * @generated
 */
public interface PSLExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Subterm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subterm</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subterm</em>' containment reference.
   * @see #setSubterm(PSLExpression)
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getPSLExpression_Subterm()
   * @model containment="true"
   * @generated
   */
  PSLExpression getSubterm();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getSubterm <em>Subterm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subterm</em>' containment reference.
   * @see #getSubterm()
   * @generated
   */
  void setSubterm(PSLExpression value);

} // PSLExpression
