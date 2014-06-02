/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.visitors;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;

/**
 * A ViewpointContext encapsulates the collection of viewpoints declared and the 
 * (declared) viewpoints to verify in a given analysis run.
 * 
 * @author Ernesto Posse
 *
 */
public class ViewpointContext {

	private Set<String> declaredViewpoints;
	private Set<String> viewpointsToVerify;
	
	public ViewpointContext() {
		declaredViewpoints = new HashSet<String>();
		viewpointsToVerify = new HashSet<String>();
	}
	
	/**
	 * @return the declaredViewpoints
	 */
	public Set<String> getDeclaredViewpoints() {
		return declaredViewpoints;
	}
	/**
	 * @return the viewpointsToVerify
	 */
	public Set<String> getViewpointsToVerify() {
		return viewpointsToVerify;
	}
	/**
	 * @param declaredViewpoints the declaredViewpoints to set
	 */
	public void setDeclaredViewpoints(Set<String> declaredViewpoints) {
		this.declaredViewpoints = declaredViewpoints;
	}
	/**
	 * @param viewpointsToVerify the viewpointsToVerify to set
	 */
	public void setViewpointsToVerify(Set<String> viewpointsToVerify) {
		this.viewpointsToVerify = viewpointsToVerify;
	}
	/**
	 * @param viewpointName  some viewpoint
	 * @return whether a viewpoint with the given name has been declared
	 * @see java.util.Set#contains(java.lang.Object)
	 */
	public boolean containsDeclaredViewpoint(String viewpointName) {
		return declaredViewpoints.contains(viewpointName);
	}
	/**
	 * @param viewpoint  some viewpoint
	 * @return {@code true} if this set did not already contain the specified element
	 * @see java.util.Set#add(java.lang.Object)
	 */
	public boolean addDeclaredViewpoint(String viewpoint) {
		return declaredViewpoints.add(viewpoint);
	}
	/**
	 * @param viewpointName  some viewpoint
	 * @return whether a viewpoint with the given name has been declared
	 * @see java.util.Set#contains(java.lang.Object)
	 */
	public boolean containsViewpointToVerify(String viewpointName) {
		if (!declaredViewpoints.contains(viewpointName)) {
			Logger.getLogger(getClass()).warn("undeclared viewpoint :" + viewpointName);
		}
		return viewpointsToVerify.contains(viewpointName);
	}
	/**
	 * @param viewpoint  some viewpoint
	 * @return {@code true} if this set did not already contain the specified element
	 * @see java.util.Set#add(java.lang.Object)
	 */
	public boolean addViewpointToVerify(String viewpointName) {
		if (!declaredViewpoints.contains(viewpointName)) {
			Logger.getLogger(getClass()).warn("undeclared viewpoint :" + viewpointName);
		}
		return viewpointsToVerify.add(viewpointName);
	}

}
