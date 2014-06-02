package org.osate.xtext.aadl2.agcl.analysis.actions;

import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.aadl2.Element;
import org.osate.aadl2.instance.InstanceObject;
import org.osate.aadl2.modelsupport.resources.OsateResourceUtil;
import org.osate.ui.actions.AaxlReadOnlyActionAsJob;
import org.osate.ui.dialogs.Dialog;
import org.osate.xtext.aadl2.agcl.analysis.util.AGCLUtil;
import org.osate.xtext.aadl2.agcl.analysis.visitors.ImplementationTypeConformanceSwitch;


/**
 * This class provides the action that performs an implementation/type contract conformance analysis.
 * 
 * <p>The actual algorithm implementing the analysis is in class {@link ImplementationTypeConformanceSwitch}. 
 * 
 * @author eposse
 *
 */
public class ImplementationTypeConformanceAction extends
		AaxlReadOnlyActionAsJob {

	@Override
	protected String getActionName() {
		return "ImplementationTypeConformanceAction";
	}

	@Override
	protected void doAaxlAction(IProgressMonitor monitor, Element root) {
		if (root instanceof InstanceObject) {
			Dialog.showError("A/G Atomic analysis ", "This action can only be performed on declarative models.");
		} else {
			ImplementationTypeConformanceSwitch theSwitch = new ImplementationTypeConformanceSwitch(monitor); 
			OsateResourceUtil.getResourceSet().getResources().clear();
			Class[] classifiersOfInterest = 
				{ org.osate.aadl2.ThreadGroupImplementation.class };
			int totalElements = AGCLUtil.countClassifiers(root, classifiersOfInterest);
			monitor.beginTask(getActionName(),totalElements); 
			theSwitch.processPreOrderAll(root);
			monitor.done();
		}
	}

}
