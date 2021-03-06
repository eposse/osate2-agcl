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
package org.osate.xtext.aadl2.agcl.analysis.misc;

import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.aadl2.util.Aadl2Switch;
import org.osate.xtext.aadl2.agcl.analysis.misc.SwitchWithProgress;

@Deprecated
@SuppressWarnings("all")
public abstract class AADLSwitchWithProgressDelegate<T extends Object> extends Aadl2Switch<T> implements SwitchWithProgress<T> {
  private IProgressMonitor _monitor;
  
  public IProgressMonitor getMonitor() {
    return this._monitor;
  }
  
  public void setMonitor(final IProgressMonitor monitor) {
    this._monitor = monitor;
  }
  
  protected SwitchWithProgress<T> annexSwitch;
  
  public AADLSwitchWithProgressDelegate(final SwitchWithProgress<T> annexSwitch) {
    this.annexSwitch = annexSwitch;
  }
}
