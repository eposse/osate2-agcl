/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.util;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.osate.aadl2.Element;
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
	
	public static int countClassifiers(Element root, Class[] classifiersOfInterest) {
		int totalElements = 0;
		for (Class classifier : classifiersOfInterest) {
			totalElements += AadlUtil.countElementsBySubclass(root, classifier);
		}
		return totalElements;
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
				folder.create(false, true, null);
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

}
