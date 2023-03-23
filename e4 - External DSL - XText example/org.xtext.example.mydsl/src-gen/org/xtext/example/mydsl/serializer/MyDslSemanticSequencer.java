/*
 * generated by Xtext 2.29.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.Association;
import org.xtext.example.mydsl.myDsl.Attribute;
import org.xtext.example.mydsl.myDsl.Entity;
import org.xtext.example.mydsl.myDsl.EntitySystem;
import org.xtext.example.mydsl.myDsl.ExternalDefinition;
import org.xtext.example.mydsl.myDsl.FunctionCall;
import org.xtext.example.mydsl.myDsl.Inheritance;
import org.xtext.example.mydsl.myDsl.Minus;
import org.xtext.example.mydsl.myDsl.Mult;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Parenthesis;
import org.xtext.example.mydsl.myDsl.Plus;
import org.xtext.example.mydsl.myDsl.Require;
import org.xtext.example.mydsl.myDsl.VarExp;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.ASSOCIATION:
				sequence_Relation(context, (Association) semanticObject); 
				return; 
			case MyDslPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case MyDslPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case MyDslPackage.ENTITY_SYSTEM:
				sequence_EntitySystem(context, (EntitySystem) semanticObject); 
				return; 
			case MyDslPackage.EXTERNAL_DEFINITION:
				sequence_ExternalDefinition(context, (ExternalDefinition) semanticObject); 
				return; 
			case MyDslPackage.FUNCTION_CALL:
				sequence_FunctionCall(context, (FunctionCall) semanticObject); 
				return; 
			case MyDslPackage.INHERITANCE:
				sequence_Relation(context, (Inheritance) semanticObject); 
				return; 
			case MyDslPackage.MINUS:
				sequence_PlusOrMinus(context, (Minus) semanticObject); 
				return; 
			case MyDslPackage.MULT:
				sequence_Term(context, (Mult) semanticObject); 
				return; 
			case MyDslPackage.NUMBER:
				sequence_Atomic(context, (org.xtext.example.mydsl.myDsl.Number) semanticObject); 
				return; 
			case MyDslPackage.PARENTHESIS:
				sequence_Atomic(context, (Parenthesis) semanticObject); 
				return; 
			case MyDslPackage.PLUS:
				sequence_PlusOrMinus(context, (Plus) semanticObject); 
				return; 
			case MyDslPackage.REQUIRE:
				sequence_Require(context, (Require) semanticObject); 
				return; 
			case MyDslPackage.VAR_EXP:
				sequence_VarExp(context, (VarExp) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Number
	 *     PlusOrMinus returns Number
	 *     PlusOrMinus.Plus_1_0_0_0 returns Number
	 *     PlusOrMinus.Minus_1_0_1_0 returns Number
	 *     Term returns Number
	 *     Term.Mult_1_0 returns Number
	 *     Factor returns Number
	 *     Atomic returns Number
	 *
	 * Constraint:
	 *     value=INT
	 * </pre>
	 */
	protected void sequence_Atomic(ISerializationContext context, org.xtext.example.mydsl.myDsl.Number semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NUMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NUMBER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Parenthesis
	 *     PlusOrMinus returns Parenthesis
	 *     PlusOrMinus.Plus_1_0_0_0 returns Parenthesis
	 *     PlusOrMinus.Minus_1_0_1_0 returns Parenthesis
	 *     Term returns Parenthesis
	 *     Term.Mult_1_0 returns Parenthesis
	 *     Factor returns Parenthesis
	 *     Atomic returns Parenthesis
	 *
	 * Constraint:
	 *     exp=Exp
	 * </pre>
	 */
	protected void sequence_Atomic(ISerializationContext context, Parenthesis semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PARENTHESIS__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PARENTHESIS__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getExpExpParserRuleCall_1_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (name=ID type=Type)
	 * </pre>
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ATTRIBUTE__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ATTRIBUTE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ATTRIBUTE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EntitySystem returns EntitySystem
	 *
	 * Constraint:
	 *     (name=ID externals+=ExternalDefinition* (elements+=Relation | elements+=Entity)+)
	 * </pre>
	 */
	protected void sequence_EntitySystem(ISerializationContext context, EntitySystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=ID (elements+=Attribute | elements+=Require)*)
	 * </pre>
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ExternalDefinition returns ExternalDefinition
	 *
	 * Constraint:
	 *     (name=ID (types+=Type types+=Type*)?)
	 * </pre>
	 */
	protected void sequence_ExternalDefinition(ISerializationContext context, ExternalDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FunctionCall returns FunctionCall
	 *
	 * Constraint:
	 *     (function=[ExternalDefinition|ID] (variables+=[Attribute|ID] variables+=[Attribute|ID]*)?)
	 * </pre>
	 */
	protected void sequence_FunctionCall(ISerializationContext context, FunctionCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Minus
	 *     PlusOrMinus returns Minus
	 *     PlusOrMinus.Plus_1_0_0_0 returns Minus
	 *     PlusOrMinus.Minus_1_0_1_0 returns Minus
	 *
	 * Constraint:
	 *     (left=PlusOrMinus_Minus_1_0_1_0 right=Term)
	 * </pre>
	 */
	protected void sequence_PlusOrMinus(ISerializationContext context, Minus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MINUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MINUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPlusOrMinusAccess().getRightTermParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Plus
	 *     PlusOrMinus returns Plus
	 *     PlusOrMinus.Plus_1_0_0_0 returns Plus
	 *     PlusOrMinus.Minus_1_0_1_0 returns Plus
	 *
	 * Constraint:
	 *     (left=PlusOrMinus_Plus_1_0_0_0 right=Term)
	 * </pre>
	 */
	protected void sequence_PlusOrMinus(ISerializationContext context, Plus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PLUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PLUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPlusOrMinusAccess().getRightTermParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Relation returns Association
	 *
	 * Constraint:
	 *     (manyFrom?='many'? from=[Entity|ID] manyTo?='many'? to=[Entity|ID])
	 * </pre>
	 */
	protected void sequence_Relation(ISerializationContext context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Relation returns Inheritance
	 *
	 * Constraint:
	 *     (baseEntity=[Entity|ID] superEntity=[Entity|ID])
	 * </pre>
	 */
	protected void sequence_Relation(ISerializationContext context, Inheritance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.INHERITANCE__BASE_ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.INHERITANCE__BASE_ENTITY));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.INHERITANCE__SUPER_ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.INHERITANCE__SUPER_ENTITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRelationAccess().getBaseEntityEntityIDTerminalRuleCall_0_2_0_1(), semanticObject.eGet(MyDslPackage.Literals.INHERITANCE__BASE_ENTITY, false));
		feeder.accept(grammarAccess.getRelationAccess().getSuperEntityEntityIDTerminalRuleCall_0_4_0_1(), semanticObject.eGet(MyDslPackage.Literals.INHERITANCE__SUPER_ENTITY, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Require returns Require
	 *
	 * Constraint:
	 *     (require=FunctionCall | require=VarExp)
	 * </pre>
	 */
	protected void sequence_Require(ISerializationContext context, Require semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Mult
	 *     PlusOrMinus returns Mult
	 *     PlusOrMinus.Plus_1_0_0_0 returns Mult
	 *     PlusOrMinus.Minus_1_0_1_0 returns Mult
	 *     Term returns Mult
	 *     Term.Mult_1_0 returns Mult
	 *
	 * Constraint:
	 *     (left=Term_Mult_1_0 right=Factor)
	 * </pre>
	 */
	protected void sequence_Term(ISerializationContext context, Mult semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MULT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MULT__LEFT));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MULT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MULT__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTermAccess().getMultLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getTermAccess().getRightFactorParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     VarExp returns VarExp
	 *
	 * Constraint:
	 *     (varRef=[Attribute|ID] (op='==' | op='&gt;' | op='&gt;=') exp=Exp)
	 * </pre>
	 */
	protected void sequence_VarExp(ISerializationContext context, VarExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
