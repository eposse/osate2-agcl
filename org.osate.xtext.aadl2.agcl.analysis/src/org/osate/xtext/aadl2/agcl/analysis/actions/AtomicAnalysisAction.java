/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.actions;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.aadl2.Element;
import org.osate.aadl2.instance.InstanceObject;
import org.osate.aadl2.modelsupport.resources.OsateResourceUtil;
import org.osate.ui.actions.AaxlReadOnlyActionAsJob;
import org.osate.ui.dialogs.Dialog;
import org.osate.xtext.aadl2.agcl.analysis.AGCLAnalysisPlugin;
import org.osate.xtext.aadl2.agcl.analysis.util.AGCLUtil;
import org.osate.xtext.aadl2.agcl.analysis.visitors.AnalysisResults;
import org.osate.xtext.aadl2.agcl.analysis.visitors.AtomicAnalysisSwitch;
import org.osate.xtext.aadl2.agcl.analysis.visitors.ViewpointContext;
import org.osate.xtext.aadl2.agcl.analysis.visitors.ViewpointContextSwitch;

/**
 * This class provides the action that performs an atomic analysis, i.e. A/G analysis on thread 
 * implementations. 
 * 
 * <p>The actual algorithm implementing the analysis is in class {@link AtomicAnalysisSwitch}. 
 * 
 * @author eposse
 *
 */
public class AtomicAnalysisAction extends AaxlReadOnlyActionAsJob {

	public AtomicAnalysisAction() {
	}

	/* (non-Javadoc)
	 * @see org.osate.ui.actions.AbstractAaxlAction#getActionName()
	 */
	@Override
	protected String getActionName() {
		return "AtomicAnalysisAction";
	}

	/* (non-Javadoc)
	 * @see org.osate.ui.actions.AbstractAaxlAction#doAaxlAction(org.eclipse.core.runtime.IProgressMonitor, org.osate.aadl2.Element)
	 */
	@Override
	protected void doAaxlAction(IProgressMonitor monitor, Element root) {
		if (root instanceof InstanceObject) {
			Dialog.showError("A/G Atomic analysis ", "This action can only be performed on declarative models.");
		} else {
			Logger.getLogger(getClass()).info("AGCL atomic analysis");
			// Clean-up Osate resource set to avoid weirdness
			OsateResourceUtil.getResourceSet().getResources().clear();
			// Setup the model-checker for this analysis run; the resource is used to 
			// determine the location of generated folders and files.
			Logger.getLogger(getClass()).debug(AGCLAnalysisPlugin.getDefault());
			Logger.getLogger(getClass()).debug(AGCLAnalysisPlugin.getDefault().getActiveModelChecker());
			Logger.getLogger(getClass()).debug(root);
			assert AGCLAnalysisPlugin.getDefault().getActiveModelChecker() != null;
			assert root != null;
			AGCLAnalysisPlugin.getDefault().getActiveModelChecker().setUp(root.eResource());
			// Count the model elements we are going to traverse
			Class<?>[] classifiersOfInterest = 
				{ org.osate.aadl2.AnnexSubclause.class,
				  org.osate.aadl2.AnnexLibrary.class };
			int totalElements = AGCLUtil.countClassifiers(root, classifiersOfInterest);
			// Create the viewpoint-context which stores the viewpoints to verify.
			ViewpointContext viewpointContext = new ViewpointContext();
			ViewpointContextSwitch viewpointContextSwitch = new ViewpointContextSwitch(monitor, viewpointContext);
			// Create an object to record analysis results.
			AnalysisResults analysisResults = new AnalysisResults(root.eResource());
			// Create the object that will perform the actual analysis.
			AtomicAnalysisSwitch analysisSwitch = new AtomicAnalysisSwitch(monitor, viewpointContext, analysisResults); 
			monitor.beginTask(getActionName(),totalElements); 
			// Populate the viewpoint-context
			viewpointContextSwitch.processPreOrderAll(root);
			// Do the actual analysis
			analysisSwitch.processPreOrderAll(root);
			monitor.done();
			Logger.getLogger(getClass()).info("Analysis results by component:\n" + analysisResults.allResultsByComponentToString());
			Logger.getLogger(getClass()).info("Analysis results by viewpoint:\n" + analysisResults.allResultsByViewpointToString());
			analysisResults.saveResults();
		}
	}
	
	

}
