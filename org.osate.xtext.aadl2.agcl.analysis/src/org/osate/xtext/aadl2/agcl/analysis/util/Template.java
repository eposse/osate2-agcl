/**
 * @author Ernesto Posse
 */
package org.osate.xtext.aadl2.agcl.analysis.util;

import java.util.Map;

/**
 * A minimal template substitution class. Templates have meta-variables of the form ${name}, and these
 * are substituted by strings according to a given {@code Map<String,Object>}.
 * 
 * @author Ernesto Posse
 *
 */
public class Template {
	
	private static final int MAX_VAR_LENGTH = 255;
	
	private char[] pattern;
	private int length;

	public Template(String pattern) {
		this.pattern = pattern.toCharArray();
		this.length = pattern.length();
	}
	
	public String getPattern() {
		return new String(pattern);
	}
	
	/**
	 * Substitutes all template variables by their String value as defined in the given substitution map.
	 * @param substitution A map associating template variables with objects whose string representation is 
	 * 			to replace the corresponding variable
	 * @return The template pattern with all the variables replaced according to the given substitution map. 
	 * @throws NullPointerException is a variable used in the pattern is undefined in the substitution map.
	 */
	public String substitute(Map<String, Object> substitution) {
		StringBuilder result = new StringBuilder();
		char[] currentVar = new char[MAX_VAR_LENGTH];
		char c;
		int i, j;
		i = 0;
		while (i < length) {
			c = pattern[i];
			if (c == '$' && pattern[i+1] == '{')  {
				i += 2;
				j = 0;
				while (i < length && j < MAX_VAR_LENGTH) {
					c = pattern[i];
					i++;
					if (c == '}') {
						String key = new String(currentVar,0,j);
						Object value = substitution.get(key);
						String replacement = value.toString();
						result.append(replacement);
						break;
					}
					currentVar[j] = c;
					j++;
				}
			}
			else {
				result.append(c);
				i++;
			}
		}
		return result.toString();
	}

}
