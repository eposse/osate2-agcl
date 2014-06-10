/**
 */
package org.osate.xtext.aadl2.agcl.agcl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.xtext.aadl2.agcl.agcl.AgclPackage;
import org.osate.xtext.aadl2.agcl.agcl.PSLEventually;
import org.osate.xtext.aadl2.agcl.agcl.PSLExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PSL Eventually</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.PSLEventuallyImpl#getSubterm <em>Subterm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PSLEventuallyImpl extends PSLExpressionImpl implements PSLEventually
{
  /**
   * The cached value of the '{@link #getSubterm() <em>Subterm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubterm()
   * @generated
   * @ordered
   */
  protected PSLExpression subterm;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PSLEventuallyImpl()
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
    return AgclPackage.Literals.PSL_EVENTUALLY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PSLExpression getSubterm()
  {
    return subterm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubterm(PSLExpression newSubterm, NotificationChain msgs)
  {
    PSLExpression oldSubterm = subterm;
    subterm = newSubterm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgclPackage.PSL_EVENTUALLY__SUBTERM, oldSubterm, newSubterm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubterm(PSLExpression newSubterm)
  {
    if (newSubterm != subterm)
    {
      NotificationChain msgs = null;
      if (subterm != null)
        msgs = ((InternalEObject)subterm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgclPackage.PSL_EVENTUALLY__SUBTERM, null, msgs);
      if (newSubterm != null)
        msgs = ((InternalEObject)newSubterm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgclPackage.PSL_EVENTUALLY__SUBTERM, null, msgs);
      msgs = basicSetSubterm(newSubterm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgclPackage.PSL_EVENTUALLY__SUBTERM, newSubterm, newSubterm));
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
      case AgclPackage.PSL_EVENTUALLY__SUBTERM:
        return basicSetSubterm(null, msgs);
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
      case AgclPackage.PSL_EVENTUALLY__SUBTERM:
        return getSubterm();
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
      case AgclPackage.PSL_EVENTUALLY__SUBTERM:
        setSubterm((PSLExpression)newValue);
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
      case AgclPackage.PSL_EVENTUALLY__SUBTERM:
        setSubterm((PSLExpression)null);
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
      case AgclPackage.PSL_EVENTUALLY__SUBTERM:
        return subterm != null;
    }
    return super.eIsSet(featureID);
  }

} //PSLEventuallyImpl
