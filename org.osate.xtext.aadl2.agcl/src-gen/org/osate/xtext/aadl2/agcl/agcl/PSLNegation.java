/**
 */
package org.osate.xtext.aadl2.agcl.agcl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PSL Negation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.PSLNegation#getNegated <em>Negated</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getPSLNegation()
 * @model
 * @generated
 */
public interface PSLNegation extends PSLAtom
{
  /**
   * Returns the value of the '<em><b>Negated</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Negated</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Negated</em>' containment reference.
   * @see #setNegated(PSLBooleanExpression)
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getPSLNegation_Negated()
   * @model containment="true"
   * @generated
   */
  PSLBooleanExpression getNegated();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.agcl.PSLNegation#getNegated <em>Negated</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Negated</em>' containment reference.
   * @see #getNegated()
   * @generated
   */
  void setNegated(PSLBooleanExpression value);

} // PSLNegation
