/*
 * generated by Xtext 2.29.0
 */
package org.xtext.ui23.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.ui23.ide.contentassist.antlr.internal.InternalDslParser;
import org.xtext.ui23.services.DslGrammarAccess;

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
			builder.put(grammarAccess.getLayoutAccess().getAxisAlternatives_1_0(), "rule__Layout__AxisAlternatives_1_0");
			builder.put(grammarAccess.getComponentAccess().getAlternatives(), "rule__Component__Alternatives");
			builder.put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getBooleanAccess().getOpAlternatives_1_1_0(), "rule__Boolean__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getEqualAccess().getOpAlternatives_1_1_0(), "rule__Equal__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getCompareAccess().getOpAlternatives_1_1_0(), "rule__Compare__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getPlusMinusAccess().getOpAlternatives_1_1_0(), "rule__PlusMinus__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getMultDivAccess().getOpAlternatives_1_1_0(), "rule__MultDiv__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getPrimitiveAccess().getAlternatives(), "rule__Primitive__Alternatives");
			builder.put(grammarAccess.getCrossRefAccess().getAlternatives(), "rule__CrossRef__Alternatives");
			builder.put(grammarAccess.getUI23Access().getGroup(), "rule__UI23__Group__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup_3(), "rule__Function__Group_3__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup_3_1(), "rule__Function__Group_3_1__0");
			builder.put(grammarAccess.getFormAccess().getGroup(), "rule__Form__Group__0");
			builder.put(grammarAccess.getFormAccess().getGroup_2(), "rule__Form__Group_2__0");
			builder.put(grammarAccess.getFormAccess().getGroup_2_1(), "rule__Form__Group_2_1__0");
			builder.put(grammarAccess.getFormAccess().getGroup_2_1_1(), "rule__Form__Group_2_1_1__0");
			builder.put(grammarAccess.getLayoutAccess().getGroup(), "rule__Layout__Group__0");
			builder.put(grammarAccess.getLabelAccess().getGroup(), "rule__Label__Group__0");
			builder.put(grammarAccess.getInputTextAccess().getGroup(), "rule__InputText__Group__0");
			builder.put(grammarAccess.getButtonAccess().getGroup(), "rule__Button__Group__0");
			builder.put(grammarAccess.getFormUseAccess().getGroup(), "rule__FormUse__Group__0");
			builder.put(grammarAccess.getFormUseAccess().getGroup_2(), "rule__FormUse__Group_2__0");
			builder.put(grammarAccess.getFormUseAccess().getGroup_2_1(), "rule__FormUse__Group_2_1__0");
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
			builder.put(grammarAccess.getPrimitiveAccess().getGroup_6_3(), "rule__Primitive__Group_6_3__0");
			builder.put(grammarAccess.getPrimitiveAccess().getGroup_6_3_1(), "rule__Primitive__Group_6_3_1__0");
			builder.put(grammarAccess.getPrimitiveAccess().getGroup_7(), "rule__Primitive__Group_7__0");
			builder.put(grammarAccess.getUI23Access().getNameAssignment_1(), "rule__UI23__NameAssignment_1");
			builder.put(grammarAccess.getUI23Access().getFunctionsAssignment_2(), "rule__UI23__FunctionsAssignment_2");
			builder.put(grammarAccess.getUI23Access().getFormsAssignment_3(), "rule__UI23__FormsAssignment_3");
			builder.put(grammarAccess.getFunctionAccess().getNameAssignment_1(), "rule__Function__NameAssignment_1");
			builder.put(grammarAccess.getFunctionAccess().getTypesAssignment_3_0(), "rule__Function__TypesAssignment_3_0");
			builder.put(grammarAccess.getFunctionAccess().getTypesAssignment_3_1_1(), "rule__Function__TypesAssignment_3_1_1");
			builder.put(grammarAccess.getFunctionAccess().getReturnTypeAssignment_6(), "rule__Function__ReturnTypeAssignment_6");
			builder.put(grammarAccess.getFormAccess().getNameAssignment_1(), "rule__Form__NameAssignment_1");
			builder.put(grammarAccess.getFormAccess().getParametersAssignment_2_1_0(), "rule__Form__ParametersAssignment_2_1_0");
			builder.put(grammarAccess.getFormAccess().getParametersAssignment_2_1_1_1(), "rule__Form__ParametersAssignment_2_1_1_1");
			builder.put(grammarAccess.getFormAccess().getLayoutAssignment_4(), "rule__Form__LayoutAssignment_4");
			builder.put(grammarAccess.getLayoutAccess().getAxisAssignment_1(), "rule__Layout__AxisAssignment_1");
			builder.put(grammarAccess.getLayoutAccess().getComponentsAssignment_3(), "rule__Layout__ComponentsAssignment_3");
			builder.put(grammarAccess.getLabelAccess().getExpAssignment_2(), "rule__Label__ExpAssignment_2");
			builder.put(grammarAccess.getInputTextAccess().getNameAssignment_1(), "rule__InputText__NameAssignment_1");
			builder.put(grammarAccess.getInputTextAccess().getExpAssignment_3(), "rule__InputText__ExpAssignment_3");
			builder.put(grammarAccess.getButtonAccess().getValidateAssignment_1(), "rule__Button__ValidateAssignment_1");
			builder.put(grammarAccess.getButtonAccess().getNameAssignment_2(), "rule__Button__NameAssignment_2");
			builder.put(grammarAccess.getButtonAccess().getExpAssignment_4(), "rule__Button__ExpAssignment_4");
			builder.put(grammarAccess.getFormUseAccess().getFormAssignment_0(), "rule__FormUse__FormAssignment_0");
			builder.put(grammarAccess.getFormUseAccess().getExpsAssignment_2_0(), "rule__FormUse__ExpsAssignment_2_0");
			builder.put(grammarAccess.getFormUseAccess().getExpsAssignment_2_1_1(), "rule__FormUse__ExpsAssignment_2_1_1");
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
			builder.put(grammarAccess.getPrimitiveAccess().getExpAssignment_2_2(), "rule__Primitive__ExpAssignment_2_2");
			builder.put(grammarAccess.getPrimitiveAccess().getExpAssignment_3_2(), "rule__Primitive__ExpAssignment_3_2");
			builder.put(grammarAccess.getPrimitiveAccess().getTypeAssignment_4_1(), "rule__Primitive__TypeAssignment_4_1");
			builder.put(grammarAccess.getPrimitiveAccess().getRefAssignment_5_1(), "rule__Primitive__RefAssignment_5_1");
			builder.put(grammarAccess.getPrimitiveAccess().getRefAssignment_6_1(), "rule__Primitive__RefAssignment_6_1");
			builder.put(grammarAccess.getPrimitiveAccess().getExpsAssignment_6_3_0(), "rule__Primitive__ExpsAssignment_6_3_0");
			builder.put(grammarAccess.getPrimitiveAccess().getExpsAssignment_6_3_1_1(), "rule__Primitive__ExpsAssignment_6_3_1_1");
			builder.put(grammarAccess.getPrimitiveAccess().getExpAssignment_7_2(), "rule__Primitive__ExpAssignment_7_2");
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
