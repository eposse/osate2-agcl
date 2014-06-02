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
import org.osate.xtext.aadl2.agcl.agcl.util.AgclSwitch;
import org.osate.xtext.aadl2.agcl.analysis.util.AGCLUtil;
import org.osate.xtext.aadl2.agcl.analysis.visitors.AGCLCheckContractsSwitch;
import org.osate.xtext.aadl2.agcl.analysis.visitors.AGCLPrintPSLSpecsSwitch;
import org.osate.xtext.aadl2.agcl.analysis.visitors.SampleXtendAADLSwitch;

/**
 * @author eposse
 *
 */
public class PrintPSLSpecsAction extends AaxlReadOnlyActionAsJob {

	protected AgclSwitch agclSwitch;
	
	/* (non-Javadoc)
	 * @see org.osate.ui.actions.AbstractAaxlAction#getActionName()
	 */
	@Override
	protected String getActionName() {
		return "PrintPSLSpecsAction";
	}

	/* (non-Javadoc)
	 * @see org.osate.ui.actions.AbstractAaxlAction#doAaxlAction(org.eclipse.core.runtime.IProgressMonitor, org.osate.aadl2.Element)
	 */
	@Override
	protected void doAaxlAction(IProgressMonitor monitor, Element root) {
		System.out.println("* printing PSL specs");
//		AGCLPrintPSLSpecsSwitch theSwitch = new AGCLPrintPSLSpecsSwitch(monitor);
		SampleXtendAADLSwitch theSwitch = new SampleXtendAADLSwitch(monitor);
		OsateResourceUtil.getResourceSet().getResources().clear();
		if (root instanceof InstanceObject) {
			Dialog.showError("Printing PSL specs", "This action can only be performed on declarative models.");
		} else {
			System.out.println("Working on a declarative model...");
			Class[] classifiersOfInterest = 
				{ 
					org.osate.aadl2.AnnexSubclause.class,
					org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause.class,
					org.osate.xtext.aadl2.agcl.agcl.AGCLBehaviour.class };
			int totalElements = AGCLUtil.countClassifiers(root, classifiersOfInterest);
			System.out.println("Total elements to traverse: " + totalElements);
			monitor.beginTask(getActionName(),totalElements); 
			theSwitch.processPreOrderAll(root);
			monitor.done();
			System.out.println("Done!");
		}
	}

}
