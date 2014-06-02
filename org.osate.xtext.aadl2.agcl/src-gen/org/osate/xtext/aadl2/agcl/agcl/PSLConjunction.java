/**
 */
package org.osate.xtext.aadl2.agcl.agcl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PSL Conjunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.PSLConjunction#getFactors <em>Factors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getPSLConjunction()
 * @model
 * @generated
 */
public interface PSLConjunction extends EObject
{
  /**
   * Returns the value of the '<em><b>Factors</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.agcl.agcl.PSLAtom}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Factors</em>' containment reference list.
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getPSLConjunction_Factors()
   * @model containment="true"
   * @generated
   */
  EList<PSLAtom> getFactors();

} // PSLConjunction
