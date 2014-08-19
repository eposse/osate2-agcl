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
package org.osate.xtext.aadl2.agcl.analysis.visitors;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexLibrary;
import org.osate.xtext.aadl2.agcl.agcl.AGCLEnforce;
import org.osate.xtext.aadl2.agcl.agcl.AGCLViewpoint;
import org.osate.xtext.aadl2.agcl.agcl.util.AgclSwitch;

/**
 * This class initializes the viewpoint context used by the different analysis switches
 * by collecting declared viewpoints and viewpoints to verify.
 * 
 * @author Ernesto Posse
 *
 */
public class ViewpointContextSwitch extends CommonAGCLAnalysisSwitch {

	/**
	 * @param pm
	 */
	public ViewpointContextSwitch(IProgressMonitor pm, ViewpointContext viewpointContext) {
		super(pm, viewpointContext, null);
	}

	@Override
	protected void initAGCLSwitch() {
		agclSwitch = new AgclSwitch<Void>() {
			public Void caseAGCLAnnexLibrary(AGCLAnnexLibrary obj) {
				monitor.subTask("AGCLAnnexLibrary" + obj.getName());
				if (monitor.isCanceled()) return null;
				
				// We collect all declared viewpoints in this package
				for (AGCLViewpoint v : obj.getViewpoints()) {
					if (monitor.isCanceled()) return null;
					Logger.getLogger(getClass()).info("declared viewpoint: " + v.getName());
					viewpointContext.addDeclaredViewpoint(v.getName());
				}
				
				// We collect the names of all viewpoints to verify, but only those which are declared
				for (AGCLEnforce e : obj.getEnforceclauses()) {
					if (monitor.isCanceled()) return null;
					String viewpointName = e.getName();
					if (viewpointContext.containsDeclaredViewpoint(viewpointName)) {
						viewpointContext.addViewpointToVerify(viewpointName);
						Logger.getLogger(getClass()).info("adding viewpoint to verify: " + viewpointName);
					}
					else {
						Logger.getLogger(getClass()).warn("ignoring undeclared viewpoint: " + viewpointName);
					}
				}
			    monitor.worked(1);
			    monitor.done();
				return null;
			}
		};
	}

}
