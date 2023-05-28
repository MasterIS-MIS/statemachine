/*
 * generated by Xtext 2.25.0
 */
package lsi.us.es.mis.xtext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import lsi.us.es.mis.xtext.MyStateMachineRuntimeModule;
import lsi.us.es.mis.xtext.MyStateMachineStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class MyStateMachineIdeSetup extends MyStateMachineStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MyStateMachineRuntimeModule(), new MyStateMachineIdeModule()));
	}
	
}
