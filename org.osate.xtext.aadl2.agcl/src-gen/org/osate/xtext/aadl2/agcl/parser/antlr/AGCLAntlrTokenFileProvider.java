/*
* generated by Xtext
*/
package org.osate.xtext.aadl2.agcl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AGCLAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/osate/xtext/aadl2/agcl/parser/antlr/internal/InternalAGCL.tokens");
	}
}
