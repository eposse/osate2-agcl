/**
 * Copyright (c) 2014 Ernesto Posse
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 * @author Ernesto Posse
 * @version 0.1 
 */
package org.osate.xtext.aadl2.agcl.analysis.visitors.concrete;

import java.util.Set;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osate.xtext.aadl2.agcl.agcl.AtomicProposition;
import org.osate.xtext.aadl2.agcl.analysis.util.SetFactory;
import org.osate.xtext.aadl2.agcl.analysis.visitors.AgclProcessingSwitch;

/**
 * This switch obtains the set of atomic propositions in a PSL expression.
 * 
 * @author Ernesto Posse
 *
 */
public class PSLAtomicPropositionsSwitch extends AgclProcessingSwitch<Set<AtomicProposition>> {
	
	public class AtomicPropStructEqWrap {
		
		private AtomicProposition wrapped;
		
		public AtomicPropStructEqWrap(AtomicProposition ap) {
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

	@Override
	public Set<AtomicProposition> caseAtomicProposition(AtomicProposition obj) {
		Set<AtomicProposition> result = SetFactory.getNewSet();
		AtomicPropStructEqWrap wrappedAP = new AtomicPropStructEqWrap(obj);
		if (!partialResults.contains(wrappedAP)) {
			partialResults.add(wrappedAP);
			result.add(obj);
		}
		return result;
	}
}
