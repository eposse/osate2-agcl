package org.osate.xtext.aadl2.agcl.analysis.results;
 
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.util.StringInputStream;
import org.osate.xtext.aadl2.agcl.analysis.AGCLAnalysisPlugin;
import org.osate.xtext.aadl2.agcl.analysis.config.IPreferenceConstants;
import org.osate.xtext.aadl2.agcl.analysis.util.AGCLUtil;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Negative;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Positive;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationResult;

/**
 * Objects of this class collect verification results, which can be queried by viewpoint or by component.
 * 
 * @author Ernesto Posse
 *
 */
public class AnalysisResults {

	// TODO: change allResults to EMap for persistence
	private Map<String, Map<String, VerificationResult>> allResults;
	private Set<String> allViewpointNames;
	private Set<String> allComponentNames;
	private IFolder resultsFolder;
	private Resource resourceContext;
	
	public static final String BYVIEWPOINT = "by viewpoint";
	public static final String BYCOMPONENT = "by component";
	
	public AnalysisResults(Resource resourceContext) {
		allResults = new HashMap<String, Map<String, VerificationResult>>();
		allViewpointNames = new HashSet<String>();
		allComponentNames = new HashSet<String>();
		this.resultsFolder = AGCLUtil.openResultsDir(resourceContext);
		this.resourceContext = resourceContext;
	}
	
	public void recordResult(String viewpointName, String componentName, VerificationResult result) {
		allViewpointNames.add(viewpointName);
		allComponentNames.add(componentName);
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
	
	public static String resultToString(VerificationResult r) {
		if (r instanceof Positive) return resultToString((Positive) r);
		else if (r instanceof Negative) return resultToString((Negative) r);
		else return "???";
	}
	
	public static String resultToString(Positive r) {
		return "satisfied";
	}

	public static String resultToString(Negative r) {
		return "not satisfied";
	}
	
	public String allResultsByViewpointToString() {
		String table = "";
		final int colWidth = 20;
		final String rowFormat = getRowFormat(colWidth);
		table += tableHeader(colWidth, "Viewpoint", "Component", "Result");
		for (String viewpointName: allViewpointNames) {
			for (String componentName: allComponentNames) {
				VerificationResult result = getResult(viewpointName, componentName);
				String resultStr = resultToString(result);
				String row = String.format(rowFormat, viewpointName, componentName, resultStr);
				table += row;
			}
		}
		return table;
	}

	public String allResultsByComponentToString() {
		String table = "";
		final int colWidth = 20;
		final String rowFormat = getRowFormat(colWidth);
		table += tableHeader(colWidth, "Component", "Viewpoint", "Result");
		for (String componentName: allComponentNames) {
			for (String viewpointName: allViewpointNames) {
				VerificationResult result = getResult(viewpointName, componentName);
				String resultStr = resultToString(result);
				String row = String.format(rowFormat, componentName, viewpointName, resultStr);
				table += row;
			}
		}
		return table;
	}
	
	private static String getRowFormat(int colWidth) {
		return String.format(" %%-%ds | %%-%ds | %%s\n", colWidth, colWidth);
	}

	private String tableHeader(int colWidth, String firstColLabel, String secondColLabel, String thirdColLabel) {
		String header = "";
		final String rowFormat = getRowFormat(colWidth);
		final String firstRow = String.format(rowFormat, firstColLabel, secondColLabel, thirdColLabel);
		final String horizontalLine = AGCLUtil.repchar('-', colWidth + 2);
		final String sepLine= horizontalLine + "+" + horizontalLine + "+" + horizontalLine + "\n";
		header += firstRow;
		header += sepLine;
		return header;
	}
	
	public void saveResults() {
		String option = AGCLAnalysisPlugin.getDefault().getPreferenceStore().getString(IPreferenceConstants.ANALYSIS_RESULTS_OPTION_PREFERENCE);
		saveResults(option);
	}

	public void saveResults(String option) {
		Logger.getLogger(getClass()).info("saving results with option: " + option);
		URI uri = resourceContext.getURI();
		String resourceName = uri.lastSegment();
		String newFileName = resourceName.replace('.', '_') + ".txt";
		IFile newResultsFile = resultsFolder.getFile("results_" + newFileName);
		String text = "";
		if (option.equals(BYVIEWPOINT)) {
			text = allResultsByViewpointToString();
		}
		else {
			text = allResultsByComponentToString();
		}
		AGCLUtil.saveFile(newResultsFile, text);
	}

}
