package org.osate.xtext.aadl2.agcl.analysis.visitors

import org.eclipse.core.runtime.IProgressMonitor
import org.osate.aadl2.AnnexSubclause
import org.osate.aadl2.util.Aadl2Switch
import org.osate.xtext.aadl2.agcl.analysis.util.SwitchWithProgress

class SampleXtendAADLSwitchDelegate extends Aadl2Switch<String> implements SwitchWithProgress<String> {
    
    @Property IProgressMonitor monitor
    SwitchWithProgress<String> annexSwitch
    
    new(SwitchWithProgress<String> annexSwitch) {
        this.annexSwitch = annexSwitch
    }
    
    override caseAnnexSubclause(AnnexSubclause obj) {
        monitor.subTask("AnnexSubclause" + obj.getName());
        println("* Annex Subclause");
        println("    name = '" + obj.getName() + "'");
        println("    containing classifier = " + obj.getContainingClassifier().getFullName());
        println("    owner = " + obj.getOwner().toString());
        val annexResult = annexSwitch.doSwitch(obj);
        println("    annex result = " + annexResult)
        monitor.worked(1);
        return obj.toString();
    }
    
}