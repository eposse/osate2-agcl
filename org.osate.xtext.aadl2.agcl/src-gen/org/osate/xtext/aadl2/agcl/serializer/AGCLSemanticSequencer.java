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
import org.osate.xtext.aadl2.agcl.agcl.PSLAlways;
import org.osate.xtext.aadl2.agcl.agcl.PSLBiconditional;
import org.osate.xtext.aadl2.agcl.agcl.PSLConjunction;
import org.osate.xtext.aadl2.agcl.agcl.PSLDisjunction;
import org.osate.xtext.aadl2.agcl.agcl.PSLEventually;
import org.osate.xtext.aadl2.agcl.agcl.PSLImplication;
import org.osate.xtext.aadl2.agcl.agcl.PSLNegation;
import org.osate.xtext.aadl2.agcl.agcl.PSLNext;
import org.osate.xtext.aadl2.agcl.agcl.PSLSpec;
import org.osate.xtext.aadl2.agcl.agcl.PSLUntil;
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
				   context == grammarAccess.getPSLConjunctionRule() ||
				   context == grammarAccess.getPSLConjunctionAccess().getPSLConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getPSLDisjunctionRule() ||
				   context == grammarAccess.getPSLDisjunctionAccess().getPSLDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getPSLLogicFactorRule() ||
				   context == grammarAccess.getPSLPrimaryRule() ||
				   context == grammarAccess.getPSLPropertyRule() ||
				   context == grammarAccess.getPSLPropertyAccess().getPSLBiconditionalLeftAction_1_1_0() ||
				   context == grammarAccess.getPSLPropertyAccess().getPSLImplicationLeftAction_1_0_0()) {
					sequence_BooleanConstant(context, (BooleanConstant) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.INPUT:
				if(context == grammarAccess.getAtomicPropositionRule() ||
				   context == grammarAccess.getInputRule() ||
				   context == grammarAccess.getPSLConjunctionRule() ||
				   context == grammarAccess.getPSLConjunctionAccess().getPSLConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getPSLDisjunctionRule() ||
				   context == grammarAccess.getPSLDisjunctionAccess().getPSLDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getPSLLogicFactorRule() ||
				   context == grammarAccess.getPSLPrimaryRule() ||
				   context == grammarAccess.getPSLPropertyRule() ||
				   context == grammarAccess.getPSLPropertyAccess().getPSLBiconditionalLeftAction_1_1_0() ||
				   context == grammarAccess.getPSLPropertyAccess().getPSLImplicationLeftAction_1_0_0()) {
					sequence_Input(context, (Input) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.OUTPUT:
				if(context == grammarAccess.getAtomicPropositionRule() ||
				   context == grammarAccess.getOutputRule() ||
				   context == grammarAccess.getPSLConjunctionRule() ||
				   context == grammarAccess.getPSLConjunctionAccess().getPSLConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getPSLDisjunctionRule() ||
				   context == grammarAccess.getPSLDisjunctionAccess().getPSLDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getPSLLogicFactorRule() ||
				   context == grammarAccess.getPSLPrimaryRule() ||
				   context == grammarAccess.getPSLPropertyRule() ||
				   context == grammarAccess.getPSLPropertyAccess().getPSLBiconditionalLeftAction_1_1_0() ||
				   context == grammarAccess.getPSLPropertyAccess().getPSLImplicationLeftAction_1_0_0()) {
					sequence_Output(context, (Output) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.PSL_ALWAYS:
				if(context == grammarAccess.getPSLConjunctionRule() ||
				   context == grammarAccess.getPSLConjunctionAccess().getPSLConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getPSLDisjunctionRule() ||
				   context == grammarAccess.getPSLDisjunctionAccess().getPSLDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getPSLLogicFactorRule() ||
				   context == grammarAccess.getPSLPropertyRule() ||
				   context == grammarAccess.getPSLPropertyAccess().getPSLBiconditionalLeftAction_1_1_0() ||
				   context == grammarAccess.getPSLPropertyAccess().getPSLImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getPSLTemporalRule()) {
					sequence_PSLTemporal(context, (PSLAlways) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.PSL_BICONDITIONAL:
				if(context == grammarAccess.getPSLConjunctionRule() ||
				   context == grammarAccess.getPSLConjunctionAccess().getPSLConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getPSLDisjunctionRule() ||
				   context == grammarAccess.getPSLDisjunctionAccess().getPSLDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getPSLLogicFactorRule() ||
				   context == grammarAccess.getPSLPropertyRule() ||
				   context == grammarAccess.getPSLPropertyAccess().getPSLBiconditionalLeftAction_1_1_0() ||
				   context == grammarAccess.getPSLPropertyAccess().getPSLImplicationLeftAction_1_0_0()) {
					sequence_PSLProperty(context, (PSLBiconditional) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.PSL_CONJUNCTION:
				if(context == grammarAccess.getPSLConjunctionRule() ||
				   context == grammarAccess.getPSLConjunctionAccess().getPSLConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getPSLDisjunctionRule() ||
				   context == grammarAccess.getPSLDisjunctionAccess().getPSLDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getPSLLogicFactorRule() ||
				   context == grammarAccess.getPSLPropertyRule() ||
				   context == grammarAccess.getPSLPropertyAccess().getPSLBiconditionalLeftAction_1_1_0() ||
				   context == grammarAccess.getPSLPropertyAccess().getPSLImplicationLeftAction_1_0_0()) {
					sequence_PSLConjunction(context, (PSLConjunction) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.PSL_DISJUNCTION:
				if(context == grammarAccess.getPSLConjunctionRule() ||
				   context == grammarAccess.getPSLConjunctionAccess().getPSLConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getPSLDisjunctionRule() ||
				   context == grammarAccess.getPSLDisjunctionAccess().getPSLDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getPSLLogicFactorRule() ||
				   context == grammarAccess.getPSLPropertyRule() ||
				   context == grammarAccess.getPSLPropertyAccess().getPSLBiconditionalLeftAction_1_1_0() ||
				   context == grammarAccess.getPSLPropertyAccess().getPSLImplicationLeftAction_1_0_0()) {
					sequence_PSLDisjunction(context, (PSLDisjunction) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.PSL_EVENTUALLY:
				if(context == grammarAccess.getPSLConjunctionRule() ||
				   context == grammarAccess.getPSLConjunctionAccess().getPSLConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getPSLDisjunctionRule() ||
				   context == grammarAccess.getPSLDisjunctionAccess().getPSLDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getPSLLogicFactorRule() ||
				   context == grammarAccess.getPSLPropertyRule() ||
				   context == grammarAccess.getPSLPropertyAccess().getPSLBiconditionalLeftAction_1_1_0() ||
				   context == grammarAccess.getPSLPropertyAccess().getPSLImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getPSLTemporalRule()) {
					sequence_PSLTemporal(context, (PSLEventually) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.PSL_IMPLICATION:
				if(context == grammarAccess.getPSLConjunctionRule() ||
				   context == grammarAccess.getPSLConjunctionAccess().getPSLConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getPSLDisjunctionRule() ||
				   context == grammarAccess.getPSLDisjunctionAccess().getPSLDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getPSLLogicFactorRule() ||
				   context == grammarAccess.getPSLPropertyRule() ||
				   context == grammarAccess.getPSLPropertyAccess().getPSLBiconditionalLeftAction_1_1_0() ||
				   context == grammarAccess.getPSLPropertyAccess().getPSLImplicationLeftAction_1_0_0()) {
					sequence_PSLProperty(context, (PSLImplication) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.PSL_NEGATION:
				if(context == grammarAccess.getPSLConjunctionRule() ||
				   context == grammarAccess.getPSLConjunctionAccess().getPSLConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getPSLDisjunctionRule() ||
				   context == grammarAccess.getPSLDisjunctionAccess().getPSLDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getPSLLogicFactorRule() ||
				   context == grammarAccess.getPSLNegationRule() ||
				   context == grammarAccess.getPSLPropertyRule() ||
				   context == grammarAccess.getPSLPropertyAccess().getPSLBiconditionalLeftAction_1_1_0() ||
				   context == grammarAccess.getPSLPropertyAccess().getPSLImplicationLeftAction_1_0_0()) {
					sequence_PSLNegation(context, (PSLNegation) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.PSL_NEXT:
				if(context == grammarAccess.getPSLConjunctionRule() ||
				   context == grammarAccess.getPSLConjunctionAccess().getPSLConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getPSLDisjunctionRule() ||
				   context == grammarAccess.getPSLDisjunctionAccess().getPSLDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getPSLLogicFactorRule() ||
				   context == grammarAccess.getPSLPropertyRule() ||
				   context == grammarAccess.getPSLPropertyAccess().getPSLBiconditionalLeftAction_1_1_0() ||
				   context == grammarAccess.getPSLPropertyAccess().getPSLImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getPSLTemporalRule()) {
					sequence_PSLTemporal(context, (PSLNext) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.PSL_SPEC:
				if(context == grammarAccess.getPSLSpecRule()) {
					sequence_PSLSpec(context, (PSLSpec) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.PSL_UNTIL:
				if(context == grammarAccess.getPSLConjunctionRule() ||
				   context == grammarAccess.getPSLConjunctionAccess().getPSLConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getPSLDisjunctionRule() ||
				   context == grammarAccess.getPSLDisjunctionAccess().getPSLDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getPSLLogicFactorRule() ||
				   context == grammarAccess.getPSLPropertyRule() ||
				   context == grammarAccess.getPSLPropertyAccess().getPSLBiconditionalLeftAction_1_1_0() ||
				   context == grammarAccess.getPSLPropertyAccess().getPSLImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getPSLTemporalRule()) {
					sequence_PSLTemporal(context, (PSLUntil) semanticObject); 
					return; 
				}
				else break;
			case AgclPackage.VAR:
				if(context == grammarAccess.getAtomicPropositionRule() ||
				   context == grammarAccess.getPSLConjunctionRule() ||
				   context == grammarAccess.getPSLConjunctionAccess().getPSLConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getPSLDisjunctionRule() ||
				   context == grammarAccess.getPSLDisjunctionAccess().getPSLDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getPSLLogicFactorRule() ||
				   context == grammarAccess.getPSLPrimaryRule() ||
				   context == grammarAccess.getPSLPropertyRule() ||
				   context == grammarAccess.getPSLPropertyAccess().getPSLBiconditionalLeftAction_1_1_0() ||
				   context == grammarAccess.getPSLPropertyAccess().getPSLImplicationLeftAction_1_0_0() ||
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
	 *     (lib=AGCLAnnexLibrary | subclause=AGCLAnnexSubclause)?
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
	 *     (val=TRUE | val=FALSE)
	 */
	protected void sequence_BooleanConstant(EObject context, BooleanConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (left=PSLConjunction_PSLConjunction_1_0 right=PSLLogicFactor)
	 */
	protected void sequence_PSLConjunction(EObject context, PSLConjunction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AgclPackage.Literals.PSL_CONJUNCTION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgclPackage.Literals.PSL_CONJUNCTION__LEFT));
			if(transientValues.isValueTransient(semanticObject, AgclPackage.Literals.PSL_CONJUNCTION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgclPackage.Literals.PSL_CONJUNCTION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPSLConjunctionAccess().getPSLConjunctionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPSLConjunctionAccess().getRightPSLLogicFactorParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=PSLDisjunction_PSLDisjunction_1_0 right=PSLConjunction)
	 */
	protected void sequence_PSLDisjunction(EObject context, PSLDisjunction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AgclPackage.Literals.PSL_DISJUNCTION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgclPackage.Literals.PSL_DISJUNCTION__LEFT));
			if(transientValues.isValueTransient(semanticObject, AgclPackage.Literals.PSL_DISJUNCTION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgclPackage.Literals.PSL_DISJUNCTION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPSLDisjunctionAccess().getPSLDisjunctionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPSLDisjunctionAccess().getRightPSLConjunctionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     subterm=PSLLogicFactor
	 */
	protected void sequence_PSLNegation(EObject context, PSLNegation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AgclPackage.Literals.PSL_NEGATION__SUBTERM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgclPackage.Literals.PSL_NEGATION__SUBTERM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPSLNegationAccess().getSubtermPSLLogicFactorParserRuleCall_2_0(), semanticObject.getSubterm());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=PSLProperty_PSLBiconditional_1_1_0 right=PSLProperty)
	 */
	protected void sequence_PSLProperty(EObject context, PSLBiconditional semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AgclPackage.Literals.PSL_BICONDITIONAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgclPackage.Literals.PSL_BICONDITIONAL__LEFT));
			if(transientValues.isValueTransient(semanticObject, AgclPackage.Literals.PSL_BICONDITIONAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgclPackage.Literals.PSL_BICONDITIONAL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPSLPropertyAccess().getPSLBiconditionalLeftAction_1_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPSLPropertyAccess().getRightPSLPropertyParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=PSLProperty_PSLImplication_1_0_0 right=PSLProperty)
	 */
	protected void sequence_PSLProperty(EObject context, PSLImplication semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AgclPackage.Literals.PSL_IMPLICATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgclPackage.Literals.PSL_IMPLICATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, AgclPackage.Literals.PSL_IMPLICATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgclPackage.Literals.PSL_IMPLICATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPSLPropertyAccess().getPSLImplicationLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPSLPropertyAccess().getRightPSLPropertyParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expr=PSLProperty
	 */
	protected void sequence_PSLSpec(EObject context, PSLSpec semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AgclPackage.Literals.PSL_SPEC__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgclPackage.Literals.PSL_SPEC__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPSLSpecAccess().getExprPSLPropertyParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     subterm=PSLLogicFactor
	 */
	protected void sequence_PSLTemporal(EObject context, PSLAlways semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AgclPackage.Literals.PSL_ALWAYS__SUBTERM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgclPackage.Literals.PSL_ALWAYS__SUBTERM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPSLTemporalAccess().getSubtermPSLLogicFactorParserRuleCall_2_2_0(), semanticObject.getSubterm());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     subterm=PSLLogicFactor
	 */
	protected void sequence_PSLTemporal(EObject context, PSLEventually semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AgclPackage.Literals.PSL_EVENTUALLY__SUBTERM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgclPackage.Literals.PSL_EVENTUALLY__SUBTERM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPSLTemporalAccess().getSubtermPSLLogicFactorParserRuleCall_1_2_0(), semanticObject.getSubterm());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     subterm=PSLLogicFactor
	 */
	protected void sequence_PSLTemporal(EObject context, PSLNext semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AgclPackage.Literals.PSL_NEXT__SUBTERM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgclPackage.Literals.PSL_NEXT__SUBTERM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPSLTemporalAccess().getSubtermPSLLogicFactorParserRuleCall_0_2_0(), semanticObject.getSubterm());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=PSLLogicFactor right=PSLLogicFactor)
	 */
	protected void sequence_PSLTemporal(EObject context, PSLUntil semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AgclPackage.Literals.PSL_UNTIL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgclPackage.Literals.PSL_UNTIL__LEFT));
			if(transientValues.isValueTransient(semanticObject, AgclPackage.Literals.PSL_UNTIL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgclPackage.Literals.PSL_UNTIL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPSLTemporalAccess().getLeftPSLLogicFactorParserRuleCall_3_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPSLTemporalAccess().getRightPSLLogicFactorParserRuleCall_3_4_0(), semanticObject.getRight());
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
