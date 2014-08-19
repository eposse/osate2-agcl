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
package org.osate.xtext.aadl2.agcl.analysis.algorithms.concrete;

import org.osate.xtext.aadl2.agcl.agcl.AGCLContract;
import org.osate.xtext.aadl2.agcl.analysis.algorithms.AnalysisAlgorithmBase;
import org.osate.xtext.aadl2.agcl.analysis.visitors.ViewpointContext;

/**
 * 
 * This class implements the implementation/type conformance analysis algorithm, this is, it checks whether
 * all thread or thread group implementations contracts conform to their respective type's contract with
 * respect to a given viewpoint.
 * 
 * @author Ernesto Posse
 *
 */
public class ImplementationTypeConformanceAnalysis extends AnalysisAlgorithmBase {

	/**
	 * @param viewpointContext
	 */
	public ImplementationTypeConformanceAnalysis(ViewpointContext viewpointContext) {
		super(viewpointContext);
	}

	public void checkThisContractSatisfiesParentContract(
			AGCLContract contract, AGCLContract parentContract, 
			String viewpointName, String componentName) {
		checkContractRefinement(contract, parentContract, viewpointName, componentName);
	}

}
