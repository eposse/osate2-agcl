/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.visitors.concrete;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.ThreadImplementation;
import org.osate.aadl2.ThreadType;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause;
import org.osate.xtext.aadl2.agcl.agcl.AGCLContract;
import org.osate.xtext.aadl2.agcl.agcl.util.AgclSwitch;
import org.osate.xtext.aadl2.agcl.analysis.algorithms.concrete.ImplementationTypeConformanceAnalysis;
import org.osate.xtext.aadl2.agcl.analysis.util.AGCLSyntaxUtil;
import org.osate.xtext.aadl2.agcl.analysis.visitors.CommonAGCLAnalysisSwitch;
import org.osate.xtext.aadl2.agcl.analysis.visitors.ViewpointContext;

/**
 * 
 * This switch class picks AGCL annex sub-clauses, extract the relevant behaviour and contracts and delegates the
 * actual analysis to the concrete algorithm class {@link ImplementationTypeConformanceAnalysis}.  
 * 
 * @author Ernesto Posse
 *
 */
public class ImplementationTypeConformanceSwitch extends CommonAGCLAnalysisSwitch {

	public ImplementationTypeConformanceSwitch(IProgressMonitor pm,
			ViewpointContext viewpointContext) {
		super(pm, viewpointContext, new ImplementationTypeConformanceAnalysis(viewpointContext));
	}

	@Override
	protected void initAGCLSwitch() {
		agclSwitch = new AgclSwitch<Void>() {
			public Void caseAGCLAnnexSubclause(AGCLAnnexSubclause obj) {
				monitor.subTask("AGCLAnnexSubclause" + obj.getName());
				if (monitor.isCanceled()) return null;
				Classifier component = obj.getContainingClassifier();
				String componentName = component.getName();
				Logger.getLogger(getClass()).info("processing AGCL annex subclause for '" + componentName + "'");
				if (component instanceof ThreadImplementation) {
					ThreadType threadType = ((ThreadImplementation) component).getType();
					Logger.getLogger(getClass()).debug("thread type: " + ((threadType == null) ? "null" : threadType.getFullName()));
					if (threadType == null) {
						Logger.getLogger(getClass()).error("the thread type for this implementation is null; this is probably due to a bug in Osate. I'm ignoring this component"); 
					}
					else {
						// Go through all relevant contracts in this annex sub-clause...
						List<AGCLContract> relevantContracts = AGCLSyntaxUtil.getViewpointContracts(obj, viewpointContext);
						Logger.getLogger(getClass()).debug("relevant contracts: " + relevantContracts);
						for (AGCLContract contract : relevantContracts) {
							if (monitor.isCanceled()) return null;
							String viewpointName = contract.getName();
							// Go through all contracts of this component's type in the same viewpoint 
							List<AGCLContract> relevantTypeContracts = AGCLSyntaxUtil.getViewpointContracts(threadType, viewpointName, viewpointContext);
							Logger.getLogger(getClass()).debug("relevant type contracts: " + relevantTypeContracts);
							for (AGCLContract typeContract : relevantTypeContracts) {
								if (monitor.isCanceled()) return null;
								// We verify only the contracts which belong to a viewpoint marked for verification 
								((ImplementationTypeConformanceAnalysis)algorithm).checkThisContractSatisfiesParentContract(contract, typeContract, viewpointName, componentName);
							}
						}
					}
				}
				monitor.worked(1);
				return null;
			}
		};
	}

}
