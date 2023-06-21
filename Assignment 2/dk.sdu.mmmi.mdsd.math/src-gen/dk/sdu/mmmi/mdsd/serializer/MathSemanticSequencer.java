/*
 * generated by Xtext 2.29.0
 */
package dk.sdu.mmmi.mdsd.serializer;

import com.google.inject.Inject;
import dk.sdu.mmmi.mdsd.math.Div;
import dk.sdu.mmmi.mdsd.math.Let;
import dk.sdu.mmmi.mdsd.math.MathExp;
import dk.sdu.mmmi.mdsd.math.MathPackage;
import dk.sdu.mmmi.mdsd.math.Minus;
import dk.sdu.mmmi.mdsd.math.Mult;
import dk.sdu.mmmi.mdsd.math.MultDiv;
import dk.sdu.mmmi.mdsd.math.Parenthesis;
import dk.sdu.mmmi.mdsd.math.Plus;
import dk.sdu.mmmi.mdsd.math.PlusMinus;
import dk.sdu.mmmi.mdsd.math.Var;
import dk.sdu.mmmi.mdsd.math.VariableUse;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;
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

@SuppressWarnings("all")
public class MathSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MathGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MathPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MathPackage.DIV:
				sequence_OpMultDiv(context, (Div) semanticObject); 
				return; 
			case MathPackage.LET:
				sequence_Let(context, (Let) semanticObject); 
				return; 
			case MathPackage.MATH_EXP:
				sequence_MathExp(context, (MathExp) semanticObject); 
				return; 
			case MathPackage.MINUS:
				sequence_OpPlusMinus(context, (Minus) semanticObject); 
				return; 
			case MathPackage.MULT:
				sequence_OpMultDiv(context, (Mult) semanticObject); 
				return; 
			case MathPackage.MULT_DIV:
				sequence_MultDiv(context, (MultDiv) semanticObject); 
				return; 
			case MathPackage.NUMBER:
				sequence_Number(context, (dk.sdu.mmmi.mdsd.math.Number) semanticObject); 
				return; 
			case MathPackage.PARENTHESIS:
				sequence_Parenthesis(context, (Parenthesis) semanticObject); 
				return; 
			case MathPackage.PLUS:
				sequence_OpPlusMinus(context, (Plus) semanticObject); 
				return; 
			case MathPackage.PLUS_MINUS:
				sequence_PlusMinus(context, (PlusMinus) semanticObject); 
				return; 
			case MathPackage.VAR:
				sequence_Variable(context, (Var) semanticObject); 
				return; 
			case MathPackage.VARIABLE_USE:
				sequence_VariableUse(context, (VariableUse) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Declaration returns Let
	 *     Let returns Let
	 *     Exp returns Let
	 *     PlusMinus returns Let
	 *     PlusMinus.PlusMinus_1_0 returns Let
	 *     MultDiv returns Let
	 *     MultDiv.MultDiv_1_0 returns Let
	 *     Primary returns Let
	 *
	 * Constraint:
	 *     (name=ID value=Exp in=Exp)
	 * </pre>
	 */
	protected void sequence_Let(ISerializationContext context, Let semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.DECLARATION__NAME));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.DECLARATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.DECLARATION__VALUE));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.LET__IN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.LET__IN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLetAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLetAccess().getValueExpParserRuleCall_4_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getLetAccess().getInExpParserRuleCall_6_0(), semanticObject.getIn());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MathExp returns MathExp
	 *
	 * Constraint:
	 *     variables+=Variable+
	 * </pre>
	 */
	protected void sequence_MathExp(ISerializationContext context, MathExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns MultDiv
	 *     PlusMinus returns MultDiv
	 *     PlusMinus.PlusMinus_1_0 returns MultDiv
	 *     MultDiv returns MultDiv
	 *     MultDiv.MultDiv_1_0 returns MultDiv
	 *
	 * Constraint:
	 *     (left=MultDiv_MultDiv_1_0 operator=OpMultDiv right=Primary)
	 * </pre>
	 */
	protected void sequence_MultDiv(ISerializationContext context, MultDiv semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.MULT_DIV__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.MULT_DIV__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.MULT_DIV__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.MULT_DIV__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.MULT_DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.MULT_DIV__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultDivAccess().getMultDivLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultDivAccess().getOperatorOpMultDivParserRuleCall_1_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getMultDivAccess().getRightPrimaryParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Number
	 *     PlusMinus returns Number
	 *     PlusMinus.PlusMinus_1_0 returns Number
	 *     MultDiv returns Number
	 *     MultDiv.MultDiv_1_0 returns Number
	 *     Primary returns Number
	 *     Number returns Number
	 *
	 * Constraint:
	 *     value=INT
	 * </pre>
	 */
	protected void sequence_Number(ISerializationContext context, dk.sdu.mmmi.mdsd.math.Number semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.NUMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.NUMBER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OpMultDiv returns Div
	 *
	 * Constraint:
	 *     {Div}
	 * </pre>
	 */
	protected void sequence_OpMultDiv(ISerializationContext context, Div semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OpMultDiv returns Mult
	 *
	 * Constraint:
	 *     {Mult}
	 * </pre>
	 */
	protected void sequence_OpMultDiv(ISerializationContext context, Mult semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OpPlusMinus returns Minus
	 *
	 * Constraint:
	 *     {Minus}
	 * </pre>
	 */
	protected void sequence_OpPlusMinus(ISerializationContext context, Minus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OpPlusMinus returns Plus
	 *
	 * Constraint:
	 *     {Plus}
	 * </pre>
	 */
	protected void sequence_OpPlusMinus(ISerializationContext context, Plus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Parenthesis
	 *     PlusMinus returns Parenthesis
	 *     PlusMinus.PlusMinus_1_0 returns Parenthesis
	 *     MultDiv returns Parenthesis
	 *     MultDiv.MultDiv_1_0 returns Parenthesis
	 *     Primary returns Parenthesis
	 *     Parenthesis returns Parenthesis
	 *
	 * Constraint:
	 *     exp=Exp
	 * </pre>
	 */
	protected void sequence_Parenthesis(ISerializationContext context, Parenthesis semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.PARENTHESIS__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.PARENTHESIS__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns PlusMinus
	 *     PlusMinus returns PlusMinus
	 *     PlusMinus.PlusMinus_1_0 returns PlusMinus
	 *
	 * Constraint:
	 *     (left=PlusMinus_PlusMinus_1_0 operator=OpPlusMinus right=MultDiv)
	 * </pre>
	 */
	protected void sequence_PlusMinus(ISerializationContext context, PlusMinus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.PLUS_MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.PLUS_MINUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.PLUS_MINUS__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.PLUS_MINUS__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.PLUS_MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.PLUS_MINUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPlusMinusAccess().getPlusMinusLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPlusMinusAccess().getOperatorOpPlusMinusParserRuleCall_1_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getPlusMinusAccess().getRightMultDivParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns VariableUse
	 *     PlusMinus returns VariableUse
	 *     PlusMinus.PlusMinus_1_0 returns VariableUse
	 *     MultDiv returns VariableUse
	 *     MultDiv.MultDiv_1_0 returns VariableUse
	 *     Primary returns VariableUse
	 *     VariableUse returns VariableUse
	 *
	 * Constraint:
	 *     ref=[Declaration|ID]
	 * </pre>
	 */
	protected void sequence_VariableUse(ISerializationContext context, VariableUse semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.VARIABLE_USE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.VARIABLE_USE__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableUseAccess().getRefDeclarationIDTerminalRuleCall_1_0_1(), semanticObject.eGet(MathPackage.Literals.VARIABLE_USE__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Declaration returns Var
	 *     Variable returns Var
	 *
	 * Constraint:
	 *     (name=ID value=Exp)
	 * </pre>
	 */
	protected void sequence_Variable(ISerializationContext context, Var semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.DECLARATION__NAME));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.DECLARATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.DECLARATION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableAccess().getValueExpParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}
