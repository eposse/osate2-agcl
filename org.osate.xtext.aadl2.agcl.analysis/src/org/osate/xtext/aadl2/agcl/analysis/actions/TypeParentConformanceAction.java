/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.actions;

import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.aadl2.Element;
import org.osate.aadl2.instance.InstanceObject;
import org.osate.aadl2.modelsupport.resources.OsateResourceUtil;
import org.osate.ui.actions.AaxlReadOnlyActionAsJob;
import org.osate.ui.dialogs.Dialog;
import org.osate.xtext.aadl2.agcl.analysis.util.AGCLUtil;
import org.osate.xtext.aadl2.agcl.analysis.visitors.TypeParentConformanceSwitch;

/**
 * This class provides the action that performs an type/parent contract conformance analysis.
 * 
 * <p>The actual algorithm implementing the analysis is in class {@link TypeParentConformanceSwitch}. 
 * 
 * @author eposse
 *
 */
public class TypeParentConformanceAction extends AaxlReadOnlyActionAsJob {

	/* (non-Javadoc)
	 * @see org.osate.ui.actions.AbstractAaxlAction#getActionName()
	 */
	@Override
	protected String getActionName() {
		return "TypeParentConformanceAction";
	}

	/* (non-Javadoc)
	 * @see org.osate.ui.actions.AbstractAaxlAction#doAaxlAction(org.eclipse.core.runtime.IProgressMonitor, org.osate.aadl2.Element)
	 */
	@Override
	protected void doAaxlAction(IProgressMonitor monitor, Element root) {
		if (root instanceof InstanceObject) {
			Dialog.showError("A/G Atomic analysis ", "This action can only be performed on declarative models.");
		} else {
			TypeParentConformanceSwitch theSwitch = new TypeParentConformanceSwitch(monitor); 
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
