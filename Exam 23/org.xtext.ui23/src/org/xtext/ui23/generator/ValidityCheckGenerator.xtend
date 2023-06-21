package org.xtext.ui23.generator

import org.xtext.ui23.dsl.TypeConstant
import org.xtext.ui23.dsl.Form
import org.xtext.ui23.dsl.InputText
import org.xtext.ui23.dsl.FormUse
import org.eclipse.xtext.EcoreUtil2
import static extension org.xtext.ui23.generator.ExpressionGenerator.*

class ValidityCheckGenerator {
	def static generateValidityCheck(Form form) '''
		public boolean checkValidity(){
			«FOR input : EcoreUtil2.getAllContentsOfType(form, InputText)»
				«val type = EcoreUtil2.getAllContentsOfType(input, TypeConstant).get(0).type»
				«switch (type){
					case "string":
					validateString(input)
					case "number":
					validateNumber(input)
				}»
			«ENDFOR»
			«FOR formUse : EcoreUtil2.getAllContentsOfType(form, FormUse)»
				if(!«formUse.form.name.toFirstLower».checkValidity())
					return false;
			«ENDFOR»
			return true;
		}
	'''

	def static CharSequence validateString(InputText input) '''
		String «input.name» = this.«input.name»Component.getText();
		«IF !(input.exp instanceof TypeConstant)»
			if(!«input.exp.computeExp.toString.replace("String", input.name)»){
				return false;
			}
		«ENDIF»
	'''

	def static CharSequence validateNumber(InputText input) '''
		int «input.name» = 0;
		try {
			«input.name» = Integer.parseInt(this.«input.name»Component.getText());
			«IF !(input.exp instanceof TypeConstant)»
				if(!«input.exp.computeExp.toString.replace("int", input.name)»){
					return false;
				}
			«ENDIF»
		} catch (Exception ex) {
			return false;
		}
	'''
}
