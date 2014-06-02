package org.osate.xtext.aadl2.agcl.analysis.util

import org.osate.aadl2.util.Aadl2Switch
import org.osate.xtext.aadl2.agcl.analysis.util.SwitchWithProgress
import org.eclipse.core.runtime.IProgressMonitor

abstract class AADLSwitchWithProgressDelegate<T> extends Aadl2Switch<T> implements SwitchWithProgress<T> {
    
    @Property IProgressMonitor monitor
    protected SwitchWithProgress<T> annexSwitch
    
    new(SwitchWithProgress<T> annexSwitch) {
        this.annexSwitch = annexSwitch
    }
    
}