package org.osate.xtext.aadl2.agcl.analysis.results;
 

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.serializer.ISerializer;
import org.osate.xtext.aadl2.agcl.agcl.PSLSpec;
import org.osate.xtext.aadl2.agcl.analysis.AGCLAnalysisPlugin;
import org.osate.xtext.aadl2.agcl.analysis.config.IPreferenceConstants;
import org.osate.xtext.aadl2.agcl.analysis.util.AGCLUtil;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Component;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ComponentCollection;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Model;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Negative;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Positive;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ResultEntry;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ResultsCollection;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationResult;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersFactory;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Viewpoint;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ViewpointCollection;

/**
 * Objects of this class collect verification results, which can be queried by viewpoint or by component.
 * 
 * @author Ernesto Posse
 *
 */
public class AnalysisResults {

	private EMap<String, EMap<String, VerificationResult>> allResults;
	private ViewpointCollection viewpointCollection;
	private ComponentCollection componentCollection;
	private IFolder resultsFolder;
	private Resource resourceContext;
	private ResultsCollection resultsCollection; // This is the object that is persisted
	private ResourceSet resourceSet;
	private ISerializer serializer;
	
	public static final String BYVIEWPOINT = "by viewpoint";
	public static final String BYCOMPONENT = "by component";
	
	public AnalysisResults(Resource resourceContext) {
		allResults = new BasicEMap<String, EMap<String, VerificationResult>>();
		viewpointCollection = AGCLAnalysisPlugin.getDefault().getActiveModelChecker().getViewpointCollection();
		componentCollection = AGCLAnalysisPlugin.getDefault().getActiveModelChecker().getComponentCollection();
		this.resultsFolder = AGCLUtil.openResultsDir(resourceContext);
		this.resourceContext = resourceContext;
		resultsCollection = AGCLAnalysisPlugin.getDefault().getActiveModelChecker().getResults();
		resourceSet = new ResourceSetImpl();
		serializer = AGCLAnalysisPlugin.getDefault().getSerializer();
	}
	
	public void recordResult(String viewpointName, String componentName, VerificationResult result) {
//		viewpointCollection.addViewpoint(viewpointName, null);
//		componentCollection.addComponent(componentName, null);
		if (allResults.containsKey(viewpointName)) {
			EMap<String, VerificationResult> viewpointResults = allResults.get(viewpointName);
			viewpointResults.put(componentName, result);
		}
		else {
			EMap<String, VerificationResult> viewpointResults = new BasicEMap<String,VerificationResult>();
			viewpointResults.put(componentName, result);
			allResults.put(viewpointName, viewpointResults);
		}
		
	}
	
	public VerificationResult getResult(String viewpointName, String componentName) {
		EMap<String, VerificationResult> viewpointResults = allResults.get(viewpointName);
		return viewpointResults.get(componentName);
	}
	
	public VerificationResult getResult(Viewpoint viewpoint, Component component) {
		return getResult(viewpoint.getName(), component.getName());
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
		for (Viewpoint viewpoint: viewpointCollection.getViewpoints()) {
			for (Component component: componentCollection.getComponents()) {
				VerificationResult result = getResult(viewpoint, component);
				String resultStr = resultToString(result);
				String row = String.format(rowFormat, viewpoint.getName(), component.getName(), resultStr);
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
		for (Component component: componentCollection.getComponents()) {
			for (Viewpoint viewpoint: viewpointCollection.getViewpoints()) {
				VerificationResult result = getResult(viewpoint, component);
				String resultStr = resultToString(result);
				String row = String.format(rowFormat, viewpoint.getName(), component.getName(), resultStr);
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
		for (ResultEntry entry : resultsCollection.getEntries()) {
			String v = entry.getVerificationUnit().getViewpoint().getName();
			String c = entry.getVerificationUnit().getComponent().getName();
			VerificationResult r = entry.getResult();
			recordResult(v, c, r);
		}
		String option = AGCLAnalysisPlugin.getDefault().getPreferenceStore().getString(IPreferenceConstants.ANALYSIS_RESULTS_OPTION_PREFERENCE);
		saveResults(option);
		saveResultsCollection();
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
	
	public void saveResultsCollection() {
		Logger.getLogger(getClass()).info("saving resultscollection");
		URI uri = resourceContext.getURI();
		String resourceName = uri.lastSegment();
		String newFileName = resourceName.replace('.', '_') + ".xml";
		IFile newResultsFile = resultsFolder.getFile("results_" + newFileName);
//		AGCLUtil.saveEObject(newResultsFile, resourceSet, resultsCollection);
		IFile file = newResultsFile;
		Logger.getLogger(AGCLUtil.class).debug("saving EObject to file: '" + file.getName() + "'");
		java.net.URI javaURI = file.getLocationURI();
		Logger.getLogger(AGCLUtil.class).debug("java uri: '" + javaURI + "'");
		org.eclipse.emf.common.util.URI emfURI = org.eclipse.emf.common.util.URI.createURI(javaURI.toString());
		Logger.getLogger(AGCLUtil.class).debug("emf uri: '" + emfURI + "'");
		Resource newResource = resourceSet.createResource(emfURI);
		Logger.getLogger(AGCLUtil.class).debug("new resource uri: '" + newResource.getURI() + "'");
		newResource.getContents().add(resultsCollection);
		newResource.getContents().add(viewpointCollection);
		newResource.getContents().add(componentCollection);
		for (ResultEntry entry : resultsCollection.getEntries()) {
			addResultEntryToResource(newResource, entry);
		}
		//logResourcesToSave(newResource);
		try {
			newResource.save(null);
		} catch (IOException e) {
			Logger.getLogger(getClass()).error("unable to save resource: " + newFileName);
			e.printStackTrace();
		}
	}
	
	private void addResultEntryToResource(Resource resource, ResultEntry entry) {
		VerificationUnit verificationUnit = entry.getVerificationUnit();
		VerificationResult result = entry.getResult();
		addVerificationUnitToResource(resource, verificationUnit);
		resource.getContents().add(result);
	}
	
	private void addVerificationUnitToResource(Resource resource, VerificationUnit verificationUnit) {
		Model model = verificationUnit.getModel();
		Specification spec = verificationUnit.getSpecification();
		replacePSLSpecWithString(model);
		replacePSLSpecWithString(spec);
		resource.getContents().add(model);
		resource.getContents().add(spec);
		resource.getContents().add(verificationUnit);
	}
	
	private void replacePSLSpecWithString(Model model) {
		Object internalModel = model.getModel();
		Object internalContext = model.getContext();
		model.setModel(PSLSpecToString(internalModel));
		model.setContext(PSLSpecToString(internalContext));
	}
	
	private void replacePSLSpecWithString(Specification spec) {
		Object internalSpec = spec.getSpec();
		Object internalContext = spec.getContext();
		spec.setSpec(PSLSpecToString(internalSpec));
		spec.setContext(PSLSpecToString(internalContext));
	}

	private String PSLSpecToString(Object obj) {
		String result = null;
		if (obj instanceof PSLSpec) {
			result = serializer.serialize((PSLSpec) obj);
		}
		return result;
	}
	
	private void logResourcesToSave(Resource newResource) {
		int i = 0;
		TreeIterator<EObject> iter = newResource.getAllContents();
		while (iter.hasNext()) {
			EObject eobj = iter.next();
			Logger.getLogger(getClass()).debug("  " + i + ") resource to save: " + eobj);
			if (eobj instanceof Specification) {
				Specification spec = (Specification) eobj;
				EObject parent = eobj.eContainer();
				Logger.getLogger(getClass()).debug("      internal spec: " + spec.getSpec());
				Object obj = spec.getSpec();
				if (obj != null)
					Logger.getLogger(getClass()).debug("      internal spec class: " + obj.getClass().getCanonicalName());
				Logger.getLogger(getClass()).debug("      internal context: " + spec.getContext());
				Object obj2 = spec.getContext();
				if (obj2 != null)	
					Logger.getLogger(getClass()).debug("      internal context class: " + obj2.getClass().getCanonicalName());
				
				Logger.getLogger(getClass()).debug("      contained in : " + parent);
			}
			if (eobj instanceof Model) {
				Model mod = (Model) eobj;
				EObject parent = eobj.eContainer();
				Logger.getLogger(getClass()).debug("      internal model: " + mod.getModel());
				Object obj = mod.getModel();
				if (obj != null)
					Logger.getLogger(getClass()).debug("      internal model class: " + obj.getClass().getCanonicalName());
				Logger.getLogger(getClass()).debug("      internal context: " + mod.getContext());
				Object obj2 = mod.getContext();
				if (obj2 != null)
					Logger.getLogger(getClass()).debug("      internal context class: " + obj2.getClass().getCanonicalName());
				
				Logger.getLogger(getClass()).debug("      contained in : " + parent);
			}
			TreeIterator<EObject> subiter = eobj.eAllContents();
			while (subiter.hasNext()) {
				EObject subobj = subiter.next();
				EObject subparent = subobj.eContainer();
				Logger.getLogger(getClass()).debug("        sub object: " + subobj);
				Logger.getLogger(getClass()).debug("        contained in : " + subparent);
			}
			i++;
		}
	}
	
	public void loadResultsCollection() {
		
	}

}
