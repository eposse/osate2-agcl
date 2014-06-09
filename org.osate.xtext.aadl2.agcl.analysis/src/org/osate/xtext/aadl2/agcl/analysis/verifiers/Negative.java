/**
 */
package org.osate.xtext.aadl2.agcl.analysis.verifiers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Negative#getCounterexample <em>Counterexample</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getNegative()
 * @model
 * @generated
 */
public interface Negative extends VerificationResult {
	/**
	 * Returns the value of the '<em><b>Counterexample</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counterexample</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counterexample</em>' containment reference.
	 * @see #setCounterexample(CounterExample)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getNegative_Counterexample()
	 * @model containment="true"
	 * @generated
	 */
	CounterExample getCounterexample();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Negative#getCounterexample <em>Counterexample</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counterexample</em>' containment reference.
	 * @see #getCounterexample()
	 * @generated
	 */
	void setCounterexample(CounterExample value);

} // Negative
