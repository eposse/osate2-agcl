/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.misc;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.ISerializer;
import org.osate.xtext.aadl2.agcl.agcl.AgclFactory;
import org.osate.xtext.aadl2.agcl.agcl.AtomicProp;
import org.osate.xtext.aadl2.agcl.agcl.Var;
import org.osate.xtext.aadl2.agcl.analysis.AGCLAnalysisPlugin;

/**
 * This class transforms a PSL specification from the AGCL meta-model to a string representation compatible with
 * NuSMV
 * 
 * @author Ernesto Posse
 *
 */
public class PSL2NuSMVSpecConverterSwitch extends AgclTransform<EObject> {
	
	private ISerializer serializer = AGCLAnalysisPlugin.getDefault().getSerializer();
	
	public EObject caseAtomicProp(AtomicProp ap) {
		String result = "ap(" + serializer.serialize(ap) + ")";
		Var newVar = AgclFactory.eINSTANCE.createVar();
		newVar.setName(result);
		Logger.getLogger(getClass()).debug(result);
		return newVar;
	}

	
}
