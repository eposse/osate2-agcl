package org.osate.xtext.aadl2.agcl.analysis.util

import org.osate.xtext.aadl2.agcl.analysis.util.ObjectWithProgressMonitor
import org.eclipse.emf.ecore.EObject

interface SwitchWithProgress<T> extends ObjectWithProgressMonitor {
    def T doSwitch(EObject eObject)
}