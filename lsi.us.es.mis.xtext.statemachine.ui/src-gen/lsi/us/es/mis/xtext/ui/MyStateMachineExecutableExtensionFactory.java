/*
 * generated by Xtext 2.30.0
 */
package lsi.us.es.mis.xtext.ui;

import com.google.inject.Injector;
import lsi.us.es.mis.xtext.statemachine.ui.internal.StatemachineActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyStateMachineExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(StatemachineActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		StatemachineActivator activator = StatemachineActivator.getInstance();
		return activator != null ? activator.getInjector(StatemachineActivator.LSI_US_ES_MIS_XTEXT_MYSTATEMACHINE) : null;
	}

}
