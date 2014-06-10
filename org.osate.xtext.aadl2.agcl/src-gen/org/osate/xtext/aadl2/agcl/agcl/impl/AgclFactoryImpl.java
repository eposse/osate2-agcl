/**
 */
package org.osate.xtext.aadl2.agcl.agcl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.osate.xtext.aadl2.agcl.agcl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AgclFactoryImpl extends EFactoryImpl implements AgclFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AgclFactory init()
  {
    try
    {
      AgclFactory theAgclFactory = (AgclFactory)EPackage.Registry.INSTANCE.getEFactory(AgclPackage.eNS_URI);
      if (theAgclFactory != null)
      {
        return theAgclFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AgclFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AgclFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AgclPackage.AGCL_GRAMMAR_ROOT: return createAGCLGrammarRoot();
      case AgclPackage.AGCL_ANNEX_LIBRARY: return createAGCLAnnexLibrary();
      case AgclPackage.AGCL_VIEWPOINT: return createAGCLViewpoint();
      case AgclPackage.AGCL_ENFORCE: return createAGCLEnforce();
      case AgclPackage.AGCL_ANNEX_SUBCLAUSE: return createAGCLAnnexSubclause();
      case AgclPackage.AGCL_CONTRACT: return createAGCLContract();
      case AgclPackage.AGCL_PROPERTY_DECL: return createAGCLPropertyDecl();
      case AgclPackage.AGCL_ASSUMPTION: return createAGCLAssumption();
      case AgclPackage.AGCL_GUARANTEE: return createAGCLGuarantee();
      case AgclPackage.AGCL_BEHAVIOUR: return createAGCLBehaviour();
      case AgclPackage.PSL_SPEC: return createPSLSpec();
      case AgclPackage.PSL_EXPRESSION: return createPSLExpression();
      case AgclPackage.BOOLEAN_CONSTANT: return createBooleanConstant();
      case AgclPackage.ATOMIC_PROPOSITION: return createAtomicProposition();
      case AgclPackage.VAR: return createVar();
      case AgclPackage.INPUT: return createInput();
      case AgclPackage.OUTPUT: return createOutput();
      case AgclPackage.PARAMETER: return createParameter();
      case AgclPackage.PSL_IMPLICATION: return createPSLImplication();
      case AgclPackage.PSL_BICONDITIONAL: return createPSLBiconditional();
      case AgclPackage.PSL_DISJUNCTION: return createPSLDisjunction();
      case AgclPackage.PSL_CONJUNCTION: return createPSLConjunction();
      case AgclPackage.PSL_NEXT: return createPSLNext();
      case AgclPackage.PSL_EVENTUALLY: return createPSLEventually();
      case AgclPackage.PSL_ALWAYS: return createPSLAlways();
      case AgclPackage.PSL_UNTIL: return createPSLUntil();
      case AgclPackage.PSL_NEGATION: return createPSLNegation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AGCLGrammarRoot createAGCLGrammarRoot()
  {
    AGCLGrammarRootImpl agclGrammarRoot = new AGCLGrammarRootImpl();
    return agclGrammarRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AGCLAnnexLibrary createAGCLAnnexLibrary()
  {
    AGCLAnnexLibraryImpl agclAnnexLibrary = new AGCLAnnexLibraryImpl();
    return agclAnnexLibrary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AGCLViewpoint createAGCLViewpoint()
  {
    AGCLViewpointImpl agclViewpoint = new AGCLViewpointImpl();
    return agclViewpoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AGCLEnforce createAGCLEnforce()
  {
    AGCLEnforceImpl agclEnforce = new AGCLEnforceImpl();
    return agclEnforce;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AGCLAnnexSubclause createAGCLAnnexSubclause()
  {
    AGCLAnnexSubclauseImpl agclAnnexSubclause = new AGCLAnnexSubclauseImpl();
    return agclAnnexSubclause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AGCLContract createAGCLContract()
  {
    AGCLContractImpl agclContract = new AGCLContractImpl();
    return agclContract;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AGCLPropertyDecl createAGCLPropertyDecl()
  {
    AGCLPropertyDeclImpl agclPropertyDecl = new AGCLPropertyDeclImpl();
    return agclPropertyDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AGCLAssumption createAGCLAssumption()
  {
    AGCLAssumptionImpl agclAssumption = new AGCLAssumptionImpl();
    return agclAssumption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AGCLGuarantee createAGCLGuarantee()
  {
    AGCLGuaranteeImpl agclGuarantee = new AGCLGuaranteeImpl();
    return agclGuarantee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AGCLBehaviour createAGCLBehaviour()
  {
    AGCLBehaviourImpl agclBehaviour = new AGCLBehaviourImpl();
    return agclBehaviour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PSLSpec createPSLSpec()
  {
    PSLSpecImpl pslSpec = new PSLSpecImpl();
    return pslSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PSLExpression createPSLExpression()
  {
    PSLExpressionImpl pslExpression = new PSLExpressionImpl();
    return pslExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanConstant createBooleanConstant()
  {
    BooleanConstantImpl booleanConstant = new BooleanConstantImpl();
    return booleanConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicProposition createAtomicProposition()
  {
    AtomicPropositionImpl atomicProposition = new AtomicPropositionImpl();
    return atomicProposition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Var createVar()
  {
    VarImpl var = new VarImpl();
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input createInput()
  {
    InputImpl input = new InputImpl();
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Output createOutput()
  {
    OutputImpl output = new OutputImpl();
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PSLImplication createPSLImplication()
  {
    PSLImplicationImpl pslImplication = new PSLImplicationImpl();
    return pslImplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PSLBiconditional createPSLBiconditional()
  {
    PSLBiconditionalImpl pslBiconditional = new PSLBiconditionalImpl();
    return pslBiconditional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PSLDisjunction createPSLDisjunction()
  {
    PSLDisjunctionImpl pslDisjunction = new PSLDisjunctionImpl();
    return pslDisjunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PSLConjunction createPSLConjunction()
  {
    PSLConjunctionImpl pslConjunction = new PSLConjunctionImpl();
    return pslConjunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PSLNext createPSLNext()
  {
    PSLNextImpl pslNext = new PSLNextImpl();
    return pslNext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PSLEventually createPSLEventually()
  {
    PSLEventuallyImpl pslEventually = new PSLEventuallyImpl();
    return pslEventually;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PSLAlways createPSLAlways()
  {
    PSLAlwaysImpl pslAlways = new PSLAlwaysImpl();
    return pslAlways;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PSLUntil createPSLUntil()
  {
    PSLUntilImpl pslUntil = new PSLUntilImpl();
    return pslUntil;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PSLNegation createPSLNegation()
  {
    PSLNegationImpl pslNegation = new PSLNegationImpl();
    return pslNegation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AgclPackage getAgclPackage()
  {
    return (AgclPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AgclPackage getPackage()
  {
    return AgclPackage.eINSTANCE;
  }

} //AgclFactoryImpl
