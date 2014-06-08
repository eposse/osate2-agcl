package org.osate.xtext.aadl2.agcl.analysis.misc

import org.eclipse.core.runtime.IProgressMonitor

interface ObjectWithProgressMonitor {
    def IProgressMonitor getMonitor()
    def void setMonitor(IProgressMonitor monitor)
}