package org.xtext.ui23.generator

import org.xtext.ui23.dsl.UI23
import org.xtext.ui23.dsl.Form
import org.xtext.ui23.dsl.Layout
import org.xtext.ui23.dsl.Label
import org.xtext.ui23.dsl.InputText
import org.xtext.ui23.dsl.Button
import org.xtext.ui23.dsl.FormUse
import org.eclipse.xtext.EcoreUtil2
import static extension org.xtext.ui23.generator.Extensions.*
import static extension org.xtext.ui23.generator.ExpressionGenerator.*
import static extension org.xtext.ui23.generator.ValidityCheckGenerator.*

class FormGenerator {
	
	def static generateForm(String pkg, UI23 model, Form form) {
		DslGenerator.panelCall += 1;
		'''
			package user_interface.«pkg»;
					
			import javax.swing.*;
			import java.awt.event.*;
			import user_interface.common.*;
			
			public class «form.name»Form extends Form{
				
				«FOR input : EcoreUtil2.getAllContentsOfType(form, InputText)»
				public JTextField «input.name»Component;
				«ENDFOR»
				«FOR button : EcoreUtil2.getAllContentsOfType(form, Button)»
				public JButton «button.name»Component;
				«ENDFOR»
				«FOR formUse : EcoreUtil2.getAllContentsOfType(form, FormUse)»
				Form «formUse.form.name.toFirstLower»;
				«ENDFOR»
				UserInterface parent;
				«IF !model.functions.empty»
				External external;
				«ENDIF»
				«FOR param : form.parameters»
				«param.type.javaName» «param.name»;
				«ENDFOR»
				
				«form.name»Form(UserInterface parent«!model.functions.empty ? ", External external" : ""»«IF !form.parameters.empty», «FOR param : form.parameters SEPARATOR ', '»«param.type.javaName» «param.name»«ENDFOR»«ENDIF») {
					this.parent = parent;
					«IF !model.functions.empty»
					this.external = external;
					«ENDIF»
					«FOR input : EcoreUtil2.getAllContentsOfType(form, InputText)»
					«input.name»Component = new JTextField();
					«ENDFOR»
					«FOR button : EcoreUtil2.getAllContentsOfType(form, Button)»
					«button.name»Component = new JButton(«button.exp.computeExp»);
					«ENDFOR»
					«FOR param : form.parameters»
					this.«param.name» = «param.name»;
					«ENDFOR»
				}
			
				public JPanel createPanel(){
					return createPanel«DslGenerator.panelCall»();
				}
				
				«FOR layout : EcoreUtil2.getAllContentsOfType(form, Layout)»
					«layout.generateLayout(model)»
				«ENDFOR»
			
				«generateValidityCheck(form)»
			}
		'''
	}

	def static CharSequence generateLayout(Layout layout, UI23 model) {
		DslGenerator.panelCreate += 1;
		'''
			public JPanel createPanel«DslGenerator.panelCreate»() {
				JPanel panel = new JPanel();
				panel.setLayout(new BoxLayout(panel, «layout.axis == "row" ? "BoxLayout.X_AXIS" : "BoxLayout.Y_AXIS"»));
				«FOR component : layout.components»
					«component.computeComponent(model)»
				«ENDFOR»
				return panel;
			}
		'''
	}

	def static dispatch CharSequence computeComponent(Layout layout, UI23 model) {
		DslGenerator.panelCall += 1;
		'''
			panel.add(createPanel«DslGenerator.panelCall»());
		'''
	}

	def static dispatch CharSequence computeComponent(Label label, UI23 model) '''
	panel.add(new JLabel(«label.exp.computeExp»));'''

	def static dispatch CharSequence computeComponent(InputText inputText, UI23 model) '''
	panel.add(«inputText.name»Component);'''

	def static dispatch CharSequence computeComponent(Button button, UI23 model) '''
		panel.add(«button.name»Component);
		«IF button.validate !== null»
			«button.name»Component.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(checkValidity()){
						JOptionPane.showMessageDialog(
							parent.frame, 
							"Data has been saved");
					}
					else {
						JOptionPane.showMessageDialog(
							parent.frame, 
							"Validation Error", 
							"Error",
							JOptionPane.ERROR_MESSAGE);
					}
				}
			});
		«ENDIF»
	'''

	def static dispatch CharSequence computeComponent(FormUse formUse, UI23 model) '''
		«formUse.form.name.toFirstLower» = new «formUse.form.name»Form(parent«!model.functions.empty ? ", external" : ""»«IF !formUse.exps.empty», «FOR exp : formUse.exps SEPARATOR ', '»«exp.computeExp»«ENDFOR»«ENDIF»);
		panel.add(«formUse.form.name.toFirstLower».createPanel());
	'''
}
