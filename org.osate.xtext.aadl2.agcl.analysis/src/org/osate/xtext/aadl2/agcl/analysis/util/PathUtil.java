package org.osate.xtext.aadl2.agcl.analysis.util;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.osate.internal.workspace.AadlWorkspace;
import org.osate.workspace.IAadlProject;
import org.osate.workspace.IAadlWorkspace;
import org.osate.xtext.aadl2.agcl.analysis.AGCLAnalysisPlugin;
import org.osate.xtext.aadl2.agcl.analysis.config.IPreferenceConstants;

/**
 * This class provides some auxiliary path manipulation functions.
 * @author Ernesto Posse
 *
 */
public class PathUtil {
	
	public static Path getAbsPath(String basePath) {
		return Paths.get(basePath.replaceAll("~", System.getProperty("user.home"))).toAbsolutePath();
	}
	
	public static Path getFullPath(String basePath, String fileName) {
		return Paths.get(Paths.get(basePath, fileName)
				.toString()
				.replaceAll("~", System.getProperty("user.home"))).toAbsolutePath();
	}
	
	/**
	 *  The following may be a hack: bundleLocationURL should have the form
	 * <p>
	 *    {@code protocol:// ...}
	 * 
	 * <p> but sometimes it seems to have two protocols:
	 * 
	 * <p> {@code resource:file:/path/to/somewhere}
	 * 
	 * <p>By applying the 'getPath' method to the URL twice, we obtain the plain path
	 * we are looking for.
	 * 
	 * @param url
	 * @return a string with just the path
	 * @throws MalformedURLException
	 */
	 //TODO: check if this approach works across platforms
	public static String stripProtocolsStr(URL url) throws MalformedURLException {
		return new URL(url.getPath()).getPath();
	}
	

	public static java.nio.file.Path stripProtocolsPath(URL url) throws MalformedURLException {
		return Paths.get(new URL(url.getPath()).getPath());
	}
	
	public static void logPathsAndPrefs(Resource r) {
		Logger.getLogger(r.getClass()).debug("resource = " + r);
		URI uri = r.getURI();
		Logger.getLogger(r.getClass()).debug("uri = " + uri);
		ResourceSet rs = r.getResourceSet();
		Logger.getLogger(r.getClass()).debug("resource set = " + rs);
		EList<Resource> rl = rs.getResources();
		for (Resource ri : rl) {
			Logger.getLogger(r.getClass()).debug("  resource: " + ri);
		}
		IFile file = WorkspaceSynchronizer.getFile(r);
		Logger.getLogger(r.getClass()).debug("file: " + file);
		IProject p = file.getProject();
		Logger.getLogger(r.getClass()).debug("project: " + p);
		IAadlWorkspace aadlWs = AadlWorkspace.getAadlWorkspace();
		IAadlProject pa = aadlWs.getAadlProject(file.getProject());
//		IProject p = settings.getSelectedProject(getWindow());
		Logger.getLogger(r.getClass()).debug("AADL project: " + pa);
//		String pf = pa.getAadlProjectFile();
//		Logger.getLogger(getClass()).debug("project file: " + pf);
		String pname = p.getName();
		Logger.getLogger(r.getClass()).debug("project name: " + pname);
		IPath pfullpath = p.getFullPath();
		Logger.getLogger(r.getClass()).debug("project fullpath: " + pfullpath);
		IPath plocation = p.getLocation();
		Logger.getLogger(r.getClass()).debug("project location: " + plocation);
		java.net.URI puri = p.getLocationURI();
		Logger.getLogger(r.getClass()).debug("project uri: " + puri);
		IPath prl = p.getRawLocation();
		Logger.getLogger(r.getClass()).debug("project raw location: " + prl);
		java.net.URI prluri = p.getRawLocationURI();
		Logger.getLogger(r.getClass()).debug("project raw location uri: " + prluri);
		IPath pwl = p.getWorkingLocation(AGCLAnalysisPlugin.PLUGIN_ID);
		Logger.getLogger(p.getClass()).debug("project working location: " + pwl);
		IPath psl = AGCLAnalysisPlugin.getDefault().getStateLocation();
		Logger.getLogger(r.getClass()).debug("plugin state location:    " + psl);
		Logger.getLogger(r.getClass()).debug("  same?     " + psl.equals(pwl));
		IPreferenceStore prefStore = AGCLAnalysisPlugin.getDefault().getPreferenceStore();
		String mc = prefStore.getString(IPreferenceConstants.MODEL_CHECKER_PREFERENCE);
		Logger.getLogger(r.getClass()).debug("model checker used: " + mc);
		String mcf = prefStore.getString(IPreferenceConstants.MODEL_CHECKER_FLAGS_PREFERENCE);
		Logger.getLogger(r.getClass()).debug("model checker flags used: " + mcf);
		String mcst = prefStore.getString(IPreferenceConstants.MODEL_CHECKER_SCRIPT_TEMPLATE_PREFERENCE);
		Logger.getLogger(r.getClass()).debug("model checker script template used: " + mcst);
		String mcid = prefStore.getString(IPreferenceConstants.MODEL_CHECKER_INPUT_DIR_PREFERENCE);
		Logger.getLogger(r.getClass()).debug("model checker input dir used: " + mcid);
		String mcod = prefStore.getString(IPreferenceConstants.MODEL_CHECKER_OUTPUT_DIR_PREFERENCE);
		Logger.getLogger(r.getClass()).debug("model checker output dir used: " + mcod);
	}
}