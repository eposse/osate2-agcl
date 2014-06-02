/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.visitors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.aadl2.modelsupport.errorreporting.AnalysisErrorReporterManager;
import org.osate.aadl2.modelsupport.modeltraversal.AadlProcessingSwitchWithProgress;

/**
 * This class implements the implementation/type conformance analysis algorithm, this is, it checks whether
 * all thread or thread group implementations contracts conform to their respective type's contract with
 * respect to a given viewpoint.
 * 
 * @author eposse
 *
 */
public class ImplementationTypeConformanceSwitch extends
		AadlProcessingSwitchWithProgress {

	/**
	 * @param pm
	 */
	public ImplementationTypeConformanceSwitch(IProgressMonitor pm) {
		super(pm);
	}

	/* (non-Javadoc)
	 * @see org.osate.aadl2.modelsupport.modeltraversal.AadlProcessingSwitch#initSwitches()
	 */
	@Override
	protected void initSwitches() {
		// TODO Auto-generated method stub

	}

}
