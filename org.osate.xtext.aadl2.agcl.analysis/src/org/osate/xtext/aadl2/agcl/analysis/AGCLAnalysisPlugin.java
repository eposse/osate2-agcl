package org.osate.xtext.aadl2.agcl.analysis;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osate.xtext.aadl2.agcl.analysis.config.IPreferenceConstants;
import org.osate.xtext.aadl2.agcl.analysis.util.PathUtil;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

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
	private String templatesDir = "resources/templates";
	private String[] templateFiles = { "nusmv_script.template", "nusmv_model.template" };
	private IPath loggerConfigPath = null;
	private IPath bundleLoc = null;
	private IPath stateLoc;

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
		copyTemplates();
		createDefaultModelChecker();
        Logger.getLogger(getClass()).info("AGCL analysis plugin activated");
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
	 * Copies the template files from the resource folder in the bundle to the plugin's state location.
	 * While strictly speaking this doesn't seem necessary, it is the appropriate place to put them. 
	 * 
	 * A user can modify the templates there and those will be used, while the default is still stored with the bundle.
	 * 
	 * @see {@link #getStateLocation()}
	 */
	private void copyTemplates() {
		IPath templatesRelPath = new Path(templatesDir);
		java.nio.file.Path targetTemplatesDirPath = Paths.get(stateLoc.toString()).resolve(templatesDir);
		Logger.getLogger(getClass()).debug("target templates directory: " + targetTemplatesDirPath);
		try {
			Files.createDirectories(targetTemplatesDirPath);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		URL[] templateURLs = FileLocator.findEntries(bundle, templatesRelPath);
		for (URL url : templateURLs) {
			try {
				Logger.getLogger(getClass()).debug("template URL:               " + url);
				URL resolvedURL = FileLocator.resolve(url);
				Logger.getLogger(getClass()).debug("resolved template URL:      " + resolvedURL);
				java.nio.file.Path sourceTemplatesDirPath = Paths.get(resolvedURL.getPath());
				Logger.getLogger(getClass()).debug("source templates directory: " + sourceTemplatesDirPath);
				for (String templateFile : templateFiles) {
					java.nio.file.Path sourceTemplateFilePath = sourceTemplatesDirPath.resolve(templateFile);
					Logger.getLogger(getClass()).debug("source template file:       " + sourceTemplateFilePath);
					java.nio.file.Path targetTemplateFilePath = targetTemplatesDirPath.resolve(templateFile);
					Logger.getLogger(getClass()).debug("target template file:       " + targetTemplateFilePath);
					try {
						Files.copy(sourceTemplateFilePath, targetTemplateFilePath);  // TODO: maybe change the policy to overwrite existing files?
					}
					catch (FileAlreadyExistsException e) {
						Logger.getLogger(getClass()).info("target template file already exists; I'm keeping the existing file");
					}
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//        Enumeration<String> templateFiles = bundle.getEntryPaths(templatesDir);
//        while (templateFiles.hasMoreElements()) {
//        	String relativePath = templateFiles.nextElement();
//        	IPath absolutePath = bundleLoc.append(relativePath);
//        	Logger.getLogger(getClass()).debug("absolute path:   " + absolutePath);
//        	File file = absolutePath.toFile();
//        	String cannonicalPath;
//			try {
//				cannonicalPath = file.getCanonicalPath();
//	        	Logger.getLogger(getClass()).debug("cannonical path: "+ cannonicalPath);
//	        	java.nio.file.Path sourcePath = Paths.get(cannonicalPath);
//	        	Logger.getLogger(getClass()).debug("source path:     " + sourcePath);
//	        	java.nio.file.Path targetPath = Paths.get(stateLoc.toString()).resolve(file.getName());
//	        	Logger.getLogger(getClass()).debug("target path:     " + targetPath);
////	        	Files.copy(sourcePath, targetPath);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//       }
	}
	
	/** 
	 * Copies a file to the plugin's state location.
	 */

	/**
	 * Sets-up the default model-checker.
	 */
	private void createDefaultModelChecker() {
		registerModelChecker(IPreferenceConstants.DEFAULT_MODEL_CHECKER, IPreferenceConstants.DEFAULT_MODEL_CHECKER_INSTANCE);
		activateModelChecker(IPreferenceConstants.DEFAULT_MODEL_CHECKER);
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

//	/**
//	 * Returns the shared instance of the {@link ConfigManager}
//	 * @return the shared instance of the {@link ConfigManager}
//	 */
//	public static ConfigManager getConfigManager() {
//		return configManager;
//	}

	@Override 
	protected void initializeDefaultPreferences(IPreferenceStore store) {
		store.setDefault(IPreferenceConstants.MODEL_CHECKER_PREFERENCE, 				IPreferenceConstants.DEFAULT_MODEL_CHECKER);
		store.setDefault(IPreferenceConstants.MODEL_CHECKER_FLAGS_PREFERENCE, 			IPreferenceConstants.DEFAULT_MODEL_CHECKER_FLAGS);
		store.setDefault(IPreferenceConstants.MODEL_CHECKER_SCRIPT_TEMPLATE_PREFERENCE,	IPreferenceConstants.DEFAULT_MODEL_CHECKER_SCRIPT_TEMPLATE);
		store.setDefault(IPreferenceConstants.MODEL_CHECKER_MODEL_TEMPLATE_PREFERENCE,	IPreferenceConstants.DEFAULT_MODEL_CHECKER_MODEL_TEMPLATE);
		store.setDefault(IPreferenceConstants.MODEL_CHECKER_INPUT_DIR_PREFERENCE, 		IPreferenceConstants.DEFAULT_MODEL_CHECKER_INPUT_DIR);
		store.setDefault(IPreferenceConstants.MODEL_CHECKER_OUTPUT_DIR_PREFERENCE, 		IPreferenceConstants.DEFAULT_MODEL_CHECKER_OUTPUT_DIR);
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
}
