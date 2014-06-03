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
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression#isImplication <em>Implication</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getConclusion <em>Conclusion</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression#isBiconditional <em>Biconditional</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getOther <em>Other</em>}</li>
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
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(PSLBooleanExpression)
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getPSLExpression_Condition()
   * @model containment="true"
   * @generated
   */
  PSLBooleanExpression getCondition();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(PSLBooleanExpression value);

  /**
   * Returns the value of the '<em><b>Implication</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Implication</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implication</em>' attribute.
   * @see #setImplication(boolean)
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getPSLExpression_Implication()
   * @model
   * @generated
   */
  boolean isImplication();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression#isImplication <em>Implication</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Implication</em>' attribute.
   * @see #isImplication()
   * @generated
   */
  void setImplication(boolean value);

  /**
   * Returns the value of the '<em><b>Conclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conclusion</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conclusion</em>' containment reference.
   * @see #setConclusion(PSLBooleanExpression)
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getPSLExpression_Conclusion()
   * @model containment="true"
   * @generated
   */
  PSLBooleanExpression getConclusion();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getConclusion <em>Conclusion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conclusion</em>' containment reference.
   * @see #getConclusion()
   * @generated
   */
  void setConclusion(PSLBooleanExpression value);

  /**
   * Returns the value of the '<em><b>Biconditional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Biconditional</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Biconditional</em>' attribute.
   * @see #setBiconditional(boolean)
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getPSLExpression_Biconditional()
   * @model
   * @generated
   */
  boolean isBiconditional();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression#isBiconditional <em>Biconditional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Biconditional</em>' attribute.
   * @see #isBiconditional()
   * @generated
   */
  void setBiconditional(boolean value);

  /**
   * Returns the value of the '<em><b>Other</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Other</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Other</em>' containment reference.
   * @see #setOther(PSLBooleanExpression)
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getPSLExpression_Other()
   * @model containment="true"
   * @generated
   */
  PSLBooleanExpression getOther();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getOther <em>Other</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Other</em>' containment reference.
   * @see #getOther()
   * @generated
   */
  void setOther(PSLBooleanExpression value);

} // PSLExpression
