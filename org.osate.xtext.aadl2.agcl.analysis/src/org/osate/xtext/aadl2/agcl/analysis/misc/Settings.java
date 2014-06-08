package org.osate.xtext.aadl2.agcl.analysis.misc;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.osate.aadl2.modelsupport.resources.OsateResourceUtil;
import org.osate.xtext.aadl2.agcl.analysis.AGCLAnalysisPlugin;
import org.osate.xtext.aadl2.agcl.analysis.util.PathUtil;

/**
 * Objects of this class store general settings for the AGCL plug-in. These are:
 * 
 * <ul>
 * 		<li> {@link #projectDir}: the project directory ("project.dir" in settings.conf)
 * 		<li> {@link #templatesDir}: the templates directory ("templates.dir" in settings.conf)
 * 		<li> {@link #nusmvSessionTemplate}: the NuSMV session script template ("templates.nusmv.session_script" in settings.conf)
 * </ul>
 * 
 * <p>The reason to have a Settings class and not just a {@link java.util.Properties} class is that
 * this class provides its clients with normalized, absolute paths according to the runtime platform,
 * whereas the {@link java.util.Properties} class simply stores plain String values for these paths,
 * which may not be platform-independent.
 * 
 * @author Ernesto Posse 
 *
 */
public class Settings {
	
	protected String projectDir = "";
	protected String analysisResultsDir = "analysis.results";
	protected String templatesDir = "resources/templates";
	protected String nusmvSessionScript = "session_script.nusmvrc";
	protected String nusmvSessionTemplate = "nusmv_session.template";

	private Map<String, String> keys = new HashMap<String,String>();
	public static final String[] propertyKeys = { 
		"project.dir", 
		"analysis.dir",
		"analysis.nusmv_session_script",
		"templates.dir", 
		"templates.nusmv.session_script"
	};
	public static final String[] propertyAttr = { 
		"projectDir", 
		"analysisResultsDir",
		"nusmvSessionScript",
		"templatesDir", 
		"nusmvSessionTemplate"
	};

	public Settings() {
		for (int i = 0; i < propertyKeys.length; i++) {
			keys.put(propertyKeys[i], propertyAttr[i]);
		}
	}

	/**
	 * @return The project of the currently selected object, or {@code null} if none is selected.
	 */
	public IProject getSelectedProject(IWorkbenchWindow window) {
		IProject project = null;
		if (window != null) {
			ISelectionService selectionService = (ISelectionService) window.getSelectionService();
			String projExpID = "org.eclipse.ui.navigator.ProjectExplorer";
			ISelection sel = selectionService.getSelection(projExpID);
			Object selectedObject = sel;
			if(sel instanceof IStructuredSelection) {
				selectedObject = ((IStructuredSelection)sel).getFirstElement();
			}
			if (selectedObject instanceof IAdaptable) {
				IResource res = (IResource) ((IAdaptable) selectedObject).getAdapter(IResource.class);
				project = res.getProject();
				Logger.getLogger(getClass()).info("Project found: " + project.getName());
			}
		}
//		final IWorkbench workbench = AGCLAnalysisPlugin.getDefault().getWorkbench();
//		workbench.getDisplay().asyncExec(new Runnable() {
//			public void run() {
//				IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
//				if (window != null) {
//					ISelectionService selectionService = (ISelectionService) window.getSelectionService();
//					String projExpID = "org.eclipse.ui.navigator.ProjectExplorer";
//					ISelection sel = selectionService.getSelection(projExpID);
//					Object selectedObject = sel;
//					if(sel instanceof IStructuredSelection) {
//						selectedObject = ((IStructuredSelection)sel).getFirstElement();
//					}
//					if (selectedObject instanceof IAdaptable) {
//						IResource res = (IResource) ((IAdaptable) selectedObject).getAdapter(IResource.class);
//						project = res.getProject();
//						Logger.getLogger(getClass()).info("Project found: " + project.getName());
//					}
//				}
//			}
//		});
		return project;
	}

	/**
	 * @return the absolute path to the nusmv template file
	 */
	public Path getAbsNusmvSessionTemplateFilePath() {
		return PathUtil.getFullPath(getAbsTemplatePath().toString(), getNusmvSessionTemplate());
	}

	/**
	 * @return the absolute path of the templates directory
	 */
	public Path getAbsTemplatePath() {
		return PathUtil.getFullPath(getProjectDir(), getTemplatesDir());
	}
	/**
	 * @return the analysisResultsDir
	 */
	public String getAnalysisResultsDir() {
		return analysisResultsDir;
	}
	/**
	 * @return the keys
	 */
	public Map<String, String> getKeys() {
		return keys;
	}
	/**
	 * @return the nusmvSessionScript
	 */
	public String getNusmvSessionScript() {
		return nusmvSessionScript;
	}
	/**
	 * @return the nusmvTemplateFile
	 */
	public String getNusmvSessionTemplate() {
		return nusmvSessionTemplate;
	}
	/**
	 * Returns the project directory. If the project directory is {@code null} then it sets the directory to
	 * the currently selected project from the workspace and returns this selection. Note that the directory
	 * is not {@code null} if it was previously set when loading the settings file. 
	 * 
	 * @see ConfigManager#assignSettingsToProperties
	 * @return the projectDir
	 */
	public String getProjectDir() {
		if (projectDir != null) {
			return projectDir;
		}
//		URI uri = new URI("");
//		OsateResourceUtil.getResourceSet().createResource(uri);
		return projectDir;
	}
	/**
	 * @return the templatesDir
	 */
	public String getTemplatesDir() {
		return templatesDir;
	}
	/**
	 * @param analysisResultsDir the analysisResultsDir to set
	 */
	public void setAnalysisResultsDir(String analysisResultsDir) {
		this.analysisResultsDir = analysisResultsDir;
	}

	/**
	 * @param nusmvSessionScript the nusmvSessionScript to set
	 */
	public void setNusmvSessionScript(String nusmvSessionScript) {
		this.nusmvSessionScript = nusmvSessionScript;
	}

	/**
	 * @param nusmvTemplateFile the nusmvTemplateFile to set
	 */
	public void setNusmvSessionTemplate(String nusmvSessionTemplate) {
		this.nusmvSessionTemplate = nusmvSessionTemplate;
	}

	/**
	 * @param projectDir the projectDir to set
	 */
	public void setProjectDir(String projectDir) {
		this.projectDir = projectDir;
	}

	/**
	 * @param templatesDir the templatesDir to set
	 */
	public void setTemplatesDir(String templatesDir) {
		this.templatesDir = templatesDir;
	}
}