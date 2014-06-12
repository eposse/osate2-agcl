/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.visitors.concrete;

import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.xtext.aadl2.agcl.analysis.algorithms.concrete.ImplementationParentConformanceAnalysis;
import org.osate.xtext.aadl2.agcl.analysis.visitors.CommonAGCLAnalysisSwitch;
import org.osate.xtext.aadl2.agcl.analysis.visitors.ViewpointContext;

/**
 * 
 * This switch class picks AGCL annex sub-clauses, extract the relevant contracts and delegates the
 * actual analysis to the concrete algorithm class {@link ImplementationParentConformanceAnalysis}.  
 * 
 * @author Ernesto Posse
 *
 */
public class ImplementationParentConformanceSwitch extends CommonAGCLAnalysisSwitch {

	public ImplementationParentConformanceSwitch(IProgressMonitor pm,
			ViewpointContext viewpointContext) {
		super(pm, viewpointContext, new ImplementationParentConformanceAnalysis(viewpointContext));
	}

	@Override
	protected void initAGCLSwitch() {
		// TODO Auto-generated method stub
		
	}


}
