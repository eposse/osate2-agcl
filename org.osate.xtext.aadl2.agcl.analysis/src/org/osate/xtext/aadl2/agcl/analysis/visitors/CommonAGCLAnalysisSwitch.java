/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.visitors;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtext.serializer.ISerializer;
import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.DefaultAnnexLibrary;
import org.osate.aadl2.DefaultAnnexSubclause;
import org.osate.aadl2.modelsupport.modeltraversal.AadlProcessingSwitchWithProgress;
import org.osate.aadl2.util.Aadl2Switch;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexLibrary;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause;
import org.osate.xtext.aadl2.agcl.agcl.util.AgclSwitch;
import org.osate.xtext.aadl2.agcl.analysis.AGCLAnalysisPlugin;
import org.osate.xtext.aadl2.agcl.analysis.results.AnalysisResults;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker;

/**
 * Base class for AGCL Analysis visitors
 * 
 * @author Ernesto Posse
 *
 */
public abstract class CommonAGCLAnalysisSwitch extends AadlProcessingSwitchWithProgress {

	protected AgclSwitch<Void> agclSwitch;
	protected final ViewpointContext viewpointContext;
	protected final AnalysisResults analysisResults;
	protected final ISerializer serializer;
	protected final ModelChecker checker;

	/**
	 * @param pm
	 */
	public CommonAGCLAnalysisSwitch(IProgressMonitor pm, ViewpointContext viewpointContext, AnalysisResults analysisResults) {
		super(pm);
		this.viewpointContext = viewpointContext;
		this.analysisResults = analysisResults;
		this.serializer = AGCLAnalysisPlugin.getDefault().getSerializer();
		this.checker = AGCLAnalysisPlugin.getDefault().getActiveModelChecker();
	}

	@Override
	protected void initSwitches() {
		initAGCLSwitch();
		aadl2Switch = new Aadl2Switch<String>() {
			public String caseAnnexSubclause(AnnexSubclause obj) {
				monitor.subTask("AnnexSubclause " + obj.getName());
				Logger.getLogger(getClass()).debug("visiting: " + obj);
				if (obj instanceof DefaultAnnexSubclause) 
					return "";
				Logger.getLogger(getClass()).debug("visiting non-default annex subclause: " + obj);
				if (!(obj instanceof AGCLAnnexSubclause))
					return "";
				Logger.getLogger(getClass()).debug("visiting AGCL annex subclause: " + obj);
				if (obj.getName().equals("AGCL")) {
					agclSwitch.caseAGCLAnnexSubclause((AGCLAnnexSubclause) obj);
				}
				monitor.worked(1);
				return obj.toString();
			}
			public String caseAnnexLibrary(AnnexLibrary obj) {
				monitor.subTask("AnnexLibrary" + obj.getName());
				Logger.getLogger(getClass()).debug("visiting: " + obj);
				if (obj instanceof DefaultAnnexLibrary)
					return "";
				Logger.getLogger(getClass()).debug("visiting non-default annex library");
				if (!(obj instanceof AGCLAnnexLibrary))
					return "";
				Logger.getLogger(getClass()).debug("visiting AGCL annex library");
				if (obj.getName().equals("AGCL")) {
					agclSwitch.caseAGCLAnnexLibrary((AGCLAnnexLibrary) obj);
				}
			    monitor.worked(1);
				return obj.toString();
			}
		};
	}
	
	protected abstract void initAGCLSwitch();

}
