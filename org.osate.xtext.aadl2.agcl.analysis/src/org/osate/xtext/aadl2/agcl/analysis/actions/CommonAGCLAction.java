/**
 * This package provides actions that are executed when the user clicks on one of the plug-in buttons or menu options.
 * 
 * <p> All concrete actions are classes in the subpackage {@link org.osate.xtext.aadl2.agcl.analysis.actions.concrete} and
 * they inherit from the base class {@link CommonAGCLAction} which provides the skeleton for each of the actions. 
 * This follows the <a href="http://en.wikipedia.org/wiki/Template_method_pattern">template method</a> design pattern.
 * 
 * @author Ernesto Posse
 */
package org.osate.xtext.aadl2.agcl.analysis.actions; 

import org.apache.log4j.Logger;
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
 * This class provides the skeleton for all concrete actions triggered by Eclipse when the user clicks one of the
 * AGCL buttons or menu options.
 * 
 * @author Ernesto Posse
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
			Dialog.showError("AGCL analysis", "This action can only be performed on declarative models.");
		} else {
			Logger.getLogger(getClass()).info("AGCL analysis");
			
			// The following "clean-up" lines are supposed to fix a huge bug in Osate:
			// If we don't clear, and the user made changes to the model, Osate will ignore the changes and pass
			// the old AST.  But if we use any of the two clean-up methods, then we either loose essential information
			// in the AST, such as the ThreadType reference of every ThreadImplementation, or information from the
			// Eclipse workspace such as the resource's project folder.
//			OsateResourceUtil.getResourceSet().getResources().clear();
//			OsateResourceUtil.refreshResourceSet();
			
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
			analysisSwitch = createConcreteAnalysisSwitch(monitor, viewpointContext); 
			
			monitor.beginTask(getActionName(),totalElements * 2); // *2 because there are two passes 
			// Populate the viewpoint-context
			viewpointContextSwitch.processPreOrderAll(root);
			// Do the actual analysis
			analysisSwitch.processPreOrderAll(root);
			monitor.done();
			
			// Save the collected results.
			analysisResults.saveResults();
			Logger.getLogger(getClass()).info("Analysis results by component:\n" + analysisResults.allResultsByComponentToString());
			Logger.getLogger(getClass()).info("Analysis results by viewpoint:\n" + analysisResults.allResultsByViewpointToString());
		}
	}
	
	/**
	 * Factory method that should provide an instance of the actual analysis visitor
	 * @param monitor
	 * @param viewpointContext
	 * @return an instance of an AGCL analysis switch
	 */
	protected abstract CommonAGCLAnalysisSwitch createConcreteAnalysisSwitch(IProgressMonitor monitor, 
			ViewpointContext viewpointContext);

//	/**
//	 * Factory method that should provide an instance of the actual analysis visitor
//	 * @param monitor
//	 * @param viewpointContext
//	 * @param analysisResults
//	 * @return an instance of an AGCL analysis switch
//	 */
//	protected abstract CommonAGCLAnalysisSwitch createConcreteAnalysisSwitch(IProgressMonitor monitor, 
//			ViewpointContext viewpointContext, 
//			AnalysisResults analysisResults);
//
}
