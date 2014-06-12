package org.osate.xtext.aadl2.agcl.analysis.misc;

import org.eclipse.emf.ecore.EObject;
import org.osate.xtext.aadl2.agcl.analysis.misc.ObjectWithProgressMonitor;

@Deprecated
@SuppressWarnings("all")
public interface SwitchWithProgress<T extends Object> extends ObjectWithProgressMonitor {
  public abstract T doSwitch(final EObject eObject);
}
