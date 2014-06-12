package org.osate.xtext.aadl2.agcl.analysis.misc;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.util.Switch;
import org.osate.xtext.aadl2.agcl.analysis.misc.SwitchWithProgress;

@Deprecated
@SuppressWarnings("all")
public abstract class AnnexSwitchWithProgressDelegate<T extends Object> extends Switch<T> implements SwitchWithProgress<T> {
  private IProgressMonitor _monitor;
  
  public IProgressMonitor getMonitor() {
    return this._monitor;
  }
  
  public void setMonitor(final IProgressMonitor monitor) {
    this._monitor = monitor;
  }
}
