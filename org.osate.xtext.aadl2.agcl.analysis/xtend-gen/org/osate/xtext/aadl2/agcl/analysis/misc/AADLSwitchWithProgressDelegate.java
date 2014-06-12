package org.osate.xtext.aadl2.agcl.analysis.misc;

import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.aadl2.util.Aadl2Switch;
import org.osate.xtext.aadl2.agcl.analysis.misc.SwitchWithProgress;

@Deprecated
@SuppressWarnings("all")
public abstract class AADLSwitchWithProgressDelegate<T extends Object> extends Aadl2Switch<T> implements SwitchWithProgress<T> {
  private IProgressMonitor _monitor;
  
  public IProgressMonitor getMonitor() {
    return this._monitor;
  }
  
  public void setMonitor(final IProgressMonitor monitor) {
    this._monitor = monitor;
  }
  
  protected SwitchWithProgress<T> annexSwitch;
  
  public AADLSwitchWithProgressDelegate(final SwitchWithProgress<T> annexSwitch) {
    this.annexSwitch = annexSwitch;
  }
}
