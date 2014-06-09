/**
 */
package org.osate.xtext.aadl2.agcl.analysis.verifiers;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersFactory
 * @model kind="package"
 * @generated
 */
public interface VerifiersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "verifiers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://verifiers/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.osate.xtext.aadl2.agcl.analysis.verifiers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VerifiersPackage eINSTANCE = org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationResult <em>Verification Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationResult
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getVerificationResult()
	 * @generated
	 */
	int VERIFICATION_RESULT = 0;

	/**
	 * The number of structural features of the '<em>Verification Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_RESULT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Verification Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.PositiveImpl <em>Positive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.PositiveImpl
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getPositive()
	 * @generated
	 */
	int POSITIVE = 1;

	/**
	 * The number of structural features of the '<em>Positive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_FEATURE_COUNT = VERIFICATION_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_OPERATION_COUNT = VERIFICATION_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NegativeImpl <em>Negative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NegativeImpl
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getNegative()
	 * @generated
	 */
	int NEGATIVE = 2;

	/**
	 * The feature id for the '<em><b>Counterexample</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE__COUNTEREXAMPLE = VERIFICATION_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Negative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_FEATURE_COUNT = VERIFICATION_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Negative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OPERATION_COUNT = VERIFICATION_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Model <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Model
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 3;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONTEXT = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___TEXT__OBJECT = 0;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__SPEC = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CONTEXT = 1;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION___TEXT__OBJECT = 0;

	/**
	 * The number of operations of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.CounterExampleImpl <em>Counter Example</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.CounterExampleImpl
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getCounterExample()
	 * @generated
	 */
	int COUNTER_EXAMPLE = 5;

	/**
	 * The number of structural features of the '<em>Counter Example</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_EXAMPLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Counter Example</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_EXAMPLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.UniversalModel <em>Universal Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.UniversalModel
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getUniversalModel()
	 * @generated
	 */
	int UNIVERSAL_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_MODEL__MODEL = MODEL__MODEL;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_MODEL__CONTEXT = MODEL__CONTEXT;

	/**
	 * The number of structural features of the '<em>Universal Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_MODEL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_MODEL___TEXT__OBJECT = MODEL___TEXT__OBJECT;

	/**
	 * The number of operations of the '<em>Universal Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_MODEL_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ModelCheckerImpl <em>Model Checker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ModelCheckerImpl
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getModelChecker()
	 * @generated
	 */
	int MODEL_CHECKER = 7;

	/**
	 * The feature id for the '<em><b>Resource Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER__RESOURCE_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Results</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER__RESULTS = 1;

	/**
	 * The feature id for the '<em><b>Verification Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER__VERIFICATION_UNITS = 2;

	/**
	 * The feature id for the '<em><b>Viewpoint Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER__VIEWPOINT_COLLECTION = 3;

	/**
	 * The feature id for the '<em><b>Component Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER__COMPONENT_COLLECTION = 4;

	/**
	 * The number of structural features of the '<em>Model Checker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Set Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER___SET_UP__RESOURCE = 0;

	/**
	 * The operation id for the '<em>Make Verification Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER___MAKE_VERIFICATION_UNIT__MODEL_SPECIFICATION_VIEWPOINT_COMPONENT = 1;

	/**
	 * The operation id for the '<em>Make Verification Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER___MAKE_VERIFICATION_UNIT__SPECIFICATION_VIEWPOINT_COMPONENT = 2;

	/**
	 * The operation id for the '<em>Check Verification Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER___CHECK_VERIFICATION_UNIT__VERIFICATIONUNIT = 3;

	/**
	 * The operation id for the '<em>Prepare Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER___PREPARE_INPUT__VERIFICATIONUNIT = 4;

	/**
	 * The operation id for the '<em>Call External</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER___CALL_EXTERNAL__MODELCHECKERINPUT = 5;

	/**
	 * The operation id for the '<em>Process Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER___PROCESS_OUTPUT__MODELCHECKEROUTPUT = 6;

	/**
	 * The operation id for the '<em>Add Verification Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER___ADD_VERIFICATION_UNIT__VERIFICATIONUNIT = 7;

	/**
	 * The operation id for the '<em>Remove Verification Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER___REMOVE_VERIFICATION_UNIT__STRING = 8;

	/**
	 * The operation id for the '<em>Get Verification Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER___GET_VERIFICATION_UNIT__STRING = 9;

	/**
	 * The operation id for the '<em>Check All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER___CHECK_ALL = 10;

	/**
	 * The number of operations of the '<em>Model Checker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER_OPERATION_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVModelCheckerImpl <em>Nu SMV Model Checker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVModelCheckerImpl
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getNuSMVModelChecker()
	 * @generated
	 */
	int NU_SMV_MODEL_CHECKER = 8;

	/**
	 * The feature id for the '<em><b>Resource Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL_CHECKER__RESOURCE_CONTEXT = MODEL_CHECKER__RESOURCE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Results</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL_CHECKER__RESULTS = MODEL_CHECKER__RESULTS;

	/**
	 * The feature id for the '<em><b>Verification Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL_CHECKER__VERIFICATION_UNITS = MODEL_CHECKER__VERIFICATION_UNITS;

	/**
	 * The feature id for the '<em><b>Viewpoint Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL_CHECKER__VIEWPOINT_COLLECTION = MODEL_CHECKER__VIEWPOINT_COLLECTION;

	/**
	 * The feature id for the '<em><b>Component Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL_CHECKER__COMPONENT_COLLECTION = MODEL_CHECKER__COMPONENT_COLLECTION;

	/**
	 * The number of structural features of the '<em>Nu SMV Model Checker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL_CHECKER_FEATURE_COUNT = MODEL_CHECKER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL_CHECKER___SET_UP__RESOURCE = MODEL_CHECKER___SET_UP__RESOURCE;

	/**
	 * The operation id for the '<em>Make Verification Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL_CHECKER___MAKE_VERIFICATION_UNIT__MODEL_SPECIFICATION_VIEWPOINT_COMPONENT = MODEL_CHECKER___MAKE_VERIFICATION_UNIT__MODEL_SPECIFICATION_VIEWPOINT_COMPONENT;

	/**
	 * The operation id for the '<em>Make Verification Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL_CHECKER___MAKE_VERIFICATION_UNIT__SPECIFICATION_VIEWPOINT_COMPONENT = MODEL_CHECKER___MAKE_VERIFICATION_UNIT__SPECIFICATION_VIEWPOINT_COMPONENT;

	/**
	 * The operation id for the '<em>Check Verification Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL_CHECKER___CHECK_VERIFICATION_UNIT__VERIFICATIONUNIT = MODEL_CHECKER___CHECK_VERIFICATION_UNIT__VERIFICATIONUNIT;

	/**
	 * The operation id for the '<em>Prepare Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL_CHECKER___PREPARE_INPUT__VERIFICATIONUNIT = MODEL_CHECKER___PREPARE_INPUT__VERIFICATIONUNIT;

	/**
	 * The operation id for the '<em>Call External</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL_CHECKER___CALL_EXTERNAL__MODELCHECKERINPUT = MODEL_CHECKER___CALL_EXTERNAL__MODELCHECKERINPUT;

	/**
	 * The operation id for the '<em>Process Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL_CHECKER___PROCESS_OUTPUT__MODELCHECKEROUTPUT = MODEL_CHECKER___PROCESS_OUTPUT__MODELCHECKEROUTPUT;

	/**
	 * The operation id for the '<em>Add Verification Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL_CHECKER___ADD_VERIFICATION_UNIT__VERIFICATIONUNIT = MODEL_CHECKER___ADD_VERIFICATION_UNIT__VERIFICATIONUNIT;

	/**
	 * The operation id for the '<em>Remove Verification Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL_CHECKER___REMOVE_VERIFICATION_UNIT__STRING = MODEL_CHECKER___REMOVE_VERIFICATION_UNIT__STRING;

	/**
	 * The operation id for the '<em>Get Verification Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL_CHECKER___GET_VERIFICATION_UNIT__STRING = MODEL_CHECKER___GET_VERIFICATION_UNIT__STRING;

	/**
	 * The operation id for the '<em>Check All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL_CHECKER___CHECK_ALL = MODEL_CHECKER___CHECK_ALL;

	/**
	 * The number of operations of the '<em>Nu SMV Model Checker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL_CHECKER_OPERATION_COUNT = MODEL_CHECKER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ModelCheckerInputImpl <em>Model Checker Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ModelCheckerInputImpl
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getModelCheckerInput()
	 * @generated
	 */
	int MODEL_CHECKER_INPUT = 9;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER_INPUT__SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER_INPUT__OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Verification Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER_INPUT__VERIFICATION_UNIT = 2;

	/**
	 * The number of structural features of the '<em>Model Checker Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER_INPUT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model Checker Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER_INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ModelCheckerOutputImpl <em>Model Checker Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ModelCheckerOutputImpl
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getModelCheckerOutput()
	 * @generated
	 */
	int MODEL_CHECKER_OUTPUT = 10;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER_OUTPUT__RESULT = 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER_OUTPUT__INPUT = 1;

	/**
	 * The number of structural features of the '<em>Model Checker Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER_OUTPUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model Checker Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER_OUTPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVInputImpl <em>Nu SMV Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVInputImpl
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getNuSMVInput()
	 * @generated
	 */
	int NU_SMV_INPUT = 11;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_INPUT__SPECIFICATION = MODEL_CHECKER_INPUT__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_INPUT__OUTPUT = MODEL_CHECKER_INPUT__OUTPUT;

	/**
	 * The feature id for the '<em><b>Verification Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_INPUT__VERIFICATION_UNIT = MODEL_CHECKER_INPUT__VERIFICATION_UNIT;

	/**
	 * The feature id for the '<em><b>Model File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_INPUT__MODEL_FILE_NAME = MODEL_CHECKER_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Session Script File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_INPUT__SESSION_SCRIPT_FILE_NAME = MODEL_CHECKER_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Nu SMV Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_INPUT_FEATURE_COUNT = MODEL_CHECKER_INPUT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Nu SMV Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_INPUT_OPERATION_COUNT = MODEL_CHECKER_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVOutputImpl <em>Nu SMV Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVOutputImpl
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getNuSMVOutput()
	 * @generated
	 */
	int NU_SMV_OUTPUT = 12;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_OUTPUT__RESULT = MODEL_CHECKER_OUTPUT__RESULT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_OUTPUT__INPUT = MODEL_CHECKER_OUTPUT__INPUT;

	/**
	 * The feature id for the '<em><b>Output File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_OUTPUT__OUTPUT_FILE_NAME = MODEL_CHECKER_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Counter Example File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_OUTPUT__COUNTER_EXAMPLE_FILE_NAME = MODEL_CHECKER_OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Nu SMV Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_OUTPUT_FEATURE_COUNT = MODEL_CHECKER_OUTPUT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Nu SMV Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_OUTPUT_OPERATION_COUNT = MODEL_CHECKER_OUTPUT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVModelImpl <em>Nu SMV Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVModelImpl
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getNuSMVModel()
	 * @generated
	 */
	int NU_SMV_MODEL = 13;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL__MODEL = MODEL__MODEL;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL__CONTEXT = MODEL__CONTEXT;

	/**
	 * The feature id for the '<em><b>Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL__VARS = MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL__INIT = MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL__TRANS = MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Nu SMV Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL___TEXT__OBJECT = MODEL___TEXT__OBJECT;

	/**
	 * The number of operations of the '<em>Nu SMV Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVUniversalModelImpl <em>Nu SMV Universal Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVUniversalModelImpl
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getNuSMVUniversalModel()
	 * @generated
	 */
	int NU_SMV_UNIVERSAL_MODEL = 14;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_UNIVERSAL_MODEL__MODEL = NU_SMV_MODEL__MODEL;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_UNIVERSAL_MODEL__CONTEXT = NU_SMV_MODEL__CONTEXT;

	/**
	 * The feature id for the '<em><b>Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_UNIVERSAL_MODEL__VARS = NU_SMV_MODEL__VARS;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_UNIVERSAL_MODEL__INIT = NU_SMV_MODEL__INIT;

	/**
	 * The feature id for the '<em><b>Trans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_UNIVERSAL_MODEL__TRANS = NU_SMV_MODEL__TRANS;

	/**
	 * The number of structural features of the '<em>Nu SMV Universal Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_UNIVERSAL_MODEL_FEATURE_COUNT = NU_SMV_MODEL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_UNIVERSAL_MODEL___TEXT__OBJECT = NU_SMV_MODEL___TEXT__OBJECT;

	/**
	 * The number of operations of the '<em>Nu SMV Universal Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_UNIVERSAL_MODEL_OPERATION_COUNT = NU_SMV_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVSpecificationImpl <em>Nu SMV Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVSpecificationImpl
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getNuSMVSpecification()
	 * @generated
	 */
	int NU_SMV_SPECIFICATION = 15;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_SPECIFICATION__SPEC = SPECIFICATION__SPEC;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_SPECIFICATION__CONTEXT = SPECIFICATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Logic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_SPECIFICATION__LOGIC = SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nu SMV Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_SPECIFICATION_FEATURE_COUNT = SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_SPECIFICATION___TEXT__OBJECT = SPECIFICATION___TEXT__OBJECT;

	/**
	 * The number of operations of the '<em>Nu SMV Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_SPECIFICATION_OPERATION_COUNT = SPECIFICATION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.UnknownImpl <em>Unknown</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.UnknownImpl
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getUnknown()
	 * @generated
	 */
	int UNKNOWN = 16;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN__REASON = VERIFICATION_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unknown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_FEATURE_COUNT = VERIFICATION_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unknown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_OPERATION_COUNT = VERIFICATION_RESULT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ResultsCollectionImpl <em>Results Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ResultsCollectionImpl
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getResultsCollection()
	 * @generated
	 */
	int RESULTS_COLLECTION = 17;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_COLLECTION__ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Results Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_COLLECTION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Record Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_COLLECTION___RECORD_RESULT__VERIFICATIONUNIT_VERIFICATIONRESULT = 0;

	/**
	 * The number of operations of the '<em>Results Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_COLLECTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ComponentImpl
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OBJECT = 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ViewpointImpl <em>Viewpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ViewpointImpl
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getViewpoint()
	 * @generated
	 */
	int VIEWPOINT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__OBJECT = 1;

	/**
	 * The number of structural features of the '<em>Viewpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Viewpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerificationUnitImpl <em>Verification Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerificationUnitImpl
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getVerificationUnit()
	 * @generated
	 */
	int VERIFICATION_UNIT = 20;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_UNIT__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_UNIT__SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Viewpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_UNIT__VIEWPOINT = 2;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_UNIT__COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_UNIT__NAME = 4;

	/**
	 * The number of structural features of the '<em>Verification Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_UNIT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Verification Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ResultEntryImpl <em>Result Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ResultEntryImpl
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getResultEntry()
	 * @generated
	 */
	int RESULT_ENTRY = 21;

	/**
	 * The feature id for the '<em><b>Verification Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ENTRY__VERIFICATION_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ENTRY__RESULT = 1;

	/**
	 * The number of structural features of the '<em>Result Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Result Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ENTRY_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ViewpointCollectionImpl <em>Viewpoint Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ViewpointCollectionImpl
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getViewpointCollection()
	 * @generated
	 */
	int VIEWPOINT_COLLECTION = 22;

	/**
	 * The feature id for the '<em><b>Viewpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_COLLECTION__VIEWPOINTS = 0;

	/**
	 * The number of structural features of the '<em>Viewpoint Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_COLLECTION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Viewpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_COLLECTION___GET_VIEWPOINT__STRING = 0;

	/**
	 * The operation id for the '<em>Add Viewpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_COLLECTION___ADD_VIEWPOINT__STRING_OBJECT = 1;

	/**
	 * The operation id for the '<em>Remove Viewpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_COLLECTION___REMOVE_VIEWPOINT__STRING = 2;

	/**
	 * The operation id for the '<em>Contains Viewpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_COLLECTION___CONTAINS_VIEWPOINT__STRING = 3;

	/**
	 * The number of operations of the '<em>Viewpoint Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_COLLECTION_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ComponentCollectionImpl <em>Component Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ComponentCollectionImpl
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getComponentCollection()
	 * @generated
	 */
	int COMPONENT_COLLECTION = 23;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_COLLECTION__COMPONENTS = 0;

	/**
	 * The number of structural features of the '<em>Component Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_COLLECTION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_COLLECTION___GET_COMPONENT__STRING = 0;

	/**
	 * The operation id for the '<em>Add Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_COLLECTION___ADD_COMPONENT__STRING_OBJECT = 1;

	/**
	 * The operation id for the '<em>Remove Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_COLLECTION___REMOVE_COMPONENT__STRING = 2;

	/**
	 * The operation id for the '<em>Contains Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_COLLECTION___CONTAINS_COMPONENT__STRING = 3;

	/**
	 * The number of operations of the '<em>Component Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_COLLECTION_OPERATION_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationResult <em>Verification Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verification Result</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationResult
	 * @generated
	 */
	EClass getVerificationResult();

	/**
	 * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Positive <em>Positive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Positive
	 * @generated
	 */
	EClass getPositive();

	/**
	 * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Negative <em>Negative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Negative
	 * @generated
	 */
	EClass getNegative();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Negative#getCounterexample <em>Counterexample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Counterexample</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Negative#getCounterexample()
	 * @see #getNegative()
	 * @generated
	 */
	EReference getNegative_Counterexample();

	/**
	 * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Model#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Model#getModel()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Model();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Model#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Model#getContext()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Context();

	/**
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Model#text(java.lang.Object) <em>Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Text</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Model#text(java.lang.Object)
	 * @generated
	 */
	EOperation getModel__Text__Object();

	/**
	 * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification#getSpec <em>Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spec</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification#getSpec()
	 * @see #getSpecification()
	 * @generated
	 */
	EAttribute getSpecification_Spec();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification#getContext()
	 * @see #getSpecification()
	 * @generated
	 */
	EAttribute getSpecification_Context();

	/**
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification#text(java.lang.Object) <em>Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Text</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification#text(java.lang.Object)
	 * @generated
	 */
	EOperation getSpecification__Text__Object();

	/**
	 * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.CounterExample <em>Counter Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counter Example</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.CounterExample
	 * @generated
	 */
	EClass getCounterExample();

	/**
	 * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.UniversalModel <em>Universal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universal Model</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.UniversalModel
	 * @generated
	 */
	EClass getUniversalModel();

	/**
	 * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker <em>Model Checker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Checker</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker
	 * @generated
	 */
	EClass getModelChecker();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#getResourceContext <em>Resource Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Context</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#getResourceContext()
	 * @see #getModelChecker()
	 * @generated
	 */
	EAttribute getModelChecker_ResourceContext();

	/**
	 * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Results</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#getResults()
	 * @see #getModelChecker()
	 * @generated
	 */
	EReference getModelChecker_Results();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#getVerificationUnits <em>Verification Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Verification Units</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#getVerificationUnits()
	 * @see #getModelChecker()
	 * @generated
	 */
	EReference getModelChecker_VerificationUnits();

	/**
	 * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#getViewpointCollection <em>Viewpoint Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Viewpoint Collection</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#getViewpointCollection()
	 * @see #getModelChecker()
	 * @generated
	 */
	EReference getModelChecker_ViewpointCollection();

	/**
	 * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#getComponentCollection <em>Component Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Collection</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#getComponentCollection()
	 * @see #getModelChecker()
	 * @generated
	 */
	EReference getModelChecker_ComponentCollection();

	/**
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#setUp(org.eclipse.emf.ecore.resource.Resource) <em>Set Up</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Up</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#setUp(org.eclipse.emf.ecore.resource.Resource)
	 * @generated
	 */
	EOperation getModelChecker__SetUp__Resource();

	/**
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#makeVerificationUnit(org.osate.xtext.aadl2.agcl.analysis.verifiers.Model, org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification, org.osate.xtext.aadl2.agcl.analysis.verifiers.Viewpoint, org.osate.xtext.aadl2.agcl.analysis.verifiers.Component) <em>Make Verification Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Verification Unit</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#makeVerificationUnit(org.osate.xtext.aadl2.agcl.analysis.verifiers.Model, org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification, org.osate.xtext.aadl2.agcl.analysis.verifiers.Viewpoint, org.osate.xtext.aadl2.agcl.analysis.verifiers.Component)
	 * @generated
	 */
	EOperation getModelChecker__MakeVerificationUnit__Model_Specification_Viewpoint_Component();

	/**
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#makeVerificationUnit(org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification, org.osate.xtext.aadl2.agcl.analysis.verifiers.Viewpoint, org.osate.xtext.aadl2.agcl.analysis.verifiers.Component) <em>Make Verification Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Verification Unit</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#makeVerificationUnit(org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification, org.osate.xtext.aadl2.agcl.analysis.verifiers.Viewpoint, org.osate.xtext.aadl2.agcl.analysis.verifiers.Component)
	 * @generated
	 */
	EOperation getModelChecker__MakeVerificationUnit__Specification_Viewpoint_Component();

	/**
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#checkVerificationUnit(org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit) <em>Check Verification Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Verification Unit</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#checkVerificationUnit(org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit)
	 * @generated
	 */
	EOperation getModelChecker__CheckVerificationUnit__VerificationUnit();

	/**
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#prepareInput(org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit) <em>Prepare Input</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Prepare Input</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#prepareInput(org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit)
	 * @generated
	 */
	EOperation getModelChecker__PrepareInput__VerificationUnit();

	/**
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#processOutput(org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerOutput) <em>Process Output</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Process Output</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#processOutput(org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerOutput)
	 * @generated
	 */
	EOperation getModelChecker__ProcessOutput__ModelCheckerOutput();

	/**
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#callExternal(org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerInput) <em>Call External</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Call External</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#callExternal(org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerInput)
	 * @generated
	 */
	EOperation getModelChecker__CallExternal__ModelCheckerInput();

	/**
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#addVerificationUnit(org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit) <em>Add Verification Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Verification Unit</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#addVerificationUnit(org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit)
	 * @generated
	 */
	EOperation getModelChecker__AddVerificationUnit__VerificationUnit();

	/**
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#removeVerificationUnit(java.lang.String) <em>Remove Verification Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Verification Unit</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#removeVerificationUnit(java.lang.String)
	 * @generated
	 */
	EOperation getModelChecker__RemoveVerificationUnit__String();

	/**
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#getVerificationUnit(java.lang.String) <em>Get Verification Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Verification Unit</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#getVerificationUnit(java.lang.String)
	 * @generated
	 */
	EOperation getModelChecker__GetVerificationUnit__String();

	/**
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#checkAll() <em>Check All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check All</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#checkAll()
	 * @generated
	 */
	EOperation getModelChecker__CheckAll();

	/**
	 * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModelChecker <em>Nu SMV Model Checker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nu SMV Model Checker</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModelChecker
	 * @generated
	 */
	EClass getNuSMVModelChecker();

	/**
	 * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerInput <em>Model Checker Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Checker Input</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerInput
	 * @generated
	 */
	EClass getModelCheckerInput();

	/**
	 * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerInput#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specification</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerInput#getSpecification()
	 * @see #getModelCheckerInput()
	 * @generated
	 */
	EReference getModelCheckerInput_Specification();

	/**
	 * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerInput#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerInput#getOutput()
	 * @see #getModelCheckerInput()
	 * @generated
	 */
	EReference getModelCheckerInput_Output();

	/**
	 * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerInput#getVerificationUnit <em>Verification Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Verification Unit</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerInput#getVerificationUnit()
	 * @see #getModelCheckerInput()
	 * @generated
	 */
	EReference getModelCheckerInput_VerificationUnit();

	/**
	 * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerOutput <em>Model Checker Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Checker Output</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerOutput
	 * @generated
	 */
	EClass getModelCheckerOutput();

	/**
	 * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerOutput#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerOutput#getResult()
	 * @see #getModelCheckerOutput()
	 * @generated
	 */
	EReference getModelCheckerOutput_Result();

	/**
	 * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerOutput#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerOutput#getInput()
	 * @see #getModelCheckerOutput()
	 * @generated
	 */
	EReference getModelCheckerOutput_Input();

	/**
	 * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVInput <em>Nu SMV Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nu SMV Input</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVInput
	 * @generated
	 */
	EClass getNuSMVInput();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVInput#getModelFileName <em>Model File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model File Name</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVInput#getModelFileName()
	 * @see #getNuSMVInput()
	 * @generated
	 */
	EAttribute getNuSMVInput_ModelFileName();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVInput#getSessionScriptFileName <em>Session Script File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session Script File Name</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVInput#getSessionScriptFileName()
	 * @see #getNuSMVInput()
	 * @generated
	 */
	EAttribute getNuSMVInput_SessionScriptFileName();

	/**
	 * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVOutput <em>Nu SMV Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nu SMV Output</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVOutput
	 * @generated
	 */
	EClass getNuSMVOutput();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVOutput#getOutputFileName <em>Output File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output File Name</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVOutput#getOutputFileName()
	 * @see #getNuSMVOutput()
	 * @generated
	 */
	EAttribute getNuSMVOutput_OutputFileName();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVOutput#getCounterExampleFileName <em>Counter Example File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter Example File Name</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVOutput#getCounterExampleFileName()
	 * @see #getNuSMVOutput()
	 * @generated
	 */
	EAttribute getNuSMVOutput_CounterExampleFileName();

	/**
	 * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModel <em>Nu SMV Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nu SMV Model</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModel
	 * @generated
	 */
	EClass getNuSMVModel();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModel#getVars <em>Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vars</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModel#getVars()
	 * @see #getNuSMVModel()
	 * @generated
	 */
	EAttribute getNuSMVModel_Vars();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModel#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModel#getInit()
	 * @see #getNuSMVModel()
	 * @generated
	 */
	EAttribute getNuSMVModel_Init();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModel#getTrans <em>Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trans</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModel#getTrans()
	 * @see #getNuSMVModel()
	 * @generated
	 */
	EAttribute getNuSMVModel_Trans();

	/**
	 * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVUniversalModel <em>Nu SMV Universal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nu SMV Universal Model</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVUniversalModel
	 * @generated
	 */
	EClass getNuSMVUniversalModel();

	/**
	 * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVSpecification <em>Nu SMV Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nu SMV Specification</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVSpecification
	 * @generated
	 */
	EClass getNuSMVSpecification();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVSpecification#getLogic <em>Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logic</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVSpecification#getLogic()
	 * @see #getNuSMVSpecification()
	 * @generated
	 */
	EAttribute getNuSMVSpecification_Logic();

	/**
	 * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Unknown <em>Unknown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Unknown
	 * @generated
	 */
	EClass getUnknown();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Unknown#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Unknown#getReason()
	 * @see #getUnknown()
	 * @generated
	 */
	EAttribute getUnknown_Reason();

	/**
	 * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ResultsCollection <em>Results Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Results Collection</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ResultsCollection
	 * @generated
	 */
	EClass getResultsCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ResultsCollection#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ResultsCollection#getEntries()
	 * @see #getResultsCollection()
	 * @generated
	 */
	EReference getResultsCollection_Entries();

	/**
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ResultsCollection#recordResult(org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit, org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationResult) <em>Record Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Record Result</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ResultsCollection#recordResult(org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit, org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationResult)
	 * @generated
	 */
	EOperation getResultsCollection__RecordResult__VerificationUnit_VerificationResult();

	/**
	 * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Component#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Component#getObject()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Object();

	/**
	 * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Viewpoint <em>Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Viewpoint</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Viewpoint
	 * @generated
	 */
	EClass getViewpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Viewpoint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Viewpoint#getName()
	 * @see #getViewpoint()
	 * @generated
	 */
	EAttribute getViewpoint_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Viewpoint#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Viewpoint#getObject()
	 * @see #getViewpoint()
	 * @generated
	 */
	EAttribute getViewpoint_Object();

	/**
	 * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit <em>Verification Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verification Unit</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit
	 * @generated
	 */
	EClass getVerificationUnit();

	/**
	 * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit#getModel()
	 * @see #getVerificationUnit()
	 * @generated
	 */
	EReference getVerificationUnit_Model();

	/**
	 * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specification</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit#getSpecification()
	 * @see #getVerificationUnit()
	 * @generated
	 */
	EReference getVerificationUnit_Specification();

	/**
	 * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit#getViewpoint <em>Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Viewpoint</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit#getViewpoint()
	 * @see #getVerificationUnit()
	 * @generated
	 */
	EReference getVerificationUnit_Viewpoint();

	/**
	 * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit#getComponent()
	 * @see #getVerificationUnit()
	 * @generated
	 */
	EReference getVerificationUnit_Component();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit#getName()
	 * @see #getVerificationUnit()
	 * @generated
	 */
	EAttribute getVerificationUnit_Name();

	/**
	 * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ResultEntry <em>Result Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Entry</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ResultEntry
	 * @generated
	 */
	EClass getResultEntry();

	/**
	 * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ResultEntry#getVerificationUnit <em>Verification Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Verification Unit</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ResultEntry#getVerificationUnit()
	 * @see #getResultEntry()
	 * @generated
	 */
	EReference getResultEntry_VerificationUnit();

	/**
	 * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ResultEntry#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ResultEntry#getResult()
	 * @see #getResultEntry()
	 * @generated
	 */
	EReference getResultEntry_Result();

	/**
	 * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ViewpointCollection <em>Viewpoint Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Viewpoint Collection</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ViewpointCollection
	 * @generated
	 */
	EClass getViewpointCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ViewpointCollection#getViewpoints <em>Viewpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Viewpoints</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ViewpointCollection#getViewpoints()
	 * @see #getViewpointCollection()
	 * @generated
	 */
	EReference getViewpointCollection_Viewpoints();

	/**
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ViewpointCollection#getViewpoint(java.lang.String) <em>Get Viewpoint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Viewpoint</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ViewpointCollection#getViewpoint(java.lang.String)
	 * @generated
	 */
	EOperation getViewpointCollection__GetViewpoint__String();

	/**
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ViewpointCollection#addViewpoint(java.lang.String, java.lang.Object) <em>Add Viewpoint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Viewpoint</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ViewpointCollection#addViewpoint(java.lang.String, java.lang.Object)
	 * @generated
	 */
	EOperation getViewpointCollection__AddViewpoint__String_Object();

	/**
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ViewpointCollection#removeViewpoint(java.lang.String) <em>Remove Viewpoint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Viewpoint</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ViewpointCollection#removeViewpoint(java.lang.String)
	 * @generated
	 */
	EOperation getViewpointCollection__RemoveViewpoint__String();

	/**
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ViewpointCollection#containsViewpoint(java.lang.String) <em>Contains Viewpoint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains Viewpoint</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ViewpointCollection#containsViewpoint(java.lang.String)
	 * @generated
	 */
	EOperation getViewpointCollection__ContainsViewpoint__String();

	/**
	 * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ComponentCollection <em>Component Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Collection</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ComponentCollection
	 * @generated
	 */
	EClass getComponentCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ComponentCollection#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ComponentCollection#getComponents()
	 * @see #getComponentCollection()
	 * @generated
	 */
	EReference getComponentCollection_Components();

	/**
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ComponentCollection#getComponent(java.lang.String) <em>Get Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Component</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ComponentCollection#getComponent(java.lang.String)
	 * @generated
	 */
	EOperation getComponentCollection__GetComponent__String();

	/**
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ComponentCollection#addComponent(java.lang.String, java.lang.Object) <em>Add Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Component</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ComponentCollection#addComponent(java.lang.String, java.lang.Object)
	 * @generated
	 */
	EOperation getComponentCollection__AddComponent__String_Object();

	/**
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ComponentCollection#removeComponent(java.lang.String) <em>Remove Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Component</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ComponentCollection#removeComponent(java.lang.String)
	 * @generated
	 */
	EOperation getComponentCollection__RemoveComponent__String();

	/**
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ComponentCollection#containsComponent(java.lang.String) <em>Contains Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains Component</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ComponentCollection#containsComponent(java.lang.String)
	 * @generated
	 */
	EOperation getComponentCollection__ContainsComponent__String();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VerifiersFactory getVerifiersFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationResult <em>Verification Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationResult
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getVerificationResult()
		 * @generated
		 */
		EClass VERIFICATION_RESULT = eINSTANCE.getVerificationResult();

		/**
		 * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.PositiveImpl <em>Positive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.PositiveImpl
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getPositive()
		 * @generated
		 */
		EClass POSITIVE = eINSTANCE.getPositive();

		/**
		 * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NegativeImpl <em>Negative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NegativeImpl
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getNegative()
		 * @generated
		 */
		EClass NEGATIVE = eINSTANCE.getNegative();

		/**
		 * The meta object literal for the '<em><b>Counterexample</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATIVE__COUNTEREXAMPLE = eINSTANCE.getNegative_Counterexample();

		/**
		 * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Model <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Model
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__MODEL = eINSTANCE.getModel_Model();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__CONTEXT = eINSTANCE.getModel_Context();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___TEXT__OBJECT = eINSTANCE.getModel__Text__Object();

		/**
		 * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '<em><b>Spec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION__SPEC = eINSTANCE.getSpecification_Spec();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION__CONTEXT = eINSTANCE.getSpecification_Context();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPECIFICATION___TEXT__OBJECT = eINSTANCE.getSpecification__Text__Object();

		/**
		 * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.CounterExampleImpl <em>Counter Example</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.CounterExampleImpl
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getCounterExample()
		 * @generated
		 */
		EClass COUNTER_EXAMPLE = eINSTANCE.getCounterExample();

		/**
		 * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.UniversalModel <em>Universal Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.UniversalModel
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getUniversalModel()
		 * @generated
		 */
		EClass UNIVERSAL_MODEL = eINSTANCE.getUniversalModel();

		/**
		 * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ModelCheckerImpl <em>Model Checker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ModelCheckerImpl
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getModelChecker()
		 * @generated
		 */
		EClass MODEL_CHECKER = eINSTANCE.getModelChecker();

		/**
		 * The meta object literal for the '<em><b>Resource Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_CHECKER__RESOURCE_CONTEXT = eINSTANCE.getModelChecker_ResourceContext();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_CHECKER__RESULTS = eINSTANCE.getModelChecker_Results();

		/**
		 * The meta object literal for the '<em><b>Verification Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_CHECKER__VERIFICATION_UNITS = eINSTANCE.getModelChecker_VerificationUnits();

		/**
		 * The meta object literal for the '<em><b>Viewpoint Collection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_CHECKER__VIEWPOINT_COLLECTION = eINSTANCE.getModelChecker_ViewpointCollection();

		/**
		 * The meta object literal for the '<em><b>Component Collection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_CHECKER__COMPONENT_COLLECTION = eINSTANCE.getModelChecker_ComponentCollection();

		/**
		 * The meta object literal for the '<em><b>Set Up</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_CHECKER___SET_UP__RESOURCE = eINSTANCE.getModelChecker__SetUp__Resource();

		/**
		 * The meta object literal for the '<em><b>Make Verification Unit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_CHECKER___MAKE_VERIFICATION_UNIT__MODEL_SPECIFICATION_VIEWPOINT_COMPONENT = eINSTANCE.getModelChecker__MakeVerificationUnit__Model_Specification_Viewpoint_Component();

		/**
		 * The meta object literal for the '<em><b>Make Verification Unit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_CHECKER___MAKE_VERIFICATION_UNIT__SPECIFICATION_VIEWPOINT_COMPONENT = eINSTANCE.getModelChecker__MakeVerificationUnit__Specification_Viewpoint_Component();

		/**
		 * The meta object literal for the '<em><b>Check Verification Unit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_CHECKER___CHECK_VERIFICATION_UNIT__VERIFICATIONUNIT = eINSTANCE.getModelChecker__CheckVerificationUnit__VerificationUnit();

		/**
		 * The meta object literal for the '<em><b>Prepare Input</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_CHECKER___PREPARE_INPUT__VERIFICATIONUNIT = eINSTANCE.getModelChecker__PrepareInput__VerificationUnit();

		/**
		 * The meta object literal for the '<em><b>Process Output</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_CHECKER___PROCESS_OUTPUT__MODELCHECKEROUTPUT = eINSTANCE.getModelChecker__ProcessOutput__ModelCheckerOutput();

		/**
		 * The meta object literal for the '<em><b>Call External</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_CHECKER___CALL_EXTERNAL__MODELCHECKERINPUT = eINSTANCE.getModelChecker__CallExternal__ModelCheckerInput();

		/**
		 * The meta object literal for the '<em><b>Add Verification Unit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_CHECKER___ADD_VERIFICATION_UNIT__VERIFICATIONUNIT = eINSTANCE.getModelChecker__AddVerificationUnit__VerificationUnit();

		/**
		 * The meta object literal for the '<em><b>Remove Verification Unit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_CHECKER___REMOVE_VERIFICATION_UNIT__STRING = eINSTANCE.getModelChecker__RemoveVerificationUnit__String();

		/**
		 * The meta object literal for the '<em><b>Get Verification Unit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_CHECKER___GET_VERIFICATION_UNIT__STRING = eINSTANCE.getModelChecker__GetVerificationUnit__String();

		/**
		 * The meta object literal for the '<em><b>Check All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_CHECKER___CHECK_ALL = eINSTANCE.getModelChecker__CheckAll();

		/**
		 * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVModelCheckerImpl <em>Nu SMV Model Checker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVModelCheckerImpl
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getNuSMVModelChecker()
		 * @generated
		 */
		EClass NU_SMV_MODEL_CHECKER = eINSTANCE.getNuSMVModelChecker();

		/**
		 * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ModelCheckerInputImpl <em>Model Checker Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ModelCheckerInputImpl
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getModelCheckerInput()
		 * @generated
		 */
		EClass MODEL_CHECKER_INPUT = eINSTANCE.getModelCheckerInput();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_CHECKER_INPUT__SPECIFICATION = eINSTANCE.getModelCheckerInput_Specification();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_CHECKER_INPUT__OUTPUT = eINSTANCE.getModelCheckerInput_Output();

		/**
		 * The meta object literal for the '<em><b>Verification Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_CHECKER_INPUT__VERIFICATION_UNIT = eINSTANCE.getModelCheckerInput_VerificationUnit();

		/**
		 * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ModelCheckerOutputImpl <em>Model Checker Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ModelCheckerOutputImpl
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getModelCheckerOutput()
		 * @generated
		 */
		EClass MODEL_CHECKER_OUTPUT = eINSTANCE.getModelCheckerOutput();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_CHECKER_OUTPUT__RESULT = eINSTANCE.getModelCheckerOutput_Result();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_CHECKER_OUTPUT__INPUT = eINSTANCE.getModelCheckerOutput_Input();

		/**
		 * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVInputImpl <em>Nu SMV Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVInputImpl
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getNuSMVInput()
		 * @generated
		 */
		EClass NU_SMV_INPUT = eINSTANCE.getNuSMVInput();

		/**
		 * The meta object literal for the '<em><b>Model File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NU_SMV_INPUT__MODEL_FILE_NAME = eINSTANCE.getNuSMVInput_ModelFileName();

		/**
		 * The meta object literal for the '<em><b>Session Script File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NU_SMV_INPUT__SESSION_SCRIPT_FILE_NAME = eINSTANCE.getNuSMVInput_SessionScriptFileName();

		/**
		 * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVOutputImpl <em>Nu SMV Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVOutputImpl
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getNuSMVOutput()
		 * @generated
		 */
		EClass NU_SMV_OUTPUT = eINSTANCE.getNuSMVOutput();

		/**
		 * The meta object literal for the '<em><b>Output File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NU_SMV_OUTPUT__OUTPUT_FILE_NAME = eINSTANCE.getNuSMVOutput_OutputFileName();

		/**
		 * The meta object literal for the '<em><b>Counter Example File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NU_SMV_OUTPUT__COUNTER_EXAMPLE_FILE_NAME = eINSTANCE.getNuSMVOutput_CounterExampleFileName();

		/**
		 * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVModelImpl <em>Nu SMV Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVModelImpl
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getNuSMVModel()
		 * @generated
		 */
		EClass NU_SMV_MODEL = eINSTANCE.getNuSMVModel();

		/**
		 * The meta object literal for the '<em><b>Vars</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NU_SMV_MODEL__VARS = eINSTANCE.getNuSMVModel_Vars();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NU_SMV_MODEL__INIT = eINSTANCE.getNuSMVModel_Init();

		/**
		 * The meta object literal for the '<em><b>Trans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NU_SMV_MODEL__TRANS = eINSTANCE.getNuSMVModel_Trans();

		/**
		 * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVUniversalModelImpl <em>Nu SMV Universal Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVUniversalModelImpl
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getNuSMVUniversalModel()
		 * @generated
		 */
		EClass NU_SMV_UNIVERSAL_MODEL = eINSTANCE.getNuSMVUniversalModel();

		/**
		 * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVSpecificationImpl <em>Nu SMV Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVSpecificationImpl
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getNuSMVSpecification()
		 * @generated
		 */
		EClass NU_SMV_SPECIFICATION = eINSTANCE.getNuSMVSpecification();

		/**
		 * The meta object literal for the '<em><b>Logic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NU_SMV_SPECIFICATION__LOGIC = eINSTANCE.getNuSMVSpecification_Logic();

		/**
		 * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.UnknownImpl <em>Unknown</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.UnknownImpl
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getUnknown()
		 * @generated
		 */
		EClass UNKNOWN = eINSTANCE.getUnknown();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNKNOWN__REASON = eINSTANCE.getUnknown_Reason();

		/**
		 * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ResultsCollectionImpl <em>Results Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ResultsCollectionImpl
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getResultsCollection()
		 * @generated
		 */
		EClass RESULTS_COLLECTION = eINSTANCE.getResultsCollection();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTS_COLLECTION__ENTRIES = eINSTANCE.getResultsCollection_Entries();

		/**
		 * The meta object literal for the '<em><b>Record Result</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULTS_COLLECTION___RECORD_RESULT__VERIFICATIONUNIT_VERIFICATIONRESULT = eINSTANCE.getResultsCollection__RecordResult__VerificationUnit_VerificationResult();

		/**
		 * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ComponentImpl
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__OBJECT = eINSTANCE.getComponent_Object();

		/**
		 * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ViewpointImpl <em>Viewpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ViewpointImpl
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getViewpoint()
		 * @generated
		 */
		EClass VIEWPOINT = eINSTANCE.getViewpoint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEWPOINT__NAME = eINSTANCE.getViewpoint_Name();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEWPOINT__OBJECT = eINSTANCE.getViewpoint_Object();

		/**
		 * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerificationUnitImpl <em>Verification Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerificationUnitImpl
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getVerificationUnit()
		 * @generated
		 */
		EClass VERIFICATION_UNIT = eINSTANCE.getVerificationUnit();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFICATION_UNIT__MODEL = eINSTANCE.getVerificationUnit_Model();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFICATION_UNIT__SPECIFICATION = eINSTANCE.getVerificationUnit_Specification();

		/**
		 * The meta object literal for the '<em><b>Viewpoint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFICATION_UNIT__VIEWPOINT = eINSTANCE.getVerificationUnit_Viewpoint();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFICATION_UNIT__COMPONENT = eINSTANCE.getVerificationUnit_Component();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIFICATION_UNIT__NAME = eINSTANCE.getVerificationUnit_Name();

		/**
		 * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ResultEntryImpl <em>Result Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ResultEntryImpl
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getResultEntry()
		 * @generated
		 */
		EClass RESULT_ENTRY = eINSTANCE.getResultEntry();

		/**
		 * The meta object literal for the '<em><b>Verification Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_ENTRY__VERIFICATION_UNIT = eINSTANCE.getResultEntry_VerificationUnit();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_ENTRY__RESULT = eINSTANCE.getResultEntry_Result();

		/**
		 * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ViewpointCollectionImpl <em>Viewpoint Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ViewpointCollectionImpl
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getViewpointCollection()
		 * @generated
		 */
		EClass VIEWPOINT_COLLECTION = eINSTANCE.getViewpointCollection();

		/**
		 * The meta object literal for the '<em><b>Viewpoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT_COLLECTION__VIEWPOINTS = eINSTANCE.getViewpointCollection_Viewpoints();

		/**
		 * The meta object literal for the '<em><b>Get Viewpoint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIEWPOINT_COLLECTION___GET_VIEWPOINT__STRING = eINSTANCE.getViewpointCollection__GetViewpoint__String();

		/**
		 * The meta object literal for the '<em><b>Add Viewpoint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIEWPOINT_COLLECTION___ADD_VIEWPOINT__STRING_OBJECT = eINSTANCE.getViewpointCollection__AddViewpoint__String_Object();

		/**
		 * The meta object literal for the '<em><b>Remove Viewpoint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIEWPOINT_COLLECTION___REMOVE_VIEWPOINT__STRING = eINSTANCE.getViewpointCollection__RemoveViewpoint__String();

		/**
		 * The meta object literal for the '<em><b>Contains Viewpoint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIEWPOINT_COLLECTION___CONTAINS_VIEWPOINT__STRING = eINSTANCE.getViewpointCollection__ContainsViewpoint__String();

		/**
		 * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ComponentCollectionImpl <em>Component Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ComponentCollectionImpl
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getComponentCollection()
		 * @generated
		 */
		EClass COMPONENT_COLLECTION = eINSTANCE.getComponentCollection();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_COLLECTION__COMPONENTS = eINSTANCE.getComponentCollection_Components();

		/**
		 * The meta object literal for the '<em><b>Get Component</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT_COLLECTION___GET_COMPONENT__STRING = eINSTANCE.getComponentCollection__GetComponent__String();

		/**
		 * The meta object literal for the '<em><b>Add Component</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT_COLLECTION___ADD_COMPONENT__STRING_OBJECT = eINSTANCE.getComponentCollection__AddComponent__String_Object();

		/**
		 * The meta object literal for the '<em><b>Remove Component</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT_COLLECTION___REMOVE_COMPONENT__STRING = eINSTANCE.getComponentCollection__RemoveComponent__String();

		/**
		 * The meta object literal for the '<em><b>Contains Component</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT_COLLECTION___CONTAINS_COMPONENT__STRING = eINSTANCE.getComponentCollection__ContainsComponent__String();

	}

} //VerifiersPackage
