/**
 */
package org.osate.xtext.aadl2.agcl.agcl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.Element;
import org.osate.aadl2.ModalElement;
import org.osate.aadl2.NamedElement;

import org.osate.xtext.aadl2.agcl.agcl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage
 * @generated
 */
public class AgclAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AgclPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AgclAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AgclPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AgclSwitch<Adapter> modelSwitch =
    new AgclSwitch<Adapter>()
    {
      @Override
      public Adapter caseAGCLGrammarRoot(AGCLGrammarRoot object)
      {
        return createAGCLGrammarRootAdapter();
      }
      @Override
      public Adapter caseAGCLAnnexLibrary(AGCLAnnexLibrary object)
      {
        return createAGCLAnnexLibraryAdapter();
      }
      @Override
      public Adapter caseAGCLViewpoint(AGCLViewpoint object)
      {
        return createAGCLViewpointAdapter();
      }
      @Override
      public Adapter caseAGCLEnforce(AGCLEnforce object)
      {
        return createAGCLEnforceAdapter();
      }
      @Override
      public Adapter caseAGCLAnnexSubclause(AGCLAnnexSubclause object)
      {
        return createAGCLAnnexSubclauseAdapter();
      }
      @Override
      public Adapter caseAGCLContract(AGCLContract object)
      {
        return createAGCLContractAdapter();
      }
      @Override
      public Adapter caseAGCLPropertyDecl(AGCLPropertyDecl object)
      {
        return createAGCLPropertyDeclAdapter();
      }
      @Override
      public Adapter caseAGCLAssumption(AGCLAssumption object)
      {
        return createAGCLAssumptionAdapter();
      }
      @Override
      public Adapter caseAGCLGuarantee(AGCLGuarantee object)
      {
        return createAGCLGuaranteeAdapter();
      }
      @Override
      public Adapter caseAGCLBehaviour(AGCLBehaviour object)
      {
        return createAGCLBehaviourAdapter();
      }
      @Override
      public Adapter casePSLSpec(PSLSpec object)
      {
        return createPSLSpecAdapter();
      }
      @Override
      public Adapter casePSLExpression(PSLExpression object)
      {
        return createPSLExpressionAdapter();
      }
      @Override
      public Adapter caseBooleanConstant(BooleanConstant object)
      {
        return createBooleanConstantAdapter();
      }
      @Override
      public Adapter caseAtomicProposition(AtomicProposition object)
      {
        return createAtomicPropositionAdapter();
      }
      @Override
      public Adapter caseVar(Var object)
      {
        return createVarAdapter();
      }
      @Override
      public Adapter caseInput(Input object)
      {
        return createInputAdapter();
      }
      @Override
      public Adapter caseOutput(Output object)
      {
        return createOutputAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter casePSLImplication(PSLImplication object)
      {
        return createPSLImplicationAdapter();
      }
      @Override
      public Adapter casePSLBiconditional(PSLBiconditional object)
      {
        return createPSLBiconditionalAdapter();
      }
      @Override
      public Adapter casePSLDisjunction(PSLDisjunction object)
      {
        return createPSLDisjunctionAdapter();
      }
      @Override
      public Adapter casePSLConjunction(PSLConjunction object)
      {
        return createPSLConjunctionAdapter();
      }
      @Override
      public Adapter casePSLNext(PSLNext object)
      {
        return createPSLNextAdapter();
      }
      @Override
      public Adapter casePSLEventually(PSLEventually object)
      {
        return createPSLEventuallyAdapter();
      }
      @Override
      public Adapter casePSLAlways(PSLAlways object)
      {
        return createPSLAlwaysAdapter();
      }
      @Override
      public Adapter casePSLUntil(PSLUntil object)
      {
        return createPSLUntilAdapter();
      }
      @Override
      public Adapter casePSLNegation(PSLNegation object)
      {
        return createPSLNegationAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseNamedElement(NamedElement object)
      {
        return createNamedElementAdapter();
      }
      @Override
      public Adapter caseAnnexLibrary(AnnexLibrary object)
      {
        return createAnnexLibraryAdapter();
      }
      @Override
      public Adapter caseModalElement(ModalElement object)
      {
        return createModalElementAdapter();
      }
      @Override
      public Adapter caseAnnexSubclause(AnnexSubclause object)
      {
        return createAnnexSubclauseAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLGrammarRoot <em>AGCL Grammar Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLGrammarRoot
   * @generated
   */
  public Adapter createAGCLGrammarRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexLibrary <em>AGCL Annex Library</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexLibrary
   * @generated
   */
  public Adapter createAGCLAnnexLibraryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLViewpoint <em>AGCL Viewpoint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLViewpoint
   * @generated
   */
  public Adapter createAGCLViewpointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLEnforce <em>AGCL Enforce</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLEnforce
   * @generated
   */
  public Adapter createAGCLEnforceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause <em>AGCL Annex Subclause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause
   * @generated
   */
  public Adapter createAGCLAnnexSubclauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLContract <em>AGCL Contract</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLContract
   * @generated
   */
  public Adapter createAGCLContractAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLPropertyDecl <em>AGCL Property Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLPropertyDecl
   * @generated
   */
  public Adapter createAGCLPropertyDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLAssumption <em>AGCL Assumption</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLAssumption
   * @generated
   */
  public Adapter createAGCLAssumptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLGuarantee <em>AGCL Guarantee</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLGuarantee
   * @generated
   */
  public Adapter createAGCLGuaranteeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLBehaviour <em>AGCL Behaviour</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLBehaviour
   * @generated
   */
  public Adapter createAGCLBehaviourAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.PSLSpec <em>PSL Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.PSLSpec
   * @generated
   */
  public Adapter createPSLSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression <em>PSL Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.PSLExpression
   * @generated
   */
  public Adapter createPSLExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.BooleanConstant <em>Boolean Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.BooleanConstant
   * @generated
   */
  public Adapter createBooleanConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.AtomicProposition <em>Atomic Proposition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.AtomicProposition
   * @generated
   */
  public Adapter createAtomicPropositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.Var <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.Var
   * @generated
   */
  public Adapter createVarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.Input
   * @generated
   */
  public Adapter createInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.Output <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.Output
   * @generated
   */
  public Adapter createOutputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.PSLImplication <em>PSL Implication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.PSLImplication
   * @generated
   */
  public Adapter createPSLImplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.PSLBiconditional <em>PSL Biconditional</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.PSLBiconditional
   * @generated
   */
  public Adapter createPSLBiconditionalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.PSLDisjunction <em>PSL Disjunction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.PSLDisjunction
   * @generated
   */
  public Adapter createPSLDisjunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.PSLConjunction <em>PSL Conjunction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.PSLConjunction
   * @generated
   */
  public Adapter createPSLConjunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.PSLNext <em>PSL Next</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.PSLNext
   * @generated
   */
  public Adapter createPSLNextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.PSLEventually <em>PSL Eventually</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.PSLEventually
   * @generated
   */
  public Adapter createPSLEventuallyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.PSLAlways <em>PSL Always</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.PSLAlways
   * @generated
   */
  public Adapter createPSLAlwaysAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.PSLUntil <em>PSL Until</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.PSLUntil
   * @generated
   */
  public Adapter createPSLUntilAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.agcl.PSLNegation <em>PSL Negation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.agcl.agcl.PSLNegation
   * @generated
   */
  public Adapter createPSLNegationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.NamedElement
   * @generated
   */
  public Adapter createNamedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.AnnexLibrary <em>Annex Library</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.AnnexLibrary
   * @generated
   */
  public Adapter createAnnexLibraryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.ModalElement <em>Modal Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.ModalElement
   * @generated
   */
  public Adapter createModalElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.AnnexSubclause <em>Annex Subclause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.AnnexSubclause
   * @generated
   */
  public Adapter createAnnexSubclauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AgclAdapterFactory
