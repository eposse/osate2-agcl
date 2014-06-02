package org.osate.xtext.aadl2.agcl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.osate.xtext.aadl2.agcl.services.AGCLGrammarAccess;

@SuppressWarnings("all")
public class AGCLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AGCLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AGCLBehaviour_BehaviorKeyword_0_1_or_BehaviourKeyword_0_0;
	protected AbstractElementAlias match_PSLAtom_PSLNegation_LeftParenthesisKeyword_3_0_or_NOTTerminalRuleCall_0;
	protected AbstractElementAlias match_PSLSpec_PslKeyword_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AGCLGrammarAccess) access;
		match_AGCLBehaviour_BehaviorKeyword_0_1_or_BehaviourKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAGCLBehaviourAccess().getBehaviorKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getAGCLBehaviourAccess().getBehaviourKeyword_0_0()));
		match_PSLAtom_PSLNegation_LeftParenthesisKeyword_3_0_or_NOTTerminalRuleCall_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPSLAtomAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getPSLNegationAccess().getNOTTerminalRuleCall_0()));
		match_PSLSpec_PslKeyword_0_q = new TokenAlias(false, true, grammarAccess.getPSLSpecAccess().getPslKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getANDRule())
			return getANDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNOTRule())
			return getNOTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getORRule())
			return getORToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal AND: '&&' | '&' | 'and';
	 */
	protected String getANDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "&&";
	}
	
	/**
	 * terminal ID  		: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal NOT: '!' | 'not';
	 */
	protected String getNOTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "!";
	}
	
	/**
	 * terminal OR: '||' | '|' | 'or';
	 */
	protected String getORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "||";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AGCLBehaviour_BehaviorKeyword_0_1_or_BehaviourKeyword_0_0.equals(syntax))
				emit_AGCLBehaviour_BehaviorKeyword_0_1_or_BehaviourKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PSLAtom_PSLNegation_LeftParenthesisKeyword_3_0_or_NOTTerminalRuleCall_0.equals(syntax))
				emit_PSLAtom_PSLNegation_LeftParenthesisKeyword_3_0_or_NOTTerminalRuleCall_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PSLSpec_PslKeyword_0_q.equals(syntax))
				emit_PSLSpec_PslKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'behavior' | 'behaviour'
	 */
	protected void emit_AGCLBehaviour_BehaviorKeyword_0_1_or_BehaviourKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '(' | NOT
	 */
	protected void emit_PSLAtom_PSLNegation_LeftParenthesisKeyword_3_0_or_NOTTerminalRuleCall_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'psl'?
	 */
	protected void emit_PSLSpec_PslKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
