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
      case AgclPackage.PSL_FORMULA:
      {
        PSLFormula pslFormula = (PSLFormula)theEObject;
        T result = casePSLFormula(pslFormula);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.PSL_BOOLEAN_EXPRESSION:
      {
        PSLBooleanExpression pslBooleanExpression = (PSLBooleanExpression)theEObject;
        T result = casePSLBooleanExpression(pslBooleanExpression);
        if (result == null) result = casePSLFormula(pslBooleanExpression);
        if (result == null) result = casePSLNegation(pslBooleanExpression);
        if (result == null) result = casePSLAtom(pslBooleanExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.BOOLEAN_CONSTANT:
      {
        BooleanConstant booleanConstant = (BooleanConstant)theEObject;
        T result = caseBooleanConstant(booleanConstant);
        if (result == null) result = casePSLAtom(booleanConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.ATOMIC_PROP:
      {
        AtomicProp atomicProp = (AtomicProp)theEObject;
        T result = caseAtomicProp(atomicProp);
        if (result == null) result = casePSLAtom(atomicProp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.VAR:
      {
        Var var = (Var)theEObject;
        T result = caseVar(var);
        if (result == null) result = caseAtomicProp(var);
        if (result == null) result = casePSLAtom(var);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.INPUT:
      {
        Input input = (Input)theEObject;
        T result = caseInput(input);
        if (result == null) result = caseAtomicProp(input);
        if (result == null) result = casePSLAtom(input);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.OUTPUT:
      {
        Output output = (Output)theEObject;
        T result = caseOutput(output);
        if (result == null) result = caseAtomicProp(output);
        if (result == null) result = casePSLAtom(output);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.PSL_DISJUNCTION:
      {
        PSLDisjunction pslDisjunction = (PSLDisjunction)theEObject;
        T result = casePSLDisjunction(pslDisjunction);
        if (result == null) result = casePSLBooleanExpression(pslDisjunction);
        if (result == null) result = casePSLFormula(pslDisjunction);
        if (result == null) result = casePSLNegation(pslDisjunction);
        if (result == null) result = casePSLAtom(pslDisjunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.PSL_CONJUNCTION:
      {
        PSLConjunction pslConjunction = (PSLConjunction)theEObject;
        T result = casePSLConjunction(pslConjunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.PSL_ATOM:
      {
        PSLAtom pslAtom = (PSLAtom)theEObject;
        T result = casePSLAtom(pslAtom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgclPackage.PSL_NEGATION:
      {
        PSLNegation pslNegation = (PSLNegation)theEObject;
        T result = casePSLNegation(pslNegation);
        if (result == null) result = casePSLAtom(pslNegation);
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
   * Returns the result of interpreting the object as an instance of '<em>PSL Formula</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PSL Formula</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePSLFormula(PSLFormula object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PSL Boolean Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PSL Boolean Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePSLBooleanExpression(PSLBooleanExpression object)
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
   * Returns the result of interpreting the object as an instance of '<em>Atomic Prop</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Prop</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicProp(AtomicProp object)
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
   * Returns the result of interpreting the object as an instance of '<em>PSL Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PSL Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePSLAtom(PSLAtom object)
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
