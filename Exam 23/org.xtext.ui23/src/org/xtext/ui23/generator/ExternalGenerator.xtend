package org.xtext.ui23.generator

import org.xtext.ui23.dsl.UI23
import static extension org.xtext.ui23.generator.Extensions.*

class ExternalGenerator {
	def static generateExternal(String pkg, UI23 model) '''
		package user_interface.«pkg»;
		
		public interface External {
			«var i = 0»
			«FOR function : model.functions»
				public «function.returnType.javaName» «function.name»(«FOR type : function.types SEPARATOR ', '»«type.javaName» param«i++»«ENDFOR»);
			«ENDFOR»
		}
	'''
}
