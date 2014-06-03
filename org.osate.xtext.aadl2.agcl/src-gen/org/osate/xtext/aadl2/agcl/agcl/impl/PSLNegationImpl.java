/**
 */
package org.osate.xtext.aadl2.agcl.agcl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.xtext.aadl2.agcl.agcl.AgclPackage;
import org.osate.xtext.aadl2.agcl.agcl.PSLBooleanExpression;
import org.osate.xtext.aadl2.agcl.agcl.PSLNegation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PSL Negation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.PSLNegationImpl#getNegated <em>Negated</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PSLNegationImpl extends PSLAtomImpl implements PSLNegation
{
  /**
   * The cached value of the '{@link #getNegated() <em>Negated</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNegated()
   * @generated
   * @ordered
   */
  protected PSLBooleanExpression negated;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PSLNegationImpl()
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
    return AgclPackage.Literals.PSL_NEGATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PSLBooleanExpression getNegated()
  {
    return negated;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNegated(PSLBooleanExpression newNegated, NotificationChain msgs)
  {
    PSLBooleanExpression oldNegated = negated;
    negated = newNegated;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgclPackage.PSL_NEGATION__NEGATED, oldNegated, newNegated);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNegated(PSLBooleanExpression newNegated)
  {
    if (newNegated != negated)
    {
      NotificationChain msgs = null;
      if (negated != null)
        msgs = ((InternalEObject)negated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgclPackage.PSL_NEGATION__NEGATED, null, msgs);
      if (newNegated != null)
        msgs = ((InternalEObject)newNegated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgclPackage.PSL_NEGATION__NEGATED, null, msgs);
      msgs = basicSetNegated(newNegated, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgclPackage.PSL_NEGATION__NEGATED, newNegated, newNegated));
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
      case AgclPackage.PSL_NEGATION__NEGATED:
        return basicSetNegated(null, msgs);
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
      case AgclPackage.PSL_NEGATION__NEGATED:
        return getNegated();
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
      case AgclPackage.PSL_NEGATION__NEGATED:
        setNegated((PSLBooleanExpression)newValue);
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
      case AgclPackage.PSL_NEGATION__NEGATED:
        setNegated((PSLBooleanExpression)null);
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
      case AgclPackage.PSL_NEGATION__NEGATED:
        return negated != null;
    }
    return super.eIsSet(featureID);
  }

} //PSLNegationImpl
