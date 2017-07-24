/*
 * generated by Xtext 2.12.0
 */
package org.xtext.entites.entites.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.entites.entities.ui.internal.EntitiesActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class EntitiesExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return EntitiesActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return EntitiesActivator.getInstance().getInjector(EntitiesActivator.ORG_XTEXT_ENTITES_ENTITES_ENTITIES);
	}
	
}