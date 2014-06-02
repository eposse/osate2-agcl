/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.visitors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.aadl2.modelsupport.errorreporting.AnalysisErrorReporterManager;
import org.osate.aadl2.modelsupport.modeltraversal.AadlProcessingSwitchWithProgress;

/**
 * @author eposse
 *
 */
public class TypeParentConformanceSwitch extends
		AadlProcessingSwitchWithProgress {

	/**
	 * @param pm
	 */
	public TypeParentConformanceSwitch(IProgressMonitor pm) {
		super(pm);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.osate.aadl2.modelsupport.modeltraversal.AadlProcessingSwitch#initSwitches()
	 */
	@Override
	protected void initSwitches() {
		// TODO Auto-generated method stub

	}

}
