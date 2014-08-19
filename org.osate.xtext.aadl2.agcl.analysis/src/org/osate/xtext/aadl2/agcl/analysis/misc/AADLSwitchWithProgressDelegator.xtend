/**
 * Copyright (c) 2014 Ernesto Posse
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 * @author Ernesto Posse
 * @version 0.1 
 */
package org.osate.xtext.aadl2.agcl.analysis.misc

import org.osate.aadl2.modelsupport.modeltraversal.AadlProcessingSwitchWithProgress
import org.eclipse.core.runtime.IProgressMonitor

@Deprecated
class AADLSwitchWithProgressDelegator<T> extends AadlProcessingSwitchWithProgress {
    
    private org.osate.xtext.aadl2.agcl.analysis.misc.AADLSwitchWithProgressDelegate<T> aadlSwitchDelegate
    private org.osate.xtext.aadl2.agcl.analysis.misc.AnnexSwitchWithProgressDelegate<T> annexSwitchDelegate
    
    protected new(IProgressMonitor pm, 
        org.osate.xtext.aadl2.agcl.analysis.misc.AADLSwitchWithProgressDelegate<T> aadlSwitchDelegate,
        org.osate.xtext.aadl2.agcl.analysis.misc.AnnexSwitchWithProgressDelegate<T> annexSwitchDelegate
    ) {
        super(pm)
        this.aadlSwitchDelegate = aadlSwitchDelegate
        this.annexSwitchDelegate = annexSwitchDelegate
        aadlSwitchDelegate.monitor = pm
        annexSwitchDelegate.monitor = pm
    }
    
    override protected initSwitches() {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
}