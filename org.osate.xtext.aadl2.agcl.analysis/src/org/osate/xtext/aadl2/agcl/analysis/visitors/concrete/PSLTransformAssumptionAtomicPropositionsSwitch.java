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
package org.osate.xtext.aadl2.agcl.analysis.visitors.concrete;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.ISerializer;
import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.ConnectedElement;
import org.osate.aadl2.Connection;
import org.osate.xtext.aadl2.agcl.agcl.AgclFactory;
import org.osate.xtext.aadl2.agcl.agcl.Input;
import org.osate.xtext.aadl2.agcl.agcl.Output;
import org.osate.xtext.aadl2.agcl.analysis.AGCLAnalysisPlugin;
import org.osate.xtext.aadl2.agcl.analysis.visitors.PSLHomomorphismExplicitSwitch;

/**
 * This map transforms atomic propositions in a guarantee of the form
 * 
 * <p> <em>direction</em> <em>port</em> : <em>signal</em>
 * 
 * <p> into 
 * 
 * <p> <em>dual(direction)</em> <em>connector</em> : <em>signal</em>
 * 
 * <p> where <em>direction</em> is either {@code in} or {@code out} and 
 * 
 * <p> <em>dual(</em>{@code in}<em>)</em> = {@code out}
 * <p> <em>dual(</em>{@code out}<em>)</em> = {@code in}
 * 
 * <p> This corresponds to the function <em>ahat</em> in Definition 26 of 
 * 
 * <p> Ernesto Posse, <em>Contract-based compositional analysis for reactive systems in RTEdge, an
 * AADL-based language</em>, Technical Report 2013-607, School of Computing, Queen's University. Sept. 2013.
 * <a href="http://sites.cs.queensu.ca/tr/">http://sites.cs.queensu.ca/tr/</a>
 * 
 * <p> Note that in that report, ports are divided into base ports and conjugate ports, while signals are
 * input or output. That entails that in the transformation, the direction of base ports is preserved while
 * the direction of conjugate ports is flipped (in to out, out to in). However, AADL has no such distinction
 * between base and conjugate ports, so in this case the direction is always preserved.
 * 
 * @author Ernesto Posse
 *
 */
public class PSLTransformAssumptionAtomicPropositionsSwitch extends PSLHomomorphismExplicitSwitch {
	
	private ISerializer serializer;
	protected ComponentClassifier component;
	protected ComponentImplementation container;
	
	public PSLTransformAssumptionAtomicPropositionsSwitch(ComponentClassifier component, ComponentImplementation container) {
		this.component = component;
		this.container = container;
		serializer = AGCLAnalysisPlugin.getDefault().getSerializer();
	}

	public EObject caseInput(Input ap) {
		String connectorName = getConnector(ap.getLink());
		Output newOutput = AgclFactory.eINSTANCE.createOutput();
		newOutput.setLink(connectorName);
		newOutput.setEvent(ap.getEvent());
		Logger.getLogger(getClass()).debug(serializer.serialize(newOutput));
		return newOutput;
	}
	
	public EObject caseOutput(Output ap) {
		String connectorName = getConnector(ap.getLink());
		Input newInput = AgclFactory.eINSTANCE.createInput();
		newInput.setLink(connectorName);
		newInput.setEvent(ap.getEvent());
		Logger.getLogger(getClass()).debug(serializer.serialize(newInput));
		return newInput;
	}

	protected String getConnector(String portName) {
		EList<Connection> allConnections = container.getAllConnections();
		for (Connection connection : allConnections) {
			String connectionName = connection.getFullName();
			Logger.getLogger(getClass()).debug("connection '" + connectionName + "'");
			ConnectedElement source = connection.getSource();
			String sourceName = source.getConnectionEnd().getName(); 
			Logger.getLogger(getClass()).debug("  source '" + sourceName + "'");
			if (sourceName.equals(portName)) return connectionName;
			ConnectedElement target = connection.getDestination();
			String targetName = target.getConnectionEnd().getName(); 
			Logger.getLogger(getClass()).debug("  target '" + targetName + "'");
			if (targetName.equals(portName)) return connectionName;
		}
		return "";
	}
	
}
