package org.osate.xtext.aadl2.agcl.analysis.visitors

import org.osate.xtext.aadl2.agcl.agcl.util.AgclSwitch
import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause
import org.osate.xtext.aadl2.agcl.analysis.util.SwitchWithProgress
import org.eclipse.core.runtime.IProgressMonitor
import org.osate.xtext.aadl2.agcl.agcl.AGCLBehaviour

class SampleXtendAGCLSwitchDelegate extends AgclSwitch<String> implements SwitchWithProgress<String> {
    
    @Property IProgressMonitor monitor
    
    override caseAGCLAnnexSubclause(AGCLAnnexSubclause obj) {
        monitor.subTask("AGCL Annex subclause" + obj.getName());
        println("* AGCL Annex subclause");
        println("    name = '" + obj.getName() + "'");
        val ms = this.doSwitch(obj.getBehaviour());
        println("    result = '" + ms + "'");
//        val s = serializer.serialize(obj);
//        println("    serialized = '" + s + "'");
        monitor.worked(1);
        return obj.toString();
        
    }
    override caseAGCLBehaviour(AGCLBehaviour obj) {
        monitor.subTask("AGCL behaviour" + obj.getSpec().getFormula().toString());
        println("* AGCL behaviour");
        println("    formula = '" + obj.getSpec().getFormula().toString() + "'");
//        String s = serializer.serialize(obj);
//        println("    serialized = '" + s + "'");
        monitor.worked(1);
        return obj.toString();
    }

}