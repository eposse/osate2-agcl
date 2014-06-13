/**
 */
package org.osate.xtext.aadl2.agcl.agcl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AGCL Grammar Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.AGCLGrammarRoot#getLib <em>Lib</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.AGCLGrammarRoot#getSubclause <em>Subclause</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getAGCLGrammarRoot()
 * @model
 * @generated
 */
public interface AGCLGrammarRoot extends EObject
{
  /**
   * Returns the value of the '<em><b>Lib</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lib</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lib</em>' containment reference.
   * @see #setLib(AGCLAnnexLibrary)
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getAGCLGrammarRoot_Lib()
   * @model containment="true"
   * @generated
   */
  AGCLAnnexLibrary getLib();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLGrammarRoot#getLib <em>Lib</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lib</em>' containment reference.
   * @see #getLib()
   * @generated
   */
  void setLib(AGCLAnnexLibrary value);

  /**
   * Returns the value of the '<em><b>Subclause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subclause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subclause</em>' containment reference.
   * @see #setSubclause(AGCLAnnexSubclause)
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getAGCLGrammarRoot_Subclause()
   * @model containment="true"
   * @generated
   */
  AGCLAnnexSubclause getSubclause();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLGrammarRoot#getSubclause <em>Subclause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subclause</em>' containment reference.
   * @see #getSubclause()
   * @generated
   */
  void setSubclause(AGCLAnnexSubclause value);

} // AGCLGrammarRoot
