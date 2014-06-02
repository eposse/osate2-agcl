package org.osate.xtext.aadl2.agcl.analysis.visitors

import org.eclipse.core.runtime.IProgressMonitor
import org.osate.aadl2.modelsupport.modeltraversal.AadlProcessingSwitchWithProgress

class SampleXtendAADLSwitch extends AadlProcessingSwitchWithProgress {
    
    SampleXtendAADLSwitchDelegate theAADLSwitch
    SampleXtendAGCLSwitchDelegate theAGCLSwitch = new SampleXtendAGCLSwitchDelegate
    
    public new(IProgressMonitor pm) {
        super(pm)
        theAADLSwitch.monitor = pm
        theAGCLSwitch.monitor = pm
    }
    
    override protected initSwitches() {
        aadl2Switch = new SampleXtendAADLSwitchDelegate(theAGCLSwitch)
    }
    
}