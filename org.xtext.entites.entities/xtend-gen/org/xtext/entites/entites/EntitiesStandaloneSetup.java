/**
 * generated by Xtext 2.12.0
 */
package org.xtext.entites.entites;

import org.xtext.entites.entites.EntitiesStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class EntitiesStandaloneSetup extends EntitiesStandaloneSetupGenerated {
  public static void doSetup() {
    new EntitiesStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
