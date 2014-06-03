/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.visitors;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.DefaultAnnexLibrary;
import org.osate.aadl2.ThreadImplementation;
import org.osate.aadl2.modelsupport.errorreporting.AnalysisErrorReporterManager;
import org.osate.aadl2.modelsupport.modeltraversal.AadlProcessingSwitchWithProgress;
import org.osate.aadl2.util.Aadl2Switch;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexLibrary;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause;
import org.osate.xtext.aadl2.agcl.agcl.AGCLEnforce;
import org.osate.xtext.aadl2.agcl.agcl.AGCLViewpoint;
import org.osate.xtext.aadl2.agcl.agcl.util.AgclSwitch;

/**
 * This class initializes the viewpoint context used by the different analysis switches
 * by collecting declared viewpoints and viewpoints to verify.
 * 
 * @author Ernesto Posse
 *
 */
public class ViewpointContextSwitch extends AadlProcessingSwitchWithProgress {

	private AgclSwitch<Void> agclSwitch;
	private ViewpointContext viewpointContext;

	/**
	 * @param pm
	 */
	public ViewpointContextSwitch(IProgressMonitor pm, ViewpointContext viewpointContext) {
		super(pm);
		if (viewpointContext == null) {
			this.viewpointContext = new ViewpointContext();
		}
		else {
			this.viewpointContext = viewpointContext;
		}
	}

	/* (non-Javadoc)
	 * @see org.osate.aadl2.modelsupport.modeltraversal.AadlProcessingSwitch#initSwitches()
	 */
	@Override
	protected void initSwitches() {
		agclSwitch = new AgclSwitch<Void>() {
			public Void caseAGCLAnnexLibrary(AGCLAnnexLibrary obj) {
				//monitor.subTask("AGCLAnnexLibrary" + obj.getName());
				// We collect all declared viewpoints in this package
				for (AGCLViewpoint v : obj.getViewpoints()) {
					Logger.getLogger(getClass()).info("declared viewpoint: " + v.getName());
					viewpointContext.addDeclaredViewpoint(v.getName());
				}
				// We collect the names of all viewpoints to verify, but only those which are declared
				for (AGCLEnforce e : obj.getEnforceclauses()) {
					String viewpointName = e.getName();
					if (viewpointContext.containsDeclaredViewpoint(viewpointName)) {
						viewpointContext.addViewpointToVerify(viewpointName);
						Logger.getLogger(getClass()).info("adding viewpoint to verify: " + viewpointName);
					}
					else {
						Logger.getLogger(getClass()).warn("ignoring undeclared viewpoint: " + viewpointName);
					}
				}
			    //monitor.worked(1);
				return null;
			}
		};
		aadl2Switch = new Aadl2Switch<String>() {
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
//					agclSwitch.doSwitch(obj); // Could be optimized by invoking caseAGCLAnnexLibrary directly
//					agclSwitch.doSwitch((AGCLAnnexLibrary) obj); // Could be optimized by invoking caseAGCLAnnexLibrary directly
				}
			    monitor.worked(1);
				return obj.toString();
			}
		};
	}

}
