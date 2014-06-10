/**
 */
package org.osate.xtext.aadl2.agcl.agcl;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getRight <em>Right</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getNegated <em>Negated</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getTerms <em>Terms</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getFactors <em>Factors</em>}</li>
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
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getPSLExpression_Left()
   * @model containment="true"
   * @generated
   */
  PSLExpression getLeft();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getLeft <em>Left</em>}' containment reference.
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
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getPSLExpression_Right()
   * @model containment="true"
   * @generated
   */
  PSLExpression getRight();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(PSLExpression value);

  /**
   * Returns the value of the '<em><b>Negated</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Negated</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Negated</em>' containment reference.
   * @see #setNegated(PSLExpression)
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getPSLExpression_Negated()
   * @model containment="true"
   * @generated
   */
  PSLExpression getNegated();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getNegated <em>Negated</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Negated</em>' containment reference.
   * @see #getNegated()
   * @generated
   */
  void setNegated(PSLExpression value);

  /**
   * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Terms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Terms</em>' containment reference list.
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getPSLExpression_Terms()
   * @model containment="true"
   * @generated
   */
  EList<PSLExpression> getTerms();

  /**
   * Returns the value of the '<em><b>Factors</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Factors</em>' containment reference list.
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getPSLExpression_Factors()
   * @model containment="true"
   * @generated
   */
  EList<PSLExpression> getFactors();

} // PSLExpression
