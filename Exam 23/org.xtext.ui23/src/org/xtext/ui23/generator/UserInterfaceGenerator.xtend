package org.xtext.ui23.generator

import org.xtext.ui23.dsl.UI23
import org.xtext.ui23.dsl.Form

class UserInterfaceGenerator {
	def static generateUserInterface(String pkg, UI23 model, Form form) '''
		package user_interface.«pkg»;
					
		import javax.swing.*;
		
		public class UserInterface{
			public JFrame frame;
		
			«IF !model.functions.empty»
				External external;
				public UserInterface(External external){
					this.external = external;
				}
			«ENDIF»
			public void open() {
				frame = new JFrame("«model.name»");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				«form.name»Form form = new «form.name»Form(this«!model.functions.empty ? ", external" : ""»);
				frame.add(form.createPanel());
				frame.pack();
				frame.setVisible(true);
			}
		}
	'''
}
