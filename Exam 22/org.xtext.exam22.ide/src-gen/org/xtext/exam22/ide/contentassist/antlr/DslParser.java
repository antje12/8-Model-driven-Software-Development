/*
 * generated by Xtext 2.29.0
 */
package org.xtext.exam22.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.exam22.ide.contentassist.antlr.internal.InternalDslParser;
import org.xtext.exam22.services.DslGrammarAccess;

public class DslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getScenarioAccess().getAlternatives_4(), "rule__Scenario__Alternatives_4");
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getBooleanAccess().getOpAlternatives_1_1_0(), "rule__Boolean__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getEqualAccess().getOpAlternatives_1_1_0(), "rule__Equal__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getCompareAccess().getOpAlternatives_1_1_0(), "rule__Compare__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getPlusMinusAccess().getOpAlternatives_1_1_0(), "rule__PlusMinus__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getMultDivAccess().getOpAlternatives_1_1_0(), "rule__MultDiv__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getPrimitiveAccess().getAlternatives(), "rule__Primitive__Alternatives");
			builder.put(grammarAccess.getPrimitiveAccess().getValueAlternatives_2_1_0(), "rule__Primitive__ValueAlternatives_2_1_0");
			builder.put(grammarAccess.getCrossRefAccess().getAlternatives(), "rule__CrossRef__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup_3(), "rule__Function__Group_3__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup_3_1(), "rule__Function__Group_3_1__0");
			builder.put(grammarAccess.getScenarioAccess().getGroup(), "rule__Scenario__Group__0");
			builder.put(grammarAccess.getScenarioAccess().getGroup_2(), "rule__Scenario__Group_2__0");
			builder.put(grammarAccess.getScenarioAccess().getGroup_2_1(), "rule__Scenario__Group_2_1__0");
			builder.put(grammarAccess.getScenarioAccess().getGroup_2_1_1(), "rule__Scenario__Group_2_1_1__0");
			builder.put(grammarAccess.getVariableDefAccess().getGroup(), "rule__VariableDef__Group__0");
			builder.put(grammarAccess.getAnnounceAccess().getGroup(), "rule__Announce__Group__0");
			builder.put(grammarAccess.getQuestionAccess().getGroup(), "rule__Question__Group__0");
			builder.put(grammarAccess.getQuestionAccess().getGroup_5(), "rule__Question__Group_5__0");
			builder.put(grammarAccess.getEndAccess().getGroup(), "rule__End__Group__0");
			builder.put(grammarAccess.getTargetAccess().getGroup(), "rule__Target__Group__0");
			builder.put(grammarAccess.getTargetAccess().getGroup_2(), "rule__Target__Group_2__0");
			builder.put(grammarAccess.getTargetAccess().getGroup_2_1(), "rule__Target__Group_2_1__0");
			builder.put(grammarAccess.getTargetAccess().getGroup_2_1_1(), "rule__Target__Group_2_1_1__0");
			builder.put(grammarAccess.getTargetAccess().getGroup_3(), "rule__Target__Group_3__0");
			builder.put(grammarAccess.getTargetAccess().getGroup_4(), "rule__Target__Group_4__0");
			builder.put(grammarAccess.getEndingTargetAccess().getGroup(), "rule__EndingTarget__Group__0");
			builder.put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
			builder.put(grammarAccess.getBooleanAccess().getGroup(), "rule__Boolean__Group__0");
			builder.put(grammarAccess.getBooleanAccess().getGroup_1(), "rule__Boolean__Group_1__0");
			builder.put(grammarAccess.getEqualAccess().getGroup(), "rule__Equal__Group__0");
			builder.put(grammarAccess.getEqualAccess().getGroup_1(), "rule__Equal__Group_1__0");
			builder.put(grammarAccess.getCompareAccess().getGroup(), "rule__Compare__Group__0");
			builder.put(grammarAccess.getCompareAccess().getGroup_1(), "rule__Compare__Group_1__0");
			builder.put(grammarAccess.getConcatAccess().getGroup(), "rule__Concat__Group__0");
			builder.put(grammarAccess.getConcatAccess().getGroup_1(), "rule__Concat__Group_1__0");
			builder.put(grammarAccess.getPlusMinusAccess().getGroup(), "rule__PlusMinus__Group__0");
			builder.put(grammarAccess.getPlusMinusAccess().getGroup_1(), "rule__PlusMinus__Group_1__0");
			builder.put(grammarAccess.getMultDivAccess().getGroup(), "rule__MultDiv__Group__0");
			builder.put(grammarAccess.getMultDivAccess().getGroup_1(), "rule__MultDiv__Group_1__0");
			builder.put(grammarAccess.getPrimitiveAccess().getGroup_0(), "rule__Primitive__Group_0__0");
			builder.put(grammarAccess.getPrimitiveAccess().getGroup_1(), "rule__Primitive__Group_1__0");
			builder.put(grammarAccess.getPrimitiveAccess().getGroup_2(), "rule__Primitive__Group_2__0");
			builder.put(grammarAccess.getPrimitiveAccess().getGroup_3(), "rule__Primitive__Group_3__0");
			builder.put(grammarAccess.getPrimitiveAccess().getGroup_4(), "rule__Primitive__Group_4__0");
			builder.put(grammarAccess.getPrimitiveAccess().getGroup_5(), "rule__Primitive__Group_5__0");
			builder.put(grammarAccess.getPrimitiveAccess().getGroup_6(), "rule__Primitive__Group_6__0");
			builder.put(grammarAccess.getPrimitiveAccess().getGroup_7(), "rule__Primitive__Group_7__0");
			builder.put(grammarAccess.getPrimitiveAccess().getGroup_7_3(), "rule__Primitive__Group_7_3__0");
			builder.put(grammarAccess.getPrimitiveAccess().getGroup_7_3_1(), "rule__Primitive__Group_7_3_1__0");
			builder.put(grammarAccess.getPrimitiveAccess().getGroup_8(), "rule__Primitive__Group_8__0");
			builder.put(grammarAccess.getModelAccess().getNameAssignment_1(), "rule__Model__NameAssignment_1");
			builder.put(grammarAccess.getModelAccess().getFunctionsAssignment_2(), "rule__Model__FunctionsAssignment_2");
			builder.put(grammarAccess.getModelAccess().getScenariosAssignment_3(), "rule__Model__ScenariosAssignment_3");
			builder.put(grammarAccess.getFunctionAccess().getNameAssignment_1(), "rule__Function__NameAssignment_1");
			builder.put(grammarAccess.getFunctionAccess().getTypesAssignment_3_0(), "rule__Function__TypesAssignment_3_0");
			builder.put(grammarAccess.getFunctionAccess().getTypesAssignment_3_1_1(), "rule__Function__TypesAssignment_3_1_1");
			builder.put(grammarAccess.getFunctionAccess().getReturnTypeAssignment_6(), "rule__Function__ReturnTypeAssignment_6");
			builder.put(grammarAccess.getScenarioAccess().getNameAssignment_1(), "rule__Scenario__NameAssignment_1");
			builder.put(grammarAccess.getScenarioAccess().getParametersAssignment_2_1_0(), "rule__Scenario__ParametersAssignment_2_1_0");
			builder.put(grammarAccess.getScenarioAccess().getParametersAssignment_2_1_1_1(), "rule__Scenario__ParametersAssignment_2_1_1_1");
			builder.put(grammarAccess.getScenarioAccess().getVariablesAssignment_4_0(), "rule__Scenario__VariablesAssignment_4_0");
			builder.put(grammarAccess.getScenarioAccess().getStatementsAssignment_4_1(), "rule__Scenario__StatementsAssignment_4_1");
			builder.put(grammarAccess.getVariableDefAccess().getNameAssignment_1(), "rule__VariableDef__NameAssignment_1");
			builder.put(grammarAccess.getVariableDefAccess().getTypeAssignment_3(), "rule__VariableDef__TypeAssignment_3");
			builder.put(grammarAccess.getAnnounceAccess().getNameAssignment_1(), "rule__Announce__NameAssignment_1");
			builder.put(grammarAccess.getAnnounceAccess().getExpressionAssignment_2(), "rule__Announce__ExpressionAssignment_2");
			builder.put(grammarAccess.getAnnounceAccess().getTargetsAssignment_3(), "rule__Announce__TargetsAssignment_3");
			builder.put(grammarAccess.getQuestionAccess().getNameAssignment_1(), "rule__Question__NameAssignment_1");
			builder.put(grammarAccess.getQuestionAccess().getExpressionAssignment_2(), "rule__Question__ExpressionAssignment_2");
			builder.put(grammarAccess.getQuestionAccess().getOutputAssignment_4(), "rule__Question__OutputAssignment_4");
			builder.put(grammarAccess.getQuestionAccess().getVariableAssignment_5_1(), "rule__Question__VariableAssignment_5_1");
			builder.put(grammarAccess.getQuestionAccess().getTargetsAssignment_6(), "rule__Question__TargetsAssignment_6");
			builder.put(grammarAccess.getEndAccess().getNameAssignment_1(), "rule__End__NameAssignment_1");
			builder.put(grammarAccess.getEndAccess().getExpressionAssignment_2(), "rule__End__ExpressionAssignment_2");
			builder.put(grammarAccess.getTargetAccess().getToAssignment_1(), "rule__Target__ToAssignment_1");
			builder.put(grammarAccess.getTargetAccess().getExpressionsAssignment_2_1_0(), "rule__Target__ExpressionsAssignment_2_1_0");
			builder.put(grammarAccess.getTargetAccess().getExpressionsAssignment_2_1_1_1(), "rule__Target__ExpressionsAssignment_2_1_1_1");
			builder.put(grammarAccess.getTargetAccess().getConditionAssignment_3_1(), "rule__Target__ConditionAssignment_3_1");
			builder.put(grammarAccess.getTargetAccess().getEndingTargetsAssignment_4_1(), "rule__Target__EndingTargetsAssignment_4_1");
			builder.put(grammarAccess.getEndingTargetAccess().getEndAssignment_1(), "rule__EndingTarget__EndAssignment_1");
			builder.put(grammarAccess.getEndingTargetAccess().getTargetAssignment_2(), "rule__EndingTarget__TargetAssignment_2");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment_0(), "rule__Parameter__NameAssignment_0");
			builder.put(grammarAccess.getParameterAccess().getTypeAssignment_2(), "rule__Parameter__TypeAssignment_2");
			builder.put(grammarAccess.getBooleanAccess().getOpAssignment_1_1(), "rule__Boolean__OpAssignment_1_1");
			builder.put(grammarAccess.getBooleanAccess().getRightAssignment_1_2(), "rule__Boolean__RightAssignment_1_2");
			builder.put(grammarAccess.getEqualAccess().getOpAssignment_1_1(), "rule__Equal__OpAssignment_1_1");
			builder.put(grammarAccess.getEqualAccess().getRightAssignment_1_2(), "rule__Equal__RightAssignment_1_2");
			builder.put(grammarAccess.getCompareAccess().getOpAssignment_1_1(), "rule__Compare__OpAssignment_1_1");
			builder.put(grammarAccess.getCompareAccess().getRightAssignment_1_2(), "rule__Compare__RightAssignment_1_2");
			builder.put(grammarAccess.getConcatAccess().getRightAssignment_1_2(), "rule__Concat__RightAssignment_1_2");
			builder.put(grammarAccess.getPlusMinusAccess().getOpAssignment_1_1(), "rule__PlusMinus__OpAssignment_1_1");
			builder.put(grammarAccess.getPlusMinusAccess().getRightAssignment_1_2(), "rule__PlusMinus__RightAssignment_1_2");
			builder.put(grammarAccess.getMultDivAccess().getOpAssignment_1_1(), "rule__MultDiv__OpAssignment_1_1");
			builder.put(grammarAccess.getMultDivAccess().getRightAssignment_1_2(), "rule__MultDiv__RightAssignment_1_2");
			builder.put(grammarAccess.getPrimitiveAccess().getValueAssignment_0_1(), "rule__Primitive__ValueAssignment_0_1");
			builder.put(grammarAccess.getPrimitiveAccess().getValueAssignment_1_1(), "rule__Primitive__ValueAssignment_1_1");
			builder.put(grammarAccess.getPrimitiveAccess().getValueAssignment_2_1(), "rule__Primitive__ValueAssignment_2_1");
			builder.put(grammarAccess.getPrimitiveAccess().getExpAssignment_3_2(), "rule__Primitive__ExpAssignment_3_2");
			builder.put(grammarAccess.getPrimitiveAccess().getTypeAssignment_4_1(), "rule__Primitive__TypeAssignment_4_1");
			builder.put(grammarAccess.getPrimitiveAccess().getRefAssignment_6_1(), "rule__Primitive__RefAssignment_6_1");
			builder.put(grammarAccess.getPrimitiveAccess().getRefAssignment_7_1(), "rule__Primitive__RefAssignment_7_1");
			builder.put(grammarAccess.getPrimitiveAccess().getExpressionsAssignment_7_3_0(), "rule__Primitive__ExpressionsAssignment_7_3_0");
			builder.put(grammarAccess.getPrimitiveAccess().getExpressionsAssignment_7_3_1_1(), "rule__Primitive__ExpressionsAssignment_7_3_1_1");
			builder.put(grammarAccess.getPrimitiveAccess().getExpAssignment_8_2(), "rule__Primitive__ExpAssignment_8_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DslGrammarAccess grammarAccess;

	@Override
	protected InternalDslParser createParser() {
		InternalDslParser result = new InternalDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}