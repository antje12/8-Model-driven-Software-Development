/*
 * generated by Xtext 2.29.0
 */
package org.xtext.example.mydsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class MyDslStandaloneSetup extends MyDslStandaloneSetupGenerated {

	def static void doSetup() {
		new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
