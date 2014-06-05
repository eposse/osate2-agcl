/**
 */
package org.osate.xtext.aadl2.agcl.analysis.verifiers.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.CounterExample;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Model;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerInput;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerOutput;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Negative;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVInput;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModel;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModelChecker;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVOutput;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVSpecification;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVUniversalModel;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Positive;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.UniversalModel;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationResult;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersFactory;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VerifiersPackageImpl extends EPackageImpl implements VerifiersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verificationResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass counterExampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universalModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelCheckerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuSMVModelCheckerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelCheckerInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelCheckerOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuSMVInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuSMVOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuSMVModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuSMVUniversalModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuSMVSpecificationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VerifiersPackageImpl() {
		super(eNS_URI, VerifiersFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link VerifiersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VerifiersPackage init() {
		if (isInited) return (VerifiersPackage)EPackage.Registry.INSTANCE.getEPackage(VerifiersPackage.eNS_URI);

		// Obtain or create and register package
		VerifiersPackageImpl theVerifiersPackage = (VerifiersPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VerifiersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VerifiersPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theVerifiersPackage.createPackageContents();

		// Initialize created meta-data
		theVerifiersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVerifiersPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VerifiersPackage.eNS_URI, theVerifiersPackage);
		return theVerifiersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerificationResult() {
		return verificationResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositive() {
		return positiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegative() {
		return negativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegative_Counterexample() {
		return (EReference)negativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Model() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Context() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModel__Text__Object() {
		return modelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecification() {
		return specificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecification_Spec() {
		return (EAttribute)specificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecification_Context() {
		return (EAttribute)specificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpecification__Text__Object() {
		return specificationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCounterExample() {
		return counterExampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniversalModel() {
		return universalModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelChecker() {
		return modelCheckerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelChecker_ResourceContext() {
		return (EAttribute)modelCheckerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelChecker__SetUp__Resource() {
		return modelCheckerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelChecker__CheckModel__Model_Specification() {
		return modelCheckerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelChecker__PrepareInput__Model_Specification() {
		return modelCheckerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelChecker__ProcessOutput__ModelCheckerOutput() {
		return modelCheckerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelChecker__CallExternal__ModelCheckerInput() {
		return modelCheckerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelChecker__CheckSpecSatisfability__Specification() {
		return modelCheckerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelChecker__CheckSpecValidity__Specification() {
		return modelCheckerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNuSMVModelChecker() {
		return nuSMVModelCheckerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelCheckerInput() {
		return modelCheckerInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelCheckerOutput() {
		return modelCheckerOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNuSMVInput() {
		return nuSMVInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNuSMVInput_ModelSourceFile() {
		return (EAttribute)nuSMVInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNuSMVInput_SessionScript() {
		return (EAttribute)nuSMVInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNuSMVOutput() {
		return nuSMVOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNuSMVOutput_CounterExampleFile() {
		return (EAttribute)nuSMVOutputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNuSMVModel() {
		return nuSMVModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNuSMVModel_Vars() {
		return (EAttribute)nuSMVModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNuSMVModel_Init() {
		return (EAttribute)nuSMVModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNuSMVModel_Trans() {
		return (EAttribute)nuSMVModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNuSMVUniversalModel() {
		return nuSMVUniversalModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNuSMVSpecification() {
		return nuSMVSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNuSMVOutput_OutputFile() {
		return (EAttribute)nuSMVOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerifiersFactory getVerifiersFactory() {
		return (VerifiersFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		verificationResultEClass = createEClass(VERIFICATION_RESULT);

		positiveEClass = createEClass(POSITIVE);

		negativeEClass = createEClass(NEGATIVE);
		createEReference(negativeEClass, NEGATIVE__COUNTEREXAMPLE);

		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__MODEL);
		createEAttribute(modelEClass, MODEL__CONTEXT);
		createEOperation(modelEClass, MODEL___TEXT__OBJECT);

		specificationEClass = createEClass(SPECIFICATION);
		createEAttribute(specificationEClass, SPECIFICATION__SPEC);
		createEAttribute(specificationEClass, SPECIFICATION__CONTEXT);
		createEOperation(specificationEClass, SPECIFICATION___TEXT__OBJECT);

		counterExampleEClass = createEClass(COUNTER_EXAMPLE);

		universalModelEClass = createEClass(UNIVERSAL_MODEL);

		modelCheckerEClass = createEClass(MODEL_CHECKER);
		createEAttribute(modelCheckerEClass, MODEL_CHECKER__RESOURCE_CONTEXT);
		createEOperation(modelCheckerEClass, MODEL_CHECKER___SET_UP__RESOURCE);
		createEOperation(modelCheckerEClass, MODEL_CHECKER___CHECK_MODEL__MODEL_SPECIFICATION);
		createEOperation(modelCheckerEClass, MODEL_CHECKER___PREPARE_INPUT__MODEL_SPECIFICATION);
		createEOperation(modelCheckerEClass, MODEL_CHECKER___PROCESS_OUTPUT__MODELCHECKEROUTPUT);
		createEOperation(modelCheckerEClass, MODEL_CHECKER___CALL_EXTERNAL__MODELCHECKERINPUT);
		createEOperation(modelCheckerEClass, MODEL_CHECKER___CHECK_SPEC_SATISFABILITY__SPECIFICATION);
		createEOperation(modelCheckerEClass, MODEL_CHECKER___CHECK_SPEC_VALIDITY__SPECIFICATION);

		nuSMVModelCheckerEClass = createEClass(NU_SMV_MODEL_CHECKER);

		modelCheckerInputEClass = createEClass(MODEL_CHECKER_INPUT);

		modelCheckerOutputEClass = createEClass(MODEL_CHECKER_OUTPUT);

		nuSMVInputEClass = createEClass(NU_SMV_INPUT);
		createEAttribute(nuSMVInputEClass, NU_SMV_INPUT__MODEL_SOURCE_FILE);
		createEAttribute(nuSMVInputEClass, NU_SMV_INPUT__SESSION_SCRIPT);

		nuSMVOutputEClass = createEClass(NU_SMV_OUTPUT);
		createEAttribute(nuSMVOutputEClass, NU_SMV_OUTPUT__OUTPUT_FILE);
		createEAttribute(nuSMVOutputEClass, NU_SMV_OUTPUT__COUNTER_EXAMPLE_FILE);

		nuSMVModelEClass = createEClass(NU_SMV_MODEL);
		createEAttribute(nuSMVModelEClass, NU_SMV_MODEL__VARS);
		createEAttribute(nuSMVModelEClass, NU_SMV_MODEL__INIT);
		createEAttribute(nuSMVModelEClass, NU_SMV_MODEL__TRANS);

		nuSMVUniversalModelEClass = createEClass(NU_SMV_UNIVERSAL_MODEL);

		nuSMVSpecificationEClass = createEClass(NU_SMV_SPECIFICATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		positiveEClass.getESuperTypes().add(this.getVerificationResult());
		negativeEClass.getESuperTypes().add(this.getVerificationResult());
		universalModelEClass.getESuperTypes().add(this.getModel());
		nuSMVModelCheckerEClass.getESuperTypes().add(this.getModelChecker());
		nuSMVInputEClass.getESuperTypes().add(this.getModelCheckerInput());
		nuSMVOutputEClass.getESuperTypes().add(this.getModelCheckerOutput());
		nuSMVModelEClass.getESuperTypes().add(this.getModel());
		nuSMVUniversalModelEClass.getESuperTypes().add(this.getNuSMVModel());
		nuSMVUniversalModelEClass.getESuperTypes().add(this.getUniversalModel());
		nuSMVSpecificationEClass.getESuperTypes().add(this.getSpecification());

		// Initialize classes, features, and operations; add parameters
		initEClass(verificationResultEClass, VerificationResult.class, "VerificationResult", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positiveEClass, Positive.class, "Positive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negativeEClass, Negative.class, "Negative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNegative_Counterexample(), this.getCounterExample(), null, "counterexample", null, 0, 1, Negative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_Model(), ecorePackage.getEJavaObject(), "model", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_Context(), ecorePackage.getEJavaObject(), "context", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getModel__Text__Object(), ecorePackage.getEString(), "text", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "args", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(specificationEClass, Specification.class, "Specification", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecification_Spec(), ecorePackage.getEJavaObject(), "spec", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecification_Context(), ecorePackage.getEJavaObject(), "context", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSpecification__Text__Object(), ecorePackage.getEString(), "text", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "args", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(counterExampleEClass, CounterExample.class, "CounterExample", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(universalModelEClass, UniversalModel.class, "UniversalModel", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelCheckerEClass, ModelChecker.class, "ModelChecker", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelChecker_ResourceContext(), ecorePackage.getEResource(), "resourceContext", null, 0, 1, ModelChecker.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getModelChecker__SetUp__Resource(), null, "setUp", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEResource(), "resource", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelChecker__CheckModel__Model_Specification(), this.getVerificationResult(), "checkModel", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getModel(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSpecification(), "spec", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelChecker__PrepareInput__Model_Specification(), this.getModelCheckerInput(), "prepareInput", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getModel(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSpecification(), "spec", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelChecker__ProcessOutput__ModelCheckerOutput(), this.getVerificationResult(), "processOutput", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getModelCheckerOutput(), "output", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelChecker__CallExternal__ModelCheckerInput(), this.getModelCheckerOutput(), "callExternal", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getModelCheckerInput(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelChecker__CheckSpecSatisfability__Specification(), this.getVerificationResult(), "checkSpecSatisfability", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSpecification(), "spec", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelChecker__CheckSpecValidity__Specification(), this.getVerificationResult(), "checkSpecValidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSpecification(), "spec", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(nuSMVModelCheckerEClass, NuSMVModelChecker.class, "NuSMVModelChecker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelCheckerInputEClass, ModelCheckerInput.class, "ModelCheckerInput", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelCheckerOutputEClass, ModelCheckerOutput.class, "ModelCheckerOutput", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nuSMVInputEClass, NuSMVInput.class, "NuSMVInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNuSMVInput_ModelSourceFile(), ecorePackage.getEString(), "modelSourceFile", null, 0, 1, NuSMVInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNuSMVInput_SessionScript(), ecorePackage.getEString(), "sessionScript", null, 0, 1, NuSMVInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuSMVOutputEClass, NuSMVOutput.class, "NuSMVOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNuSMVOutput_OutputFile(), ecorePackage.getEString(), "outputFile", null, 0, 1, NuSMVOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNuSMVOutput_CounterExampleFile(), ecorePackage.getEString(), "counterExampleFile", null, 0, 1, NuSMVOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuSMVModelEClass, NuSMVModel.class, "NuSMVModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNuSMVModel_Vars(), ecorePackage.getEJavaObject(), "vars", null, 0, 1, NuSMVModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNuSMVModel_Init(), ecorePackage.getEJavaObject(), "init", null, 0, 1, NuSMVModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNuSMVModel_Trans(), ecorePackage.getEJavaObject(), "trans", null, 0, 1, NuSMVModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuSMVUniversalModelEClass, NuSMVUniversalModel.class, "NuSMVUniversalModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nuSMVSpecificationEClass, NuSMVSpecification.class, "NuSMVSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";				
		addAnnotation
		  (getNuSMVInput_ModelSourceFile(), 
		   source, 
		   new String[] {
			 "processing", "skip"
		   });		
		addAnnotation
		  (getNuSMVInput_SessionScript(), 
		   source, 
		   new String[] {
			 "processing", "skip"
		   });		
		addAnnotation
		  (getNuSMVOutput_OutputFile(), 
		   source, 
		   new String[] {
			 "processing", "skip"
		   });		
		addAnnotation
		  (getNuSMVOutput_CounterExampleFile(), 
		   source, 
		   new String[] {
			 "processing", "skip"
		   });
	}

} //VerifiersPackageImpl
