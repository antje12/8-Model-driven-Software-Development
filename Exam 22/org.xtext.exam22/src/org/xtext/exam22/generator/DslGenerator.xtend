/*
 * generated by Xtext 2.29.0
 */
package org.xtext.exam22.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.exam22.dsl.Model
import org.xtext.exam22.dsl.Scenario
import org.xtext.exam22.dsl.Announce
import org.xtext.exam22.dsl.Question
import org.xtext.exam22.dsl.End
import org.xtext.exam22.dsl.Boolean
import org.xtext.exam22.dsl.Equal
import org.xtext.exam22.dsl.Compare
import org.xtext.exam22.dsl.Concat
import org.xtext.exam22.dsl.PlusMinus
import org.xtext.exam22.dsl.MultDiv
import org.xtext.exam22.dsl.IntConstant
import org.xtext.exam22.dsl.StringConstant
import org.xtext.exam22.dsl.BoolConstant
import org.xtext.exam22.dsl.Not
import org.xtext.exam22.dsl.TypeConstant
import org.xtext.exam22.dsl.This
import org.xtext.exam22.dsl.VarRef
import org.xtext.exam22.dsl.FuncCall
import org.xtext.exam22.dsl.Parenthesis
import org.xtext.exam22.dsl.Target
import org.eclipse.emf.common.util.EList
import org.xtext.exam22.dsl.Function
import java.util.ArrayList

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = resource.allContents.filter(Model).next

		val name = model.name;
		val names = name.split("(?=[A-Z])");
		val folder = String.join("_", names).toLowerCase;

		// generate common
		fsa.generateFile('''/interactive_fiction/common/Scenario.java''', generateCommon())

		// generate game
		val init = model.scenarios.get(0);
		val externals = !model.functions.empty;
		fsa.generateFile('''/interactive_fiction/«folder»/Game.java''', generateGame(folder, init, externals))

		// generate external
		if (externals) {
			fsa.generateFile('''/interactive_fiction/«folder»/External.java''', generateExternal(folder, model))
		}

		// generate scenarios
		for (scenario : model.scenarios) {
			fsa.generateFile('''/interactive_fiction/«folder»/Scenario«scenario.name».java''',
				generateScenario(folder, model, scenario))
		}
	}

	def generateScenario(String folder, Model model, Scenario scenario) '''
		package interactive_fiction.«folder»;
		
		import java.io.IOException;
		import interactive_fiction.common.*;
		
		class Scenario«scenario.name» extends Scenario {
			«FOR variable : scenario.variables»
				«variable.type.javaName» «variable.name»;
			«ENDFOR»
			«FOR statement : scenario.statements»
				«IF statement instanceof Question»
					«IF statement.output instanceof Compare»
						«(statement.output as Compare).left.computeExpression» __«statement.name»;
					«ELSEIF statement.output instanceof FuncCall && (statement.output as FuncCall).ref instanceof Function»
						«((statement.output as FuncCall).ref as Function).types.get(0).javaName» __«statement.name»;
					«ELSE»
						«statement.output.computeExpression» __«statement.name»;
					«ENDIF»
				«ENDIF»
			«ENDFOR»
			
			«IF !model.functions.empty || !scenario.parameters.empty»
				«val params = new ArrayList<String>()»
				«FOR parameter : scenario.parameters»
					«val t = params.add(parameter.type.javaName + " " + parameter.name)»
					«parameter.type.javaName + " " + parameter.name»;
				«ENDFOR»
				«IF !model.functions.empty»
					«val t = params.add("External external")»
					External external;
				«ENDIF»
				
				Scenario«scenario.name»(«String.join(",", params)») {
					«FOR parameter : scenario.parameters»
						this.«parameter.name» = «parameter.name»;
					«ENDFOR»
					«IF !model.functions.empty»
						this.external = external;
					«ENDIF»
				}
			«ENDIF»
			
			public String interact() throws IOException {
				nextInteraction = "«scenario.statements.get(0).name»";
				while(true){
					switch(nextInteraction){
						«FOR statement : scenario.statements»
							«statement.computeStatement(model)»
						«ENDFOR»
						
					}
				}
			}
		}
	'''

	def static dispatch CharSequence computeStatement(Announce announce, Model model) {
		'''
			case "«announce.name»":
				System.out.println(«announce.expression.computeExpression»);
				«targets("", announce.targets, model)»
		'''
	}

	def static dispatch CharSequence computeStatement(Question question, Model model) {
		'''
			case "«question.name»":
				System.out.println(«question.expression.computeExpression»);
				«IF question.output.computeExpression.toString.contains("int")»
					try {
						__«question.name» = Integer.parseInt(br.readLine());
						«IF question.variable !== null»
							«question.variable.name» = __«question.name»;
						«ENDIF»
						«IF question.output instanceof Compare»
							if(!«question.output.computeExpression.toString.replace("int", "__"+question.name)»){
								break;
							}
						«ENDIF»
						«targets("__"+question.name, question.targets, model)»
					} catch (Exception ex) {
						break;
					}
				«ELSE»
					__«question.name» = br.readLine();
					«IF question.variable !== null»
						«question.variable.name» = __«question.name»;
					«ENDIF»
					«IF question.output instanceof FuncCall && (question.output as FuncCall).ref instanceof Function»
						if(!«question.output.computeExpression.toString.replace(((question.output as FuncCall).ref as Function).types.get(0).javaName, "__"+question.name)»){
							break;
						}
					«ENDIF»
					«targets("__"+question.name, question.targets, model)»
				«ENDIF»
		'''
	}

	def static CharSequence targets(String thisVar, EList<Target> targets, Model model) {
		'''
			«FOR target : targets»
				«IF target.condition !== null»
					if(«target.condition.computeExpression.toString.replace("this", thisVar)»){
				«ENDIF»
				«IF !target.endingTargets.empty»
						«val params = new ArrayList<String>()»
						«FOR parameter : target.expressions»
							«val t = params.add(parameter.computeExpression.toString.replace("this", thisVar))»
						«ENDFOR»
						«IF !model.functions.empty»
							«val t = params.add("external")»
						«ENDIF»
						calledScenarioEnd = new Scenario«target.to.name»(«String.join(",", params)»).interact();
						«FOR endingTarget : target.endingTargets»
							if(calledScenarioEnd.equals("«endingTarget.end.name»")){
								nextInteraction = "«endingTarget.target.to.name»";
								break;
							}
						«ENDFOR»
				«ELSE»
					nextInteraction = "«target.to.name»";
					break;
				«ENDIF»
				«IF target.condition !== null»
					}
				«ENDIF»
			«ENDFOR»
		'''
	}

	def static dispatch CharSequence computeStatement(End end, Model model) {
		'''
			case "«end.name»":
				«IF end.expression !== null »
					System.out.println(«end.expression.computeExpression»);
				«ENDIF»
				return "«end.name»";
		'''
	}

	def static dispatch CharSequence computeExpression(Boolean bool) {
		'''
		(«bool.left.computeExpression» «bool.op» «bool.right.computeExpression»)'''
	}

	def static dispatch CharSequence computeExpression(Equal equal) {
		if (equal.left instanceof StringConstant || equal.right instanceof StringConstant) {
			switch (equal.op) {
				case "==": '''(«equal.left.computeExpression»).equals(«equal.right.computeExpression»)'''
				case "!=": '''!(«equal.left.computeExpression»).equals(«equal.right.computeExpression»)'''
				default: ''''''
			}
		} else {
			'''(«equal.left.computeExpression» «equal.op» «equal.right.computeExpression»)'''
		}
	}

	def static dispatch CharSequence computeExpression(Compare compare) {
		'''
		(«compare.left.computeExpression» «compare.op» «compare.right.computeExpression»)'''
	}

	def static dispatch CharSequence computeExpression(Concat concat) {
		'''
		(«concat.left.computeExpression» + «concat.right.computeExpression»)'''
	}

	def static dispatch CharSequence computeExpression(PlusMinus plusMinus) {
		'''
		(«plusMinus.left.computeExpression» «plusMinus.op» «plusMinus.right.computeExpression»)'''
	}

	def static dispatch CharSequence computeExpression(MultDiv multDiv) {
		'''
		(«multDiv.left.computeExpression» «multDiv.op» «multDiv.right.computeExpression»)'''
	}

	def static dispatch CharSequence computeExpression(IntConstant primitive) {
		'''
		«primitive.value»'''
	}

	def static dispatch CharSequence computeExpression(StringConstant primitive) {
		'''
		"«primitive.value»"'''
	}

	def static dispatch CharSequence computeExpression(BoolConstant primitive) {
		'''
		«primitive.value»'''
	}

	def static dispatch CharSequence computeExpression(Not primitive) {
		'''
		!(«primitive.exp.computeExpression»)'''
	}

	def static dispatch CharSequence computeExpression(TypeConstant primitive) {
		'''
		«primitive.type.javaName»'''
	}

	def static dispatch CharSequence computeExpression(This primitive) {
		'''
		this'''
	}

	def static dispatch CharSequence computeExpression(VarRef primitive) {
		'''
		«primitive.ref.name»'''
	}

	def static dispatch CharSequence computeExpression(FuncCall primitive) {
		'''
		external.«primitive.ref.name»(«FOR expression : primitive.expressions SEPARATOR ','»«expression.computeExpression()»«ENDFOR»)'''
	}

	def static dispatch CharSequence computeExpression(Parenthesis primitive) {
		'''		
		(«primitive.exp.computeExpression»)'''
	}

	def generateExternal(String folder, Model model) '''
		package interactive_fiction.«folder»;
		
		public interface External {
			«var i = 0»
			«FOR function : model.functions»
				public «function.returnType.javaName» «function.name»(«FOR type : function.types SEPARATOR ','»«type.javaName» param«i++»«ENDFOR»);
			«ENDFOR»
		}
		
	'''

	def static String javaName(String type) {
		switch (type) {
			// case "boolean": '''boolean'''
			case "text": "String"
			case "number": "int"
			default: type
		}
	}

	def generateGame(String folder, Scenario scenario, boolean external) '''
		package interactive_fiction.«folder»;
		
		import java.io.IOException;
		import interactive_fiction.common.*;
		
		public class Game{
			public Scenario start;
			
			public Game(«external ? "External external" : ""»){
				this.start = new Scenario«scenario.name»(«external ? "external" : ""»);
			}
			
			public void play()  throws IOException {
				start.interact();
			}
		}
	'''

	def generateCommon() '''
		package interactive_fiction.common;
		
		import java.io.BufferedReader;
		import java.io.InputStreamReader;
		import java.io.IOException;
		
		public abstract class Scenario {
			protected static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			protected String nextInteraction;
			protected String calledScenarioEnd;
			
			public abstract String interact() throws IOException ;
			
			public static void changeInput(InputStreamReader streamReader) {
				br = new BufferedReader(streamReader);
			}
		}
	'''
}
