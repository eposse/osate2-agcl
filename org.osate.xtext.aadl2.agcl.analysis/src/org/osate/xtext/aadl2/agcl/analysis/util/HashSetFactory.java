/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.util;

import java.util.HashSet;
import java.util.Set;

/**
 * Concrete set factory that provides sets implemented as {@code HashSet}
 * 
 * @author Ernesto Posse
 *
 */
public class HashSetFactory extends SetFactory {

	@Override
	public Set createSet() {
		return new HashSet();
	}

}
