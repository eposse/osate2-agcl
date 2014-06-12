/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.misc;

import java.io.IOException;
import java.io.OutputStream;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceStore;

/**
 * This class implements a store for project and plug-in properties. The idea is to provide 
 * project-specific settings that default to plug-in wide settings.
 * 
 * It is based on the class described in the article
 * <a href="https://www.eclipse.org/articles/Article-Mutatis-mutandis/overlay-pages.html">Mutatis mutandis - Using Preference Pages as Property Pages</a>
 * by Berthold Daum.
 * 
 * @author Ernesto Posse
 *
 */
@Deprecated
public class PropertyStore extends PreferenceStore {

	private IResource resource;
	private IPreferenceStore workbenchStore;
	private String pageId;
	
	
	public PropertyStore(IResource resource, 
			IPreferenceStore workbenchStore, 
			String pageId) {
		this.resource = resource;
		this.workbenchStore = workbenchStore;
		this.pageId = pageId;
	}

	public String getDefaultString(String name) {
		return workbenchStore.getDefaultString(name);
	}
	
	public String getString(String name) {
		insertValue(name);
		return super.getString(name);
	}

	private boolean inserting = false;
	private synchronized void insertValue(String name) {
		if (inserting)
			return;
		if (super.contains(name))
			return;
		inserting = true;
		String prop = null;
		try {
			prop = getProperty(name);
		} catch (CoreException e) {
		}
		if (prop == null)
			prop = workbenchStore.getString(name);
		if (prop != null)
			setValue(name, prop);
		inserting = false;
	}
	
	private String getProperty(String name) throws CoreException {
		return resource.getPersistentProperty(new QualifiedName(pageId, name));
	}
	
	public boolean contains(String name) {
		return workbenchStore.contains(name);
	}

	public void setToDefault(String name) {
		setValue(name, getDefaultString(name));
	}
	
	public boolean isDefault(String name) {
		String defaultValue = getDefaultString(name);
		if (defaultValue == null) return false;
		return defaultValue.equals(getString(name));
	}

	public void save() throws IOException {
		writeProperties();
	}
	
	public void save(OutputStream out, String header) 
			throws IOException {
		writeProperties();
	}
	
	private void writeProperties() throws IOException {
		String[] preferences = super.preferenceNames();
		for (int i = 0; i < preferences.length; i++) {
			String name = preferences[i];
			try {
				setProperty(name, getString(name));
			} catch (CoreException e) {
				throw new IOException("Cannot write resource property " + name);
			}
		}
	}
	
	private void setProperty(String name, String value) 
			throws CoreException {
		resource.setPersistentProperty(
				new QualifiedName(pageId, name), value);
	}
}
