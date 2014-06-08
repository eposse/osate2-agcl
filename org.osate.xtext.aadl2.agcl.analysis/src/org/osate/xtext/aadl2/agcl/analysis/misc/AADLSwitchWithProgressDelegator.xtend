package org.osate.xtext.aadl2.agcl.analysis.misc

import org.osate.aadl2.modelsupport.modeltraversal.AadlProcessingSwitchWithProgress
import org.eclipse.core.runtime.IProgressMonitor

class AADLSwitchWithProgressDelegator<T> extends AadlProcessingSwitchWithProgress {
    
    private org.osate.xtext.aadl2.agcl.analysis.misc.AADLSwitchWithProgressDelegate<T> aadlSwitchDelegate
    private org.osate.xtext.aadl2.agcl.analysis.misc.AnnexSwitchWithProgressDelegate<T> annexSwitchDelegate
    
    protected new(IProgressMonitor pm, 
        org.osate.xtext.aadl2.agcl.analysis.misc.AADLSwitchWithProgressDelegate<T> aadlSwitchDelegate,
        org.osate.xtext.aadl2.agcl.analysis.misc.AnnexSwitchWithProgressDelegate<T> annexSwitchDelegate
    ) {
        super(pm)
        this.aadlSwitchDelegate = aadlSwitchDelegate
        this.annexSwitchDelegate = annexSwitchDelegate
        aadlSwitchDelegate.monitor = pm
        annexSwitchDelegate.monitor = pm
    }
    
    override protected initSwitches() {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
}