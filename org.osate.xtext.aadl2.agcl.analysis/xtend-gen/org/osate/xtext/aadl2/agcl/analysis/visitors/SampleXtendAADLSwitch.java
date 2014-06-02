package org.osate.xtext.aadl2.agcl.analysis.visitors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.aadl2.modelsupport.modeltraversal.AadlProcessingSwitchWithProgress;
import org.osate.xtext.aadl2.agcl.analysis.visitors.SampleXtendAADLSwitchDelegate;
import org.osate.xtext.aadl2.agcl.analysis.visitors.SampleXtendAGCLSwitchDelegate;

@SuppressWarnings("all")
public class SampleXtendAADLSwitch extends AadlProcessingSwitchWithProgress {
  private SampleXtendAADLSwitchDelegate theAADLSwitch;
  
  private SampleXtendAGCLSwitchDelegate theAGCLSwitch = new SampleXtendAGCLSwitchDelegate();
  
  public SampleXtendAADLSwitch(final IProgressMonitor pm) {
    super(pm);
    this.theAADLSwitch.setMonitor(pm);
    this.theAGCLSwitch.setMonitor(pm);
  }
  
  protected void initSwitches() {
    SampleXtendAADLSwitchDelegate _sampleXtendAADLSwitchDelegate = new SampleXtendAADLSwitchDelegate(this.theAGCLSwitch);
    this.aadl2Switch = _sampleXtendAADLSwitchDelegate;
  }
}
