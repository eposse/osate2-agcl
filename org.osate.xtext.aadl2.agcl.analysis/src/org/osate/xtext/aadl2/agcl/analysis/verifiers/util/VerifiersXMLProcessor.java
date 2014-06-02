/**
 */
package org.osate.xtext.aadl2.agcl.analysis.verifiers.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VerifiersXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerifiersXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		VerifiersPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the VerifiersResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new VerifiersResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new VerifiersResourceFactoryImpl());
		}
		return registrations;
	}

} //VerifiersXMLProcessor
