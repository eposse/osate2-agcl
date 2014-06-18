/**
 */
package org.osate.xtext.aadl2.agcl.analysis.verifiers;

import org.osate.aadl2.Classifier;
import org.osate.xtext.aadl2.agcl.agcl.PSLSpec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nu SMV Model Checker</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getNuSMVModelChecker()
 * @model
 * @generated
 */
public interface NuSMVModelChecker extends ModelChecker {

	public void checkSpecValidity(PSLSpec pslSpec, String viewpointName, String componentName, String label);

} // NuSMVModelChecker
