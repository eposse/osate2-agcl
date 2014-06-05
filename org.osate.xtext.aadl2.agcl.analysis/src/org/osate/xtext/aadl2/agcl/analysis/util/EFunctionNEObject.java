/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.util;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * @author eposse
 *
 */
public interface EFunctionNEObject extends EFunction<EMap<EStructuralFeature,EObject>, EObject> {

	public EObject apply(EMap<EStructuralFeature,EObject> args);
	//public EObject apply(FeatureMap args);
}
