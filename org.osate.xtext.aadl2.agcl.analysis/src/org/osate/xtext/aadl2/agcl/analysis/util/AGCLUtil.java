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
package org.osate.xtext.aadl2.agcl.analysis.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.xtext.util.StringInputStream;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.Element;
import org.osate.aadl2.ThreadGroupImplementation;
import org.osate.aadl2.ThreadGroupType;
import org.osate.aadl2.ThreadImplementation;
import org.osate.aadl2.ThreadType;
import org.osate.aadl2.modelsupport.util.AadlUtil;
import org.osate.xtext.aadl2.agcl.analysis.AGCLAnalysisPlugin;
import org.osate.xtext.aadl2.agcl.analysis.config.IPreferenceConstants;

/**
 * This class collects general-purpose utility methods for the AGCL analysis tool.
 * 
 * @author eposse
 *
 */
public class AGCLUtil {

	public static int countClassifiers(Element root, Class<?>[] classifiersOfInterest) {
		int totalElements = 0;
		for (Class<?> classifier : classifiersOfInterest) {
			totalElements += AadlUtil.countElementsBySubclass(root, classifier);
		}
		return totalElements;
	}

	/**
	 * Recursively creates resources, by creating their parent if it does not exist.
	 * @param resource
	 * @throws CoreException
	 */
	public static void createResource(final IResource resource) throws CoreException {
		if (resource == null || resource.exists())
			return;
		if (!resource.getParent().exists()) {
			createResource(resource.getParent());
		}
		switch (resource.getType()) {
		case IResource.FILE:
			((IFile) resource).create(new ByteArrayInputStream(new byte[0]), true, null);
			break;
		case IResource.FOLDER:
			((IFolder) resource).create(IResource.NONE, true, null);
			break;
		case IResource.PROJECT:
			((IProject) resource).create(null);
			((IProject) resource).open(null);
			break;
		}
	}

	/**
	 * Creates or returns a project-specific folder
	 * @param resource
	 * @param dirName
	 * @return a handle to the folder
	 */
	public static IFolder openDir(Resource resource, String dirName) {
		IFile file = WorkspaceSynchronizer.getFile(resource);
		IProject project = file.getProject();
		IFolder folder = project.getFolder(dirName);
		if (!folder.exists()) {
			Logger.getLogger(AGCLUtil.class).info("requested folder for model-checker doesn't exist: " + dirName);
			try {
				createResource(folder);
//				folder.create(false, true, null);
				Logger.getLogger(AGCLUtil.class).info("folder for model-checker created: " + dirName);
			} catch (CoreException e) {
				e.printStackTrace();
				Logger.getLogger(AGCLUtil.class).info("failed to create folder for model-checker: " + dirName);
			}
		}
		return folder;
	}
	
	/**
	 * Creates the project-specific model-checker input directory if it doesn't exist
	 * @param resource
	 * @return the input directory for the model-checker's input
	 */
	public static IFolder openInputDir(Resource resource) {
		IPreferenceStore prefStore = AGCLAnalysisPlugin.getDefault().getPreferenceStore();
		String inputDir = prefStore.getString(IPreferenceConstants.MODEL_CHECKER_INPUT_DIR_PREFERENCE);
		Logger.getLogger(AGCLUtil.class).info("opening input folder for model-checker: " + inputDir);
		return openDir(resource, inputDir);
	}

	/**
	 * Creates the project-specific model-checker output directory if it doesn't exist
	 * @param resource
	 * @return the output directory for the model-checker's output
	 */
	public static IFolder openOutputDir(Resource resource) {
		IPreferenceStore prefStore = AGCLAnalysisPlugin.getDefault().getPreferenceStore();
		String outputDir = prefStore.getString(IPreferenceConstants.MODEL_CHECKER_OUTPUT_DIR_PREFERENCE);
		Logger.getLogger(AGCLUtil.class).info("opening output folder for model-checker: " + outputDir);
		return openDir(resource, outputDir);
	}

	/**
	 * Creates the project-specific analysis results directory if it doesn't exist
	 * @param resource
	 * @return the output directory for analysis results
	 */
	public static IFolder openResultsDir(Resource resource) {
		IPreferenceStore prefStore = AGCLAnalysisPlugin.getDefault().getPreferenceStore();
		String resultsDir = prefStore.getString(IPreferenceConstants.ANALYSIS_RESULTS_DIR_PREFERENCE);
		Logger.getLogger(AGCLUtil.class).info("opening output folder for analysis results: " + resultsDir);
		return openDir(resource, resultsDir);
	}

	public static String spaces(int n) {
		return repchar(' ', n);
	}
	
	public static String repchar(char c, int n) {
		char[] array = new char[n];
		for (int i = 0; i < n; i++) {
			array[i] = c;
		}
		return new String(array);
	}

	public static void saveFile(IFile file, String contents) {
		Logger.getLogger(AGCLUtil.class).debug("saving file '" + file.getName() + "'");
		StringInputStream source = new StringInputStream(contents);
		try {
			if (!file.exists()) {
				file.create(source, true, null);
			}
			else {
				file.setContents(source, true, true, null);
			}
		}
		catch (CoreException e) {
			Logger.getLogger(AGCLUtil.class).error("unable to save file '" + file.getName() + "'");
			e.printStackTrace();
		}
	}
	
	public static void saveEObject(Resource resource, EObject obj) {
		resource.getContents().add(obj);
		try {
			resource.save(null);
		} catch (IOException e) {
			Logger.getLogger(AGCLUtil.class).error("unable to save resource '" + resource + "'");
			e.printStackTrace();
		}
	} 

	public static void saveEObject(IFile file, ResourceSet resourceSet, EObject obj) {
		Logger.getLogger(AGCLUtil.class).debug("saving EObject to file: '" + file.getName() + "'");
		java.net.URI javaURI = file.getLocationURI();
		Logger.getLogger(AGCLUtil.class).debug("java uri: '" + javaURI + "'");
		org.eclipse.emf.common.util.URI emfURI = org.eclipse.emf.common.util.URI.createURI(javaURI.toString());
		Logger.getLogger(AGCLUtil.class).debug("emf uri: '" + emfURI + "'");
		Resource newResource = resourceSet.createResource(emfURI);
		Logger.getLogger(AGCLUtil.class).debug("new resource uri: '" + newResource.getURI() + "'");
		saveEObject(newResource, obj);
	}
	
	public static Classifier getComponentTypeClassifier(ComponentClassifier component) {
		Classifier componentType = null;
		if (component instanceof ThreadImplementation) {
			ThreadType threadType = ((ThreadImplementation) component).getType();
			Logger.getLogger(AGCLUtil.class).debug("thread type: " + ((threadType == null) ? "null" : threadType.getFullName()));
			if (threadType == null) {
				Logger.getLogger(AGCLUtil.class).error("the thread type for this implementation is null; this is probably due to a bug in Osate. I'm ignoring this component");
				return null;
			}
			else {
				componentType = threadType;
			}
		}
		else if (component instanceof ThreadGroupImplementation) {
			ThreadGroupType threadGroupType = ((ThreadGroupImplementation) component).getType();
			Logger.getLogger(AGCLUtil.class).debug("thread group type: " + ((threadGroupType == null) ? "null" : threadGroupType.getFullName()));
			if (threadGroupType == null) {
				Logger.getLogger(AGCLUtil.class).error("the thread group type for this implementation is null; this is probably due to a bug in Osate. I'm ignoring this component"); 
				return null;
			}
			else {
				componentType = threadGroupType;
			}
		}
		return componentType;
	}
	
	public static Classifier getComponentImplementationClassifier(ComponentClassifier component) {
		Classifier componentImpl = null;
		if (component instanceof ThreadImplementation) {
			ThreadType threadType = ((ThreadImplementation) component).getType();
			Logger.getLogger(AGCLUtil.class).debug("thread type: " + ((threadType == null) ? "null" : threadType.getFullName()));
			if (threadType == null) {
				Logger.getLogger(AGCLUtil.class).error("the thread type for this implementation is null; this is probably due to a bug in Osate. I'm ignoring this component");
				return null;
			}
			else {
				componentImpl = threadType;
			}
		}
		else if (component instanceof ThreadGroupImplementation) {
			ThreadGroupType threadGroupType = ((ThreadGroupImplementation) component).getType();
			Logger.getLogger(AGCLUtil.class).debug("thread group type: " + ((threadGroupType == null) ? "null" : threadGroupType.getFullName()));
			if (threadGroupType == null) {
				Logger.getLogger(AGCLUtil.class).error("the thread group type for this implementation is null; this is probably due to a bug in Osate. I'm ignoring this component"); 
				return null;
			}
			else {
				componentImpl = threadGroupType;
			}
		}
		return componentImpl;
	}
	
}
