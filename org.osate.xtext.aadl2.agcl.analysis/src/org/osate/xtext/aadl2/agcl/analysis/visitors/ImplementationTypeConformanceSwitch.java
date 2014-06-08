/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.visitors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.xtext.aadl2.agcl.analysis.results.AnalysisResults;

/**
 * This class implements the implementation/type conformance analysis algorithm, this is, it checks whether
 * all thread or thread group implementations contracts conform to their respective type's contract with
 * respect to a given viewpoint.
 * 
 * @author eposse
 *
 */
public class ImplementationTypeConformanceSwitch extends
		CommonAGCLAnalysisSwitch {

	public ImplementationTypeConformanceSwitch(IProgressMonitor pm,
			ViewpointContext viewpointContext, AnalysisResults analysisResults) {
		super(pm, viewpointContext, analysisResults);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initAGCLSwitch() {
		// TODO Auto-generated method stub
		
	}


}
