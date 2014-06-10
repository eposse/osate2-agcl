/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.actions.concrete;

import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.xtext.aadl2.agcl.analysis.actions.CommonAGCLAction;
import org.osate.xtext.aadl2.agcl.analysis.visitors.CommonAGCLAnalysisSwitch;
import org.osate.xtext.aadl2.agcl.analysis.visitors.ViewpointContext;
import org.osate.xtext.aadl2.agcl.analysis.visitors.concrete.TypeParentConformanceSwitch;

/**
 * This class provides the action that performs an type/parent contract conformance analysis.
 * 
 * <p>The actual algorithm implementing the analysis is in class {@link TypeParentConformanceSwitch}. 
 * 
 * @author eposse
 *
 */
public class TypeParentConformanceAction extends CommonAGCLAction {

	/* (non-Javadoc)
	 * @see org.osate.ui.actions.AbstractAaxlAction#getActionName()
	 */
	@Override
	protected String getActionName() {
		return "TypeParentConformanceAction";
	}

	@Override
	protected CommonAGCLAnalysisSwitch createConcreteAnalysisSwitch(
			IProgressMonitor monitor, ViewpointContext viewpointContext) {
		return new TypeParentConformanceSwitch(monitor, viewpointContext);
	}

//	@Override
//	protected CommonAGCLAnalysisSwitch createConcreteAnalysisSwitch(
//			IProgressMonitor monitor, ViewpointContext viewpointContext,
//			AnalysisResults analysisResults) {
//		return new TypeParentConformanceSwitch(monitor, viewpointContext, analysisResults);
//	}

}
