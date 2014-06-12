/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.actions.concrete;

import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.xtext.aadl2.agcl.analysis.actions.CommonAGCLAction;
import org.osate.xtext.aadl2.agcl.analysis.visitors.CommonAGCLAnalysisSwitch;
import org.osate.xtext.aadl2.agcl.analysis.visitors.ViewpointContext;
import org.osate.xtext.aadl2.agcl.analysis.visitors.concrete.AtomicAnalysisSwitch;

/**
 * This class provides the action that performs an atomic analysis (A/G analysis on thread 
 * implementations). 
 * 
 * <p>The actual algorithm implementing the analysis is in class {@link AtomicAnalysisSwitch}. 
 * 
 * @author Ernesto Posse
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
		return new AtomicAnalysisSwitch(monitor, viewpointContext);
	}

}
