package org.osate.xtext.aadl2.agcl.analysis.visitors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause;
import org.osate.xtext.aadl2.agcl.agcl.AGCLBehaviour;
import org.osate.xtext.aadl2.agcl.agcl.PSLFormula;
import org.osate.xtext.aadl2.agcl.agcl.PSLSpec;
import org.osate.xtext.aadl2.agcl.agcl.util.AgclSwitch;
import org.osate.xtext.aadl2.agcl.analysis.util.SwitchWithProgress;

@SuppressWarnings("all")
public class SampleXtendAGCLSwitchDelegate extends AgclSwitch<String> implements SwitchWithProgress<String> {
  private IProgressMonitor _monitor;
  
  public IProgressMonitor getMonitor() {
    return this._monitor;
  }
  
  public void setMonitor(final IProgressMonitor monitor) {
    this._monitor = monitor;
  }
  
  public String caseAGCLAnnexSubclause(final AGCLAnnexSubclause obj) {
    IProgressMonitor _monitor = this.getMonitor();
    String _name = obj.getName();
    String _plus = ("AGCL Annex subclause" + _name);
    _monitor.subTask(_plus);
    InputOutput.<String>println("* AGCL Annex subclause");
    String _name_1 = obj.getName();
    String _plus_1 = ("    name = \'" + _name_1);
    String _plus_2 = (_plus_1 + "\'");
    InputOutput.<String>println(_plus_2);
    AGCLBehaviour _behaviour = obj.getBehaviour();
    final String ms = this.doSwitch(_behaviour);
    InputOutput.<String>println((("    result = \'" + ms) + "\'"));
    IProgressMonitor _monitor_1 = this.getMonitor();
    _monitor_1.worked(1);
    return obj.toString();
  }
  
  public String caseAGCLBehaviour(final AGCLBehaviour obj) {
    IProgressMonitor _monitor = this.getMonitor();
    PSLSpec _spec = obj.getSpec();
    PSLFormula _formula = _spec.getFormula();
    String _string = _formula.toString();
    String _plus = ("AGCL behaviour" + _string);
    _monitor.subTask(_plus);
    InputOutput.<String>println("* AGCL behaviour");
    PSLSpec _spec_1 = obj.getSpec();
    PSLFormula _formula_1 = _spec_1.getFormula();
    String _string_1 = _formula_1.toString();
    String _plus_1 = ("    formula = \'" + _string_1);
    String _plus_2 = (_plus_1 + "\'");
    InputOutput.<String>println(_plus_2);
    IProgressMonitor _monitor_1 = this.getMonitor();
    _monitor_1.worked(1);
    return obj.toString();
  }
}
