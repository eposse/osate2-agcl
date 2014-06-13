/**
 */
package org.osate.xtext.aadl2.agcl.agcl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.osate.xtext.aadl2.agcl.agcl.AgclPackage
 * @generated
 */
public interface AgclFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AgclFactory eINSTANCE = org.osate.xtext.aadl2.agcl.agcl.impl.AgclFactoryImpl.init();

  /**
   * Returns a new object of class '<em>AGCL Grammar Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>AGCL Grammar Root</em>'.
   * @generated
   */
  AGCLGrammarRoot createAGCLGrammarRoot();

  /**
   * Returns a new object of class '<em>AGCL Annex Library</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>AGCL Annex Library</em>'.
   * @generated
   */
  AGCLAnnexLibrary createAGCLAnnexLibrary();

  /**
   * Returns a new object of class '<em>AGCL Viewpoint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>AGCL Viewpoint</em>'.
   * @generated
   */
  AGCLViewpoint createAGCLViewpoint();

  /**
   * Returns a new object of class '<em>AGCL Enforce</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>AGCL Enforce</em>'.
   * @generated
   */
  AGCLEnforce createAGCLEnforce();

  /**
   * Returns a new object of class '<em>AGCL Annex Subclause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>AGCL Annex Subclause</em>'.
   * @generated
   */
  AGCLAnnexSubclause createAGCLAnnexSubclause();

  /**
   * Returns a new object of class '<em>AGCL Contract</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>AGCL Contract</em>'.
   * @generated
   */
  AGCLContract createAGCLContract();

  /**
   * Returns a new object of class '<em>AGCL Property Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>AGCL Property Decl</em>'.
   * @generated
   */
  AGCLPropertyDecl createAGCLPropertyDecl();

  /**
   * Returns a new object of class '<em>AGCL Assumption</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>AGCL Assumption</em>'.
   * @generated
   */
  AGCLAssumption createAGCLAssumption();

  /**
   * Returns a new object of class '<em>AGCL Guarantee</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>AGCL Guarantee</em>'.
   * @generated
   */
  AGCLGuarantee createAGCLGuarantee();

  /**
   * Returns a new object of class '<em>AGCL Behaviour</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>AGCL Behaviour</em>'.
   * @generated
   */
  AGCLBehaviour createAGCLBehaviour();

  /**
   * Returns a new object of class '<em>PSL Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PSL Spec</em>'.
   * @generated
   */
  PSLSpec createPSLSpec();

  /**
   * Returns a new object of class '<em>PSL Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PSL Expression</em>'.
   * @generated
   */
  PSLExpression createPSLExpression();

  /**
   * Returns a new object of class '<em>Boolean Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Constant</em>'.
   * @generated
   */
  BooleanConstant createBooleanConstant();

  /**
   * Returns a new object of class '<em>Atomic Proposition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atomic Proposition</em>'.
   * @generated
   */
  AtomicProposition createAtomicProposition();

  /**
   * Returns a new object of class '<em>Var</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var</em>'.
   * @generated
   */
  Var createVar();

  /**
   * Returns a new object of class '<em>Input</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input</em>'.
   * @generated
   */
  Input createInput();

  /**
   * Returns a new object of class '<em>Output</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output</em>'.
   * @generated
   */
  Output createOutput();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>PSL Implication</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PSL Implication</em>'.
   * @generated
   */
  PSLImplication createPSLImplication();

  /**
   * Returns a new object of class '<em>PSL Biconditional</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PSL Biconditional</em>'.
   * @generated
   */
  PSLBiconditional createPSLBiconditional();

  /**
   * Returns a new object of class '<em>PSL Disjunction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PSL Disjunction</em>'.
   * @generated
   */
  PSLDisjunction createPSLDisjunction();

  /**
   * Returns a new object of class '<em>PSL Conjunction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PSL Conjunction</em>'.
   * @generated
   */
  PSLConjunction createPSLConjunction();

  /**
   * Returns a new object of class '<em>PSL Next</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PSL Next</em>'.
   * @generated
   */
  PSLNext createPSLNext();

  /**
   * Returns a new object of class '<em>PSL Eventually</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PSL Eventually</em>'.
   * @generated
   */
  PSLEventually createPSLEventually();

  /**
   * Returns a new object of class '<em>PSL Always</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PSL Always</em>'.
   * @generated
   */
  PSLAlways createPSLAlways();

  /**
   * Returns a new object of class '<em>PSL Until</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PSL Until</em>'.
   * @generated
   */
  PSLUntil createPSLUntil();

  /**
   * Returns a new object of class '<em>PSL Negation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PSL Negation</em>'.
   * @generated
   */
  PSLNegation createPSLNegation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AgclPackage getAgclPackage();

} //AgclFactory
