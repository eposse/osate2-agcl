/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.util;

/**
 * First-class functions. This will be unnecessary for Java 1.8, but in the meantime we must have it.
 * 
 * @author Ernesto Posse
 *
 */
public interface Function<T, R> {
	public R apply(T x);
}
