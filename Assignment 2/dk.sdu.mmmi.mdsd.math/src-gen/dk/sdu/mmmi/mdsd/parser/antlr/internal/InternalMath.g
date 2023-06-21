/*
 * generated by Xtext 2.29.0
 */
grammar InternalMath;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package dk.sdu.mmmi.mdsd.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package dk.sdu.mmmi.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;

}

@parser::members {

 	private MathGrammarAccess grammarAccess;

    public InternalMathParser(TokenStream input, MathGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "MathExp";
   	}

   	@Override
   	protected MathGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleMathExp
entryRuleMathExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMathExpRule()); }
	iv_ruleMathExp=ruleMathExp
	{ $current=$iv_ruleMathExp.current; }
	EOF;

// Rule MathExp
ruleMathExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getMathExpAccess().getVariablesVariableParserRuleCall_0());
			}
			lv_variables_0_0=ruleVariable
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getMathExpRule());
				}
				add(
					$current,
					"variables",
					lv_variables_0_0,
					"dk.sdu.mmmi.mdsd.Math.Variable");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	iv_ruleVariable=ruleVariable
	{ $current=$iv_ruleVariable.current; }
	EOF;

// Rule Variable
ruleVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getVariableAccess().getVarAction_0(),
					$current);
			}
		)
		otherlv_1='var'
		{
			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getVarKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='='
		{
			newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVariableAccess().getValueExpParserRuleCall_4_0());
				}
				lv_value_4_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariableRule());
					}
					set(
						$current,
						"value",
						lv_value_4_0,
						"dk.sdu.mmmi.mdsd.Math.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleLet
entryRuleLet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLetRule()); }
	iv_ruleLet=ruleLet
	{ $current=$iv_ruleLet.current; }
	EOF;

// Rule Let
ruleLet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getLetAccess().getLetAction_0(),
					$current);
			}
		)
		otherlv_1='let'
		{
			newLeafNode(otherlv_1, grammarAccess.getLetAccess().getLetKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getLetAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLetRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='='
		{
			newLeafNode(otherlv_3, grammarAccess.getLetAccess().getEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLetAccess().getValueExpParserRuleCall_4_0());
				}
				lv_value_4_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLetRule());
					}
					set(
						$current,
						"value",
						lv_value_4_0,
						"dk.sdu.mmmi.mdsd.Math.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='in'
		{
			newLeafNode(otherlv_5, grammarAccess.getLetAccess().getInKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLetAccess().getInExpParserRuleCall_6_0());
				}
				lv_in_6_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLetRule());
					}
					set(
						$current,
						"in",
						lv_in_6_0,
						"dk.sdu.mmmi.mdsd.Math.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='end'
		{
			newLeafNode(otherlv_7, grammarAccess.getLetAccess().getEndKeyword_7());
		}
	)
;

// Entry rule entryRuleExp
entryRuleExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpRule()); }
	iv_ruleExp=ruleExp
	{ $current=$iv_ruleExp.current; }
	EOF;

// Rule Exp
ruleExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getExpAccess().getPlusMinusParserRuleCall());
	}
	this_PlusMinus_0=rulePlusMinus
	{
		$current = $this_PlusMinus_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRulePlusMinus
entryRulePlusMinus returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPlusMinusRule()); }
	iv_rulePlusMinus=rulePlusMinus
	{ $current=$iv_rulePlusMinus.current; }
	EOF;

// Rule PlusMinus
rulePlusMinus returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPlusMinusAccess().getMultDivParserRuleCall_0());
		}
		this_MultDiv_0=ruleMultDiv
		{
			$current = $this_MultDiv_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getPlusMinusAccess().getPlusMinusLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getPlusMinusAccess().getOperatorOpPlusMinusParserRuleCall_1_1_0());
					}
					lv_operator_2_0=ruleOpPlusMinus
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPlusMinusRule());
						}
						set(
							$current,
							"operator",
							lv_operator_2_0,
							"dk.sdu.mmmi.mdsd.Math.OpPlusMinus");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getPlusMinusAccess().getRightMultDivParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleMultDiv
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPlusMinusRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"dk.sdu.mmmi.mdsd.Math.MultDiv");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMultDiv
entryRuleMultDiv returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultDivRule()); }
	iv_ruleMultDiv=ruleMultDiv
	{ $current=$iv_ruleMultDiv.current; }
	EOF;

// Rule MultDiv
ruleMultDiv returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMultDivAccess().getPrimaryParserRuleCall_0());
		}
		this_Primary_0=rulePrimary
		{
			$current = $this_Primary_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMultDivAccess().getMultDivLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMultDivAccess().getOperatorOpMultDivParserRuleCall_1_1_0());
					}
					lv_operator_2_0=ruleOpMultDiv
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultDivRule());
						}
						set(
							$current,
							"operator",
							lv_operator_2_0,
							"dk.sdu.mmmi.mdsd.Math.OpMultDiv");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMultDivAccess().getRightPrimaryParserRuleCall_1_2_0());
					}
					lv_right_3_0=rulePrimary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultDivRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"dk.sdu.mmmi.mdsd.Math.Primary");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrimary
entryRulePrimary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryRule()); }
	iv_rulePrimary=rulePrimary
	{ $current=$iv_rulePrimary.current; }
	EOF;

// Rule Primary
rulePrimary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_0());
		}
		this_Parenthesis_0=ruleParenthesis
		{
			$current = $this_Parenthesis_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_1());
		}
		this_Number_1=ruleNumber
		{
			$current = $this_Number_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getLetParserRuleCall_2());
		}
		this_Let_2=ruleLet
		{
			$current = $this_Let_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_3());
		}
		this_VariableUse_3=ruleVariableUse
		{
			$current = $this_VariableUse_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleOpPlusMinus
entryRuleOpPlusMinus returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOpPlusMinusRule()); }
	iv_ruleOpPlusMinus=ruleOpPlusMinus
	{ $current=$iv_ruleOpPlusMinus.current; }
	EOF;

// Rule OpPlusMinus
ruleOpPlusMinus returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getOpPlusMinusAccess().getPlusAction_0_0(),
						$current);
				}
			)
			otherlv_1='+'
			{
				newLeafNode(otherlv_1, grammarAccess.getOpPlusMinusAccess().getPlusSignKeyword_0_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getOpPlusMinusAccess().getMinusAction_1_0(),
						$current);
				}
			)
			otherlv_3='-'
			{
				newLeafNode(otherlv_3, grammarAccess.getOpPlusMinusAccess().getHyphenMinusKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleOpMultDiv
entryRuleOpMultDiv returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOpMultDivRule()); }
	iv_ruleOpMultDiv=ruleOpMultDiv
	{ $current=$iv_ruleOpMultDiv.current; }
	EOF;

// Rule OpMultDiv
ruleOpMultDiv returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getOpMultDivAccess().getMultAction_0_0(),
						$current);
				}
			)
			otherlv_1='*'
			{
				newLeafNode(otherlv_1, grammarAccess.getOpMultDivAccess().getAsteriskKeyword_0_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getOpMultDivAccess().getDivAction_1_0(),
						$current);
				}
			)
			otherlv_3='/'
			{
				newLeafNode(otherlv_3, grammarAccess.getOpMultDivAccess().getSolidusKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleNumber
entryRuleNumber returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNumberRule()); }
	iv_ruleNumber=ruleNumber
	{ $current=$iv_ruleNumber.current; }
	EOF;

// Rule Number
ruleNumber returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getNumberAccess().getNumberAction_0(),
					$current);
			}
		)
		(
			(
				lv_value_1_0=RULE_INT
				{
					newLeafNode(lv_value_1_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNumberRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleParenthesis
entryRuleParenthesis returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParenthesisRule()); }
	iv_ruleParenthesis=ruleParenthesis
	{ $current=$iv_ruleParenthesis.current; }
	EOF;

// Rule Parenthesis
ruleParenthesis returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getParenthesisAccess().getParenthesisAction_0(),
					$current);
			}
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_2_0());
				}
				lv_exp_2_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParenthesisRule());
					}
					set(
						$current,
						"exp",
						lv_exp_2_0,
						"dk.sdu.mmmi.mdsd.Math.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleVariableUse
entryRuleVariableUse returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableUseRule()); }
	iv_ruleVariableUse=ruleVariableUse
	{ $current=$iv_ruleVariableUse.current; }
	EOF;

// Rule VariableUse
ruleVariableUse returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getVariableUseAccess().getVariableUseAction_0(),
					$current);
			}
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableUseRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getVariableUseAccess().getRefDeclarationCrossReference_1_0());
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
