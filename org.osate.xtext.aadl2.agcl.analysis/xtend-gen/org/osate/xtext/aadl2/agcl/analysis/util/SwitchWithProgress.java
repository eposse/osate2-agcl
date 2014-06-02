package org.osate.xtext.aadl2.agcl.analysis.util;

import org.eclipse.emf.ecore.EObject;
import org.osate.xtext.aadl2.agcl.analysis.util.ObjectWithProgressMonitor;

@SuppressWarnings("all")
public interface SwitchWithProgress<T extends Object> extends ObjectWithProgressMonitor {
  public abstract T doSwitch(final EObject eObject);
}
