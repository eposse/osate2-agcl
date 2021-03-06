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
 * This is the top-level package for the AGCL plug-in. 
 * 
 * @author Ernesto Posse
 * @version 0.1
 */
package org.osate.xtext.aadl2.agcl.analysis;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.osate.xtext.aadl2.agcl.AGCLStandaloneSetup;
import org.osate.xtext.aadl2.agcl.analysis.config.IPreferenceConstants;
import org.osate.xtext.aadl2.agcl.analysis.util.PathUtil;
import org.osate.xtext.aadl2.agcl.analysis.util.TemplateManager;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker;
import org.osate.xtext.aadl2.agcl.analysis.visitors.PSLSerializerExplicit;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

import com.google.inject.Injector;

/**
 * The activator class controls the plug-in life cycle
 */
public class AGCLAnalysisPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.osate.xtext.aadl2.agcl.analysis"; //$NON-NLS-1$

	// The shared instance
	private static AGCLAnalysisPlugin plugin;
	
//	private static ConfigManager configManager;
	private Bundle bundle = getBundle();
	private String configDir = "config";
	private String loggerConfigFile = "logger.conf";
	private IPath loggerConfigPath = null;
	private IPath bundleLoc = null;
	private IPath stateLoc;
	private Injector injector = new AGCLStandaloneSetup().createInjectorAndDoEMFRegistration();
    private ISerializer serializer = injector.getInstance(Serializer.class);  
	private PSLSerializerExplicit altSerializer = new PSLSerializerExplicit();
    private TemplateManager templateManager;
    
	private ModelChecker activeModelChecker;
	private Map<String,ModelChecker> modelCheckerRegistry;
	
	/**
	 * The constructor
	 */
	public AGCLAnalysisPlugin() {
		setModelCheckerRegistry(new HashMap<String,ModelChecker>());
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		Logger.getLogger(getClass()).setLevel((Level) Level.DEBUG);
        Logger.getLogger(getClass()).info("Activating AGCL analysis plugin");
		plugin = this;
		findPluginLocations();
		initLogger();
		createTemplateManager();
		createDefaultModelChecker();
        Logger.getLogger(getClass()).info("AGCL analysis plugin activated");
	}
	
	private void createTemplateManager() {
		templateManager = new TemplateManager();
	}

	/**
	 * Determines the plug-in bundle actual location and the plug-in state location.
	 * @throws MalformedURLException
	 */
	private void findPluginLocations() throws MalformedURLException {
		String bundleLocStr = bundle.getLocation();
		Logger.getLogger(getClass()).debug("bundle location = " + bundleLocStr);
		URL bundleLocURL = new URL(bundleLocStr);
		String resolvedBundleLoc = PathUtil.stripProtocolsStr(bundleLocURL);
		Logger.getLogger(getClass()).debug("resolved bundle path = " + resolvedBundleLoc);
		bundleLoc = new Path(resolvedBundleLoc).makeAbsolute();
		Logger.getLogger(getClass()).debug("absolute bundle path = " + bundleLoc);
//		IResource r = ResourcesPlugin.getPlugin().getWorkspace().getRoot().findMember(getStateLocation());
        stateLoc = plugin.getStateLocation().makeAbsolute();
        Logger.getLogger(getClass()).debug("plugin state location: "+ stateLoc);
        URL configURL = bundle.getResource(configDir);
        Logger.getLogger(getClass()).debug("config URL = " + configURL);
	}
	
	/**
	 * Obtains logging configuration file and configure the logger.
	 * 
	 * <p>This method also copies the logger configuration file from the resource folder in the bundle to 
	 * the plugin's state location. While strictly speaking this doesn't seem necessary, it is the appropriate 
	 * place to put it. 
	 * 
	 * @see {@link #getStateLocation()}
	 */
	private void initLogger() {
        IPath loggerConfigRelPath = new Path(configDir).append(loggerConfigFile);
        loggerConfigPath = bundleLoc.append(loggerConfigRelPath);
		Logger.getLogger(getClass()).debug("logger config path = " + loggerConfigPath);
		if (!loggerConfigPath.toFile().exists()) {
			Logger.getLogger(getClass()).debug("logger configuration file doesn't exist; assuming default logging configuration"); 
		}
		else {
			Logger.getLogger(getClass()).debug("logger configuration file found: " + loggerConfigPath); 
			PropertyConfigurator.configure(loggerConfigPath.toString());
		}
	}

	/**
	 * Sets-up the default model-checker.
	 */
	private void createDefaultModelChecker() {
		registerModelChecker(IPreferenceConstants.DEFAULT_MODEL_CHECKER_NAME, IPreferenceConstants.DEFAULT_MODEL_CHECKER_INSTANCE);
		activateModelChecker(IPreferenceConstants.DEFAULT_MODEL_CHECKER_NAME);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static AGCLAnalysisPlugin getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	@Override 
	protected void initializeDefaultPreferences(IPreferenceStore store) {
		store.setDefault(IPreferenceConstants.MODEL_CHECKER_NAME_PREFERENCE,			IPreferenceConstants.DEFAULT_MODEL_CHECKER_NAME);
		store.setDefault(IPreferenceConstants.MODEL_CHECKER_EXECUTABLE_PREFERENCE,		IPreferenceConstants.DEFAULT_MODEL_CHECKER_EXECUTABLE);
		store.setDefault(IPreferenceConstants.MODEL_CHECKER_FLAGS_PREFERENCE, 			IPreferenceConstants.DEFAULT_MODEL_CHECKER_FLAGS);
		store.setDefault(IPreferenceConstants.MODEL_CHECKER_SCRIPT_TEMPLATE_PREFERENCE,	IPreferenceConstants.DEFAULT_MODEL_CHECKER_SCRIPT_TEMPLATE);
		store.setDefault(IPreferenceConstants.MODEL_CHECKER_MODEL_TEMPLATE_PREFERENCE,	IPreferenceConstants.DEFAULT_MODEL_CHECKER_MODEL_TEMPLATE);
		store.setDefault(IPreferenceConstants.MODEL_CHECKER_INPUT_DIR_PREFERENCE, 		IPreferenceConstants.DEFAULT_MODEL_CHECKER_INPUT_DIR);
		store.setDefault(IPreferenceConstants.MODEL_CHECKER_OUTPUT_DIR_PREFERENCE, 		IPreferenceConstants.DEFAULT_MODEL_CHECKER_OUTPUT_DIR);
		store.setDefault(IPreferenceConstants.ANALYSIS_RESULTS_DIR_PREFERENCE, 			IPreferenceConstants.DEFAULT_ANALYSIS_RESULTS_DIR);
		store.setDefault(IPreferenceConstants.ANALYSIS_RESULTS_OPTION_PREFERENCE, 		IPreferenceConstants.DEFAULT_ANALYSIS_RESULTS_OPTION);
	}

	/**
	 * @return the activeModelChecker
	 */
	public ModelChecker getActiveModelChecker() {
		return activeModelChecker;
	}

	/**
	 * @param activeModelChecker the activeModelChecker to set
	 */
	public void setActiveModelChecker(ModelChecker modelChecker) {
		this.activeModelChecker = modelChecker;
	}

	/**
	 * @return the modelCheckerRegistry
	 */
	public Map<String,ModelChecker> getModelCheckerRegistry() {
		return modelCheckerRegistry;
	}

	/**
	 * @param modelCheckerRegistry the modelCheckerRegistry to set
	 */
	public void setModelCheckerRegistry(Map<String,ModelChecker> modelCheckerRegistry) {
		this.modelCheckerRegistry = modelCheckerRegistry;
	}

	/**
	 * @param key 		the name (path) of a model-checker
	 * @param value		an instance of the model-checker
	 * @return
	 * @see java.util.Map#put(java.lang.Object, java.lang.Object)
	 */
	public ModelChecker registerModelChecker(String key, ModelChecker value) {
		return modelCheckerRegistry.put(key, value);
	}

	/**
	 * @param key		the name (path) of a model-checker
	 * @return			the currently registered
	 * @see java.util.Map#get(java.lang.Object)
	 */
	public ModelChecker getModelChecker(Object key) {
		return modelCheckerRegistry.get(key);
	}
	
	/**
	 * @param name	the name (path) of a registered model-checker
	 */
	public void activateModelChecker(String name) {
		setActiveModelChecker(getModelChecker(name));
	}

	/**
	 * @return the serializer
	 */
	public ISerializer getSerializer() {
		return serializer;
	}

	/**
	 * @param serializer the serializer to set
	 */
	public void setSerializer(ISerializer serializer) {
		this.serializer = serializer;
	}

	public TemplateManager getTemplateManager() {
		return templateManager;
	}

	public void setTemplateManager(TemplateManager templateManager) {
		this.templateManager = templateManager;
	}

	/**
	 * @return the altSerializer
	 */
	public PSLSerializerExplicit getAltSerializer() {
		return altSerializer;
	}

	/**
	 * @param altSerializer the altSerializer to set
	 */
	public void setAltSerializer(PSLSerializerExplicit altSerializer) {
		this.altSerializer = altSerializer;
	}
	
}
