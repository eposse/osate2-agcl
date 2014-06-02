package org.osate.xtext.aadl2.agcl.analysis.util

import org.eclipse.emf.ecore.util.Switch
import org.osate.xtext.aadl2.agcl.analysis.util.SwitchWithProgress
import org.eclipse.core.runtime.IProgressMonitor

abstract class AnnexSwitchWithProgressDelegate<T> extends Switch<T> implements SwitchWithProgress<T> {
    
    @Property IProgressMonitor monitor
    
}