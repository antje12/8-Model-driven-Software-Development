/*
 * generated by Xtext 2.29.0
 */
package org.xtext.exam22.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.exam22.services.DslGrammarAccess;

@SuppressWarnings("all")
public class DslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Scenario___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q;
	protected AbstractElementAlias match_Target___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DslGrammarAccess) access;
		match_Scenario___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getScenarioAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getScenarioAccess().getRightParenthesisKeyword_2_2()));
		match_Target___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTargetAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getTargetAccess().getRightParenthesisKeyword_2_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Scenario___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q.equals(syntax))
				emit_Scenario___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Target___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q.equals(syntax))
				emit_Target___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) '{' '}' (rule end)
	 *     name=ID (ambiguity) '{' statements+=Statement
	 *     name=ID (ambiguity) '{' variables+=VariableDef
	 
	 * </pre>
	 */
	protected void emit_Scenario___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     to=[CrossRef|ID] (ambiguity) 'if' condition=Exp
	 *     to=[CrossRef|ID] (ambiguity) '{' endingTargets+=EndingTarget
	 *     to=[CrossRef|ID] (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_Target___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
