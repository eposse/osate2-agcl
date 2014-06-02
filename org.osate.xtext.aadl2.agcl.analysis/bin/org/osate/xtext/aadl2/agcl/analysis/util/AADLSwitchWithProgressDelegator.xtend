package org.osate.xtext.aadl2.agcl.analysis.util

import org.osate.aadl2.modelsupport.modeltraversal.AadlProcessingSwitchWithProgress
import org.eclipse.core.runtime.IProgressMonitor

class AADLSwitchWithProgressDelegator<T> extends AadlProcessingSwitchWithProgress {
    
    private AADLSwitchWithProgressDelegate<T> aadlSwitchDelegate
    private AnnexSwitchWithProgressDelegate<T> annexSwitchDelegate
    
    protected new(IProgressMonitor pm, 
        AADLSwitchWithProgressDelegate<T> aadlSwitchDelegate,
        AnnexSwitchWithProgressDelegate<T> annexSwitchDelegate
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