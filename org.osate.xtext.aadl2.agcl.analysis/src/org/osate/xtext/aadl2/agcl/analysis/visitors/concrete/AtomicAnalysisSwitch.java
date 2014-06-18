package org.osate.xtext.aadl2.agcl.analysis.visitors.concrete;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.ComponentClassifier;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause;
import org.osate.xtext.aadl2.agcl.agcl.AGCLBehaviour;
import org.osate.xtext.aadl2.agcl.agcl.AGCLContract;
import org.osate.xtext.aadl2.agcl.agcl.util.AgclSwitch;
import org.osate.xtext.aadl2.agcl.analysis.algorithms.concrete.AtomicAnalysis;
import org.osate.xtext.aadl2.agcl.analysis.util.AGCLSyntaxUtil;
import org.osate.xtext.aadl2.agcl.analysis.visitors.CommonAGCLAnalysisSwitch;
import org.osate.xtext.aadl2.agcl.analysis.visitors.ViewpointContext;

/**
 * 
 * This switch class picks AGCL annex sub-clauses, extract the relevant behaviour and contracts and delegates the
 * actual analysis to the concrete algorithm class {@link AtomicAnalysis}.  
 * 
 * @author Ernesto Posse
 *
 */
public class AtomicAnalysisSwitch extends CommonAGCLAnalysisSwitch {

	/**
	 * @param pm				a progress monitor
	 * @param viewpointContext	a viewpoint context specifying which viewpoints to verify
	 */
	public AtomicAnalysisSwitch(IProgressMonitor pm, ViewpointContext viewpointContext) {
		super(pm, viewpointContext, new AtomicAnalysis(viewpointContext));
	}

	@Override
	protected void initAGCLSwitch() {
		agclSwitch = new AgclSwitch<Void>() {
			public Void caseAGCLAnnexSubclause(AGCLAnnexSubclause obj) {
				Classifier classifier = obj.getContainingClassifier();
				String componentName = classifier.getName();
				if (!(classifier instanceof ComponentClassifier)) {
					Logger.getLogger(getClass()).info("classifier '" + componentName + "' is not a component classifier; ignoring");
					return null;
				}
				ComponentClassifier component = (ComponentClassifier) classifier;
				Logger.getLogger(getClass()).info("Performing atomic analysis on '" + componentName + "'");
				monitor.subTask("Performing atomic analysis on '" + componentName + "'");
				if (monitor.isCanceled()) return null;
				
				// Get the component's behaviour specified in this annex sub-clause
				AGCLBehaviour behaviour = obj.getBehaviour();
				
				if (behaviour == null) {
					Logger.getLogger(getClass()).info("component '" + componentName + "' does not have a behaviour spec; I'm ignoring it");
				}
				else {
					// Go through all relevant contracts in this annex  sub-clause...
					for (AGCLContract contract : AGCLSyntaxUtil.getViewpointContracts(obj, viewpointContext)) {
						if (monitor.isCanceled()) return null;
						String viewpointName = contract.getName();
						((AtomicAnalysis)algorithm).checkBehaviourSatisfiesContract(behaviour, contract, viewpointName, componentName);
					}
				}
				monitor.worked(1);
				return null;
			}
		};
	}
	
}
