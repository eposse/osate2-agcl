package org.osate.xtext.aadl2.agcl.analysis.misc

import org.osate.xtext.aadl2.agcl.analysis.misc.ObjectWithProgressMonitor
import org.eclipse.emf.ecore.EObject

@Deprecated
interface SwitchWithProgress<T> extends ObjectWithProgressMonitor {
    def T doSwitch(EObject eObject)
}