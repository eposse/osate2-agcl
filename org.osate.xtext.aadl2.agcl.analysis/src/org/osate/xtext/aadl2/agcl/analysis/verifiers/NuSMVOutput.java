/**
 */
package org.osate.xtext.aadl2.agcl.analysis.verifiers;

import org.eclipse.core.resources.IFile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nu SMV Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVOutput#getOutputFileName <em>Output File Name</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVOutput#getCounterExampleFileName <em>Counter Example File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getNuSMVOutput()
 * @model
 * @generated
 */
public interface NuSMVOutput extends ModelCheckerOutput {
	/**
	 * Returns the value of the '<em><b>Output File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output File Name</em>' attribute.
	 * @see #setOutputFileName(String)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getNuSMVOutput_OutputFileName()
	 * @model extendedMetaData="processing='skip'"
	 * @generated
	 */
	String getOutputFileName();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVOutput#getOutputFileName <em>Output File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output File Name</em>' attribute.
	 * @see #getOutputFileName()
	 * @generated
	 */
	void setOutputFileName(String value);

	/**
	 * Returns the value of the '<em><b>Counter Example File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter Example File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter Example File Name</em>' attribute.
	 * @see #setCounterExampleFileName(String)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getNuSMVOutput_CounterExampleFileName()
	 * @model extendedMetaData="processing='skip'"
	 * @generated
	 */
	String getCounterExampleFileName();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVOutput#getCounterExampleFileName <em>Counter Example File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter Example File Name</em>' attribute.
	 * @see #getCounterExampleFileName()
	 * @generated
	 */
	void setCounterExampleFileName(String value);

	IFile getOutputFile();
	
	void setOutputFile(IFile file);
	
	IFile getCounterexampleFile();
	
	void setCounterexampleFile(IFile file);

} // NuSMVOutput
