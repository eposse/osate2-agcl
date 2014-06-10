/**
 */
package org.osate.xtext.aadl2.agcl.agcl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.osate.aadl2.Aadl2Package;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.osate.xtext.aadl2.agcl.agcl.AgclFactory
 * @model kind="package"
 * @generated
 */
public interface AgclPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "agcl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.osate.org/xtext/aadl2/agcl/AGCL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "agcl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AgclPackage eINSTANCE = org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl.init();

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLGrammarRootImpl <em>AGCL Grammar Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AGCLGrammarRootImpl
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getAGCLGrammarRoot()
   * @generated
   */
  int AGCL_GRAMMAR_ROOT = 0;

  /**
   * The feature id for the '<em><b>Lib</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_GRAMMAR_ROOT__LIB = 0;

  /**
   * The feature id for the '<em><b>Subclause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_GRAMMAR_ROOT__SUBCLAUSE = 1;

  /**
   * The number of structural features of the '<em>AGCL Grammar Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_GRAMMAR_ROOT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLAnnexLibraryImpl <em>AGCL Annex Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AGCLAnnexLibraryImpl
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getAGCLAnnexLibrary()
   * @generated
   */
  int AGCL_ANNEX_LIBRARY = 1;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_ANNEX_LIBRARY__OWNED_ELEMENT = Aadl2Package.ANNEX_LIBRARY__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_ANNEX_LIBRARY__OWNED_COMMENT = Aadl2Package.ANNEX_LIBRARY__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_ANNEX_LIBRARY__NAME = Aadl2Package.ANNEX_LIBRARY__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_ANNEX_LIBRARY__QUALIFIED_NAME = Aadl2Package.ANNEX_LIBRARY__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_ANNEX_LIBRARY__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.ANNEX_LIBRARY__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Viewpoints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_ANNEX_LIBRARY__VIEWPOINTS = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Enforceclauses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_ANNEX_LIBRARY__ENFORCECLAUSES = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>AGCL Annex Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_ANNEX_LIBRARY_FEATURE_COUNT = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLViewpointImpl <em>AGCL Viewpoint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AGCLViewpointImpl
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getAGCLViewpoint()
   * @generated
   */
  int AGCL_VIEWPOINT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_VIEWPOINT__NAME = 0;

  /**
   * The number of structural features of the '<em>AGCL Viewpoint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_VIEWPOINT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLEnforceImpl <em>AGCL Enforce</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AGCLEnforceImpl
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getAGCLEnforce()
   * @generated
   */
  int AGCL_ENFORCE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_ENFORCE__NAME = 0;

  /**
   * The number of structural features of the '<em>AGCL Enforce</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_ENFORCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLAnnexSubclauseImpl <em>AGCL Annex Subclause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AGCLAnnexSubclauseImpl
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getAGCLAnnexSubclause()
   * @generated
   */
  int AGCL_ANNEX_SUBCLAUSE = 4;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_ANNEX_SUBCLAUSE__OWNED_ELEMENT = Aadl2Package.ANNEX_SUBCLAUSE__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_ANNEX_SUBCLAUSE__OWNED_COMMENT = Aadl2Package.ANNEX_SUBCLAUSE__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_ANNEX_SUBCLAUSE__NAME = Aadl2Package.ANNEX_SUBCLAUSE__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_ANNEX_SUBCLAUSE__QUALIFIED_NAME = Aadl2Package.ANNEX_SUBCLAUSE__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_ANNEX_SUBCLAUSE__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.ANNEX_SUBCLAUSE__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>In Mode</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_ANNEX_SUBCLAUSE__IN_MODE = Aadl2Package.ANNEX_SUBCLAUSE__IN_MODE;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_ANNEX_SUBCLAUSE__DECLARATIONS = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Behaviour</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_ANNEX_SUBCLAUSE__BEHAVIOUR = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Contracts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_ANNEX_SUBCLAUSE__CONTRACTS = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>AGCL Annex Subclause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_ANNEX_SUBCLAUSE_FEATURE_COUNT = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLContractImpl <em>AGCL Contract</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AGCLContractImpl
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getAGCLContract()
   * @generated
   */
  int AGCL_CONTRACT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_CONTRACT__NAME = 0;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_CONTRACT__DECLARATIONS = 1;

  /**
   * The feature id for the '<em><b>Assumption</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_CONTRACT__ASSUMPTION = 2;

  /**
   * The feature id for the '<em><b>Guarantee</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_CONTRACT__GUARANTEE = 3;

  /**
   * The feature id for the '<em><b>Ename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_CONTRACT__ENAME = 4;

  /**
   * The number of structural features of the '<em>AGCL Contract</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_CONTRACT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLPropertyDeclImpl <em>AGCL Property Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AGCLPropertyDeclImpl
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getAGCLPropertyDecl()
   * @generated
   */
  int AGCL_PROPERTY_DECL = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_PROPERTY_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_PROPERTY_DECL__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_PROPERTY_DECL__SPEC = 2;

  /**
   * The number of structural features of the '<em>AGCL Property Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_PROPERTY_DECL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLAssumptionImpl <em>AGCL Assumption</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AGCLAssumptionImpl
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getAGCLAssumption()
   * @generated
   */
  int AGCL_ASSUMPTION = 7;

  /**
   * The feature id for the '<em><b>Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_ASSUMPTION__SPEC = 0;

  /**
   * The number of structural features of the '<em>AGCL Assumption</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_ASSUMPTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLGuaranteeImpl <em>AGCL Guarantee</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AGCLGuaranteeImpl
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getAGCLGuarantee()
   * @generated
   */
  int AGCL_GUARANTEE = 8;

  /**
   * The feature id for the '<em><b>Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_GUARANTEE__SPEC = 0;

  /**
   * The number of structural features of the '<em>AGCL Guarantee</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_GUARANTEE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLBehaviourImpl <em>AGCL Behaviour</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AGCLBehaviourImpl
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getAGCLBehaviour()
   * @generated
   */
  int AGCL_BEHAVIOUR = 9;

  /**
   * The feature id for the '<em><b>Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_BEHAVIOUR__SPEC = 0;

  /**
   * The number of structural features of the '<em>AGCL Behaviour</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGCL_BEHAVIOUR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.PSLSpecImpl <em>PSL Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.PSLSpecImpl
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getPSLSpec()
   * @generated
   */
  int PSL_SPEC = 10;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSL_SPEC__EXPR = 0;

  /**
   * The number of structural features of the '<em>PSL Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSL_SPEC_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.PSLExpressionImpl <em>PSL Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.PSLExpressionImpl
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getPSLExpression()
   * @generated
   */
  int PSL_EXPRESSION = 11;

  /**
   * The feature id for the '<em><b>Subterm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSL_EXPRESSION__SUBTERM = 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSL_EXPRESSION__LEFT = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSL_EXPRESSION__RIGHT = 2;

  /**
   * The feature id for the '<em><b>Negated</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSL_EXPRESSION__NEGATED = 3;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSL_EXPRESSION__TERMS = 4;

  /**
   * The feature id for the '<em><b>Factors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSL_EXPRESSION__FACTORS = 5;

  /**
   * The number of structural features of the '<em>PSL Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSL_EXPRESSION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.BooleanConstantImpl <em>Boolean Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.BooleanConstantImpl
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getBooleanConstant()
   * @generated
   */
  int BOOLEAN_CONSTANT = 12;

  /**
   * The feature id for the '<em><b>Subterm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_CONSTANT__SUBTERM = PSL_EXPRESSION__SUBTERM;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_CONSTANT__LEFT = PSL_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_CONSTANT__RIGHT = PSL_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Negated</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_CONSTANT__NEGATED = PSL_EXPRESSION__NEGATED;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_CONSTANT__TERMS = PSL_EXPRESSION__TERMS;

  /**
   * The feature id for the '<em><b>Factors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_CONSTANT__FACTORS = PSL_EXPRESSION__FACTORS;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_CONSTANT__VAL = PSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_CONSTANT_FEATURE_COUNT = PSL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.AtomicPropImpl <em>Atomic Prop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AtomicPropImpl
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getAtomicProp()
   * @generated
   */
  int ATOMIC_PROP = 13;

  /**
   * The feature id for the '<em><b>Subterm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_PROP__SUBTERM = PSL_EXPRESSION__SUBTERM;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_PROP__LEFT = PSL_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_PROP__RIGHT = PSL_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Negated</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_PROP__NEGATED = PSL_EXPRESSION__NEGATED;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_PROP__TERMS = PSL_EXPRESSION__TERMS;

  /**
   * The feature id for the '<em><b>Factors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_PROP__FACTORS = PSL_EXPRESSION__FACTORS;

  /**
   * The number of structural features of the '<em>Atomic Prop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_PROP_FEATURE_COUNT = PSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.VarImpl <em>Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.VarImpl
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getVar()
   * @generated
   */
  int VAR = 14;

  /**
   * The feature id for the '<em><b>Subterm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__SUBTERM = ATOMIC_PROP__SUBTERM;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__LEFT = ATOMIC_PROP__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__RIGHT = ATOMIC_PROP__RIGHT;

  /**
   * The feature id for the '<em><b>Negated</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__NEGATED = ATOMIC_PROP__NEGATED;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__TERMS = ATOMIC_PROP__TERMS;

  /**
   * The feature id for the '<em><b>Factors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__FACTORS = ATOMIC_PROP__FACTORS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__NAME = ATOMIC_PROP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_FEATURE_COUNT = ATOMIC_PROP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.InputImpl <em>Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.InputImpl
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getInput()
   * @generated
   */
  int INPUT = 15;

  /**
   * The feature id for the '<em><b>Subterm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__SUBTERM = ATOMIC_PROP__SUBTERM;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__LEFT = ATOMIC_PROP__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__RIGHT = ATOMIC_PROP__RIGHT;

  /**
   * The feature id for the '<em><b>Negated</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__NEGATED = ATOMIC_PROP__NEGATED;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__TERMS = ATOMIC_PROP__TERMS;

  /**
   * The feature id for the '<em><b>Factors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__FACTORS = ATOMIC_PROP__FACTORS;

  /**
   * The feature id for the '<em><b>Link</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__LINK = ATOMIC_PROP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Event</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__EVENT = ATOMIC_PROP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FEATURE_COUNT = ATOMIC_PROP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.OutputImpl <em>Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.OutputImpl
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getOutput()
   * @generated
   */
  int OUTPUT = 16;

  /**
   * The feature id for the '<em><b>Subterm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__SUBTERM = ATOMIC_PROP__SUBTERM;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__LEFT = ATOMIC_PROP__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__RIGHT = ATOMIC_PROP__RIGHT;

  /**
   * The feature id for the '<em><b>Negated</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__NEGATED = ATOMIC_PROP__NEGATED;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__TERMS = ATOMIC_PROP__TERMS;

  /**
   * The feature id for the '<em><b>Factors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__FACTORS = ATOMIC_PROP__FACTORS;

  /**
   * The feature id for the '<em><b>Link</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__LINK = ATOMIC_PROP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Event</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__EVENT = ATOMIC_PROP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FEATURE_COUNT = ATOMIC_PROP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.ParameterImpl
   * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 17;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 0;


  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLGrammarRoot <em>AGCL Grammar Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AGCL Grammar Root</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLGrammarRoot
   * @generated
   */
  EClass getAGCLGrammarRoot();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLGrammarRoot#getLib <em>Lib</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lib</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLGrammarRoot#getLib()
   * @see #getAGCLGrammarRoot()
   * @generated
   */
  EReference getAGCLGrammarRoot_Lib();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLGrammarRoot#getSubclause <em>Subclause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subclause</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLGrammarRoot#getSubclause()
   * @see #getAGCLGrammarRoot()
   * @generated
   */
  EReference getAGCLGrammarRoot_Subclause();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexLibrary <em>AGCL Annex Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AGCL Annex Library</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexLibrary
   * @generated
   */
  EClass getAGCLAnnexLibrary();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexLibrary#getViewpoints <em>Viewpoints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Viewpoints</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexLibrary#getViewpoints()
   * @see #getAGCLAnnexLibrary()
   * @generated
   */
  EReference getAGCLAnnexLibrary_Viewpoints();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexLibrary#getEnforceclauses <em>Enforceclauses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enforceclauses</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexLibrary#getEnforceclauses()
   * @see #getAGCLAnnexLibrary()
   * @generated
   */
  EReference getAGCLAnnexLibrary_Enforceclauses();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLViewpoint <em>AGCL Viewpoint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AGCL Viewpoint</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLViewpoint
   * @generated
   */
  EClass getAGCLViewpoint();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLViewpoint#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLViewpoint#getName()
   * @see #getAGCLViewpoint()
   * @generated
   */
  EAttribute getAGCLViewpoint_Name();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLEnforce <em>AGCL Enforce</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AGCL Enforce</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLEnforce
   * @generated
   */
  EClass getAGCLEnforce();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLEnforce#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLEnforce#getName()
   * @see #getAGCLEnforce()
   * @generated
   */
  EAttribute getAGCLEnforce_Name();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause <em>AGCL Annex Subclause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AGCL Annex Subclause</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause
   * @generated
   */
  EClass getAGCLAnnexSubclause();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause#getDeclarations()
   * @see #getAGCLAnnexSubclause()
   * @generated
   */
  EReference getAGCLAnnexSubclause_Declarations();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause#getBehaviour <em>Behaviour</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Behaviour</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause#getBehaviour()
   * @see #getAGCLAnnexSubclause()
   * @generated
   */
  EReference getAGCLAnnexSubclause_Behaviour();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause#getContracts <em>Contracts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contracts</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause#getContracts()
   * @see #getAGCLAnnexSubclause()
   * @generated
   */
  EReference getAGCLAnnexSubclause_Contracts();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLContract <em>AGCL Contract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AGCL Contract</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLContract
   * @generated
   */
  EClass getAGCLContract();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLContract#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLContract#getName()
   * @see #getAGCLContract()
   * @generated
   */
  EAttribute getAGCLContract_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLContract#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLContract#getDeclarations()
   * @see #getAGCLContract()
   * @generated
   */
  EReference getAGCLContract_Declarations();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLContract#getAssumption <em>Assumption</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assumption</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLContract#getAssumption()
   * @see #getAGCLContract()
   * @generated
   */
  EReference getAGCLContract_Assumption();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLContract#getGuarantee <em>Guarantee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guarantee</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLContract#getGuarantee()
   * @see #getAGCLContract()
   * @generated
   */
  EReference getAGCLContract_Guarantee();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLContract#getEname <em>Ename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ename</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLContract#getEname()
   * @see #getAGCLContract()
   * @generated
   */
  EAttribute getAGCLContract_Ename();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLPropertyDecl <em>AGCL Property Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AGCL Property Decl</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLPropertyDecl
   * @generated
   */
  EClass getAGCLPropertyDecl();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLPropertyDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLPropertyDecl#getName()
   * @see #getAGCLPropertyDecl()
   * @generated
   */
  EAttribute getAGCLPropertyDecl_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLPropertyDecl#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLPropertyDecl#getParams()
   * @see #getAGCLPropertyDecl()
   * @generated
   */
  EReference getAGCLPropertyDecl_Params();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLPropertyDecl#getSpec <em>Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Spec</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLPropertyDecl#getSpec()
   * @see #getAGCLPropertyDecl()
   * @generated
   */
  EReference getAGCLPropertyDecl_Spec();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLAssumption <em>AGCL Assumption</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AGCL Assumption</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLAssumption
   * @generated
   */
  EClass getAGCLAssumption();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLAssumption#getSpec <em>Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Spec</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLAssumption#getSpec()
   * @see #getAGCLAssumption()
   * @generated
   */
  EReference getAGCLAssumption_Spec();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLGuarantee <em>AGCL Guarantee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AGCL Guarantee</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLGuarantee
   * @generated
   */
  EClass getAGCLGuarantee();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLGuarantee#getSpec <em>Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Spec</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLGuarantee#getSpec()
   * @see #getAGCLGuarantee()
   * @generated
   */
  EReference getAGCLGuarantee_Spec();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLBehaviour <em>AGCL Behaviour</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AGCL Behaviour</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLBehaviour
   * @generated
   */
  EClass getAGCLBehaviour();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.agcl.agcl.AGCLBehaviour#getSpec <em>Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Spec</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AGCLBehaviour#getSpec()
   * @see #getAGCLBehaviour()
   * @generated
   */
  EReference getAGCLBehaviour_Spec();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.agcl.PSLSpec <em>PSL Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PSL Spec</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.PSLSpec
   * @generated
   */
  EClass getPSLSpec();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.agcl.agcl.PSLSpec#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.PSLSpec#getExpr()
   * @see #getPSLSpec()
   * @generated
   */
  EReference getPSLSpec_Expr();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression <em>PSL Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PSL Expression</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.PSLExpression
   * @generated
   */
  EClass getPSLExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getSubterm <em>Subterm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subterm</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getSubterm()
   * @see #getPSLExpression()
   * @generated
   */
  EReference getPSLExpression_Subterm();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getLeft()
   * @see #getPSLExpression()
   * @generated
   */
  EReference getPSLExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getRight()
   * @see #getPSLExpression()
   * @generated
   */
  EReference getPSLExpression_Right();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getNegated <em>Negated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Negated</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getNegated()
   * @see #getPSLExpression()
   * @generated
   */
  EReference getPSLExpression_Negated();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getTerms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Terms</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getTerms()
   * @see #getPSLExpression()
   * @generated
   */
  EReference getPSLExpression_Terms();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getFactors <em>Factors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Factors</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.PSLExpression#getFactors()
   * @see #getPSLExpression()
   * @generated
   */
  EReference getPSLExpression_Factors();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.agcl.BooleanConstant <em>Boolean Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Constant</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.BooleanConstant
   * @generated
   */
  EClass getBooleanConstant();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.agcl.BooleanConstant#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.BooleanConstant#getVal()
   * @see #getBooleanConstant()
   * @generated
   */
  EAttribute getBooleanConstant_Val();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.agcl.AtomicProp <em>Atomic Prop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic Prop</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.AtomicProp
   * @generated
   */
  EClass getAtomicProp();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.agcl.Var <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.Var
   * @generated
   */
  EClass getVar();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.agcl.Var#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.Var#getName()
   * @see #getVar()
   * @generated
   */
  EAttribute getVar_Name();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.agcl.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.Input
   * @generated
   */
  EClass getInput();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.agcl.Input#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Link</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.Input#getLink()
   * @see #getInput()
   * @generated
   */
  EAttribute getInput_Link();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.agcl.Input#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Event</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.Input#getEvent()
   * @see #getInput()
   * @generated
   */
  EAttribute getInput_Event();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.agcl.Output <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.Output
   * @generated
   */
  EClass getOutput();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.agcl.Output#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Link</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.Output#getLink()
   * @see #getOutput()
   * @generated
   */
  EAttribute getOutput_Link();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.agcl.agcl.Output#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Event</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.Output#getEvent()
   * @see #getOutput()
   * @generated
   */
  EAttribute getOutput_Event();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.agcl.agcl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.osate.xtext.aadl2.agcl.agcl.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AgclFactory getAgclFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLGrammarRootImpl <em>AGCL Grammar Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AGCLGrammarRootImpl
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getAGCLGrammarRoot()
     * @generated
     */
    EClass AGCL_GRAMMAR_ROOT = eINSTANCE.getAGCLGrammarRoot();

    /**
     * The meta object literal for the '<em><b>Lib</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGCL_GRAMMAR_ROOT__LIB = eINSTANCE.getAGCLGrammarRoot_Lib();

    /**
     * The meta object literal for the '<em><b>Subclause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGCL_GRAMMAR_ROOT__SUBCLAUSE = eINSTANCE.getAGCLGrammarRoot_Subclause();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLAnnexLibraryImpl <em>AGCL Annex Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AGCLAnnexLibraryImpl
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getAGCLAnnexLibrary()
     * @generated
     */
    EClass AGCL_ANNEX_LIBRARY = eINSTANCE.getAGCLAnnexLibrary();

    /**
     * The meta object literal for the '<em><b>Viewpoints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGCL_ANNEX_LIBRARY__VIEWPOINTS = eINSTANCE.getAGCLAnnexLibrary_Viewpoints();

    /**
     * The meta object literal for the '<em><b>Enforceclauses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGCL_ANNEX_LIBRARY__ENFORCECLAUSES = eINSTANCE.getAGCLAnnexLibrary_Enforceclauses();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLViewpointImpl <em>AGCL Viewpoint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AGCLViewpointImpl
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getAGCLViewpoint()
     * @generated
     */
    EClass AGCL_VIEWPOINT = eINSTANCE.getAGCLViewpoint();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGCL_VIEWPOINT__NAME = eINSTANCE.getAGCLViewpoint_Name();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLEnforceImpl <em>AGCL Enforce</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AGCLEnforceImpl
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getAGCLEnforce()
     * @generated
     */
    EClass AGCL_ENFORCE = eINSTANCE.getAGCLEnforce();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGCL_ENFORCE__NAME = eINSTANCE.getAGCLEnforce_Name();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLAnnexSubclauseImpl <em>AGCL Annex Subclause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AGCLAnnexSubclauseImpl
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getAGCLAnnexSubclause()
     * @generated
     */
    EClass AGCL_ANNEX_SUBCLAUSE = eINSTANCE.getAGCLAnnexSubclause();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGCL_ANNEX_SUBCLAUSE__DECLARATIONS = eINSTANCE.getAGCLAnnexSubclause_Declarations();

    /**
     * The meta object literal for the '<em><b>Behaviour</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGCL_ANNEX_SUBCLAUSE__BEHAVIOUR = eINSTANCE.getAGCLAnnexSubclause_Behaviour();

    /**
     * The meta object literal for the '<em><b>Contracts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGCL_ANNEX_SUBCLAUSE__CONTRACTS = eINSTANCE.getAGCLAnnexSubclause_Contracts();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLContractImpl <em>AGCL Contract</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AGCLContractImpl
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getAGCLContract()
     * @generated
     */
    EClass AGCL_CONTRACT = eINSTANCE.getAGCLContract();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGCL_CONTRACT__NAME = eINSTANCE.getAGCLContract_Name();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGCL_CONTRACT__DECLARATIONS = eINSTANCE.getAGCLContract_Declarations();

    /**
     * The meta object literal for the '<em><b>Assumption</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGCL_CONTRACT__ASSUMPTION = eINSTANCE.getAGCLContract_Assumption();

    /**
     * The meta object literal for the '<em><b>Guarantee</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGCL_CONTRACT__GUARANTEE = eINSTANCE.getAGCLContract_Guarantee();

    /**
     * The meta object literal for the '<em><b>Ename</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGCL_CONTRACT__ENAME = eINSTANCE.getAGCLContract_Ename();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLPropertyDeclImpl <em>AGCL Property Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AGCLPropertyDeclImpl
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getAGCLPropertyDecl()
     * @generated
     */
    EClass AGCL_PROPERTY_DECL = eINSTANCE.getAGCLPropertyDecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGCL_PROPERTY_DECL__NAME = eINSTANCE.getAGCLPropertyDecl_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGCL_PROPERTY_DECL__PARAMS = eINSTANCE.getAGCLPropertyDecl_Params();

    /**
     * The meta object literal for the '<em><b>Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGCL_PROPERTY_DECL__SPEC = eINSTANCE.getAGCLPropertyDecl_Spec();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLAssumptionImpl <em>AGCL Assumption</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AGCLAssumptionImpl
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getAGCLAssumption()
     * @generated
     */
    EClass AGCL_ASSUMPTION = eINSTANCE.getAGCLAssumption();

    /**
     * The meta object literal for the '<em><b>Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGCL_ASSUMPTION__SPEC = eINSTANCE.getAGCLAssumption_Spec();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLGuaranteeImpl <em>AGCL Guarantee</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AGCLGuaranteeImpl
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getAGCLGuarantee()
     * @generated
     */
    EClass AGCL_GUARANTEE = eINSTANCE.getAGCLGuarantee();

    /**
     * The meta object literal for the '<em><b>Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGCL_GUARANTEE__SPEC = eINSTANCE.getAGCLGuarantee_Spec();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLBehaviourImpl <em>AGCL Behaviour</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AGCLBehaviourImpl
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getAGCLBehaviour()
     * @generated
     */
    EClass AGCL_BEHAVIOUR = eINSTANCE.getAGCLBehaviour();

    /**
     * The meta object literal for the '<em><b>Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGCL_BEHAVIOUR__SPEC = eINSTANCE.getAGCLBehaviour_Spec();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.PSLSpecImpl <em>PSL Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.PSLSpecImpl
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getPSLSpec()
     * @generated
     */
    EClass PSL_SPEC = eINSTANCE.getPSLSpec();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PSL_SPEC__EXPR = eINSTANCE.getPSLSpec_Expr();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.PSLExpressionImpl <em>PSL Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.PSLExpressionImpl
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getPSLExpression()
     * @generated
     */
    EClass PSL_EXPRESSION = eINSTANCE.getPSLExpression();

    /**
     * The meta object literal for the '<em><b>Subterm</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PSL_EXPRESSION__SUBTERM = eINSTANCE.getPSLExpression_Subterm();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PSL_EXPRESSION__LEFT = eINSTANCE.getPSLExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PSL_EXPRESSION__RIGHT = eINSTANCE.getPSLExpression_Right();

    /**
     * The meta object literal for the '<em><b>Negated</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PSL_EXPRESSION__NEGATED = eINSTANCE.getPSLExpression_Negated();

    /**
     * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PSL_EXPRESSION__TERMS = eINSTANCE.getPSLExpression_Terms();

    /**
     * The meta object literal for the '<em><b>Factors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PSL_EXPRESSION__FACTORS = eINSTANCE.getPSLExpression_Factors();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.BooleanConstantImpl <em>Boolean Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.BooleanConstantImpl
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getBooleanConstant()
     * @generated
     */
    EClass BOOLEAN_CONSTANT = eINSTANCE.getBooleanConstant();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_CONSTANT__VAL = eINSTANCE.getBooleanConstant_Val();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.AtomicPropImpl <em>Atomic Prop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AtomicPropImpl
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getAtomicProp()
     * @generated
     */
    EClass ATOMIC_PROP = eINSTANCE.getAtomicProp();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.VarImpl <em>Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.VarImpl
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getVar()
     * @generated
     */
    EClass VAR = eINSTANCE.getVar();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR__NAME = eINSTANCE.getVar_Name();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.InputImpl <em>Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.InputImpl
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getInput()
     * @generated
     */
    EClass INPUT = eINSTANCE.getInput();

    /**
     * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT__LINK = eINSTANCE.getInput_Link();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT__EVENT = eINSTANCE.getInput_Event();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.OutputImpl <em>Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.OutputImpl
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getOutput()
     * @generated
     */
    EClass OUTPUT = eINSTANCE.getOutput();

    /**
     * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT__LINK = eINSTANCE.getOutput_Link();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT__EVENT = eINSTANCE.getOutput_Event();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.agcl.agcl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.ParameterImpl
     * @see org.osate.xtext.aadl2.agcl.agcl.impl.AgclPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

  }

} //AgclPackage
