/**
 */
package org.osate.xtext.aadl2.agcl.analysis.verifiers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nu SMV Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVSpecification#getLogic <em>Logic</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getNuSMVSpecification()
 * @model
 * @generated
 */
public interface NuSMVSpecification extends Specification {

	/**
	 * Returns the value of the '<em><b>Logic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logic</em>' attribute.
	 * @see #setLogic(Object)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getNuSMVSpecification_Logic()
	 * @model
	 * @generated
	 */
	Object getLogic();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVSpecification#getLogic <em>Logic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logic</em>' attribute.
	 * @see #getLogic()
	 * @generated
	 */
	void setLogic(Object value);
	
	String logicText();
	
} // NuSMVSpecification
