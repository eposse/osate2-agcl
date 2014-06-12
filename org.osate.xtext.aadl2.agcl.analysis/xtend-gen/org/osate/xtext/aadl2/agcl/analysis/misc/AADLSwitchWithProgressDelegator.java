package org.osate.xtext.aadl2.agcl.analysis.misc;

import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.aadl2.modelsupport.modeltraversal.AadlProcessingSwitchWithProgress;
import org.osate.xtext.aadl2.agcl.analysis.misc.AADLSwitchWithProgressDelegate;
import org.osate.xtext.aadl2.agcl.analysis.misc.AnnexSwitchWithProgressDelegate;

@Deprecated
@SuppressWarnings("all")
public class AADLSwitchWithProgressDelegator<T extends Object> extends AadlProcessingSwitchWithProgress {
  private AADLSwitchWithProgressDelegate<T> aadlSwitchDelegate;
  
  private AnnexSwitchWithProgressDelegate<T> annexSwitchDelegate;
  
  protected AADLSwitchWithProgressDelegator(final IProgressMonitor pm, final AADLSwitchWithProgressDelegate<T> aadlSwitchDelegate, final AnnexSwitchWithProgressDelegate<T> annexSwitchDelegate) {
    super(pm);
    this.aadlSwitchDelegate = aadlSwitchDelegate;
    this.annexSwitchDelegate = annexSwitchDelegate;
    aadlSwitchDelegate.setMonitor(pm);
    annexSwitchDelegate.setMonitor(pm);
  }
  
  protected void initSwitches() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
