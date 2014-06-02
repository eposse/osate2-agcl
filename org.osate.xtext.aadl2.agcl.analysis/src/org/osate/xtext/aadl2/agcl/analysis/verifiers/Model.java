/**
 */
package org.osate.xtext.aadl2.agcl.analysis.verifiers;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getModel()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Model extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method should return a textual representation of the model. 
	 * 
	 * @param args	information that may be required to produced the textual representation
	 * 
	 * <!-- end-model-doc -->
	 * @model required="true"
	 * @generated
	 */
	String text(Object args);
} // Model
