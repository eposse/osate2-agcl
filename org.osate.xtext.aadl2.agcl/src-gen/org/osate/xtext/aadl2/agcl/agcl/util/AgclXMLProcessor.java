/**
 */
package org.osate.xtext.aadl2.agcl.agcl.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.osate.xtext.aadl2.agcl.agcl.AgclPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AgclXMLProcessor extends XMLProcessor
{

  /**
   * Public constructor to instantiate the helper.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AgclXMLProcessor()
  {
    super((EPackage.Registry.INSTANCE));
    AgclPackage.eINSTANCE.eClass();
  }
  
  /**
   * Register for "*" and "xml" file extensions the AgclResourceFactoryImpl factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Map<String, Resource.Factory> getRegistrations()
  {
    if (registrations == null)
    {
      super.getRegistrations();
      registrations.put(XML_EXTENSION, new AgclResourceFactoryImpl());
      registrations.put(STAR_EXTENSION, new AgclResourceFactoryImpl());
    }
    return registrations;
  }

} //AgclXMLProcessor
