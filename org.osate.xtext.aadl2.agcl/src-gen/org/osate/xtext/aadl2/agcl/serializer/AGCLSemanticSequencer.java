package org.osate.xtext.aadl2.agcl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
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
import org.osate.xtext.aadl2.agcl.agcl.AgclPackage;
import org.osate.xtext.aadl2.agcl.agcl.BooleanConstant;
import org.osate.xtext.aadl2.agcl.agcl.Input;
import org.osate.xtext.aadl2.agcl.agcl.Output;
import org.osate.xtext.aadl2.agcl.agcl.PSLConjunction;
import org.osate.xtext.aadl2.agcl.agcl.PSLDisjunction;
import org.osate.xtext.aadl2.agcl.agcl.PSLSpec;
import org.osate.xtext.aadl2.agcl.agcl.Var;
import org.osate.xtext.aadl2.agcl.services.AGCLGrammarAccess;

@SuppressWarnings("all")
public class AGCLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AGCLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AgclPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AgclPackage.AGCL_ANNEX_LIBRARY:
				if(context == grammarAccess.getAGCLAnnexLibraryRule() ||
				   context == grammarAccess.getAnnexLibraryRule()) {
					sequence_AGCLAnnexLibrary(context, (AGCLAnnexLibrary) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.AGCL_ANNEX_SUBCLAUSE:
				if(context == grammarAccess.getAGCLAnnexSubclauseRule() ||
				   context == grammarAccess.getAnnexSubclauseRule()) {
					sequence_AGCLAnnexSubclause(context, (AGCLAnnexSubclause) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.AGCL_ASSUMPTION:
				if(context == grammarAccess.getAGCLAssumptionRule()) {
					sequence_AGCLAssumption(context, (AGCLAssumption) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.AGCL_BEHAVIOUR:
				if(context == grammarAccess.getAGCLBehaviourRule()) {
					sequence_AGCLBehaviour(context, (AGCLBehaviour) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.AGCL_CONTRACT:
				if(context == grammarAccess.getAGCLContractRule()) {
					sequence_AGCLContract(context, (AGCLContract) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.AGCL_ENFORCE:
				if(context == grammarAccess.getAGCLEnforceRule()) {
					sequence_AGCLEnforce(context, (AGCLEnforce) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.AGCL_GRAMMAR_ROOT:
				if(context == grammarAccess.getAGCLGrammarRootRule()) {
					sequence_AGCLGrammarRoot(context, (AGCLGrammarRoot) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.AGCL_GUARANTEE:
				if(context == grammarAccess.getAGCLGuaranteeRule()) {
					sequence_AGCLGuarantee(context, (AGCLGuarantee) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.AGCL_PROPERTY_DECL:
				if(context == grammarAccess.getAGCLPropertyDeclRule()) {
					sequence_AGCLPropertyDecl(context, (AGCLPropertyDecl) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.AGCL_VIEWPOINT:
				if(context == grammarAccess.getAGCLViewpointRule()) {
					sequence_AGCLViewpoint(context, (AGCLViewpoint) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.BOOLEAN_CONSTANT:
				if(context == grammarAccess.getBooleanConstantRule() ||
				   context == grammarAccess.getPSLAtomRule()) {
					sequence_BooleanConstant(context, (BooleanConstant) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.INPUT:
				if(context == grammarAccess.getAtomicPropRule() ||
				   context == grammarAccess.getInputRule() ||
				   context == grammarAccess.getPSLAtomRule()) {
					sequence_Input(context, (Input) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.OUTPUT:
				if(context == grammarAccess.getAtomicPropRule() ||
				   context == grammarAccess.getOutputRule() ||
				   context == grammarAccess.getPSLAtomRule()) {
					sequence_Output(context, (Output) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.PSL_CONJUNCTION:
				if(context == grammarAccess.getPSLConjunctionRule()) {
					sequence_PSLConjunction(context, (PSLConjunction) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.PSL_DISJUNCTION:
				if(context == grammarAccess.getPSLAtomRule() ||
				   context == grammarAccess.getPSLBooleanExpressionRule() ||
				   context == grammarAccess.getPSLDisjunctionRule() ||
				   context == grammarAccess.getPSLFormulaRule() ||
				   context == grammarAccess.getPSLNegationRule()) {
					sequence_PSLDisjunction(context, (PSLDisjunction) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.PSL_SPEC:
				if(context == grammarAccess.getPSLSpecRule()) {
					sequence_PSLSpec(context, (PSLSpec) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.VAR:
				if(context == grammarAccess.getAtomicPropRule() ||
				   context == grammarAccess.getPSLAtomRule() ||
				   context == grammarAccess.getVarRule()) {
					sequence_Var(context, (Var) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((viewpoints+=AGCLViewpoint viewpoints+=AGCLViewpoint*)? (enforceclauses+=AGCLEnforce enforceclauses+=AGCLEnforce*)?)
	 */
	protected void sequence_AGCLAnnexLibrary(EObject context, AGCLAnnexLibrary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((declarations+=AGCLPropertyDecl declarations+=AGCLPropertyDecl*)? behaviour=AGCLBehaviour? (contracts+=AGCLContract contracts+=AGCLContract*)?)
	 */
	protected void sequence_AGCLAnnexSubclause(EObject context, AGCLAnnexSubclause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     spec=PSLSpec
	 */
	protected void sequence_AGCLAssumption(EObject context, AGCLAssumption semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AgclPackage.Literals.AGCL_ASSUMPTION__SPEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgclPackage.Literals.AGCL_ASSUMPTION__SPEC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAGCLAssumptionAccess().getSpecPSLSpecParserRuleCall_1_0(), semanticObject.getSpec());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     spec=PSLSpec
	 */
	protected void sequence_AGCLBehaviour(EObject context, AGCLBehaviour semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AgclPackage.Literals.AGCL_BEHAVIOUR__SPEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgclPackage.Literals.AGCL_BEHAVIOUR__SPEC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAGCLBehaviourAccess().getSpecPSLSpecParserRuleCall_1_0(), semanticObject.getSpec());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (declarations+=AGCLPropertyDecl declarations+=AGCLPropertyDecl*)? assumption=AGCLAssumption guarantee=AGCLGuarantee ename=ID)
	 */
	protected void sequence_AGCLContract(EObject context, AGCLContract semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_AGCLEnforce(EObject context, AGCLEnforce semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AgclPackage.Literals.AGCL_ENFORCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgclPackage.Literals.AGCL_ENFORCE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAGCLEnforceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lib=AGCLAnnexLibrary | subclause=AGCLAnnexSubclause)
	 */
	protected void sequence_AGCLGrammarRoot(EObject context, AGCLGrammarRoot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     spec=PSLSpec
	 */
	protected void sequence_AGCLGuarantee(EObject context, AGCLGuarantee semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AgclPackage.Literals.AGCL_GUARANTEE__SPEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgclPackage.Literals.AGCL_GUARANTEE__SPEC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAGCLGuaranteeAccess().getSpecPSLSpecParserRuleCall_1_0(), semanticObject.getSpec());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (params+=Parameter params+=Parameter*)? spec=PSLSpec)
	 */
	protected void sequence_AGCLPropertyDecl(EObject context, AGCLPropertyDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_AGCLViewpoint(EObject context, AGCLViewpoint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AgclPackage.Literals.AGCL_VIEWPOINT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgclPackage.Literals.AGCL_VIEWPOINT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAGCLViewpointAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     val=TRUE
	 */
	protected void sequence_BooleanConstant(EObject context, BooleanConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AgclPackage.Literals.BOOLEAN_CONSTANT__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgclPackage.Literals.BOOLEAN_CONSTANT__VAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanConstantAccess().getValTRUETerminalRuleCall_0_1_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (link=ID event=ID?)
	 */
	protected void sequence_Input(EObject context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (link=ID event=ID?)
	 */
	protected void sequence_Output(EObject context, Output semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (factors+=PSLAtom factors+=PSLAtom*)
	 */
	protected void sequence_PSLConjunction(EObject context, PSLConjunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (terms+=PSLConjunction terms+=PSLConjunction*)
	 */
	protected void sequence_PSLDisjunction(EObject context, PSLDisjunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     formula=PSLFormula
	 */
	protected void sequence_PSLSpec(EObject context, PSLSpec semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AgclPackage.Literals.PSL_SPEC__FORMULA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgclPackage.Literals.PSL_SPEC__FORMULA));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPSLSpecAccess().getFormulaPSLFormulaParserRuleCall_1_0(), semanticObject.getFormula());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Var(EObject context, Var semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AgclPackage.Literals.VAR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgclPackage.Literals.VAR__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
}
