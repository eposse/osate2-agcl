/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.actions; 

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.aadl2.Element;
import org.osate.aadl2.instance.InstanceObject;
import org.osate.aadl2.modelsupport.resources.OsateResourceUtil;
import org.osate.ui.actions.AaxlReadOnlyActionAsJob;
import org.osate.ui.dialogs.Dialog;
import org.osate.xtext.aadl2.agcl.analysis.AGCLAnalysisPlugin;
import org.osate.xtext.aadl2.agcl.analysis.results.AnalysisResults;
import org.osate.xtext.aadl2.agcl.analysis.util.AGCLUtil;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker;
import org.osate.xtext.aadl2.agcl.analysis.visitors.CommonAGCLAnalysisSwitch;
import org.osate.xtext.aadl2.agcl.analysis.visitors.ViewpointContext;
import org.osate.xtext.aadl2.agcl.analysis.visitors.ViewpointContextSwitch;

/**
 * @author eposse
 *
 */
public abstract class CommonAGCLAction extends AaxlReadOnlyActionAsJob {


	protected CommonAGCLAnalysisSwitch analysisSwitch;

	/* (non-Javadoc)
	 * @see org.osate.ui.actions.AbstractAaxlAction#doAaxlAction(org.eclipse.core.runtime.IProgressMonitor, org.osate.aadl2.Element)
	 */
	@Override
	protected void doAaxlAction(IProgressMonitor monitor, Element root) {
		if (root instanceof InstanceObject) {
			Dialog.showError("A/G Atomic analysis ", "This action can only be performed on declarative models.");
		} else {
			Logger.getLogger(getClass()).info("AGCL analysis");
			// Clean-up Osate resource set to avoid weirdness
			OsateResourceUtil.getResourceSet().getResources().clear();
			// Setup the model-checker for this analysis run; the resource is used to 
			// determine the location of generated folders and files.
			Logger.getLogger(getClass()).debug("plugin: " + AGCLAnalysisPlugin.getDefault());
			ModelChecker modelChecker = AGCLAnalysisPlugin.getDefault().getActiveModelChecker();
			Logger.getLogger(getClass()).debug("active model checker: " + modelChecker);
			Logger.getLogger(getClass()).debug("root element under scrutiny: " + root);
			assert modelChecker != null;
			assert root != null;
			// Set-up a run for the model checker with respect to the element's resource
			modelChecker.setUp(root.eResource());
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
			// Create an instance of the analysis visitor
			analysisSwitch = createConcreteAnalysisSwitch(monitor, viewpointContext, analysisResults); 
			monitor.beginTask(getActionName(),totalElements * 2); // *2 because there are two passes 
			// Populate the viewpoint-context
			viewpointContextSwitch.processPreOrderAll(root);
			// Do the actual analysis
			analysisSwitch.processPreOrderAll(root);
			monitor.done();
			Logger.getLogger(getClass()).info("Analysis results by component:\n" + analysisResults.allResultsByComponentToString());
			Logger.getLogger(getClass()).info("Analysis results by viewpoint:\n" + analysisResults.allResultsByViewpointToString());
			analysisResults.saveResults();
			try {
				modelChecker.getInputFolder().refreshLocal(IResource.DEPTH_INFINITE, monitor);
				modelChecker.getOutputFolder().refreshLocal(IResource.DEPTH_INFINITE, monitor);
			} catch (CoreException e) {
				Logger.getLogger(getClass()).error("Unable to refresh project folders");
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Factory method that should provide an instance of the actual analysis visitor
	 * @param monitor
	 * @param viewpointContext
	 * @param analysisResults
	 * @return an instance of an AGCL analysis switch
	 */
	protected abstract CommonAGCLAnalysisSwitch createConcreteAnalysisSwitch(IProgressMonitor monitor, 
			ViewpointContext viewpointContext, 
			AnalysisResults analysisResults);

}
