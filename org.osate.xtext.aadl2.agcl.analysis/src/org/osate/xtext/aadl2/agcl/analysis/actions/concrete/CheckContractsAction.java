package org.osate.xtext.aadl2.agcl.analysis.actions.concrete;

import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.Element;
import org.osate.aadl2.instance.InstanceObject;
import org.osate.aadl2.modelsupport.resources.OsateResourceUtil;
import org.osate.aadl2.modelsupport.util.AadlUtil;
import org.osate.ui.actions.AaxlReadOnlyActionAsJob;
import org.osate.ui.dialogs.Dialog;
import org.osate.xtext.aadl2.agcl.analysis.misc.AGCLCheckContractsSwitch;
import org.osate.xtext.aadl2.agcl.analysis.util.*;


/**
 * This action executes all the analyses on the model.
 */
public final class CheckContractsAction extends AaxlReadOnlyActionAsJob {

	@Override
	protected String getActionName() {
		return "CheckContractsAction";
	}

	@Override
	protected void doAaxlAction(IProgressMonitor monitor, Element root) {
		System.out.println("doing AaxlAction");
		AGCLCheckContractsSwitch theSwitch = new AGCLCheckContractsSwitch(monitor); 
//		OsateResourceUtil.refreshResourceSet();		// This does not seem to work.
		OsateResourceUtil.getResourceSet().getResources().clear();
		if (root instanceof InstanceObject) {
			System.out.println("Working on an instance model...");
			Class[] classifiersOfInterest = 
				{ org.osate.aadl2.instance.ComponentInstance.class };
			int totalElements = AGCLUtil.countClassifiers(root, classifiersOfInterest);
			System.out.println("Total elements to traverse: " + totalElements);
			monitor.beginTask(getActionName(),totalElements); 
			theSwitch.processPreOrderAll(root);
			monitor.done();
			System.out.println("Done!");
		} else {
			System.out.println("Working on a declarative model...");
			Class[] classifiersOfInterest = 
				{ org.osate.aadl2.ThreadType.class,
				  org.osate.aadl2.ThreadImplementation.class,
				  org.osate.aadl2.AnnexSubclause.class,
				  org.osate.aadl2.AnnexLibrary.class,
				  org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause.class,
				  org.osate.xtext.aadl2.agcl.agcl.AGCLContract.class };
			int totalElements = AGCLUtil.countClassifiers(root, classifiersOfInterest);
			System.out.println("Total elements to traverse: " + totalElements);
			monitor.beginTask(getActionName(),totalElements); 
			theSwitch.processPreOrderAll(root);
			monitor.done();
			System.out.println("Done!");
		}
	}
	
}