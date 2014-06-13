/**
 */
package org.osate.xtext.aadl2.agcl.agcl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.Input#getLink <em>Link</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.Input#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends AtomicProposition
{
  /**
   * Returns the value of the '<em><b>Link</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Link</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link</em>' attribute.
   * @see #setLink(String)
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getInput_Link()
   * @model
   * @generated
   */
  String getLink();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.agcl.Input#getLink <em>Link</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Link</em>' attribute.
   * @see #getLink()
   * @generated
   */
  void setLink(String value);

  /**
   * Returns the value of the '<em><b>Event</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' attribute.
   * @see #setEvent(String)
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#getInput_Event()
   * @model
   * @generated
   */
  String getEvent();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.agcl.Input#getEvent <em>Event</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' attribute.
   * @see #getEvent()
   * @generated
   */
  void setEvent(String value);

} // Input
