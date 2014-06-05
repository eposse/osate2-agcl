/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.util;

import java.util.Set;
import java.util.TreeSet;

/**
 * Concrete set factory that provides sets implemented as {@code TreeSet} (red-black tree)
 * 
 * @author Ernesto Posse
 *
 */
public class TreeSetFactory extends SetFactory {

	/* (non-Javadoc)
	 * @see org.osate.xtext.aadl2.agcl.analysis.util.SetFactory#createSet()
	 */
	@Override
	public Set createSet() {
		return new TreeSet();
	}

}
