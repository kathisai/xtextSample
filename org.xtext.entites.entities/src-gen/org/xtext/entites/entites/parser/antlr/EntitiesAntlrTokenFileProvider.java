/*
 * generated by Xtext 2.12.0
 */
package org.xtext.entites.entites.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class EntitiesAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/entites/entites/parser/antlr/internal/InternalEntities.tokens");
	}
}
