/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.util;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.osate.xtext.aadl2.agcl.analysis.AGCLAnalysisPlugin;
import org.osate.xtext.aadl2.agcl.analysis.config.IPreferenceConstants;
import org.osgi.framework.Bundle;

/**
 * This class is used for loading and providing templates used by the plug-in.
 * 
 * @author Ernesto Posse
 *
 */
public class TemplateManager {
	
	private Map<String,Template> templates;
	private Map<String,String> templateFiles;
	private Map<String,java.nio.file.Path> templatePaths;
	private String templatesDir = "resources/templates";
	private IPath stateLoc;
	private Bundle bundle;

	public TemplateManager() {
		templates = new HashMap<String, Template>();
		stateLoc = AGCLAnalysisPlugin.getDefault().getStateLocation();
		bundle = AGCLAnalysisPlugin.getDefault().getBundle();
		populateTemplateFiles();
		copyTemplateFiles();
		createTemplateInstances();
	}

	private void populateTemplateFiles() {
		Logger.getLogger(getClass()).debug("populating templateFiles");
		templateFiles = new HashMap<String,String>();
		templateFiles.put(IPreferenceConstants.MODEL_CHECKER_SCRIPT_TEMPLATE_PREFERENCE, IPreferenceConstants.DEFAULT_MODEL_CHECKER_SCRIPT_TEMPLATE);
		templateFiles.put(IPreferenceConstants.MODEL_CHECKER_MODEL_TEMPLATE_PREFERENCE, IPreferenceConstants.DEFAULT_MODEL_CHECKER_MODEL_TEMPLATE);
	}

	/**
	 * @param key the name of the template
	 * @return the registered {@link Template} instance for the given name
	 * @see java.util.Map#get(java.lang.Object)
	 */
	public Template get(String key) {
		return templates.get(key);
	}
	
	/**
	 * @param key the name of the template
	 * @param a {@link Template} instance to associate to the given name
	 * @see java.util.Map#get(java.lang.Object)
	 */
	public void put(String key, Template template) {
		templates.put(key, template);
	}
	
	/**
	 * Copies the template files from the resource folder in the bundle to the plugin's state location.
	 * While strictly speaking this doesn't seem necessary, it is the appropriate place to put them. 
	 * 
	 * A user can modify the templates there and those will be used, while the default is still stored with the bundle.
	 * 
	 * @see {@link #getStateLocation()}
	 */
	private void copyTemplateFiles() {
		Logger.getLogger(getClass()).debug("copying template files to state location");
		templatePaths = new HashMap<String, java.nio.file.Path>();
		IPath templatesRelPath = new Path(templatesDir);
		java.nio.file.Path targetTemplatesDirPath = Paths.get(stateLoc.toString()).resolve(templatesDir);
		Logger.getLogger(getClass()).debug("target templates directory: " + targetTemplatesDirPath);
		try {
			Files.createDirectories(targetTemplatesDirPath);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		URL[] templateURLs = FileLocator.findEntries(bundle, templatesRelPath);
		for (URL url : templateURLs) {
			try {
				Logger.getLogger(getClass()).debug("template URL:               " + url);
				URL resolvedURL = FileLocator.resolve(url);
				Logger.getLogger(getClass()).debug("resolved template URL:      " + resolvedURL);
				Logger.getLogger(getClass()).debug("resolved template URL path: " + resolvedURL.getPath());
				IPath absoluteTemplatePath  = new Path(resolvedURL.getPath()).makeAbsolute();
				Logger.getLogger(getClass()).debug("absolute template path:     " + absoluteTemplatePath);
				String absoluteTemplateOSPath = absoluteTemplatePath.toOSString();
				Logger.getLogger(getClass()).debug("absolute template OS path:  " + absoluteTemplateOSPath);
				java.nio.file.Path sourceTemplatesDirPath = Paths.get(absoluteTemplateOSPath);
				Logger.getLogger(getClass()).debug("source templates directory: " + sourceTemplatesDirPath);
				for (Entry<String,String> entry : templateFiles.entrySet() ) {
					String templateName = entry.getKey();
					String templateFile = entry.getValue();
					java.nio.file.Path sourceTemplateFilePath = sourceTemplatesDirPath.resolve(templateFile);
					Logger.getLogger(getClass()).debug("source template file:       " + sourceTemplateFilePath);
					java.nio.file.Path targetTemplateFilePath = targetTemplatesDirPath.resolve(templateFile);
					Logger.getLogger(getClass()).debug("target template file:       " + targetTemplateFilePath);
					try {
						Files.copy(sourceTemplateFilePath, targetTemplateFilePath, REPLACE_EXISTING);  
						templatePaths.put(templateName, targetTemplateFilePath);
					}
					catch (FileAlreadyExistsException e) {
						Logger.getLogger(getClass()).info("target template file already exists; I'm replacing the existing file with the default");
					}
				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Populates the template manager with {@link Template} instances for each template file 
	 */
	private void createTemplateInstances() {
		Logger.getLogger(getClass()).debug("creating template instances");
		for (Entry<String,java.nio.file.Path> entry: templatePaths.entrySet()) {
			String templateName = entry.getKey();
			java.nio.file.Path templatePath = entry.getValue();
			Logger.getLogger(getClass()).debug("  template name: " + templateName);
			Logger.getLogger(getClass()).debug("  template path: " + templatePath);
			try {
				String templateContents = new String(Files.readAllBytes(templatePath));
				Template template = new Template(templateContents);
				Logger.getLogger(getClass()).debug("  template pattern:\n" + template.getPattern());
				templates.put(templateName, template);
			} catch (IOException e) {
				Logger.getLogger(getClass()).error("template could not be read: " + templatePath);
				e.printStackTrace();
			}
		}
	}

}
