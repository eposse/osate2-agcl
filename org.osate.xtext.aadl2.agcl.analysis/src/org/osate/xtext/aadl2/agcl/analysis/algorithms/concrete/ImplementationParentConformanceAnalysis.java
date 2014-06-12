/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.algorithms.concrete;

import org.osate.xtext.aadl2.agcl.agcl.AGCLContract;
import org.osate.xtext.aadl2.agcl.analysis.algorithms.AnalysisAlgorithmBase;
import org.osate.xtext.aadl2.agcl.analysis.visitors.ViewpointContext;

/**
 *
 * This class implements the implementation/parent conformance analysis algorithm, this is, it checks whether
 * all thread or thread group implementations contracts conform to their respective parent's contract with
 * respect to a given viewpoint.
 * 
 * @author Ernesto Posse
 *
 */
public class ImplementationParentConformanceAnalysis extends AnalysisAlgorithmBase {

	/**
	 * @param viewpointContext
	 */
	public ImplementationParentConformanceAnalysis(
			ViewpointContext viewpointContext) {
		super(viewpointContext);
	}

	public void checkThisContractSatisfiesParentContract(
			AGCLContract contract, AGCLContract parentContract, 
			String viewpointName, String componentName) {
		checkContractRefinement(contract, parentContract, viewpointName, componentName);
	}

}
