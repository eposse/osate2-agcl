/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.visitors.concrete;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.ComponentType;
import org.osate.aadl2.ThreadImplementation;
import org.osate.aadl2.ThreadType;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause;
import org.osate.xtext.aadl2.agcl.agcl.AGCLContract;
import org.osate.xtext.aadl2.agcl.agcl.util.AgclSwitch;
import org.osate.xtext.aadl2.agcl.analysis.algorithms.concrete.ImplementationTypeConformanceAnalysis;
import org.osate.xtext.aadl2.agcl.analysis.algorithms.concrete.TypeParentConformanceAnalysis;
import org.osate.xtext.aadl2.agcl.analysis.util.AGCLSyntaxUtil;
import org.osate.xtext.aadl2.agcl.analysis.visitors.CommonAGCLAnalysisSwitch;
import org.osate.xtext.aadl2.agcl.analysis.visitors.ViewpointContext;

/**
 * 
 * This switch class picks AGCL annex sub-clauses, extract the relevant contracts and delegates the
 * actual analysis to the concrete algorithm class {@link TypeParentConformanceAnalysis}.  
 * 
 * @author Ernesto Posse
 *
 */
public class TypeParentConformanceSwitch extends CommonAGCLAnalysisSwitch {

	public TypeParentConformanceSwitch(IProgressMonitor pm,
			ViewpointContext viewpointContext) {
		super(pm, viewpointContext, new TypeParentConformanceAnalysis(viewpointContext));
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
				Logger.getLogger(getClass()).info("Performing type/parent type conformance analysis on '" + componentName + "'");
				monitor.subTask("Performing type/parent type conformance analysis on '" + componentName + "'");
				if (monitor.isCanceled()) return null;

				if (component instanceof ThreadType) {
					ThreadType threadType = ((ThreadType) component);
					Logger.getLogger(getClass()).debug("thread type: " + ((threadType == null) ? "null" : threadType.getFullName()));
					
					ComponentType parentThreadType = threadType.getExtended();
					Logger.getLogger(getClass()).debug("parent thread type: " + ((parentThreadType == null) ? "null" : parentThreadType.getFullName()));
					
					if (parentThreadType instanceof ThreadType) {
						// Go through all relevant contracts in this annex sub-clause...
						List<AGCLContract> relevantContracts = AGCLSyntaxUtil.getViewpointContracts(obj, viewpointContext);
						Logger.getLogger(getClass()).debug("relevant contracts: " + relevantContracts);
						for (AGCLContract contract : relevantContracts) {
							if (monitor.isCanceled()) return null;
							String viewpointName = contract.getName();
							// Go through all contracts of this component's parent in the same viewpoint 
							List<AGCLContract> relevantParentTypeContracts = AGCLSyntaxUtil.getViewpointContracts(parentThreadType, viewpointName, viewpointContext);
							Logger.getLogger(getClass()).debug("relevant type contracts: " + relevantParentTypeContracts);
							for (AGCLContract typeContract : relevantParentTypeContracts) {
								if (monitor.isCanceled()) return null;
								// We verify only the contracts which belong to a viewpoint marked for verification 
								((TypeParentConformanceAnalysis)algorithm).checkThisContractSatisfiesParentContract(contract, typeContract, viewpointName, componentName);
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
