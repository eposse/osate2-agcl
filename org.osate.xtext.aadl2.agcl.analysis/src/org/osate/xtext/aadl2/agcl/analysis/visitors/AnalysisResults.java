package org.osate.xtext.aadl2.agcl.analysis.visitors;

import java.util.HashMap;
import java.util.Map;

import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationResult;

/**
 * Objects of this class collect verification results, which can be queried by viewpoint or by component.
 * 
 * @author Ernesto Posse
 *
 */
public class AnalysisResults {

	private Map<String, Map<String, VerificationResult>> allResults;
	
	public AnalysisResults() {
		allResults = new HashMap<String, Map<String, VerificationResult>>();
	}
	
	public void recordResult(String viewpointName, String componentName, VerificationResult result) {
		if (allResults.containsKey(viewpointName)) {
			Map<String, VerificationResult> viewpointResults = allResults.get(viewpointName);
			viewpointResults.put(componentName, result);
		}
		else {
			Map<String, VerificationResult> viewpointResults = new HashMap<String,VerificationResult>();
			viewpointResults.put(componentName, result);
			allResults.put(viewpointName, viewpointResults);
		}
	}
	
	public VerificationResult getResult(String viewpointName, String componentName) {
		Map<String, VerificationResult> viewpointResults = allResults.get(viewpointName);
		return viewpointResults.get(componentName);
	}

}
