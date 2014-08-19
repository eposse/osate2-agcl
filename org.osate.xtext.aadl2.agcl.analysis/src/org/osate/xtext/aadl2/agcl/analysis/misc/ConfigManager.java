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
package org.osate.xtext.aadl2.agcl.analysis.misc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.eclipse.core.runtime.IPath;
import org.osate.xtext.aadl2.agcl.analysis.AGCLAnalysisPlugin;
import org.osgi.framework.Bundle;

/**
 * This class manages a configuration file which contains several settings for the AGCL plug-in.
 * These settings are mainly directory and template file names as well as the name(s) of external
 * tools used, mainly the model-checker back-end.
 * 
 * <p>The location of this settings file is under the currently selected AADL project in the OSATE2 
 * workspace. If the project is located at "<workspace_loc>/<project_loc>", then the file "settings.conf" will be located 
 * under "<workspace_loc>/<project_loc>/analysis/".  If this file or the folder do not exist, they will 
 * be created with default values for the settings.
 * 
 * <p>For the actual settings, see {@link Settings} and {@link DefaultSettings}.
 * 
 * @author Ernesto Posse
 *
 */
@Deprecated
public class ConfigManager {
	
	private String configDir = "config";
	private String settingsFile = "settings.conf";
	private String loggerConfigFile = "logger.conf";
	private Path configPath = null;
	private Path settingsPath = null;
	private Path loggerConfigPath = null;
	private Properties properties = new Properties();
	private Settings settings = null;
	
	/**
	 * Creates a new settings file, or loads one if it already exists.
	 * @param settings 		A {@link Settings} instance. If {@code null}, an instance of {@link DefaultSettings} is created.
	 * @throws IOException
	 * @throws URISyntaxException 
	 */
	public ConfigManager(Bundle bundle, Settings settings) throws IOException, URISyntaxException {
		Logger.getLogger(getClass()).setLevel((Level) Level.DEBUG);
		if (settings == null) {
			this.settings = new DefaultSettings();
		}
		else {
			this.settings = settings;
		}
		if (bundle == null) {
			bundle = AGCLAnalysisPlugin.getDefault().getBundle();
		}
		String bundleLoc = bundle.getLocation();
		Logger.getLogger(getClass()).debug("bundleLoc = " + bundleLoc);
		URL bundleLocURL = new URL(bundleLoc);
		// TODO: check if this approach works across platforms
		String resolvedBundleLoc = new URL(bundleLocURL.getPath()).getPath();
		Logger.getLogger(getClass()).debug("resolvedBundleLoc = " + resolvedBundleLoc);
	    configPath = Paths.get(resolvedBundleLoc, configDir).toAbsolutePath();
		Logger.getLogger(getClass()).debug("configPath = " + configPath);
		settingsPath = Paths.get(resolvedBundleLoc, configDir, settingsFile).toAbsolutePath();
		Logger.getLogger(getClass()).debug("settingPath = " + settingsPath);
		loggerConfigPath = Paths.get(resolvedBundleLoc, configDir, loggerConfigFile).toAbsolutePath();
		Logger.getLogger(getClass()).debug("loggerConfigPath = " + loggerConfigPath);
		if (!Files.exists(configPath)) {
			Logger.getLogger(getClass()).debug("config directory not found; creating: " + configPath);
			Files.createDirectories(configPath.getParent().toAbsolutePath());
		}
		if (!Files.exists(loggerConfigPath)) {
			Logger.getLogger(getClass()).debug("logger configuration file doesn't exist; assuming default logging configuration"); 
		}
		else {
			Logger.getLogger(getClass()).debug("logger configuration file found: " + loggerConfigPath); 
			PropertyConfigurator.configure(loggerConfigPath.toString());
		}
		if (!Files.exists(settingsPath)) {
			Logger.getLogger(getClass()).debug("config file not found; creating: " + settingsPath);
			saveConfig();
		}
		else {
			Logger.getLogger(getClass()).debug("config file found");
			if (Files.isRegularFile(settingsPath) && Files.isReadable(settingsPath)) {
				loadConfig();
			}
			else {
				throw new IOException("The configuration file '" + settingsPath.toString() + "' is not readable or accessible.");
			}
		}
	}
	
	private void assignSettingsToProperties() {
		Class<? extends Settings> settingsClass = settings.getClass();
		for (String key: Settings.propertyKeys) {
			try {
				String attr = settingsClass.getDeclaredField(settings.getKeys().get(key)).getName();
				String getterName = "get" + Character.toUpperCase(attr.charAt(0)) + attr.substring(1);
				Method getter = Settings.class.getDeclaredMethod(getterName);
				String value = (String) getter.invoke(settings, (Object[]) null);
				properties.setProperty(key, value);
			} catch (NoSuchMethodException | IllegalAccessException | IllegalArgumentException 
					| InvocationTargetException | NoSuchFieldException | SecurityException e) {
				// Ignore
			}
		}
	}
	
	private void assignPropertiesToSettings() {
		Class<? extends Settings> settingsClass = settings.getClass();
		for (String key: Settings.propertyKeys) {
			try {
				String attr = settingsClass.getDeclaredField(settings.getKeys().get(key)).getName();
				String setterName = "set" + Character.toUpperCase(attr.charAt(0)) + attr.substring(1);
				Method setter = Settings.class.getDeclaredMethod(setterName, String.class);
				String value = properties.getProperty(key);
				setter.invoke(settings, value);
			} catch (NoSuchMethodException | IllegalAccessException | IllegalArgumentException 
					| InvocationTargetException | NoSuchFieldException | SecurityException e) {
				// Ignore
			}
		}
	}
	
	/**
	 * Saves the configuration file.
	 * 
	 * @throws IOException
	 */
	public void saveConfig() throws IOException {
		OutputStream output = null;
		try {
			output = new FileOutputStream(settingsPath.toString());
			assignSettingsToProperties();
			properties.store(output, null);
		} 
		finally {
			if (output != null) {
				output.close();
			}
		}
 	}

	/**
	 * Loads the configuration file.
	 * 
	 * @throws IOException
	 */
	public void loadConfig() throws IOException {
		InputStream input = null;
		try {
			input = new FileInputStream(settingsPath.toString());
			properties.load(input);
			assignPropertiesToSettings();
		} 
		finally {
			if (input != null) {
				input.close();
			}
		}
	}
	
	public String getProperty(String key) {
		return properties.getProperty(key);
	}

	/**
	 * This method should be used to access the actual useful values of each setting.
	 * 
	 * @return the settings
	 */
	public Settings getSettings() {
		return settings;
	}

	/**
	 * @return the configPath
	 */
	public Path getConfigPath() {
		return configPath;
	}

	/**
	 * @param configPath the configPath to set
	 */
	public void setConfigPath(Path configPath) {
		this.configPath = configPath;
	}

	/**
	 * @return the settingsFile
	 */
	public String getSettingsFile() {
		return settingsFile;
	}

	/**
	 * @param settingsFile the settingsFile to set
	 */
	public void setSettingsFile(String configFile) {
		this.settingsFile = configFile;
	}

	/**
	 * @return the loggerConfigFile
	 */
	public String getLoggerConfigFile() {
		return loggerConfigFile;
	}

	/**
	 * @param loggerConfigFile the loggerConfigFile to set
	 */
	public void setLoggerConfigFile(String loggerConfigFile) {
		this.loggerConfigFile = loggerConfigFile;
	}

	/**
	 * @return the settingsPath
	 */
	public Path getSettingsPath() {
		return settingsPath;
	}

	/**
	 * @param settingsPath the settingsPath to set
	 */
	public void setSettingsPath(Path settingsPath) {
		this.settingsPath = settingsPath;
	}

	/**
	 * @return the loggerConfigPath
	 */
	public Path getLoggerConfigPath() {
		return loggerConfigPath;
	}

	/**
	 * @param loggerConfigPath the loggerConfigPath to set
	 */
	public void setLoggerConfigPath(Path loggerConfigPath) {
		this.loggerConfigPath = loggerConfigPath;
	}
	
	/**
	 * @return the absolute path to the default model-checker if installed, or null otherwise
	 * @return
	 */
	public IPath getDefaultModelCheckerFullPath() {
		IPath path = null;
		return path;
	}
}