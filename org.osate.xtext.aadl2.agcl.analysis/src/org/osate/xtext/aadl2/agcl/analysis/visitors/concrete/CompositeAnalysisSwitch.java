/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.visitors.concrete;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.Subcomponent;
import org.osate.aadl2.ThreadGroupImplementation;
import org.osate.aadl2.impl.ThreadGroupClassifierImpl;
import org.osate.aadl2.impl.ThreadGroupImpl;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause;
import org.osate.xtext.aadl2.agcl.agcl.AGCLBehaviour;
import org.osate.xtext.aadl2.agcl.agcl.AGCLContract;
import org.osate.xtext.aadl2.agcl.agcl.util.AgclSwitch;
import org.osate.xtext.aadl2.agcl.analysis.algorithms.concrete.AtomicAnalysis;
import org.osate.xtext.aadl2.agcl.analysis.algorithms.concrete.CompositeAnalysis;
import org.osate.xtext.aadl2.agcl.analysis.util.AGCLSyntaxUtil;
import org.osate.xtext.aadl2.agcl.analysis.visitors.CommonAGCLAnalysisSwitch;
import org.osate.xtext.aadl2.agcl.analysis.visitors.ViewpointContext;

/**
 * This switch class picks AGCL annex sub-clauses, extract the relevant contracts and delegates the
 * actual analysis to the concrete algorithm class {@link CompositeAnalysis}.  
 * 
 * @author Ernesto Posse
 *
 */
public class CompositeAnalysisSwitch extends CommonAGCLAnalysisSwitch {

	public CompositeAnalysisSwitch(IProgressMonitor pm,
			ViewpointContext viewpointContext) {
		super(pm, viewpointContext, new CompositeAnalysis(viewpointContext));
	}

	@Override
	protected void initAGCLSwitch() {
		agclSwitch = new AgclSwitch<Void>() {
			public Void caseAGCLAnnexSubclause(AGCLAnnexSubclause obj) {
				Classifier component = obj.getContainingClassifier();
				String componentName = component.getName();
				Logger.getLogger(getClass()).info("Performing composite analysis on '" + componentName + "'");
				monitor.subTask("Performing composite analysis on '" + componentName + "'");
				if (monitor.isCanceled()) return null;
				
				if (component instanceof ThreadGroupImplementation) {
					
					// Get the sub-components
					ThreadGroupImplementation composite = (ThreadGroupImplementation) component;
					EList<Subcomponent> subcomponents = composite.getAllSubcomponents();
					Logger.getLogger(getClass()).debug("subcomponents: " + subcomponents);
					
					for (AGCLContract contract : AGCLSyntaxUtil.getViewpointContracts(obj, viewpointContext)) {
						if (monitor.isCanceled()) return null;
						String viewpointName = contract.getName();

						// Collect relevant contracts of the subcomponents 
						List<AGCLContract> subcontracts = new ArrayList<AGCLContract>();
						for (Subcomponent subcomponent : subcomponents) {
							if (monitor.isCanceled()) return null;
							if (subcomponent == null) continue;
							ComponentClassifier subcomponentClassifier = subcomponent.getClassifier();
							Logger.getLogger(getClass()).debug("subcomponent '" + subcomponent.getFullName() + "' with classifier '" + ((subcomponentClassifier == null) ? "null" : subcomponentClassifier.getFullName()));
							subcontracts.addAll(AGCLSyntaxUtil.getViewpointContracts(subcomponentClassifier, viewpointName, viewpointContext));
						}
						((CompositeAnalysis)algorithm).checkSubcontractsSatisfyCompositeContainerContract(subcontracts, contract, viewpointName, componentName);
					}
				}
				monitor.worked(1);
				return null;
			}
		};
	}


}
