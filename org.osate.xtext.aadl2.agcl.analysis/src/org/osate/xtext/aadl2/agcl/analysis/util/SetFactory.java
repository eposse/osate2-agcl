/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.util;

import java.util.HashSet;
import java.util.Set;

/**
 * @author eposse
 *
 */
public class SetFactory {
	
	private static Set instance;
	
	public static void setInstance(Set set) {
		instance = set;
	}
	
	public static Set getInstance() {
		if (instance == null) {
			return new HashSet();
		}
		return instance;
	}

}
