/*
 * generated by Xtext 2.29.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}

@parser::members {

 	private MyDslGrammarAccess grammarAccess;

    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "System";
   	}

   	@Override
   	protected MyDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleSystem
entryRuleSystem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSystemRule()); }
	iv_ruleSystem=ruleSystem
	{ $current=$iv_ruleSystem.current; }
	EOF;

// Rule System
ruleSystem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='system'
		{
			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSystemRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getSystemAccess().getElementsRelationParserRuleCall_2_0_0());
					}
					lv_elements_2_1=ruleRelation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSystemRule());
						}
						add(
							$current,
							"elements",
							lv_elements_2_1,
							"org.xtext.example.mydsl.MyDsl.Relation");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getSystemAccess().getElementsEntityParserRuleCall_2_0_1());
					}
					lv_elements_2_2=ruleEntity
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSystemRule());
						}
						add(
							$current,
							"elements",
							lv_elements_2_2,
							"org.xtext.example.mydsl.MyDsl.Entity");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)+
	)
;

// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	iv_ruleEntity=ruleEntity
	{ $current=$iv_ruleEntity.current; }
	EOF;

// Rule Entity
ruleEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='entity'
		{
			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getEntityAccess().getElementsAttributeParserRuleCall_2_0_0());
					}
					lv_elements_2_1=ruleAttribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEntityRule());
						}
						add(
							$current,
							"elements",
							lv_elements_2_1,
							"org.xtext.example.mydsl.MyDsl.Attribute");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getEntityAccess().getElementsRequireParserRuleCall_2_0_1());
					}
					lv_elements_2_2=ruleRequire
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEntityRule());
						}
						add(
							$current,
							"elements",
							lv_elements_2_2,
							"org.xtext.example.mydsl.MyDsl.Require");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='attribute'
		{
			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='as'
		{
			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getAsKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_3_0());
				}
				lv_type_3_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"type",
						lv_type_3_0,
						"org.xtext.example.mydsl.MyDsl.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleRequire
entryRuleRequire returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRequireRule()); }
	iv_ruleRequire=ruleRequire
	{ $current=$iv_ruleRequire.current; }
	EOF;

// Rule Require
ruleRequire returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='require'
		{
			newLeafNode(otherlv_0, grammarAccess.getRequireAccess().getRequireKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRequireRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getRequireAccess().getVarRefAttributeCrossReference_1_0());
				}
			)
		)
		otherlv_2='=='
		{
			newLeafNode(otherlv_2, grammarAccess.getRequireAccess().getEqualsSignEqualsSignKeyword_2());
		}
		(
			(
				lv_exp_3_0=RULE_INT
				{
					newLeafNode(lv_exp_3_0, grammarAccess.getRequireAccess().getExpINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRequireRule());
					}
					setWithLastConsumed(
						$current,
						"exp",
						lv_exp_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleType
entryRuleType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current.getText(); }
	EOF;

// Rule Type
ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='string'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_0());
		}
		    |
		kw='number'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getNumberKeyword_1());
		}
	)
;

// Entry rule entryRuleRelation
entryRuleRelation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRelationRule()); }
	iv_ruleRelation=ruleRelation
	{ $current=$iv_ruleRelation.current; }
	EOF;

// Rule Relation
ruleRelation returns [EObject current=null]
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
						grammarAccess.getRelationAccess().getInheritanceAction_0_0(),
						$current);
				}
			)
			otherlv_1='relation'
			{
				newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getRelationKeyword_0_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRelationRule());
						}
					}
					otherlv_2=RULE_ID
					{
						newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getBaseEntityEntityCrossReference_0_2_0());
					}
				)
			)
			otherlv_3='is'
			{
				newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getIsKeyword_0_3());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRelationRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getRelationAccess().getSuperEntityEntityCrossReference_0_4_0());
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getRelationAccess().getAssociationAction_1_0(),
						$current);
				}
			)
			otherlv_6='relation'
			{
				newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getRelationKeyword_1_1());
			}
			(
				otherlv_7='a'
				{
					newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getAKeyword_1_2_0());
				}
				    |
				(
					(
						lv_manyFrom_8_0='many'
						{
							newLeafNode(lv_manyFrom_8_0, grammarAccess.getRelationAccess().getManyFromManyKeyword_1_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getRelationRule());
							}
							setWithLastConsumed($current, "manyFrom", lv_manyFrom_8_0 != null, "many");
						}
					)
				)
			)?
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRelationRule());
						}
					}
					otherlv_9=RULE_ID
					{
						newLeafNode(otherlv_9, grammarAccess.getRelationAccess().getFromEntityCrossReference_1_3_0());
					}
				)
			)
			(
				otherlv_10='has'
				{
					newLeafNode(otherlv_10, grammarAccess.getRelationAccess().getHasKeyword_1_4_0());
				}
				    |
				otherlv_11='have'
				{
					newLeafNode(otherlv_11, grammarAccess.getRelationAccess().getHaveKeyword_1_4_1());
				}
			)
			(
				otherlv_12='a'
				{
					newLeafNode(otherlv_12, grammarAccess.getRelationAccess().getAKeyword_1_5_0());
				}
				    |
				(
					(
						lv_manyTo_13_0='many'
						{
							newLeafNode(lv_manyTo_13_0, grammarAccess.getRelationAccess().getManyToManyKeyword_1_5_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getRelationRule());
							}
							setWithLastConsumed($current, "manyTo", lv_manyTo_13_0 != null, "many");
						}
					)
				)
			)?
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRelationRule());
						}
					}
					otherlv_14=RULE_ID
					{
						newLeafNode(otherlv_14, grammarAccess.getRelationAccess().getToEntityCrossReference_1_6_0());
					}
				)
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
