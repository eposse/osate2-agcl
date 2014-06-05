/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.util;

import org.eclipse.emf.ecore.EObject;

/**
 * Extends the Function interface to allow for functions that are applicable with respect to an EObject context.
 * 
 * @author Ernesto Posse
 *
 */
public interface EFunction<T,R> extends Function<T, R> {
	
	public R apply(EObject context, T arg);
}
