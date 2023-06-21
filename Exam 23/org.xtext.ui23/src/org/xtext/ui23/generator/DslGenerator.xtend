/*
 * generated by Xtext 2.29.0
 */
package org.xtext.ui23.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.ui23.dsl.UI23
import static extension org.xtext.ui23.generator.CommonGenerator.*
import static extension org.xtext.ui23.generator.UserInterfaceGenerator.*
import static extension org.xtext.ui23.generator.ExternalGenerator.*
import static extension org.xtext.ui23.generator.FormGenerator.*

class DslGenerator extends AbstractGenerator {
	
	public static var panelCreate = 0;
	public static var panelCall = 0;
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = resource.allContents.filter(UI23).next

		val name = model.name;
		val names = name.split("(?=[A-Z])");
		val pkg = String.join("_", names).toLowerCase;

		// generate Common
		fsa.generateFile('''/user_interface/common/Form.java''', 
			generateCommon())

		// generate UserInterface
		val init = model.forms.get(0);
		fsa.generateFile('''/user_interface/«pkg»/UserInterface.java''',
			generateUserInterface(pkg, model, init))

		// generate External
		if (!model.functions.empty)
			fsa.generateFile('''/user_interface/«pkg»/External.java''', 
				generateExternal(pkg, model))

		// generate Forms
		panelCreate = 0;
		panelCall = 0;
		for (form : model.forms) {
			fsa.generateFile('''/user_interface/«pkg»/«form.name»Form.java''',
				generateForm(pkg, model, form))
		}
	}
}
