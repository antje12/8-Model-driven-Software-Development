/**
 * generated by Xtext 2.29.0
 */
package org.xtext.exam22.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.exam22.DslRuntimeModule;
import org.xtext.exam22.DslStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class DslIdeSetup extends DslStandaloneSetup {
  @Override
  public Injector createInjector() {
    DslRuntimeModule _dslRuntimeModule = new DslRuntimeModule();
    DslIdeModule _dslIdeModule = new DslIdeModule();
    return Guice.createInjector(Modules2.mixin(_dslRuntimeModule, _dslIdeModule));
  }
}
