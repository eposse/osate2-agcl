/**
 */
package org.osate.xtext.aadl2.agcl.agcl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.impl.AnnexLibraryImpl;

import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexLibrary;
import org.osate.xtext.aadl2.agcl.agcl.AGCLEnforce;
import org.osate.xtext.aadl2.agcl.agcl.AGCLViewpoint;
import org.osate.xtext.aadl2.agcl.agcl.AgclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AGCL Annex Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLAnnexLibraryImpl#getViewpoints <em>Viewpoints</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLAnnexLibraryImpl#getEnforceclauses <em>Enforceclauses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AGCLAnnexLibraryImpl extends AnnexLibraryImpl implements AGCLAnnexLibrary
{
  /**
   * The cached value of the '{@link #getViewpoints() <em>Viewpoints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewpoints()
   * @generated
   * @ordered
   */
  protected EList<AGCLViewpoint> viewpoints;

  /**
   * The cached value of the '{@link #getEnforceclauses() <em>Enforceclauses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnforceclauses()
   * @generated
   * @ordered
   */
  protected EList<AGCLEnforce> enforceclauses;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AGCLAnnexLibraryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AgclPackage.Literals.AGCL_ANNEX_LIBRARY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AGCLViewpoint> getViewpoints()
  {
    if (viewpoints == null)
    {
      viewpoints = new EObjectContainmentEList<AGCLViewpoint>(AGCLViewpoint.class, this, AgclPackage.AGCL_ANNEX_LIBRARY__VIEWPOINTS);
    }
    return viewpoints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AGCLEnforce> getEnforceclauses()
  {
    if (enforceclauses == null)
    {
      enforceclauses = new EObjectContainmentEList<AGCLEnforce>(AGCLEnforce.class, this, AgclPackage.AGCL_ANNEX_LIBRARY__ENFORCECLAUSES);
    }
    return enforceclauses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AgclPackage.AGCL_ANNEX_LIBRARY__VIEWPOINTS:
        return ((InternalEList<?>)getViewpoints()).basicRemove(otherEnd, msgs);
      case AgclPackage.AGCL_ANNEX_LIBRARY__ENFORCECLAUSES:
        return ((InternalEList<?>)getEnforceclauses()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AgclPackage.AGCL_ANNEX_LIBRARY__VIEWPOINTS:
        return getViewpoints();
      case AgclPackage.AGCL_ANNEX_LIBRARY__ENFORCECLAUSES:
        return getEnforceclauses();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AgclPackage.AGCL_ANNEX_LIBRARY__VIEWPOINTS:
        getViewpoints().clear();
        getViewpoints().addAll((Collection<? extends AGCLViewpoint>)newValue);
        return;
      case AgclPackage.AGCL_ANNEX_LIBRARY__ENFORCECLAUSES:
        getEnforceclauses().clear();
        getEnforceclauses().addAll((Collection<? extends AGCLEnforce>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AgclPackage.AGCL_ANNEX_LIBRARY__VIEWPOINTS:
        getViewpoints().clear();
        return;
      case AgclPackage.AGCL_ANNEX_LIBRARY__ENFORCECLAUSES:
        getEnforceclauses().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AgclPackage.AGCL_ANNEX_LIBRARY__VIEWPOINTS:
        return viewpoints != null && !viewpoints.isEmpty();
      case AgclPackage.AGCL_ANNEX_LIBRARY__ENFORCECLAUSES:
        return enforceclauses != null && !enforceclauses.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AGCLAnnexLibraryImpl
