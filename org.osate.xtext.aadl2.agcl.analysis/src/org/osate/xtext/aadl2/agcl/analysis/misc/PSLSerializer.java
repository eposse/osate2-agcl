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

import org.osate.xtext.aadl2.agcl.agcl.Input;
import org.osate.xtext.aadl2.agcl.agcl.Output;
import org.osate.xtext.aadl2.agcl.agcl.util.AgclSwitch;

/**
 * Manual implementation of a serializer for PSL expressions within an AGCL specification
 * @author eposse
 *
 */
@Deprecated
public class PSLSerializer extends AgclSwitch<String> {
	
	private String inputKwd = "in ";
	private String outputKwd = "out ";
	private String portSigSep = ":";
		
	public String caseInput(Input obj) {
		return getInputKwd() + obj.getLink() + portSigSep + obj.getEvent();
	}

	public String caseOutput(Output obj) {
		return getOutputKwd() + obj.getLink() + portSigSep + obj.getEvent();
	}

	/**
	 * @return the inputKwd
	 */
	public String getInputKwd() {
		return inputKwd;
	}

	/**
	 * @return the outputKwd
	 */
	public String getOutputKwd() {
		return outputKwd;
	}

	/**
	 * @return the portSigSep
	 */
	public String getPortSigSep() {
		return portSigSep;
	}

	/**
	 * @param inputKwd the inputKwd to set
	 */
	public void setInputKwd(String inputKwd) {
		this.inputKwd = inputKwd;
	}

	/**
	 * @param outputKwd the outputKwd to set
	 */
	public void setOutputKwd(String outputKwd) {
		this.outputKwd = outputKwd;
	}

	/**
	 * @param portSigSep the portSigSep to set
	 */
	public void setPortSigSep(String portSigSep) {
		this.portSigSep = portSigSep;
	}

}
