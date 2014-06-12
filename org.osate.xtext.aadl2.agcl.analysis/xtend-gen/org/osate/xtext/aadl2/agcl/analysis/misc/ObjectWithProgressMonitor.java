package org.osate.xtext.aadl2.agcl.analysis.misc;

import org.eclipse.core.runtime.IProgressMonitor;

@Deprecated
@SuppressWarnings("all")
public interface ObjectWithProgressMonitor {
  public abstract IProgressMonitor getMonitor();
  
  public abstract void setMonitor(final IProgressMonitor monitor);
}
