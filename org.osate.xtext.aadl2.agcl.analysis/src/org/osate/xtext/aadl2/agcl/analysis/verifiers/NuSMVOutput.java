/**
 */
package org.osate.xtext.aadl2.agcl.analysis.verifiers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nu SMV Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVOutput#getOutputFile <em>Output File</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVOutput#getCounterExampleFile <em>Counter Example File</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getNuSMVOutput()
 * @model
 * @generated
 */
public interface NuSMVOutput extends ModelCheckerOutput {
	/**
	 * Returns the value of the '<em><b>Counter Example File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter Example File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter Example File</em>' attribute.
	 * @see #setCounterExampleFile(String)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getNuSMVOutput_CounterExampleFile()
	 * @model extendedMetaData="processing='skip'"
	 * @generated
	 */
	String getCounterExampleFile();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVOutput#getCounterExampleFile <em>Counter Example File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter Example File</em>' attribute.
	 * @see #getCounterExampleFile()
	 * @generated
	 */
	void setCounterExampleFile(String value);

	/**
	 * Returns the value of the '<em><b>Output File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output File</em>' attribute.
	 * @see #setOutputFile(String)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getNuSMVOutput_OutputFile()
	 * @model extendedMetaData="processing='skip'"
	 * @generated
	 */
	String getOutputFile();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVOutput#getOutputFile <em>Output File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output File</em>' attribute.
	 * @see #getOutputFile()
	 * @generated
	 */
	void setOutputFile(String value);

} // NuSMVOutput
