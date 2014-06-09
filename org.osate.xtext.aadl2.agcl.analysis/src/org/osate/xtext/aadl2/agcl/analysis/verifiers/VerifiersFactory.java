/**
 */
package org.osate.xtext.aadl2.agcl.analysis.verifiers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage
 * @generated
 */
public interface VerifiersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VerifiersFactory eINSTANCE = org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Positive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positive</em>'.
	 * @generated
	 */
	Positive createPositive();

	/**
	 * Returns a new object of class '<em>Negative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negative</em>'.
	 * @generated
	 */
	Negative createNegative();

	/**
	 * Returns a new object of class '<em>Nu SMV Model Checker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nu SMV Model Checker</em>'.
	 * @generated
	 */
	NuSMVModelChecker createNuSMVModelChecker();

	/**
	 * Returns a new object of class '<em>Nu SMV Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nu SMV Input</em>'.
	 * @generated
	 */
	NuSMVInput createNuSMVInput();

	/**
	 * Returns a new object of class '<em>Nu SMV Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nu SMV Output</em>'.
	 * @generated
	 */
	NuSMVOutput createNuSMVOutput();

	/**
	 * Returns a new object of class '<em>Nu SMV Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nu SMV Model</em>'.
	 * @generated
	 */
	NuSMVModel createNuSMVModel();

	/**
	 * Returns a new object of class '<em>Nu SMV Universal Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nu SMV Universal Model</em>'.
	 * @generated
	 */
	NuSMVUniversalModel createNuSMVUniversalModel();

	/**
	 * Returns a new object of class '<em>Nu SMV Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nu SMV Specification</em>'.
	 * @generated
	 */
	NuSMVSpecification createNuSMVSpecification();

	/**
	 * Returns a new object of class '<em>Unknown</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unknown</em>'.
	 * @generated
	 */
	Unknown createUnknown();

	/**
	 * Returns a new object of class '<em>Results Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Results Collection</em>'.
	 * @generated
	 */
	ResultsCollection createResultsCollection();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Viewpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Viewpoint</em>'.
	 * @generated
	 */
	Viewpoint createViewpoint();

	/**
	 * Returns a new object of class '<em>Verification Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Verification Unit</em>'.
	 * @generated
	 */
	VerificationUnit createVerificationUnit();

	/**
	 * Returns a new object of class '<em>Result Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Entry</em>'.
	 * @generated
	 */
	ResultEntry createResultEntry();

	/**
	 * Returns a new object of class '<em>Viewpoint Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Viewpoint Collection</em>'.
	 * @generated
	 */
	ViewpointCollection createViewpointCollection();

	/**
	 * Returns a new object of class '<em>Component Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Collection</em>'.
	 * @generated
	 */
	ComponentCollection createComponentCollection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VerifiersPackage getVerifiersPackage();

} //VerifiersFactory
