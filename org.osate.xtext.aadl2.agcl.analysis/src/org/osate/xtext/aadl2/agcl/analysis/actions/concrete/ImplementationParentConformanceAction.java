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
package org.osate.xtext.aadl2.agcl.analysis.actions.concrete;

import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.xtext.aadl2.agcl.analysis.actions.CommonAGCLAction;
import org.osate.xtext.aadl2.agcl.analysis.visitors.CommonAGCLAnalysisSwitch;
import org.osate.xtext.aadl2.agcl.analysis.visitors.ViewpointContext;
import org.osate.xtext.aadl2.agcl.analysis.visitors.concrete.ImplementationParentConformanceSwitch;

/**
 * This class provides the action that performs an implementation/parent contract conformance analysis.
 * 
 * <p>The actual algorithm implementing the analysis is in class {@link ImplementationParentConformanceSwitch}. 
 * 
 * @author Ernesto Posse
 *
 */
public class ImplementationParentConformanceAction extends
		CommonAGCLAction {

	/* (non-Javadoc)
	 * @see org.osate.ui.actions.AbstractAaxlAction#getActionName()
	 */
	@Override
	protected String getActionName() {
		return "ImplementationParentConformanceAction";
	}

	@Override
	protected CommonAGCLAnalysisSwitch createConcreteAnalysisSwitch(
			IProgressMonitor monitor, ViewpointContext viewpointContext) {
		return new ImplementationParentConformanceSwitch(monitor, viewpointContext);
	}

}
