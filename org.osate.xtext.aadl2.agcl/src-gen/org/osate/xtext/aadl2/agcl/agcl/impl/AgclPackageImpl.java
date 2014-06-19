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
import org.osate.xtext.aadl2.agcl.agcl.AtomicProposition;
import org.osate.xtext.aadl2.agcl.agcl.BooleanConstant;
import org.osate.xtext.aadl2.agcl.agcl.Input;
import org.osate.xtext.aadl2.agcl.agcl.Output;
import org.osate.xtext.aadl2.agcl.agcl.PSLAlways;
import org.osate.xtext.aadl2.agcl.agcl.PSLBiconditional;
import org.osate.xtext.aadl2.agcl.agcl.PSLConjunction;
import org.osate.xtext.aadl2.agcl.agcl.PSLDisjunction;
import org.osate.xtext.aadl2.agcl.agcl.PSLEventually;
import org.osate.xtext.aadl2.agcl.agcl.PSLExpression;
import org.osate.xtext.aadl2.agcl.agcl.PSLImplication;
import org.osate.xtext.aadl2.agcl.agcl.PSLNegation;
import org.osate.xtext.aadl2.agcl.agcl.PSLNext;
import org.osate.xtext.aadl2.agcl.agcl.PSLSpec;
import org.osate.xtext.aadl2.agcl.agcl.PSLUntil;
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
  private EClass pslExpressionEClass = null;

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
  private EClass atomicPropositionEClass = null;

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
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pslImplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pslBiconditionalEClass = null;

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
  private EClass pslNextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pslEventuallyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pslAlwaysEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pslUntilEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pslNegationEClass = null;

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
  public EReference getPSLSpec_Expr()
  {
    return (EReference)pslSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPSLExpression()
  {
    return pslExpressionEClass;
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
  public EClass getAtomicProposition()
  {
    return atomicPropositionEClass;
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
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPSLImplication()
  {
    return pslImplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPSLImplication_Left()
  {
    return (EReference)pslImplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPSLImplication_Right()
  {
    return (EReference)pslImplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPSLBiconditional()
  {
    return pslBiconditionalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPSLBiconditional_Left()
  {
    return (EReference)pslBiconditionalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPSLBiconditional_Right()
  {
    return (EReference)pslBiconditionalEClass.getEStructuralFeatures().get(1);
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
  public EReference getPSLDisjunction_Left()
  {
    return (EReference)pslDisjunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPSLDisjunction_Right()
  {
    return (EReference)pslDisjunctionEClass.getEStructuralFeatures().get(1);
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
  public EReference getPSLConjunction_Left()
  {
    return (EReference)pslConjunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPSLConjunction_Right()
  {
    return (EReference)pslConjunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPSLNext()
  {
    return pslNextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPSLNext_Subterm()
  {
    return (EReference)pslNextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPSLEventually()
  {
    return pslEventuallyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPSLEventually_Subterm()
  {
    return (EReference)pslEventuallyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPSLAlways()
  {
    return pslAlwaysEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPSLAlways_Subterm()
  {
    return (EReference)pslAlwaysEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPSLUntil()
  {
    return pslUntilEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPSLUntil_Left()
  {
    return (EReference)pslUntilEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPSLUntil_Right()
  {
    return (EReference)pslUntilEClass.getEStructuralFeatures().get(1);
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
  public EReference getPSLNegation_Subterm()
  {
    return (EReference)pslNegationEClass.getEStructuralFeatures().get(0);
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
    createEReference(pslSpecEClass, PSL_SPEC__EXPR);

    pslExpressionEClass = createEClass(PSL_EXPRESSION);

    booleanConstantEClass = createEClass(BOOLEAN_CONSTANT);
    createEAttribute(booleanConstantEClass, BOOLEAN_CONSTANT__VAL);

    atomicPropositionEClass = createEClass(ATOMIC_PROPOSITION);

    varEClass = createEClass(VAR);
    createEAttribute(varEClass, VAR__NAME);

    inputEClass = createEClass(INPUT);
    createEAttribute(inputEClass, INPUT__LINK);
    createEAttribute(inputEClass, INPUT__EVENT);

    outputEClass = createEClass(OUTPUT);
    createEAttribute(outputEClass, OUTPUT__LINK);
    createEAttribute(outputEClass, OUTPUT__EVENT);

    parameterEClass = createEClass(PARAMETER);

    pslImplicationEClass = createEClass(PSL_IMPLICATION);
    createEReference(pslImplicationEClass, PSL_IMPLICATION__LEFT);
    createEReference(pslImplicationEClass, PSL_IMPLICATION__RIGHT);

    pslBiconditionalEClass = createEClass(PSL_BICONDITIONAL);
    createEReference(pslBiconditionalEClass, PSL_BICONDITIONAL__LEFT);
    createEReference(pslBiconditionalEClass, PSL_BICONDITIONAL__RIGHT);

    pslDisjunctionEClass = createEClass(PSL_DISJUNCTION);
    createEReference(pslDisjunctionEClass, PSL_DISJUNCTION__LEFT);
    createEReference(pslDisjunctionEClass, PSL_DISJUNCTION__RIGHT);

    pslConjunctionEClass = createEClass(PSL_CONJUNCTION);
    createEReference(pslConjunctionEClass, PSL_CONJUNCTION__LEFT);
    createEReference(pslConjunctionEClass, PSL_CONJUNCTION__RIGHT);

    pslNextEClass = createEClass(PSL_NEXT);
    createEReference(pslNextEClass, PSL_NEXT__SUBTERM);

    pslEventuallyEClass = createEClass(PSL_EVENTUALLY);
    createEReference(pslEventuallyEClass, PSL_EVENTUALLY__SUBTERM);

    pslAlwaysEClass = createEClass(PSL_ALWAYS);
    createEReference(pslAlwaysEClass, PSL_ALWAYS__SUBTERM);

    pslUntilEClass = createEClass(PSL_UNTIL);
    createEReference(pslUntilEClass, PSL_UNTIL__LEFT);
    createEReference(pslUntilEClass, PSL_UNTIL__RIGHT);

    pslNegationEClass = createEClass(PSL_NEGATION);
    createEReference(pslNegationEClass, PSL_NEGATION__SUBTERM);
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
    booleanConstantEClass.getESuperTypes().add(this.getPSLExpression());
    atomicPropositionEClass.getESuperTypes().add(this.getPSLExpression());
    varEClass.getESuperTypes().add(this.getAtomicProposition());
    inputEClass.getESuperTypes().add(this.getAtomicProposition());
    outputEClass.getESuperTypes().add(this.getAtomicProposition());
    pslImplicationEClass.getESuperTypes().add(this.getPSLExpression());
    pslBiconditionalEClass.getESuperTypes().add(this.getPSLExpression());
    pslDisjunctionEClass.getESuperTypes().add(this.getPSLExpression());
    pslConjunctionEClass.getESuperTypes().add(this.getPSLExpression());
    pslNextEClass.getESuperTypes().add(this.getPSLExpression());
    pslEventuallyEClass.getESuperTypes().add(this.getPSLExpression());
    pslAlwaysEClass.getESuperTypes().add(this.getPSLExpression());
    pslUntilEClass.getESuperTypes().add(this.getPSLExpression());
    pslNegationEClass.getESuperTypes().add(this.getPSLExpression());

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
    initEReference(getPSLSpec_Expr(), this.getPSLExpression(), null, "expr", null, 0, 1, PSLSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pslExpressionEClass, PSLExpression.class, "PSLExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(booleanConstantEClass, BooleanConstant.class, "BooleanConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanConstant_Val(), ecorePackage.getEString(), "val", null, 0, 1, BooleanConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atomicPropositionEClass, AtomicProposition.class, "AtomicProposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(varEClass, Var.class, "Var", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVar_Name(), ecorePackage.getEString(), "name", null, 0, 1, Var.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInput_Link(), ecorePackage.getEString(), "link", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInput_Event(), ecorePackage.getEString(), "event", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOutput_Link(), ecorePackage.getEString(), "link", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutput_Event(), ecorePackage.getEString(), "event", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pslImplicationEClass, PSLImplication.class, "PSLImplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPSLImplication_Left(), this.getPSLExpression(), null, "left", null, 0, 1, PSLImplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPSLImplication_Right(), this.getPSLExpression(), null, "right", null, 0, 1, PSLImplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pslBiconditionalEClass, PSLBiconditional.class, "PSLBiconditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPSLBiconditional_Left(), this.getPSLExpression(), null, "left", null, 0, 1, PSLBiconditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPSLBiconditional_Right(), this.getPSLExpression(), null, "right", null, 0, 1, PSLBiconditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pslDisjunctionEClass, PSLDisjunction.class, "PSLDisjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPSLDisjunction_Left(), this.getPSLExpression(), null, "left", null, 0, 1, PSLDisjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPSLDisjunction_Right(), this.getPSLExpression(), null, "right", null, 0, 1, PSLDisjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pslConjunctionEClass, PSLConjunction.class, "PSLConjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPSLConjunction_Left(), this.getPSLExpression(), null, "left", null, 0, 1, PSLConjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPSLConjunction_Right(), this.getPSLExpression(), null, "right", null, 0, 1, PSLConjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pslNextEClass, PSLNext.class, "PSLNext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPSLNext_Subterm(), this.getPSLExpression(), null, "subterm", null, 0, 1, PSLNext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pslEventuallyEClass, PSLEventually.class, "PSLEventually", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPSLEventually_Subterm(), this.getPSLExpression(), null, "subterm", null, 0, 1, PSLEventually.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pslAlwaysEClass, PSLAlways.class, "PSLAlways", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPSLAlways_Subterm(), this.getPSLExpression(), null, "subterm", null, 0, 1, PSLAlways.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pslUntilEClass, PSLUntil.class, "PSLUntil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPSLUntil_Left(), this.getPSLExpression(), null, "left", null, 0, 1, PSLUntil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPSLUntil_Right(), this.getPSLExpression(), null, "right", null, 0, 1, PSLUntil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pslNegationEClass, PSLNegation.class, "PSLNegation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPSLNegation_Subterm(), this.getPSLExpression(), null, "subterm", null, 0, 1, PSLNegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //AgclPackageImpl
