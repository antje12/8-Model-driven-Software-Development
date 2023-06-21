package org.xtext.ui23.generator

class Extensions {
	def static String javaName(String type) {
		switch (type) {
			// case "boolean": '''boolean'''
			case "string": "String"
			case "number": "int"
			default: type
		}
	}
}
