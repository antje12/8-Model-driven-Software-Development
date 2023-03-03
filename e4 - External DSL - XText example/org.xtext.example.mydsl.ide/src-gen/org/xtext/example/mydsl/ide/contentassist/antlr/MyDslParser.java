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
			builder.put(grammarAccess.getSystemAccess().getElementsAlternatives_2_0(), "rule__System__ElementsAlternatives_2_0");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getRelationAccess().getAlternatives(), "rule__Relation__Alternatives");
			builder.put(grammarAccess.getRelationAccess().getAlternatives_1_2(), "rule__Relation__Alternatives_1_2");
			builder.put(grammarAccess.getRelationAccess().getAlternatives_1_4(), "rule__Relation__Alternatives_1_4");
			builder.put(grammarAccess.getRelationAccess().getAlternatives_1_5(), "rule__Relation__Alternatives_1_5");
			builder.put(grammarAccess.getSystemAccess().getGroup(), "rule__System__Group__0");
			builder.put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getRelationAccess().getGroup_0(), "rule__Relation__Group_0__0");
			builder.put(grammarAccess.getRelationAccess().getGroup_1(), "rule__Relation__Group_1__0");
			builder.put(grammarAccess.getSystemAccess().getNameAssignment_1(), "rule__System__NameAssignment_1");
			builder.put(grammarAccess.getSystemAccess().getElementsAssignment_2(), "rule__System__ElementsAssignment_2");
			builder.put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
			builder.put(grammarAccess.getEntityAccess().getAttributesAssignment_2(), "rule__Entity__AttributesAssignment_2");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
			builder.put(grammarAccess.getAttributeAccess().getTypeAssignment_3(), "rule__Attribute__TypeAssignment_3");
			builder.put(grammarAccess.getRelationAccess().getSubEntityAssignment_0_2(), "rule__Relation__SubEntityAssignment_0_2");
			builder.put(grammarAccess.getRelationAccess().getSuperEntityAssignment_0_4(), "rule__Relation__SuperEntityAssignment_0_4");
			builder.put(grammarAccess.getRelationAccess().getSingletoAssignment_1_2_0(), "rule__Relation__SingletoAssignment_1_2_0");
			builder.put(grammarAccess.getRelationAccess().getManytoAssignment_1_2_1(), "rule__Relation__ManytoAssignment_1_2_1");
			builder.put(grammarAccess.getRelationAccess().getFromAssignment_1_3(), "rule__Relation__FromAssignment_1_3");
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
