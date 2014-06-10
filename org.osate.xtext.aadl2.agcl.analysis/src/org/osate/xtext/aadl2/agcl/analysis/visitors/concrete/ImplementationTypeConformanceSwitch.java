/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.visitors.concrete;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.ThreadImplementation;
import org.osate.aadl2.ThreadType;
import org.osate.aadl2.modelsupport.util.AadlUtil;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause;
import org.osate.xtext.aadl2.agcl.agcl.AGCLBehaviour;
import org.osate.xtext.aadl2.agcl.agcl.AGCLContract;
import org.osate.xtext.aadl2.agcl.agcl.util.AgclSwitch;
import org.osate.xtext.aadl2.agcl.analysis.visitors.CommonAGCLAnalysisSwitch;
import org.osate.xtext.aadl2.agcl.analysis.visitors.ViewpointContext;
import org.w3c.dom.Element;

/**
 * This class implements the implementation/type conformance analysis algorithm, this is, it checks whether
 * all thread or thread group implementations contracts conform to their respective type's contract with
 * respect to a given viewpoint.
 * 
 * @author eposse
 *
 */
public class ImplementationTypeConformanceSwitch extends
		CommonAGCLAnalysisSwitch {

	public ImplementationTypeConformanceSwitch(IProgressMonitor pm,
			ViewpointContext viewpointContext) {
		super(pm, viewpointContext);
		// TODO Auto-generated constructor stub
	}

//	public ImplementationTypeConformanceSwitch(IProgressMonitor pm,
//			ViewpointContext viewpointContext, AnalysisResults analysisResults) {
//		super(pm, viewpointContext, analysisResults);
//		// TODO Auto-generated constructor stub
//	}

	@Override
	protected void initAGCLSwitch() {
		agclSwitch = new AgclSwitch<Void>() {
			public Void caseAGCLAnnexSubclause(AGCLAnnexSubclause obj) {
				//monitor.subTask("AGCLAnnexSubclause" + obj.getName());
				Classifier component = obj.getContainingClassifier();
				String componentName = component.getName();
				Logger.getLogger(getClass()).info("processing AGCL annex subclause for '" + componentName + "'");
				NamedElement owner = (NamedElement) component.getOwner();
				Logger.getLogger(getClass()).debug("owned by '" + owner.getFullName() + "'");
				Classifier enclosing = component.getContainingClassifier();
				Logger.getLogger(getClass()).debug("enclosed by '" + enclosing.getFullName() + "'");
				Classifier extended = component.getExtended();
				Logger.getLogger(getClass()).debug("extends '" + extended == null ? "null" : extended.getFullName() + "'");
				EList<Classifier> allParents = component.allParents();
				for (Classifier c: allParents) {
					Logger.getLogger(getClass()).debug("ancestor: '" + c == null ? "null" : c.getFullName() + "'");
				}
				EList<Classifier> allImmediateParents = component.parents();
				for (Classifier c: allImmediateParents) {
					Logger.getLogger(getClass()).debug("parent: '" + c == null ? "null" : c.getFullName() + "'");
				}
				if (component instanceof ThreadImplementation) {
					ThreadImplementation ti = (ThreadImplementation) component;
					ThreadType tt = ti.getType();
					Logger.getLogger(getClass()).debug("thread type: " + tt.getFullName());
					
				}
				// Get the component's behaviour specified in this annex sub-clause
				// Go through all contracts in this annex  sub-clause...
				for (AGCLContract contract : obj.getContracts()) {
					String viewpointName = contract.getName();
					if (viewpointContext.containsViewpointToVerify(viewpointName)) {
						AGCLContract parentContract = null;
						// We verify only the contracts which belong to a viewpoint marked for verification 
						checkThisContractSatisfiesParentContract(contract, parentContract, viewpointName, componentName);
					}
				}
				//monitor.worked(1);
				return null;
			}
		};
	}

	public void checkThisContractSatisfiesParentContract(
			AGCLContract contract, AGCLContract parentContract, String viewpointName,
			String componentName) {
		// TODO Auto-generated method stub
		
	}


}
