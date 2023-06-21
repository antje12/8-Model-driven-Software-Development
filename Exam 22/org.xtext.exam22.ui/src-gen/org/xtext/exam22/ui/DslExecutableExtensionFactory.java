/*
 * generated by Xtext 2.29.0
 */
package org.xtext.exam22.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.exam22.ui.internal.Exam22Activator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(Exam22Activator.class);
	}
	
	@Override
	protected Injector getInjector() {
		Exam22Activator activator = Exam22Activator.getInstance();
		return activator != null ? activator.getInjector(Exam22Activator.ORG_XTEXT_EXAM22_DSL) : null;
	}

}
