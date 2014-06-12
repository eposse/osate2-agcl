package org.osate.xtext.aadl2.agcl.analysis.misc

import org.osate.aadl2.util.Aadl2Switch
import org.osate.xtext.aadl2.agcl.analysis.misc.SwitchWithProgress
import org.eclipse.core.runtime.IProgressMonitor 

@Deprecated
abstract class AADLSwitchWithProgressDelegate<T> extends Aadl2Switch<T> implements SwitchWithProgress<T> {
    
    @Property IProgressMonitor monitor
    protected SwitchWithProgress<T> annexSwitch
    
    new(SwitchWithProgress<T> annexSwitch) {
        this.annexSwitch = annexSwitch
    }
    
}