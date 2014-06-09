/**
 */
package org.osate.xtext.aadl2.agcl.analysis.verifiers;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ResultEntry#getVerificationUnit <em>Verification Unit</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ResultEntry#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getResultEntry()
 * @model
 * @generated
 */
public interface ResultEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Verification Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verification Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification Unit</em>' reference.
	 * @see #setVerificationUnit(VerificationUnit)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getResultEntry_VerificationUnit()
	 * @model
	 * @generated
	 */
	VerificationUnit getVerificationUnit();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ResultEntry#getVerificationUnit <em>Verification Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Unit</em>' reference.
	 * @see #getVerificationUnit()
	 * @generated
	 */
	void setVerificationUnit(VerificationUnit value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' reference.
	 * @see #setResult(VerificationResult)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getResultEntry_Result()
	 * @model
	 * @generated
	 */
	VerificationResult getResult();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ResultEntry#getResult <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(VerificationResult value);

} // ResultEntry
