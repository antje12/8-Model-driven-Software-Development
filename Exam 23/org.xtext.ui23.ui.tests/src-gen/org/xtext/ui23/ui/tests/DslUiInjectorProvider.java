/*
 * generated by Xtext 2.29.0
 */
package org.xtext.ui23.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.ui23.ui.internal.Ui23Activator;

public class DslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return Ui23Activator.getInstance().getInjector("org.xtext.ui23.Dsl");
	}

}
