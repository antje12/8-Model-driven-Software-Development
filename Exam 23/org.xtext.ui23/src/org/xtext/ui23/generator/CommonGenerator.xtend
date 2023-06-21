package org.xtext.ui23.generator

class CommonGenerator {
	def static generateCommon() '''
		package user_interface.common;
		
		import javax.swing.*;
		
		public abstract class Form{
			public abstract boolean checkValidity();
			public abstract JPanel createPanel();
		}
	'''
}
