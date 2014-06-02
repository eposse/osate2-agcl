/**
 */
package org.osate.xtext.aadl2.agcl.analysis.verifiers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nu SMV Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVInput#getModelSourceFile <em>Model Source File</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVInput#getSessionScript <em>Session Script</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getNuSMVInput()
 * @model
 * @generated
 */
public interface NuSMVInput extends ModelCheckerInput {
	/**
	 * Returns the value of the '<em><b>Model Source File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Source File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Source File</em>' attribute.
	 * @see #setModelSourceFile(String)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getNuSMVInput_ModelSourceFile()
	 * @model extendedMetaData="processing='skip'"
	 * @generated
	 */
	String getModelSourceFile();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVInput#getModelSourceFile <em>Model Source File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Source File</em>' attribute.
	 * @see #getModelSourceFile()
	 * @generated
	 */
	void setModelSourceFile(String value);

	/**
	 * Returns the value of the '<em><b>Session Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session Script</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Script</em>' attribute.
	 * @see #setSessionScript(String)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getNuSMVInput_SessionScript()
	 * @model extendedMetaData="processing='skip'"
	 * @generated
	 */
	String getSessionScript();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVInput#getSessionScript <em>Session Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Script</em>' attribute.
	 * @see #getSessionScript()
	 * @generated
	 */
	void setSessionScript(String value);

} // NuSMVInput
