/**
 */
package org.osate.xtext.aadl2.agcl.agcl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.Element;
import org.osate.aadl2.ModalElement;
import org.osate.aadl2.NamedElement;

import org.osate.xtext.aadl2.agcl.agcl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage
 * @generated
 */
public class AgclSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AgclPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AgclSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AgclPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AgclPackage.AGCL_GRAMMAR_ROOT:
      {
        AGCLGrammarRoot agclGrammarRoot = (AGCLGrammarRoot)theEObject;
        T result = caseAGCLGrammarRoot(agclGrammarRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.AGCL_ANNEX_LIBRARY:
      {
        AGCLAnnexLibrary agclAnnexLibrary = (AGCLAnnexLibrary)theEObject;
        T result = caseAGCLAnnexLibrary(agclAnnexLibrary);
        if (result == null) result = caseAnnexLibrary(agclAnnexLibrary);
        if (result == null) result = caseNamedElement(agclAnnexLibrary);
        if (result == null) result = caseElement(agclAnnexLibrary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.AGCL_VIEWPOINT:
      {
        AGCLViewpoint agclViewpoint = (AGCLViewpoint)theEObject;
        T result = caseAGCLViewpoint(agclViewpoint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.AGCL_ENFORCE:
      {
        AGCLEnforce agclEnforce = (AGCLEnforce)theEObject;
        T result = caseAGCLEnforce(agclEnforce);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.AGCL_ANNEX_SUBCLAUSE:
      {
        AGCLAnnexSubclause agclAnnexSubclause = (AGCLAnnexSubclause)theEObject;
        T result = caseAGCLAnnexSubclause(agclAnnexSubclause);
        if (result == null) result = caseAnnexSubclause(agclAnnexSubclause);
        if (result == null) result = caseModalElement(agclAnnexSubclause);
        if (result == null) result = caseNamedElement(agclAnnexSubclause);
        if (result == null) result = caseElement(agclAnnexSubclause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.AGCL_CONTRACT:
      {
        AGCLContract agclContract = (AGCLContract)theEObject;
        T result = caseAGCLContract(agclContract);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.AGCL_PROPERTY_DECL:
      {
        AGCLPropertyDecl agclPropertyDecl = (AGCLPropertyDecl)theEObject;
        T result = caseAGCLPropertyDecl(agclPropertyDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.AGCL_ASSUMPTION:
      {
        AGCLAssumption agclAssumption = (AGCLAssumption)theEObject;
        T result = caseAGCLAssumption(agclAssumption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.AGCL_GUARANTEE:
      {
        AGCLGuarantee agclGuarantee = (AGCLGuarantee)theEObject;
        T result = caseAGCLGuarantee(agclGuarantee);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.AGCL_BEHAVIOUR:
      {
        AGCLBehaviour agclBehaviour = (AGCLBehaviour)theEObject;
        T result = caseAGCLBehaviour(agclBehaviour);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.PSL_SPEC:
      {
        PSLSpec pslSpec = (PSLSpec)theEObject;
        T result = casePSLSpec(pslSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.PSL_EXPRESSION:
      {
        PSLExpression pslExpression = (PSLExpression)theEObject;
        T result = casePSLExpression(pslExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.BOOLEAN_CONSTANT:
      {
        BooleanConstant booleanConstant = (BooleanConstant)theEObject;
        T result = caseBooleanConstant(booleanConstant);
        if (result == null) result = casePSLExpression(booleanConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.ATOMIC_PROPOSITION:
      {
        AtomicProposition atomicProposition = (AtomicProposition)theEObject;
        T result = caseAtomicProposition(atomicProposition);
        if (result == null) result = casePSLExpression(atomicProposition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.VAR:
      {
        Var var = (Var)theEObject;
        T result = caseVar(var);
        if (result == null) result = caseAtomicProposition(var);
        if (result == null) result = casePSLExpression(var);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.INPUT:
      {
        Input input = (Input)theEObject;
        T result = caseInput(input);
        if (result == null) result = caseAtomicProposition(input);
        if (result == null) result = casePSLExpression(input);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.OUTPUT:
      {
        Output output = (Output)theEObject;
        T result = caseOutput(output);
        if (result == null) result = caseAtomicProposition(output);
        if (result == null) result = casePSLExpression(output);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.PSL_IMPLICATION:
      {
        PSLImplication pslImplication = (PSLImplication)theEObject;
        T result = casePSLImplication(pslImplication);
        if (result == null) result = casePSLExpression(pslImplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.PSL_BICONDITIONAL:
      {
        PSLBiconditional pslBiconditional = (PSLBiconditional)theEObject;
        T result = casePSLBiconditional(pslBiconditional);
        if (result == null) result = casePSLExpression(pslBiconditional);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.PSL_DISJUNCTION:
      {
        PSLDisjunction pslDisjunction = (PSLDisjunction)theEObject;
        T result = casePSLDisjunction(pslDisjunction);
        if (result == null) result = casePSLExpression(pslDisjunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.PSL_CONJUNCTION:
      {
        PSLConjunction pslConjunction = (PSLConjunction)theEObject;
        T result = casePSLConjunction(pslConjunction);
        if (result == null) result = casePSLExpression(pslConjunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.PSL_NEXT:
      {
        PSLNext pslNext = (PSLNext)theEObject;
        T result = casePSLNext(pslNext);
        if (result == null) result = casePSLExpression(pslNext);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.PSL_EVENTUALLY:
      {
        PSLEventually pslEventually = (PSLEventually)theEObject;
        T result = casePSLEventually(pslEventually);
        if (result == null) result = casePSLExpression(pslEventually);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.PSL_ALWAYS:
      {
        PSLAlways pslAlways = (PSLAlways)theEObject;
        T result = casePSLAlways(pslAlways);
        if (result == null) result = casePSLExpression(pslAlways);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.PSL_UNTIL:
      {
        PSLUntil pslUntil = (PSLUntil)theEObject;
        T result = casePSLUntil(pslUntil);
        if (result == null) result = casePSLExpression(pslUntil);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.PSL_NEGATION:
      {
        PSLNegation pslNegation = (PSLNegation)theEObject;
        T result = casePSLNegation(pslNegation);
        if (result == null) result = casePSLExpression(pslNegation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AGCL Grammar Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AGCL Grammar Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAGCLGrammarRoot(AGCLGrammarRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AGCL Annex Library</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AGCL Annex Library</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAGCLAnnexLibrary(AGCLAnnexLibrary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AGCL Viewpoint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AGCL Viewpoint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAGCLViewpoint(AGCLViewpoint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AGCL Enforce</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AGCL Enforce</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAGCLEnforce(AGCLEnforce object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AGCL Annex Subclause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AGCL Annex Subclause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAGCLAnnexSubclause(AGCLAnnexSubclause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AGCL Contract</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AGCL Contract</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAGCLContract(AGCLContract object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AGCL Property Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AGCL Property Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAGCLPropertyDecl(AGCLPropertyDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AGCL Assumption</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AGCL Assumption</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAGCLAssumption(AGCLAssumption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AGCL Guarantee</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AGCL Guarantee</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAGCLGuarantee(AGCLGuarantee object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AGCL Behaviour</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AGCL Behaviour</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAGCLBehaviour(AGCLBehaviour object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PSL Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PSL Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePSLSpec(PSLSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PSL Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PSL Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePSLExpression(PSLExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanConstant(BooleanConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Proposition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Proposition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicProposition(AtomicProposition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVar(Var object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInput(Input object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutput(Output object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PSL Implication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PSL Implication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePSLImplication(PSLImplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PSL Biconditional</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PSL Biconditional</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePSLBiconditional(PSLBiconditional object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PSL Disjunction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PSL Disjunction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePSLDisjunction(PSLDisjunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PSL Conjunction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PSL Conjunction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePSLConjunction(PSLConjunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PSL Next</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PSL Next</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePSLNext(PSLNext object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PSL Eventually</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PSL Eventually</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePSLEventually(PSLEventually object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PSL Always</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PSL Always</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePSLAlways(PSLAlways object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PSL Until</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PSL Until</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePSLUntil(PSLUntil object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PSL Negation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PSL Negation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePSLNegation(PSLNegation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedElement(NamedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annex Library</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annex Library</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnexLibrary(AnnexLibrary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Modal Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Modal Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModalElement(ModalElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annex Subclause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annex Subclause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnexSubclause(AnnexSubclause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AgclSwitch
