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
	 * The feature id for the '<em><b>Counterexample</b></em>' reference.
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
	 * The number of structural features of the '<em>Model Checker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Set Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER___SET_UP__RESOURCE = 0;

	/**
	 * The operation id for the '<em>Check Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER___CHECK_MODEL__MODEL_SPECIFICATION = 1;

	/**
	 * The operation id for the '<em>Prepare Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER___PREPARE_INPUT__MODEL_SPECIFICATION = 2;

	/**
	 * The operation id for the '<em>Process Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER___PROCESS_OUTPUT__MODELCHECKEROUTPUT = 3;

	/**
	 * The operation id for the '<em>Call External</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER___CALL_EXTERNAL__MODELCHECKERINPUT = 4;

	/**
	 * The operation id for the '<em>Check Spec Satisfability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER___CHECK_SPEC_SATISFABILITY__SPECIFICATION = 5;

	/**
	 * The operation id for the '<em>Check Spec Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER___CHECK_SPEC_VALIDITY__SPECIFICATION = 6;

	/**
	 * The number of operations of the '<em>Model Checker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER_OPERATION_COUNT = 7;

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
	 * The operation id for the '<em>Check Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL_CHECKER___CHECK_MODEL__MODEL_SPECIFICATION = MODEL_CHECKER___CHECK_MODEL__MODEL_SPECIFICATION;

	/**
	 * The operation id for the '<em>Prepare Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL_CHECKER___PREPARE_INPUT__MODEL_SPECIFICATION = MODEL_CHECKER___PREPARE_INPUT__MODEL_SPECIFICATION;

	/**
	 * The operation id for the '<em>Process Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL_CHECKER___PROCESS_OUTPUT__MODELCHECKEROUTPUT = MODEL_CHECKER___PROCESS_OUTPUT__MODELCHECKEROUTPUT;

	/**
	 * The operation id for the '<em>Call External</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL_CHECKER___CALL_EXTERNAL__MODELCHECKERINPUT = MODEL_CHECKER___CALL_EXTERNAL__MODELCHECKERINPUT;

	/**
	 * The operation id for the '<em>Check Spec Satisfability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL_CHECKER___CHECK_SPEC_SATISFABILITY__SPECIFICATION = MODEL_CHECKER___CHECK_SPEC_SATISFABILITY__SPECIFICATION;

	/**
	 * The operation id for the '<em>Check Spec Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_MODEL_CHECKER___CHECK_SPEC_VALIDITY__SPECIFICATION = MODEL_CHECKER___CHECK_SPEC_VALIDITY__SPECIFICATION;

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
	 * The number of structural features of the '<em>Model Checker Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER_INPUT_FEATURE_COUNT = 0;

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
	 * The number of structural features of the '<em>Model Checker Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER_OUTPUT_FEATURE_COUNT = 0;

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
	 * The number of structural features of the '<em>Nu SMV Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NU_SMV_SPECIFICATION_FEATURE_COUNT = SPECIFICATION_FEATURE_COUNT + 0;

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
	 * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Negative#getCounterexample <em>Counterexample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Counterexample</em>'.
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
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#setUp(org.eclipse.emf.ecore.resource.Resource) <em>Set Up</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Up</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#setUp(org.eclipse.emf.ecore.resource.Resource)
	 * @generated
	 */
	EOperation getModelChecker__SetUp__Resource();

	/**
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#checkModel(org.osate.xtext.aadl2.agcl.analysis.verifiers.Model, org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification) <em>Check Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Model</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#checkModel(org.osate.xtext.aadl2.agcl.analysis.verifiers.Model, org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification)
	 * @generated
	 */
	EOperation getModelChecker__CheckModel__Model_Specification();

	/**
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#prepareInput(org.osate.xtext.aadl2.agcl.analysis.verifiers.Model, org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification) <em>Prepare Input</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Prepare Input</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#prepareInput(org.osate.xtext.aadl2.agcl.analysis.verifiers.Model, org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification)
	 * @generated
	 */
	EOperation getModelChecker__PrepareInput__Model_Specification();

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
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#checkSpecSatisfability(org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification) <em>Check Spec Satisfability</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Spec Satisfability</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#checkSpecSatisfability(org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification)
	 * @generated
	 */
	EOperation getModelChecker__CheckSpecSatisfability__Specification();

	/**
	 * Returns the meta object for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#checkSpecValidity(org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification) <em>Check Spec Validity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Spec Validity</em>' operation.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#checkSpecValidity(org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification)
	 * @generated
	 */
	EOperation getModelChecker__CheckSpecValidity__Specification();

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
	 * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerOutput <em>Model Checker Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Checker Output</em>'.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerOutput
	 * @generated
	 */
	EClass getModelCheckerOutput();

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
		 * The meta object literal for the '<em><b>Counterexample</b></em>' reference feature.
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
		 * The meta object literal for the '<em><b>Set Up</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_CHECKER___SET_UP__RESOURCE = eINSTANCE.getModelChecker__SetUp__Resource();

		/**
		 * The meta object literal for the '<em><b>Check Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_CHECKER___CHECK_MODEL__MODEL_SPECIFICATION = eINSTANCE.getModelChecker__CheckModel__Model_Specification();

		/**
		 * The meta object literal for the '<em><b>Prepare Input</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_CHECKER___PREPARE_INPUT__MODEL_SPECIFICATION = eINSTANCE.getModelChecker__PrepareInput__Model_Specification();

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
		 * The meta object literal for the '<em><b>Check Spec Satisfability</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_CHECKER___CHECK_SPEC_SATISFABILITY__SPECIFICATION = eINSTANCE.getModelChecker__CheckSpecSatisfability__Specification();

		/**
		 * The meta object literal for the '<em><b>Check Spec Validity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_CHECKER___CHECK_SPEC_VALIDITY__SPECIFICATION = eINSTANCE.getModelChecker__CheckSpecValidity__Specification();

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
		 * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ModelCheckerOutputImpl <em>Model Checker Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ModelCheckerOutputImpl
		 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.VerifiersPackageImpl#getModelCheckerOutput()
		 * @generated
		 */
		EClass MODEL_CHECKER_OUTPUT = eINSTANCE.getModelCheckerOutput();

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

	}

} //VerifiersPackage
