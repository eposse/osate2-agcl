/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.actions.concrete;

import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.xtext.aadl2.agcl.analysis.actions.CommonAGCLAction;
import org.osate.xtext.aadl2.agcl.analysis.visitors.CommonAGCLAnalysisSwitch;
import org.osate.xtext.aadl2.agcl.analysis.visitors.ViewpointContext;
import org.osate.xtext.aadl2.agcl.analysis.visitors.concrete.ImplementationParentConformanceSwitch;

/**
 * This class provides the action that performs an implementation/parent contract conformance analysis.
 * 
 * <p>The actual algorithm implementing the analysis is in class {@link ImplementationParentConformanceSwitch}. 
 * 
 * @author eposse
 *
 */
public class ImplementationParentConformanceAction extends
		CommonAGCLAction {

	/* (non-Javadoc)
	 * @see org.osate.ui.actions.AbstractAaxlAction#getActionName()
	 */
	@Override
	protected String getActionName() {
		return "ImplementationParentConformanceAction";
	}

	@Override
	protected CommonAGCLAnalysisSwitch createConcreteAnalysisSwitch(
			IProgressMonitor monitor, ViewpointContext viewpointContext) {
		return new ImplementationParentConformanceSwitch(monitor, viewpointContext);
	}

//	@Override
//	protected CommonAGCLAnalysisSwitch createConcreteAnalysisSwitch(
//			IProgressMonitor monitor, ViewpointContext viewpointContext,
//			AnalysisResults analysisResults) {
//		return new ImplementationParentConformanceSwitch(monitor, viewpointContext, analysisResults);
//	}
//
}