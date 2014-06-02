package org.osate.xtext.aadl2.agcl.analysis.visitors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.Element;
import org.osate.aadl2.util.Aadl2Switch;
import org.osate.xtext.aadl2.agcl.analysis.util.SwitchWithProgress;

@SuppressWarnings("all")
public class SampleXtendAADLSwitchDelegate extends Aadl2Switch<String> implements SwitchWithProgress<String> {
  private IProgressMonitor _monitor;
  
  public IProgressMonitor getMonitor() {
    return this._monitor;
  }
  
  public void setMonitor(final IProgressMonitor monitor) {
    this._monitor = monitor;
  }
  
  private SwitchWithProgress<String> annexSwitch;
  
  public SampleXtendAADLSwitchDelegate(final SwitchWithProgress<String> annexSwitch) {
    this.annexSwitch = annexSwitch;
  }
  
  public String caseAnnexSubclause(final AnnexSubclause obj) {
    IProgressMonitor _monitor = this.getMonitor();
    String _name = obj.getName();
    String _plus = ("AnnexSubclause" + _name);
    _monitor.subTask(_plus);
    InputOutput.<String>println("* Annex Subclause");
    String _name_1 = obj.getName();
    String _plus_1 = ("    name = \'" + _name_1);
    String _plus_2 = (_plus_1 + "\'");
    InputOutput.<String>println(_plus_2);
    Classifier _containingClassifier = obj.getContainingClassifier();
    String _fullName = _containingClassifier.getFullName();
    String _plus_3 = ("    containing classifier = " + _fullName);
    InputOutput.<String>println(_plus_3);
    Element _owner = obj.getOwner();
    String _string = _owner.toString();
    String _plus_4 = ("    owner = " + _string);
    InputOutput.<String>println(_plus_4);
    final String annexResult = this.annexSwitch.doSwitch(obj);
    InputOutput.<String>println(("    annex result = " + annexResult));
    IProgressMonitor _monitor_1 = this.getMonitor();
    _monitor_1.worked(1);
    return obj.toString();
  }
}
