/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.actions.concrete;

import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.xtext.aadl2.agcl.analysis.actions.CommonAGCLAction;
import org.osate.xtext.aadl2.agcl.analysis.visitors.CommonAGCLAnalysisSwitch;
import org.osate.xtext.aadl2.agcl.analysis.visitors.ViewpointContext;
import org.osate.xtext.aadl2.agcl.analysis.visitors.concrete.CompositeAnalysisSwitch;

/**
 * This class provides the action that performs a composite analysis (analysis on thread group
 * implementations).
 * 
 * <p>The actual algorithm implementing the analysis is in class {@link CompositeAnalysisSwitch}. 
 * 
 * @author Ernesto Posse
 *
 */
public class CompositeAnalysisAction extends CommonAGCLAction {

	/* (non-Javadoc)
	 * @see org.osate.ui.actions.AbstractAaxlAction#getActionName()
	 */
	@Override
	protected String getActionName() {
		return "CompositeAnalysisAction";
	}

	@Override
	protected CommonAGCLAnalysisSwitch createConcreteAnalysisSwitch(
			IProgressMonitor monitor, ViewpointContext viewpointContext) {
		return new CompositeAnalysisSwitch(monitor, viewpointContext);
	}

}
