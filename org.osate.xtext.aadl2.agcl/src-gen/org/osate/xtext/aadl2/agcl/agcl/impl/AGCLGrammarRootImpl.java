/**
 */
package org.osate.xtext.aadl2.agcl.agcl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexLibrary;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause;
import org.osate.xtext.aadl2.agcl.agcl.AGCLGrammarRoot;
import org.osate.xtext.aadl2.agcl.agcl.AgclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AGCL Grammar Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLGrammarRootImpl#getLib <em>Lib</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLGrammarRootImpl#getSubclause <em>Subclause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AGCLGrammarRootImpl extends MinimalEObjectImpl.Container implements AGCLGrammarRoot
{
  /**
   * The cached value of the '{@link #getLib() <em>Lib</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLib()
   * @generated
   * @ordered
   */
  protected AGCLAnnexLibrary lib;

  /**
   * The cached value of the '{@link #getSubclause() <em>Subclause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubclause()
   * @generated
   * @ordered
   */
  protected AGCLAnnexSubclause subclause;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AGCLGrammarRootImpl()
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
    return AgclPackage.Literals.AGCL_GRAMMAR_ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AGCLAnnexLibrary getLib()
  {
    return lib;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLib(AGCLAnnexLibrary newLib, NotificationChain msgs)
  {
    AGCLAnnexLibrary oldLib = lib;
    lib = newLib;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgclPackage.AGCL_GRAMMAR_ROOT__LIB, oldLib, newLib);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLib(AGCLAnnexLibrary newLib)
  {
    if (newLib != lib)
    {
      NotificationChain msgs = null;
      if (lib != null)
        msgs = ((InternalEObject)lib).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgclPackage.AGCL_GRAMMAR_ROOT__LIB, null, msgs);
      if (newLib != null)
        msgs = ((InternalEObject)newLib).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgclPackage.AGCL_GRAMMAR_ROOT__LIB, null, msgs);
      msgs = basicSetLib(newLib, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgclPackage.AGCL_GRAMMAR_ROOT__LIB, newLib, newLib));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AGCLAnnexSubclause getSubclause()
  {
    return subclause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubclause(AGCLAnnexSubclause newSubclause, NotificationChain msgs)
  {
    AGCLAnnexSubclause oldSubclause = subclause;
    subclause = newSubclause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgclPackage.AGCL_GRAMMAR_ROOT__SUBCLAUSE, oldSubclause, newSubclause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubclause(AGCLAnnexSubclause newSubclause)
  {
    if (newSubclause != subclause)
    {
      NotificationChain msgs = null;
      if (subclause != null)
        msgs = ((InternalEObject)subclause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgclPackage.AGCL_GRAMMAR_ROOT__SUBCLAUSE, null, msgs);
      if (newSubclause != null)
        msgs = ((InternalEObject)newSubclause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgclPackage.AGCL_GRAMMAR_ROOT__SUBCLAUSE, null, msgs);
      msgs = basicSetSubclause(newSubclause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgclPackage.AGCL_GRAMMAR_ROOT__SUBCLAUSE, newSubclause, newSubclause));
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
      case AgclPackage.AGCL_GRAMMAR_ROOT__LIB:
        return basicSetLib(null, msgs);
      case AgclPackage.AGCL_GRAMMAR_ROOT__SUBCLAUSE:
        return basicSetSubclause(null, msgs);
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
      case AgclPackage.AGCL_GRAMMAR_ROOT__LIB:
        return getLib();
      case AgclPackage.AGCL_GRAMMAR_ROOT__SUBCLAUSE:
        return getSubclause();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AgclPackage.AGCL_GRAMMAR_ROOT__LIB:
        setLib((AGCLAnnexLibrary)newValue);
        return;
      case AgclPackage.AGCL_GRAMMAR_ROOT__SUBCLAUSE:
        setSubclause((AGCLAnnexSubclause)newValue);
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
      case AgclPackage.AGCL_GRAMMAR_ROOT__LIB:
        setLib((AGCLAnnexLibrary)null);
        return;
      case AgclPackage.AGCL_GRAMMAR_ROOT__SUBCLAUSE:
        setSubclause((AGCLAnnexSubclause)null);
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
      case AgclPackage.AGCL_GRAMMAR_ROOT__LIB:
        return lib != null;
      case AgclPackage.AGCL_GRAMMAR_ROOT__SUBCLAUSE:
        return subclause != null;
    }
    return super.eIsSet(featureID);
  }

} //AGCLGrammarRootImpl
