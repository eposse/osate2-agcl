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
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.ISerializer;
import org.osate.xtext.aadl2.agcl.agcl.util.AgclSwitch;
import org.osate.xtext.aadl2.agcl.analysis.AGCLAnalysisPlugin;

/**
 * An AGCL-specific visitor (processing switch), very similar to {@code AadlProcessingSwitch} but works on AGCL's 
 * constructs. It provides some traversal methods similar to those in {@link ForAllElement}.
 * 
 * @author Ernesto Posse
 *
 */
public class AgclProcessingSwitch<T> extends AgclSwitch<T> {
	
	private EMap<EObject,T> results; 

	public AgclProcessingSwitch() {
		results = new BasicEMap<EObject,T>();
	}
	
	/**
	 * @return the results
	 */
	public EMap<EObject,T> getResults() {
		return results;
	}

	public void processPreOrderAll(EObject root) {
		ISerializer serializer = AGCLAnalysisPlugin.getDefault().getSerializer();
		TreeIterator<EObject> iterator = root.eAllContents();
		while (iterator.hasNext()) {
			EObject obj = iterator.next();
			Logger.getLogger(getClass()).debug("visiting: '" + serializer.serialize(obj) + "';" + obj);
			T result = doSwitch(obj);
			results.put(obj, result);
		}
	}

}

