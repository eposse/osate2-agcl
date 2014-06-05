/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.visitors;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.serializer.ISerializer;
import org.osate.xtext.aadl2.agcl.agcl.util.AgclSwitch;
import org.osate.xtext.aadl2.agcl.analysis.AGCLAnalysisPlugin;
import org.osate.xtext.aadl2.agcl.analysis.util.AGCLUtil;
import org.osate.xtext.aadl2.agcl.analysis.util.EFunction;
import org.osate.xtext.aadl2.agcl.analysis.util.EFunctionNEObject;
import org.osate.xtext.aadl2.agcl.analysis.util.Function;

/**
 * Acts as a map (in the sense of transformation/function) from AGCL AST's to AGCL AST'.
 * The main method is {@link #map} which will construct a new Ecore object from the given one, where each object may
 * be transformed according to the appropriate caseX method.
 * 
 * <p> The client must implement the caseX method for the constructs X that must be transformed.
 * All other constructs will be preserved in the sense that a structurally equivalent copy will be produced. 
 * 
 * @author Ernesto Posse
 *
 */
public class AgclTransform<T> extends AgclSwitch<T> {
	
	protected EFunction<EMap<EStructuralFeature,T>,T> function;
	private ISerializer serializer = AGCLAnalysisPlugin.getDefault().getSerializer();
	private int indent = 0;
	
	public AgclTransform() {
		super();
		final EFunctionNEObject defaultFunction = new EFunctionNEObject() {

			@Override
			public EObject apply(EObject context,
					EMap<EStructuralFeature, EObject> args) {
				return featureReplacement(context, args);
			}

			@Override
			public EObject apply(EMap<EStructuralFeature, EObject> args) {
				return null;
			}
			
		};
		function = new EFunction<EMap<EStructuralFeature, T>, T>() {
			
			@Override
			public T apply(EMap<EStructuralFeature, T> args) {
				return null;
			}

			@Override
			public T apply(EObject context, EMap<EStructuralFeature, T> args) {
				T result;
				EMap<EStructuralFeature, EObject> newArgs = new BasicEMap<EStructuralFeature, EObject>();
				for (Entry<EStructuralFeature, T> entry : args.entrySet()) {
					newArgs.put(entry.getKey(), (EObject)entry.getValue());
				}
				EObject newEObject = defaultFunction.apply(context, newArgs);
				
				return (T)newEObject;
			}
		};
	}
	
	public T map(EObject source, EFunction<EMap<EStructuralFeature, T>, T> func) {
		indent = 0;
		function = func;
		return doSwitch(source);
	}
	
	public T map(EObject source) {
		indent = 0;
		return doSwitch(source);
	}
	
	public T defaultCase(EObject source) {
		Logger.getLogger(getClass()).debug(String.format(" %s+ transforming: '%20s' | %s", AGCLUtil.spaces(indent), serializer.serialize(source), source));
		T target = null; // = AgclPackage.eINSTANCE.getEClassifier(source.eClass());
//		EList<EObject> contents = source.eContents();
		EClass srcClass = source.eClass();
		EList<EStructuralFeature> features = srcClass.getEStructuralFeatures();
		EMap<EStructuralFeature, T> childrenResults = new BasicEMap<EStructuralFeature, T>();
		indent += 4;
//		for (EObject obj: contents) {
		for (EStructuralFeature feature: features) {
			Object obj = source.eGet(feature);
			Logger.getLogger(getClass()).debug(String.format("feature: '%s':'%s' ", feature,obj));
			if (obj instanceof EObjectContainmentEList) {
				EObjectContainmentEList<EObject> eocl = (EObjectContainmentEList<EObject>) obj;
			}
			if (obj instanceof EObject) {
				EObject eobj = (EObject) obj;
				Logger.getLogger(getClass()).debug(String.format("%s- child:        '%20s' | %s", AGCLUtil.spaces(indent), serializer.serialize(eobj), eobj));
				T childResult = doSwitch(eobj);
				childrenResults.put(feature, childResult);
			}
		}
		indent -= 4;
		target = function.apply(childrenResults);
		return target;
	}
	
	public EObject featureReplacement(EObject source, EMap<EStructuralFeature,EObject> newFeatures) {
		Logger.getLogger(getClass()).debug(String.format("%s+ replacing features: '%20s' | %s", AGCLUtil.spaces(indent), serializer.serialize(source), source));
		EClass srcClass = source.eClass();
		EObject target = EcoreUtil.create(srcClass);
		EList<EStructuralFeature> features = srcClass.getEStructuralFeatures();
		indent += 4;
		for (EStructuralFeature feature: features) {
			Object currentFeatureVal = source.eGet(feature);
			Logger.getLogger(getClass()).debug(String.format("%s- feature:        '%20s' =  '%20s' | %s", AGCLUtil.spaces(indent), feature.getName(), currentFeatureVal, feature));
			EObject newValue = newFeatures.get(feature);
			target.eSet(feature, newValue);
			Logger.getLogger(getClass()).debug(String.format("%s- replaced by:    '%20s' =  '%20s' | %s", AGCLUtil.spaces(indent), feature.getName(), newValue, feature));
		}
		indent -= 4;
		Logger.getLogger(getClass()).debug(String.format("%s+ result: '%20s' | %s", AGCLUtil.spaces(indent), serializer.serialize(target), target));
		return target;
	}
	
	

}
