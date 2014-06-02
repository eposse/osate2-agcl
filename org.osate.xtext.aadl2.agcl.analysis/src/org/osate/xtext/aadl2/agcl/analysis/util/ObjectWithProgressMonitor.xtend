package org.osate.xtext.aadl2.agcl.analysis.util

import org.eclipse.core.runtime.IProgressMonitor

interface ObjectWithProgressMonitor {
    def IProgressMonitor getMonitor()
    def void setMonitor(IProgressMonitor monitor)
}