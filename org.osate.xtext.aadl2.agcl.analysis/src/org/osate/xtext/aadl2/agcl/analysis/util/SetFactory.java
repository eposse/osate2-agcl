/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.util;

import java.util.Set;

/**
 * An abstract factory for sets.
 * 
 * <p> Typical use:
 * 
 * <pre>
 * {@code
 * Set s = SetFactory.getNewSet();
 * }
 * </pre>
 * 
 * <p> Subclasses provide concrete factory methods:
 * 
 * <pre>
 * {@code
 * class TreeSetFactory extends SetFactory {
 *   public Set createSet() {
 *     return new TreeSet();
 *   }
 * }
 * </pre>
 * 
 * <p>Then, the new factory could be used in two ways, either 
 * 
 * <pre>
 * {@code
 * Set s = TreeSetFactory.getNewSet();
 * }
 * </pre>
 * 
 * or
 * 
 * <pre>
 * {@code
 * SetFactory.setConcreteFactory(new TreeSetFactory());
 * // ...
 * Set s = SetFactory.getNewSet();   // client code
 * }
 * </pre>
 * 
 * <p> This later approach is useful to make the client code more abstract and independent of the particular set 
 * implementation, by separating the selection of a concrete factory implementation from the client code. The drawback
 * is that the client code doesn't provide a hint of which implementation is actually used. 
 * 
 * <p> Note: unfortunately this factory works only with the raw type {@code Set} and doesn't support generic sets due
 * to the fact that static members can't be generic in Java 1.7, as static members are shared between all instances
 * of the class, even across instances of the class with different type parameters.
 * 
 * @author Ernesto Posse
 *
 */
public abstract class SetFactory {
	
	private static SetFactory concreteSetFactory = new HashSetFactory();  // Default factory
	
	public static SetFactory getConcreteFactory() {
		return concreteSetFactory;
	}
	
	public static void setConcreteFactory(SetFactory factory) {
		concreteSetFactory = factory;
	}
	
	public static Set getNewSet() {
		return concreteSetFactory.createSet();
	}

	public abstract Set createSet();

}
