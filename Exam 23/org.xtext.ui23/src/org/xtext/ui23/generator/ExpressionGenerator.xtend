package org.xtext.ui23.generator

import org.xtext.ui23.dsl.Boolean
import org.xtext.ui23.dsl.Equal
import org.xtext.ui23.dsl.StringConstant
import org.xtext.ui23.dsl.Compare
import org.xtext.ui23.dsl.Concat
import org.xtext.ui23.dsl.PlusMinus
import org.xtext.ui23.dsl.MultDiv
import org.xtext.ui23.dsl.IntConstant
import org.xtext.ui23.dsl.Not
import org.xtext.ui23.dsl.Length
import org.xtext.ui23.dsl.TypeConstant
import org.xtext.ui23.dsl.VarRef
import org.xtext.ui23.dsl.FuncCall
import org.xtext.ui23.dsl.Parenthesis
import static extension org.xtext.ui23.generator.Extensions.*

class ExpressionGenerator {
	def static dispatch CharSequence computeExp(Boolean bool) '''
	(«bool.left.computeExp» «bool.op» «bool.right.computeExp»)'''

	def static dispatch CharSequence computeExp(Equal equal) {
		switch (equal.op) {
			case "==": '''(«equal.left.computeExp»).equals(«equal.right.computeExp»)'''
			case "!=": '''!(«equal.left.computeExp»).equals(«equal.right.computeExp»)'''
		}
	}

	def static dispatch CharSequence computeExp(Compare compare) '''
	(«compare.left.computeExp» «compare.op» «compare.right.computeExp»)'''

	def static dispatch CharSequence computeExp(Concat concat) '''
	(«concat.left.computeExp» + «concat.right.computeExp»)'''

	def static dispatch CharSequence computeExp(PlusMinus plusMinus) '''
	(«plusMinus.left.computeExp» «plusMinus.op» «plusMinus.right.computeExp»)'''

	def static dispatch CharSequence computeExp(MultDiv multDiv) '''
	(«multDiv.left.computeExp» «multDiv.op» «multDiv.right.computeExp»)'''

	def static dispatch CharSequence computeExp(IntConstant primitive) '''
	«primitive.value»'''

	def static dispatch CharSequence computeExp(StringConstant primitive) '''
	"«primitive.value»"'''

	def static dispatch CharSequence computeExp(Not primitive) '''
	!(«primitive.exp.computeExp»)'''

	def static dispatch CharSequence computeExp(Length primitive) '''
	«primitive.exp.computeExp».length()'''

	def static dispatch CharSequence computeExp(TypeConstant primitive) '''
	«primitive.type.javaName»'''

	def static dispatch CharSequence computeExp(VarRef primitive) '''
	«primitive.ref.name»'''

	def static dispatch CharSequence computeExp(FuncCall primitive) '''
	external.«primitive.ref.name»(«FOR exp : primitive.exps SEPARATOR ', '»«exp.computeExp()»«ENDFOR»)'''

	def static dispatch CharSequence computeExp(Parenthesis primitive) '''		
	(«primitive.exp.computeExp»)'''
}
