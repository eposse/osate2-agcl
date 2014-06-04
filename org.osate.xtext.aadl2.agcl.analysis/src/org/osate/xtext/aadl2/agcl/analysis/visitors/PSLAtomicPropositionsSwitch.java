/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.visitors;

import java.util.Set;

import org.osate.xtext.aadl2.agcl.agcl.AtomicProp;
import org.osate.xtext.aadl2.agcl.agcl.util.AgclSwitch;
import org.osate.xtext.aadl2.agcl.analysis.util.SetFactory;

/**
 * @author eposse
 *
 */
public class PSLAtomicPropositionsSwitch extends AgclProcessingSwitch<Set<AtomicProp>> {

	public void initSwitch() {
		agclSwitch = new AgclSwitch<Set<AtomicProp>>() {
			public Set<AtomicProp> caseAtomicProp(AtomicProp obj) {
				Set<AtomicProp> result = SetFactory.getInstance();
				result.add(obj);
				return result;
			}
		};
	}
}
