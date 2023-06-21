/*
 * generated by Xtext 2.29.0
 */
package org.xtext.exam22.validation

import org.eclipse.xtext.validation.Check
import org.xtext.exam22.dsl.Scenario
import org.xtext.exam22.dsl.Model
import org.xtext.exam22.dsl.DslPackage
import org.xtext.exam22.dsl.Function
import org.xtext.exam22.dsl.Statement
import org.xtext.exam22.dsl.End
import org.xtext.exam22.dsl.Question
import org.xtext.exam22.dsl.TypeConstant
import org.xtext.exam22.dsl.This
import org.eclipse.xtext.EcoreUtil2
import org.xtext.exam22.dsl.Target
import org.xtext.exam22.dsl.FuncCall
import org.xtext.exam22.dsl.VarRef
import org.xtext.exam22.dsl.DslPackage.Literals
import org.xtext.exam22.dsl.VariableDef
import org.xtext.exam22.dsl.Parameter
import org.xtext.exam22.dsl.Exp
import org.xtext.exam22.dsl.PlusMinus
import org.xtext.exam22.dsl.MultDiv
import org.eclipse.emf.ecore.EObject

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class DslValidator extends AbstractDslValidator {

	public static final String SCENARIO_UNIQUE = 'scenario_unique'
	public static final String FUNCTION_UNIQUE = 'function_unique'
	public static final String STATEMENT_UNIQUE = 'statement_unique'
	public static final String SCENARIO_END = 'scenario_end'
	public static final String VALID_INPUT = 'valid_input'
	public static final String VALID_THIS = 'valid_this'
	public static final String VALID_VARIABLE = 'valid_variable'

	@Check
	def void uniqueScenarioName(Scenario scenario) {
		if ((scenario.eContainer as Model).scenarios.filter[name == scenario.name].size > 1) {
			val error = String.format("The scenario name must be unique")
			error(error, DslPackage.eINSTANCE.crossRef_Name, SCENARIO_UNIQUE)
		}
	}

	@Check
	def void uniqueFunctionName(Function function) {
		if ((function.eContainer as Model).functions.filter[name == function.name].size > 1) {
			val error = String.format("The function name must be unique")
			error(error, DslPackage.eINSTANCE.crossRef_Name, FUNCTION_UNIQUE)
		}
	}

	@Check
	def void uniqueStatementName(Statement statement) {
		if ((statement.eContainer as Scenario).statements.filter[name == statement.name].size > 1) {
			val error = String.format("The statement name must be unique")
			error(error, DslPackage.eINSTANCE.crossRef_Name, FUNCTION_UNIQUE)
		}
	}

	@Check
	def void scenarioEnd(Scenario scenario) {
		if (!(scenario.statements.filter[it instanceof End].size > 0)) {
			val error = String.format("The statement must have an end")
			error(error, DslPackage.eINSTANCE.scenario_Statements, SCENARIO_END)
		}
	}

	@Check
	def void validInput(Question question) {

		if (!(question.output instanceof TypeConstant) && question.output.eAllContents.filter [
			it instanceof TypeConstant
		].size != 1) {
			val error = String.format("The input is not valid")
			error(error, DslPackage.eINSTANCE.question_Output, VALID_INPUT)
		}
	}

	@Check
	def funcCallArguments(FuncCall funcCall) {
		for (var i = 0; i < funcCall.expressions.size; i++) {
			val input = funcCall.expressions.get(i)
			val type = getType(funcCall, input)
			if (type != funcCall.ref.types.get(i)) {
				error(
					"Wrong function argument",
					Literals.FUNC_CALL__EXPRESSIONS,
					i // error shown at argument at index i
					// so if the error was because of the second argument, this is shown
				)
				return
			}
		}
	}

	def String getType(EObject current, Exp input) {
		return input instanceof TypeConstant
			? input.type 
			: input instanceof VarRef
			? (input.ref instanceof VariableDef ? (input.ref as VariableDef).type : input.
			ref instanceof Parameter ? (input.ref as Parameter).type : null)
			: input instanceof This
			? (EcoreUtil2.getContainerOfType(current, Question).output.eAllContents.findFirst [
			it instanceof TypeConstant
		] as TypeConstant).type
			: input instanceof FuncCall
			? input.ref.returnType
			: input instanceof PlusMinus
			? getType(current, input.left) : input instanceof MultDiv
			? getType(current, input.left)
			: null
	}

	@Check
	def scenarioCallArguments(Target target) {
		if (target.to instanceof Scenario && !target.expressions.empty) {
			for (var i = 0; i < target.expressions.size; i++) {
				val input = target.expressions.get(i)
				val type = getType(target, input)
				if (type != (target.to as Scenario).parameters.get(i).type) {
					error(
						"Wrong scenario argument",
						Literals.TARGET__EXPRESSIONS,
						i // error shown at argument at index i
						// so if the error was because of the second argument, this is shown
					)
					return
				}
			}
		}
	}

	//@Check
	//def void validVariable(Question question) {
	//	if (question.variable !== null) {
	//		val type = getType(question, question.output)
	//		if (type != question.variable.type) {
	//			val error = String.format("The variable is not of valid type")
	//			error(error, DslPackage.eINSTANCE.question_Variable, VALID_VARIABLE)
	//		}
	//	}
	//}
}
