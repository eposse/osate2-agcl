package org.osate.xtext.aadl2.agcl.analysis.actions.concrete;

import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.xtext.aadl2.agcl.analysis.actions.CommonAGCLAction;
import org.osate.xtext.aadl2.agcl.analysis.visitors.CommonAGCLAnalysisSwitch;
import org.osate.xtext.aadl2.agcl.analysis.visitors.ViewpointContext;
import org.osate.xtext.aadl2.agcl.analysis.visitors.concrete.ImplementationTypeConformanceSwitch;


/**
 * This class provides the action that performs an implementation/type contract conformance analysis.
 * 
 * <p>The actual algorithm implementing the analysis is in class {@link ImplementationTypeConformanceSwitch}. 
 * 
 * @author eposse
 *
 */
public class ImplementationTypeConformanceAction extends
CommonAGCLAction {

	@Override
	protected String getActionName() {
		return "ImplementationTypeConformanceAction";
	}

	@Override
	protected CommonAGCLAnalysisSwitch createConcreteAnalysisSwitch(
			IProgressMonitor monitor, ViewpointContext viewpointContext) {
		return new ImplementationTypeConformanceSwitch(monitor, viewpointContext);
	}

//	@Override
//	protected CommonAGCLAnalysisSwitch createConcreteAnalysisSwitch(
//			IProgressMonitor monitor, ViewpointContext viewpointContext,
//			AnalysisResults analysisResults) {
//		return new ImplementationTypeConformanceSwitch(monitor, viewpointContext, analysisResults);
//	}

}
