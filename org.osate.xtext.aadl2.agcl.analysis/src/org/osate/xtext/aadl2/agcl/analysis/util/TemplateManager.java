/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.util;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is used for loading and providing templates used by the plug-in.
 * 
 * @author Ernesto Posse
 *
 */
public class TemplateManager {
	
	private Map<String,Template> templates;

	public TemplateManager() {
		templates = new HashMap<String, Template>();
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
}
