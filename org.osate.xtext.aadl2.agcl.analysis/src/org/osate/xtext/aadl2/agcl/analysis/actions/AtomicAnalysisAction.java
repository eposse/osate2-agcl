/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.actions;

import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.xtext.aadl2.agcl.analysis.visitors.AtomicAnalysisSwitch;
import org.osate.xtext.aadl2.agcl.analysis.visitors.CommonAGCLAnalysisSwitch;
import org.osate.xtext.aadl2.agcl.analysis.visitors.ViewpointContext;

/**
 * This class provides the action that performs an atomic analysis, i.e. A/G analysis on thread 
 * implementations. 
 * 
 * <p>The actual algorithm implementing the analysis is in class {@link AtomicAnalysisSwitch}. 
 * 
 * @author eposse
 *
 */
public class AtomicAnalysisAction extends CommonAGCLAction {

	/* (non-Javadoc)
	 * @see org.osate.ui.actions.AbstractAaxlAction#getActionName()
	 */
	@Override
	protected String getActionName() {
		return "AtomicAnalysisAction";
	}

	@Override
	protected CommonAGCLAnalysisSwitch createConcreteAnalysisSwitch(IProgressMonitor monitor, ViewpointContext viewpointContext) {
		// TODO Auto-generated method stub
		return new AtomicAnalysisSwitch(monitor, viewpointContext);
	}

//	@Override
//	protected CommonAGCLAnalysisSwitch createConcreteAnalysisSwitch(
//			IProgressMonitor monitor, ViewpointContext viewpointContext,
//			AnalysisResults analysisResults) {
//		// TODO Auto-generated method stub
//		return new AtomicAnalysisSwitch(monitor, viewpointContext, analysisResults);
//	}
//
}
