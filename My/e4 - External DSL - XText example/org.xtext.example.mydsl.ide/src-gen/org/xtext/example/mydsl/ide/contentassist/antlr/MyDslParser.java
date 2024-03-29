/*
 * generated by Xtext 2.29.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEntitySystemAccess().getElementsAlternatives_3_0(), "rule__EntitySystem__ElementsAlternatives_3_0");
			builder.put(grammarAccess.getEntityAccess().getElementsAlternatives_2_0(), "rule__Entity__ElementsAlternatives_2_0");
			builder.put(grammarAccess.getRequireAccess().getRequireAlternatives_1_0(), "rule__Require__RequireAlternatives_1_0");
			builder.put(grammarAccess.getVarExpAccess().getOpAlternatives_1_0(), "rule__VarExp__OpAlternatives_1_0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0(), "rule__PlusOrMinus__Alternatives_1_0");
			builder.put(grammarAccess.getAtomicAccess().getAlternatives(), "rule__Atomic__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getRelationAccess().getAlternatives(), "rule__Relation__Alternatives");
			builder.put(grammarAccess.getRelationAccess().getAlternatives_1_2(), "rule__Relation__Alternatives_1_2");
			builder.put(grammarAccess.getRelationAccess().getAlternatives_1_4(), "rule__Relation__Alternatives_1_4");
			builder.put(grammarAccess.getRelationAccess().getAlternatives_1_5(), "rule__Relation__Alternatives_1_5");
			builder.put(grammarAccess.getEntitySystemAccess().getGroup(), "rule__EntitySystem__Group__0");
			builder.put(grammarAccess.getExternalDefinitionAccess().getGroup(), "rule__ExternalDefinition__Group__0");
			builder.put(grammarAccess.getExternalDefinitionAccess().getGroup_3(), "rule__ExternalDefinition__Group_3__0");
			builder.put(grammarAccess.getExternalDefinitionAccess().getGroup_3_1(), "rule__ExternalDefinition__Group_3_1__0");
			builder.put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getRequireAccess().getGroup(), "rule__Require__Group__0");
			builder.put(grammarAccess.getFunctionCallAccess().getGroup(), "rule__FunctionCall__Group__0");
			builder.put(grammarAccess.getFunctionCallAccess().getGroup_2(), "rule__FunctionCall__Group_2__0");
			builder.put(grammarAccess.getFunctionCallAccess().getGroup_2_1(), "rule__FunctionCall__Group_2_1__0");
			builder.put(grammarAccess.getVarExpAccess().getGroup(), "rule__VarExp__Group__0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getGroup(), "rule__PlusOrMinus__Group__0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getGroup_1(), "rule__PlusOrMinus__Group_1__0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0(), "rule__PlusOrMinus__Group_1_0_0__0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1(), "rule__PlusOrMinus__Group_1_0_1__0");
			builder.put(grammarAccess.getTermAccess().getGroup(), "rule__Term__Group__0");
			builder.put(grammarAccess.getTermAccess().getGroup_1(), "rule__Term__Group_1__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_0(), "rule__Atomic__Group_0__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_1(), "rule__Atomic__Group_1__0");
			builder.put(grammarAccess.getRelationAccess().getGroup_0(), "rule__Relation__Group_0__0");
			builder.put(grammarAccess.getRelationAccess().getGroup_1(), "rule__Relation__Group_1__0");
			builder.put(grammarAccess.getEntitySystemAccess().getNameAssignment_1(), "rule__EntitySystem__NameAssignment_1");
			builder.put(grammarAccess.getEntitySystemAccess().getExternalsAssignment_2(), "rule__EntitySystem__ExternalsAssignment_2");
			builder.put(grammarAccess.getEntitySystemAccess().getElementsAssignment_3(), "rule__EntitySystem__ElementsAssignment_3");
			builder.put(grammarAccess.getExternalDefinitionAccess().getNameAssignment_1(), "rule__ExternalDefinition__NameAssignment_1");
			builder.put(grammarAccess.getExternalDefinitionAccess().getTypesAssignment_3_0(), "rule__ExternalDefinition__TypesAssignment_3_0");
			builder.put(grammarAccess.getExternalDefinitionAccess().getTypesAssignment_3_1_1(), "rule__ExternalDefinition__TypesAssignment_3_1_1");
			builder.put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
			builder.put(grammarAccess.getEntityAccess().getElementsAssignment_2(), "rule__Entity__ElementsAssignment_2");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
			builder.put(grammarAccess.getAttributeAccess().getTypeAssignment_3(), "rule__Attribute__TypeAssignment_3");
			builder.put(grammarAccess.getRequireAccess().getRequireAssignment_1(), "rule__Require__RequireAssignment_1");
			builder.put(grammarAccess.getFunctionCallAccess().getFunctionAssignment_0(), "rule__FunctionCall__FunctionAssignment_0");
			builder.put(grammarAccess.getFunctionCallAccess().getVariablesAssignment_2_0(), "rule__FunctionCall__VariablesAssignment_2_0");
			builder.put(grammarAccess.getFunctionCallAccess().getVariablesAssignment_2_1_1(), "rule__FunctionCall__VariablesAssignment_2_1_1");
			builder.put(grammarAccess.getVarExpAccess().getVarRefAssignment_0(), "rule__VarExp__VarRefAssignment_0");
			builder.put(grammarAccess.getVarExpAccess().getOpAssignment_1(), "rule__VarExp__OpAssignment_1");
			builder.put(grammarAccess.getVarExpAccess().getExpAssignment_2(), "rule__VarExp__ExpAssignment_2");
			builder.put(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1(), "rule__PlusOrMinus__RightAssignment_1_1");
			builder.put(grammarAccess.getTermAccess().getRightAssignment_1_2(), "rule__Term__RightAssignment_1_2");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_0_1(), "rule__Atomic__ValueAssignment_0_1");
			builder.put(grammarAccess.getAtomicAccess().getExpAssignment_1_2(), "rule__Atomic__ExpAssignment_1_2");
			builder.put(grammarAccess.getRelationAccess().getBaseEntityAssignment_0_2(), "rule__Relation__BaseEntityAssignment_0_2");
			builder.put(grammarAccess.getRelationAccess().getSuperEntityAssignment_0_4(), "rule__Relation__SuperEntityAssignment_0_4");
			builder.put(grammarAccess.getRelationAccess().getManyFromAssignment_1_2_1(), "rule__Relation__ManyFromAssignment_1_2_1");
			builder.put(grammarAccess.getRelationAccess().getFromAssignment_1_3(), "rule__Relation__FromAssignment_1_3");
			builder.put(grammarAccess.getRelationAccess().getManyToAssignment_1_5_1(), "rule__Relation__ManyToAssignment_1_5_1");
			builder.put(grammarAccess.getRelationAccess().getToAssignment_1_6(), "rule__Relation__ToAssignment_1_6");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
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

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
