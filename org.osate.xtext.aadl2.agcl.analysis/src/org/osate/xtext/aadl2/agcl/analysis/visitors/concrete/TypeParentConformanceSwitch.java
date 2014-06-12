/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.visitors.concrete;

import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.xtext.aadl2.agcl.analysis.algorithms.concrete.TypeParentConformanceAnalysis;
import org.osate.xtext.aadl2.agcl.analysis.visitors.CommonAGCLAnalysisSwitch;
import org.osate.xtext.aadl2.agcl.analysis.visitors.ViewpointContext;

/**
 * 
 * This switch class picks AGCL annex sub-clauses, extract the relevant contracts and delegates the
 * actual analysis to the concrete algorithm class {@link TypeParentConformanceAnalysis}.  
 * 
 * @author Ernesto Posse
 *
 */
public class TypeParentConformanceSwitch extends CommonAGCLAnalysisSwitch {

	public TypeParentConformanceSwitch(IProgressMonitor pm,
			ViewpointContext viewpointContext) {
		super(pm, viewpointContext, new TypeParentConformanceAnalysis(viewpointContext));
	}

	@Override
	protected void initAGCLSwitch() {
		// TODO Auto-generated method stub
		
	}

}
