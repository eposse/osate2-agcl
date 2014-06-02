/**
 */
package org.osate.xtext.aadl2.agcl.agcl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.osate.aadl2.Aadl2Package;

import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexLibrary;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAssumption;
import org.osate.xtext.aadl2.agcl.agcl.AGCLBehaviour;
import org.osate.xtext.aadl2.agcl.agcl.AGCLContract;
import org.osate.xtext.aadl2.agcl.agcl.AGCLEnforce;
import org.osate.xtext.aadl2.agcl.agcl.AGCLGrammarRoot;
import org.osate.xtext.aadl2.agcl.agcl.AGCLGuarantee;
import org.osate.xtext.aadl2.agcl.agcl.AGCLPropertyDecl;
import org.osate.xtext.aadl2.agcl.agcl.AGCLViewpoint;
import org.osate.xtext.aadl2.agcl.agcl.AgclFactory;
import org.osate.xtext.aadl2.agcl.agcl.AgclPackage;
import org.osate.xtext.aadl2.agcl.agcl.AtomicProp;
import org.osate.xtext.aadl2.agcl.agcl.BooleanConstant;
import org.osate.xtext.aadl2.agcl.agcl.Input;
import org.osate.xtext.aadl2.agcl.agcl.Output;
import org.osate.xtext.aadl2.agcl.agcl.PSLAtom;
import org.osate.xtext.aadl2.agcl.agcl.PSLBooleanExpression;
import org.osate.xtext.aadl2.agcl.agcl.PSLConjunction;
import org.osate.xtext.aadl2.agcl.agcl.PSLDisjunction;
import org.osate.xtext.aadl2.agcl.agcl.PSLFormula;
import org.osate.xtext.aadl2.agcl.agcl.PSLNegation;
import org.osate.xtext.aadl2.agcl.agcl.PSLSpec;
import org.osate.xtext.aadl2.agcl.agcl.Parameter;
import org.osate.xtext.aadl2.agcl.agcl.Var;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AgclPackageImpl extends EPackageImpl implements AgclPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass agclGrammarRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass agclAnnexLibraryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass agclViewpointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass agclEnforceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass agclAnnexSubclauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass agclContractEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass agclPropertyDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass agclAssumptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass agclGuaranteeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass agclBehaviourEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pslSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pslFormulaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pslBooleanExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomicPropEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pslDisjunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pslConjunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pslAtomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pslNegationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

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
   * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AgclPackageImpl()
  {
    super(eNS_URI, AgclFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link AgclPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AgclPackage init()
  {
    if (isInited) return (AgclPackage)EPackage.Registry.INSTANCE.getEPackage(AgclPackage.eNS_URI);

    // Obtain or create and register package
    AgclPackageImpl theAgclPackage = (AgclPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AgclPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AgclPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    Aadl2Package.eINSTANCE.eClass();

    // Create package meta-data objects
    theAgclPackage.createPackageContents();

    // Initialize created meta-data
    theAgclPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAgclPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AgclPackage.eNS_URI, theAgclPackage);
    return theAgclPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAGCLGrammarRoot()
  {
    return agclGrammarRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAGCLGrammarRoot_Lib()
  {
    return (EReference)agclGrammarRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAGCLGrammarRoot_Subclause()
  {
    return (EReference)agclGrammarRootEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAGCLAnnexLibrary()
  {
    return agclAnnexLibraryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAGCLAnnexLibrary_Viewpoints()
  {
    return (EReference)agclAnnexLibraryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAGCLAnnexLibrary_Enforceclauses()
  {
    return (EReference)agclAnnexLibraryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAGCLViewpoint()
  {
    return agclViewpointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAGCLViewpoint_Name()
  {
    return (EAttribute)agclViewpointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAGCLEnforce()
  {
    return agclEnforceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAGCLEnforce_Name()
  {
    return (EAttribute)agclEnforceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAGCLAnnexSubclause()
  {
    return agclAnnexSubclauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAGCLAnnexSubclause_Declarations()
  {
    return (EReference)agclAnnexSubclauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAGCLAnnexSubclause_Behaviour()
  {
    return (EReference)agclAnnexSubclauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAGCLAnnexSubclause_Contracts()
  {
    return (EReference)agclAnnexSubclauseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAGCLContract()
  {
    return agclContractEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAGCLContract_Name()
  {
    return (EAttribute)agclContractEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAGCLContract_Declarations()
  {
    return (EReference)agclContractEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAGCLContract_Assumption()
  {
    return (EReference)agclContractEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAGCLContract_Guarantee()
  {
    return (EReference)agclContractEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAGCLContract_Ename()
  {
    return (EAttribute)agclContractEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAGCLPropertyDecl()
  {
    return agclPropertyDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAGCLPropertyDecl_Name()
  {
    return (EAttribute)agclPropertyDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAGCLPropertyDecl_Params()
  {
    return (EReference)agclPropertyDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAGCLPropertyDecl_Spec()
  {
    return (EReference)agclPropertyDeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAGCLAssumption()
  {
    return agclAssumptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAGCLAssumption_Spec()
  {
    return (EReference)agclAssumptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAGCLGuarantee()
  {
    return agclGuaranteeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAGCLGuarantee_Spec()
  {
    return (EReference)agclGuaranteeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAGCLBehaviour()
  {
    return agclBehaviourEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAGCLBehaviour_Spec()
  {
    return (EReference)agclBehaviourEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPSLSpec()
  {
    return pslSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPSLSpec_Formula()
  {
    return (EReference)pslSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPSLFormula()
  {
    return pslFormulaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPSLBooleanExpression()
  {
    return pslBooleanExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanConstant()
  {
    return booleanConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanConstant_Val()
  {
    return (EAttribute)booleanConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtomicProp()
  {
    return atomicPropEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVar()
  {
    return varEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVar_Name()
  {
    return (EAttribute)varEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInput()
  {
    return inputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInput_Link()
  {
    return (EAttribute)inputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInput_Event()
  {
    return (EAttribute)inputEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutput()
  {
    return outputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutput_Link()
  {
    return (EAttribute)outputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutput_Event()
  {
    return (EAttribute)outputEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPSLDisjunction()
  {
    return pslDisjunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPSLDisjunction_Terms()
  {
    return (EReference)pslDisjunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPSLConjunction()
  {
    return pslConjunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPSLConjunction_Factors()
  {
    return (EReference)pslConjunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPSLAtom()
  {
    return pslAtomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPSLNegation()
  {
    return pslNegationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AgclFactory getAgclFactory()
  {
    return (AgclFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    agclGrammarRootEClass = createEClass(AGCL_GRAMMAR_ROOT);
    createEReference(agclGrammarRootEClass, AGCL_GRAMMAR_ROOT__LIB);
    createEReference(agclGrammarRootEClass, AGCL_GRAMMAR_ROOT__SUBCLAUSE);

    agclAnnexLibraryEClass = createEClass(AGCL_ANNEX_LIBRARY);
    createEReference(agclAnnexLibraryEClass, AGCL_ANNEX_LIBRARY__VIEWPOINTS);
    createEReference(agclAnnexLibraryEClass, AGCL_ANNEX_LIBRARY__ENFORCECLAUSES);

    agclViewpointEClass = createEClass(AGCL_VIEWPOINT);
    createEAttribute(agclViewpointEClass, AGCL_VIEWPOINT__NAME);

    agclEnforceEClass = createEClass(AGCL_ENFORCE);
    createEAttribute(agclEnforceEClass, AGCL_ENFORCE__NAME);

    agclAnnexSubclauseEClass = createEClass(AGCL_ANNEX_SUBCLAUSE);
    createEReference(agclAnnexSubclauseEClass, AGCL_ANNEX_SUBCLAUSE__DECLARATIONS);
    createEReference(agclAnnexSubclauseEClass, AGCL_ANNEX_SUBCLAUSE__BEHAVIOUR);
    createEReference(agclAnnexSubclauseEClass, AGCL_ANNEX_SUBCLAUSE__CONTRACTS);

    agclContractEClass = createEClass(AGCL_CONTRACT);
    createEAttribute(agclContractEClass, AGCL_CONTRACT__NAME);
    createEReference(agclContractEClass, AGCL_CONTRACT__DECLARATIONS);
    createEReference(agclContractEClass, AGCL_CONTRACT__ASSUMPTION);
    createEReference(agclContractEClass, AGCL_CONTRACT__GUARANTEE);
    createEAttribute(agclContractEClass, AGCL_CONTRACT__ENAME);

    agclPropertyDeclEClass = createEClass(AGCL_PROPERTY_DECL);
    createEAttribute(agclPropertyDeclEClass, AGCL_PROPERTY_DECL__NAME);
    createEReference(agclPropertyDeclEClass, AGCL_PROPERTY_DECL__PARAMS);
    createEReference(agclPropertyDeclEClass, AGCL_PROPERTY_DECL__SPEC);

    agclAssumptionEClass = createEClass(AGCL_ASSUMPTION);
    createEReference(agclAssumptionEClass, AGCL_ASSUMPTION__SPEC);

    agclGuaranteeEClass = createEClass(AGCL_GUARANTEE);
    createEReference(agclGuaranteeEClass, AGCL_GUARANTEE__SPEC);

    agclBehaviourEClass = createEClass(AGCL_BEHAVIOUR);
    createEReference(agclBehaviourEClass, AGCL_BEHAVIOUR__SPEC);

    pslSpecEClass = createEClass(PSL_SPEC);
    createEReference(pslSpecEClass, PSL_SPEC__FORMULA);

    pslFormulaEClass = createEClass(PSL_FORMULA);

    pslBooleanExpressionEClass = createEClass(PSL_BOOLEAN_EXPRESSION);

    booleanConstantEClass = createEClass(BOOLEAN_CONSTANT);
    createEAttribute(booleanConstantEClass, BOOLEAN_CONSTANT__VAL);

    atomicPropEClass = createEClass(ATOMIC_PROP);

    varEClass = createEClass(VAR);
    createEAttribute(varEClass, VAR__NAME);

    inputEClass = createEClass(INPUT);
    createEAttribute(inputEClass, INPUT__LINK);
    createEAttribute(inputEClass, INPUT__EVENT);

    outputEClass = createEClass(OUTPUT);
    createEAttribute(outputEClass, OUTPUT__LINK);
    createEAttribute(outputEClass, OUTPUT__EVENT);

    pslDisjunctionEClass = createEClass(PSL_DISJUNCTION);
    createEReference(pslDisjunctionEClass, PSL_DISJUNCTION__TERMS);

    pslConjunctionEClass = createEClass(PSL_CONJUNCTION);
    createEReference(pslConjunctionEClass, PSL_CONJUNCTION__FACTORS);

    pslAtomEClass = createEClass(PSL_ATOM);

    pslNegationEClass = createEClass(PSL_NEGATION);

    parameterEClass = createEClass(PARAMETER);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    Aadl2Package theAadl2Package = (Aadl2Package)EPackage.Registry.INSTANCE.getEPackage(Aadl2Package.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    agclAnnexLibraryEClass.getESuperTypes().add(theAadl2Package.getAnnexLibrary());
    agclAnnexSubclauseEClass.getESuperTypes().add(theAadl2Package.getAnnexSubclause());
    pslBooleanExpressionEClass.getESuperTypes().add(this.getPSLFormula());
    pslBooleanExpressionEClass.getESuperTypes().add(this.getPSLAtom());
    pslBooleanExpressionEClass.getESuperTypes().add(this.getPSLNegation());
    booleanConstantEClass.getESuperTypes().add(this.getPSLAtom());
    atomicPropEClass.getESuperTypes().add(this.getPSLAtom());
    varEClass.getESuperTypes().add(this.getAtomicProp());
    inputEClass.getESuperTypes().add(this.getAtomicProp());
    outputEClass.getESuperTypes().add(this.getAtomicProp());
    pslDisjunctionEClass.getESuperTypes().add(this.getPSLBooleanExpression());
    pslNegationEClass.getESuperTypes().add(this.getPSLAtom());

    // Initialize classes and features; add operations and parameters
    initEClass(agclGrammarRootEClass, AGCLGrammarRoot.class, "AGCLGrammarRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAGCLGrammarRoot_Lib(), this.getAGCLAnnexLibrary(), null, "lib", null, 0, 1, AGCLGrammarRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAGCLGrammarRoot_Subclause(), this.getAGCLAnnexSubclause(), null, "subclause", null, 0, 1, AGCLGrammarRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(agclAnnexLibraryEClass, AGCLAnnexLibrary.class, "AGCLAnnexLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAGCLAnnexLibrary_Viewpoints(), this.getAGCLViewpoint(), null, "viewpoints", null, 0, -1, AGCLAnnexLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAGCLAnnexLibrary_Enforceclauses(), this.getAGCLEnforce(), null, "enforceclauses", null, 0, -1, AGCLAnnexLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(agclViewpointEClass, AGCLViewpoint.class, "AGCLViewpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAGCLViewpoint_Name(), ecorePackage.getEString(), "name", null, 0, 1, AGCLViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(agclEnforceEClass, AGCLEnforce.class, "AGCLEnforce", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAGCLEnforce_Name(), ecorePackage.getEString(), "name", null, 0, 1, AGCLEnforce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(agclAnnexSubclauseEClass, AGCLAnnexSubclause.class, "AGCLAnnexSubclause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAGCLAnnexSubclause_Declarations(), this.getAGCLPropertyDecl(), null, "declarations", null, 0, -1, AGCLAnnexSubclause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAGCLAnnexSubclause_Behaviour(), this.getAGCLBehaviour(), null, "behaviour", null, 0, 1, AGCLAnnexSubclause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAGCLAnnexSubclause_Contracts(), this.getAGCLContract(), null, "contracts", null, 0, -1, AGCLAnnexSubclause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(agclContractEClass, AGCLContract.class, "AGCLContract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAGCLContract_Name(), ecorePackage.getEString(), "name", null, 0, 1, AGCLContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAGCLContract_Declarations(), this.getAGCLPropertyDecl(), null, "declarations", null, 0, -1, AGCLContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAGCLContract_Assumption(), this.getAGCLAssumption(), null, "assumption", null, 0, 1, AGCLContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAGCLContract_Guarantee(), this.getAGCLGuarantee(), null, "guarantee", null, 0, 1, AGCLContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAGCLContract_Ename(), ecorePackage.getEString(), "ename", null, 0, 1, AGCLContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(agclPropertyDeclEClass, AGCLPropertyDecl.class, "AGCLPropertyDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAGCLPropertyDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, AGCLPropertyDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAGCLPropertyDecl_Params(), this.getParameter(), null, "params", null, 0, -1, AGCLPropertyDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAGCLPropertyDecl_Spec(), this.getPSLSpec(), null, "spec", null, 0, 1, AGCLPropertyDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(agclAssumptionEClass, AGCLAssumption.class, "AGCLAssumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAGCLAssumption_Spec(), this.getPSLSpec(), null, "spec", null, 0, 1, AGCLAssumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(agclGuaranteeEClass, AGCLGuarantee.class, "AGCLGuarantee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAGCLGuarantee_Spec(), this.getPSLSpec(), null, "spec", null, 0, 1, AGCLGuarantee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(agclBehaviourEClass, AGCLBehaviour.class, "AGCLBehaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAGCLBehaviour_Spec(), this.getPSLSpec(), null, "spec", null, 0, 1, AGCLBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pslSpecEClass, PSLSpec.class, "PSLSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPSLSpec_Formula(), this.getPSLFormula(), null, "formula", null, 0, 1, PSLSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pslFormulaEClass, PSLFormula.class, "PSLFormula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pslBooleanExpressionEClass, PSLBooleanExpression.class, "PSLBooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(booleanConstantEClass, BooleanConstant.class, "BooleanConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanConstant_Val(), ecorePackage.getEString(), "val", null, 0, 1, BooleanConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atomicPropEClass, AtomicProp.class, "AtomicProp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(varEClass, Var.class, "Var", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVar_Name(), ecorePackage.getEString(), "name", null, 0, 1, Var.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInput_Link(), ecorePackage.getEString(), "link", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInput_Event(), ecorePackage.getEString(), "event", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOutput_Link(), ecorePackage.getEString(), "link", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutput_Event(), ecorePackage.getEString(), "event", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pslDisjunctionEClass, PSLDisjunction.class, "PSLDisjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPSLDisjunction_Terms(), this.getPSLConjunction(), null, "terms", null, 0, -1, PSLDisjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pslConjunctionEClass, PSLConjunction.class, "PSLConjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPSLConjunction_Factors(), this.getPSLAtom(), null, "factors", null, 0, -1, PSLConjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pslAtomEClass, PSLAtom.class, "PSLAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pslNegationEClass, PSLNegation.class, "PSLNegation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //AgclPackageImpl
