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
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.ThreadImplementation;
import org.osate.aadl2.ThreadType;
import org.osate.aadl2.modelsupport.errorreporting.AnalysisErrorReporterManager;
import org.osate.aadl2.modelsupport.modeltraversal.AadlProcessingSwitchWithProgress;
import org.osate.aadl2.util.Aadl2Switch;
import org.osate.xtext.aadl2.agcl.AGCLStandaloneSetup;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause;
import org.osate.xtext.aadl2.agcl.agcl.AGCLBehaviour;
import org.osate.xtext.aadl2.agcl.agcl.AGCLContract;
import org.osate.xtext.aadl2.agcl.agcl.util.AgclSwitch;

import com.google.inject.Injector;

/**
 * @author eposse
 *
 */
@Deprecated
public class AGCLPrintPSLSpecsSwitch extends AadlProcessingSwitchWithProgress {

	private AgclSwitch<String> agclSwitch;
	private ISerializer serializer;

	public AGCLPrintPSLSpecsSwitch(IProgressMonitor pm) {
		super(pm);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.osate.aadl2.modelsupport.modeltraversal.AadlProcessingSwitch#initSwitches()
	 */
	@Override
	protected void initSwitches() {
		Injector injector = new AGCLStandaloneSetup().createInjectorAndDoEMFRegistration();  
		serializer = injector.getInstance(Serializer.class);   
		agclSwitch = new AgclSwitch<String>() {
			public String caseAGCLAnnexSubclause(AGCLAnnexSubclause obj) {
				monitor.subTask("AGCL Annex subclause" + obj.getName());
				System.out.println("* AGCL Annex subclause");
				System.out.println("    name = '" + obj.getName() + "'");
				String ms = agclSwitch.doSwitch(obj.getBehaviour());
				System.out.println("    result = '" + ms + "'");
				String s = serializer.serialize(obj);
				System.out.println("    serialized = '" + s + "'");
				monitor.worked(1);
				return obj.toString();
				
			}
			public String caseAGCLBehaviour(AGCLBehaviour obj) {
				monitor.subTask("AGCL behaviour" + obj.getSpec().getExpr().toString());
				System.out.println("* AGCL behaviour");
				System.out.println("    expr = '" + obj.getSpec().getExpr().toString() + "'");
				String s = serializer.serialize(obj);
				System.out.println("    serialized = '" + s + "'");
				monitor.worked(1);
				return obj.toString();
			}
		};
		aadl2Switch = new Aadl2Switch<String>() {
			public String caseAnnexSubclause(AnnexSubclause obj) {
				monitor.subTask("AnnexSubclause" + obj.getName());
				System.out.println("* Annex Subclause");
				System.out.println("    name = '" + obj.getName() + "'");
				System.out.println("    containing classifier = " + obj.getContainingClassifier().getFullName());
				System.out.println("    owner = " + obj.getOwner().toString());
				String s = serializer.serialize(obj);
				System.out.println("    serialized = '" + s + "'");
				agclSwitch.doSwitch(obj);
				monitor.worked(1);
				return obj.toString();
			}
		};
	}

}
