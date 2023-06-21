/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.generator

import dk.sdu.mmmi.mdsd.math.Div
import dk.sdu.mmmi.mdsd.math.LetBinding
import dk.sdu.mmmi.mdsd.math.MathExp
import dk.sdu.mmmi.mdsd.math.MathNumber
import dk.sdu.mmmi.mdsd.math.Minus
import dk.sdu.mmmi.mdsd.math.Mult
import dk.sdu.mmmi.mdsd.math.Plus
import dk.sdu.mmmi.mdsd.math.VarBinding
import dk.sdu.mmmi.mdsd.math.VariableUse
import dk.sdu.mmmi.mdsd.math.Function
import dk.sdu.mmmi.mdsd.math.Parenthesis
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MathGenerator extends AbstractGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val math = resource.allContents.filter(MathExp).next
		fsa.generateFile('''/math_expression/«math.name.toFirstUpper».java''', generateJavaString(math))
	}
	
	def generateJavaString(MathExp math)'''
	package math_expression;
	public class «math.name» {
		
		«FOR variable: math.variables»
		public int «variable.name»;
		«ENDFOR»
		«IF !math.externals.empty»
		
		private External external;
		
		public «math.name»(External external) {
			this.external = external;
		}
		«ENDIF»
		
		public void compute() {
			«FOR variable: math.variables»
			this.«variable.name» = «variable.computeExpression(new HashMap())»;
			«ENDFOR»
		}
		«IF !math.externals.empty»
		
		public interface External {
			«FOR external: math.externals»
			«var i = 0»
			public int «external.name»(«FOR type : external.types SEPARATOR ','»«type» n«i++»«ENDFOR»);
			«ENDFOR»
		}
		«ENDIF»
		
	}
	'''
	
	def static dispatch CharSequence computeExpression(Function function, Map<String, CharSequence> local) {
		'''this.external.«function.function.name»(«FOR variable : function.variables SEPARATOR ','»«variable.computeExpression(local)»«ENDFOR»)'''
	}
	
	def static dispatch CharSequence computeExpression(VarBinding binding, Map<String, CharSequence> local) {
		'''«binding.expression.computeExpression(local)»'''
	}
	
	def static dispatch CharSequence computeExpression(MathNumber exp, Map<String, CharSequence> local) {
		'''«exp.value»'''
	}
	
	def static dispatch CharSequence computeExpression(Parenthesis exp, Map<String, CharSequence> local) {
		'''(«exp.content.computeExpression(local)»)'''
	}

	def static dispatch CharSequence computeExpression(Plus exp, Map<String, CharSequence> local) {
		'''«exp.left.computeExpression(local)» + «exp.right.computeExpression(local)»'''
	}
	
	def static dispatch CharSequence computeExpression(Minus exp, Map<String, CharSequence> local) {
		'''«exp.left.computeExpression(local)» - «exp.right.computeExpression(local)»'''
	}
	
	def static dispatch CharSequence computeExpression(Mult exp, Map<String, CharSequence> local) {
		'''«exp.left.computeExpression(local)» * «exp.right.computeExpression(local)»'''
	}
	
	def static dispatch CharSequence computeExpression(Div exp, Map<String, CharSequence> local) {
		'''«exp.left.computeExpression(local)» / «exp.right.computeExpression(local)»'''
	}

	def static dispatch CharSequence computeExpression(LetBinding exp, Map<String, CharSequence> local) {		
		var layer = new HashMap<String, CharSequence>(local)
		layer.put(exp.name, exp.binding.computeExpression(local))
		'''«exp.body.computeExpression(layer)»'''
	}
	
	def static dispatch CharSequence computeExpression(VariableUse exp, Map<String, CharSequence> local) {
		if (local.containsKey(exp.ref.name)){
			'''(«local.get(exp.ref.name)»)'''
		}
		else{
			'''«exp.ref.name»'''
		}
	}
}