/*
 * generated by Xtext 2.12.0
 */
package org.xtext.entites.entites.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.entites.entities.ui.internal.EntitiesActivator;

public class EntitiesUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return EntitiesActivator.getInstance().getInjector("org.xtext.entites.entites.Entities");
	}

}
