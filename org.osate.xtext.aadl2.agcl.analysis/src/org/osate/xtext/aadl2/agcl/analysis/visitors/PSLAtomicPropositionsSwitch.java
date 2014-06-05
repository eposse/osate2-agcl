/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.visitors;

import java.util.Set;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osate.xtext.aadl2.agcl.agcl.AtomicProp;
import org.osate.xtext.aadl2.agcl.analysis.util.SetFactory;

/**
 * This switch obtains the set of atomic propositions in a PSL expression.
 * 
 * @author Ernesto Posse
 *
 */
public class PSLAtomicPropositionsSwitch extends AgclProcessingSwitch<Set<AtomicProp>> {
	
	public class AtomicPropStructEqWrap {
		
		private AtomicProp wrapped;
		
		public AtomicPropStructEqWrap(AtomicProp ap) {
			wrapped = ap;
		}
		
		@Override
		public boolean equals(Object other) {
			AtomicPropStructEqWrap otherAP = (AtomicPropStructEqWrap) other;
			return EcoreUtil.equals(this.wrapped, otherAP.wrapped);
		}
		
		@Override
		public int hashCode() {
			// A bit of a hack: the test for equality when testing membership in a collection first compares
			// the hash codes of the objects in question, and only if they are the same, it will invoke the 
			// equals method. That allows the collections methods to discard non-members quickly.
			// However, computing the hash code of two structurally equal EObjects might not be trivial, and
			// I don't have a lot of time now to investigate a more elegant solution. Hence, by always returning
			// the same hash code for this wrapper object, we force the invocation of the equals method.
			return 1; 
		}
	}
	
	private Set<AtomicPropStructEqWrap> partialResults;
	
	public PSLAtomicPropositionsSwitch() {
		super();
		partialResults = SetFactory.getNewSet();
	}

	public Set<AtomicProp> caseAtomicProp(AtomicProp obj) {
		Set<AtomicProp> result = SetFactory.getNewSet();
		AtomicPropStructEqWrap wrappedAP = new AtomicPropStructEqWrap(obj);
		if (!partialResults.contains(wrappedAP)) {
			partialResults.add(wrappedAP);
			result.add(obj);
		}
		return result;
	}
}
