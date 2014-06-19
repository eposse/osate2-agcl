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
	protected AbstractElementAlias match_PSLLogicFactor_LeftParenthesisKeyword_3_0_a;
	protected AbstractElementAlias match_PSLLogicFactor_LeftParenthesisKeyword_3_0_p;
	protected AbstractElementAlias match_PSLSpec_PslKeyword_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AGCLGrammarAccess) access;
		match_AGCLBehaviour_BehaviorKeyword_0_1_or_BehaviourKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAGCLBehaviourAccess().getBehaviorKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getAGCLBehaviourAccess().getBehaviourKeyword_0_0()));
		match_PSLLogicFactor_LeftParenthesisKeyword_3_0_a = new TokenAlias(true, true, grammarAccess.getPSLLogicFactorAccess().getLeftParenthesisKeyword_3_0());
		match_PSLLogicFactor_LeftParenthesisKeyword_3_0_p = new TokenAlias(true, false, grammarAccess.getPSLLogicFactorAccess().getLeftParenthesisKeyword_3_0());
		match_PSLSpec_PslKeyword_0_q = new TokenAlias(false, true, grammarAccess.getPSLSpecAccess().getPslKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getALWAYSRule())
			return getALWAYSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getANDRule())
			return getANDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEVENTUALLYRule())
			return getEVENTUALLYToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIFFRule())
			return getIFFToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIMPLRule())
			return getIMPLToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNEXTRule())
			return getNEXTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNOTRule())
			return getNOTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getORRule())
			return getORToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getUNTILRule())
			return getUNTILToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ALWAYS: 'G' | 'always';
	 */
	protected String getALWAYSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "G";
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
	 * terminal EVENTUALLY: 'F' | 'eventually';
	 */
	protected String getEVENTUALLYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "F";
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
	 * terminal IFF: '<->';
	 */
	protected String getIFFToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<->";
	}
	
	/**
	 * terminal IMPL: '->';
	 */
	protected String getIMPLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "->";
	}
	
	/**
	 * terminal NEXT: 'X' | 'next';
	 */
	protected String getNEXTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "X";
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
	
	/**
	 * terminal UNTIL: 'U' | 'until';
	 */
	protected String getUNTILToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "U";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AGCLBehaviour_BehaviorKeyword_0_1_or_BehaviourKeyword_0_0.equals(syntax))
				emit_AGCLBehaviour_BehaviorKeyword_0_1_or_BehaviourKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PSLLogicFactor_LeftParenthesisKeyword_3_0_a.equals(syntax))
				emit_PSLLogicFactor_LeftParenthesisKeyword_3_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PSLLogicFactor_LeftParenthesisKeyword_3_0_p.equals(syntax))
				emit_PSLLogicFactor_LeftParenthesisKeyword_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PSLSpec_PslKeyword_0_q.equals(syntax))
				emit_PSLSpec_PslKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'behaviour' | 'behavior'
	 */
	protected void emit_AGCLBehaviour_BehaviorKeyword_0_1_or_BehaviourKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_PSLLogicFactor_LeftParenthesisKeyword_3_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_PSLLogicFactor_LeftParenthesisKeyword_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
