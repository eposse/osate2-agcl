/**
 */
package org.osate.xtext.aadl2.agcl.agcl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.xtext.aadl2.agcl.agcl.AgclPackage;
import org.osate.xtext.aadl2.agcl.agcl.PSLBooleanExpression;
import org.osate.xtext.aadl2.agcl.agcl.PSLExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PSL Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.PSLExpressionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.PSLExpressionImpl#isImplication <em>Implication</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.PSLExpressionImpl#getConclusion <em>Conclusion</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.PSLExpressionImpl#isBiconditional <em>Biconditional</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.PSLExpressionImpl#getOther <em>Other</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PSLExpressionImpl extends MinimalEObjectImpl.Container implements PSLExpression
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected PSLBooleanExpression condition;

  /**
   * The default value of the '{@link #isImplication() <em>Implication</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isImplication()
   * @generated
   * @ordered
   */
  protected static final boolean IMPLICATION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isImplication() <em>Implication</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isImplication()
   * @generated
   * @ordered
   */
  protected boolean implication = IMPLICATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getConclusion() <em>Conclusion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConclusion()
   * @generated
   * @ordered
   */
  protected PSLBooleanExpression conclusion;

  /**
   * The default value of the '{@link #isBiconditional() <em>Biconditional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBiconditional()
   * @generated
   * @ordered
   */
  protected static final boolean BICONDITIONAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBiconditional() <em>Biconditional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBiconditional()
   * @generated
   * @ordered
   */
  protected boolean biconditional = BICONDITIONAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getOther() <em>Other</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOther()
   * @generated
   * @ordered
   */
  protected PSLBooleanExpression other;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PSLExpressionImpl()
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
    return AgclPackage.Literals.PSL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PSLBooleanExpression getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(PSLBooleanExpression newCondition, NotificationChain msgs)
  {
    PSLBooleanExpression oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgclPackage.PSL_EXPRESSION__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(PSLBooleanExpression newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgclPackage.PSL_EXPRESSION__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgclPackage.PSL_EXPRESSION__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgclPackage.PSL_EXPRESSION__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isImplication()
  {
    return implication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImplication(boolean newImplication)
  {
    boolean oldImplication = implication;
    implication = newImplication;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgclPackage.PSL_EXPRESSION__IMPLICATION, oldImplication, implication));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PSLBooleanExpression getConclusion()
  {
    return conclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConclusion(PSLBooleanExpression newConclusion, NotificationChain msgs)
  {
    PSLBooleanExpression oldConclusion = conclusion;
    conclusion = newConclusion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgclPackage.PSL_EXPRESSION__CONCLUSION, oldConclusion, newConclusion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConclusion(PSLBooleanExpression newConclusion)
  {
    if (newConclusion != conclusion)
    {
      NotificationChain msgs = null;
      if (conclusion != null)
        msgs = ((InternalEObject)conclusion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgclPackage.PSL_EXPRESSION__CONCLUSION, null, msgs);
      if (newConclusion != null)
        msgs = ((InternalEObject)newConclusion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgclPackage.PSL_EXPRESSION__CONCLUSION, null, msgs);
      msgs = basicSetConclusion(newConclusion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgclPackage.PSL_EXPRESSION__CONCLUSION, newConclusion, newConclusion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBiconditional()
  {
    return biconditional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBiconditional(boolean newBiconditional)
  {
    boolean oldBiconditional = biconditional;
    biconditional = newBiconditional;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgclPackage.PSL_EXPRESSION__BICONDITIONAL, oldBiconditional, biconditional));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PSLBooleanExpression getOther()
  {
    return other;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOther(PSLBooleanExpression newOther, NotificationChain msgs)
  {
    PSLBooleanExpression oldOther = other;
    other = newOther;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgclPackage.PSL_EXPRESSION__OTHER, oldOther, newOther);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOther(PSLBooleanExpression newOther)
  {
    if (newOther != other)
    {
      NotificationChain msgs = null;
      if (other != null)
        msgs = ((InternalEObject)other).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgclPackage.PSL_EXPRESSION__OTHER, null, msgs);
      if (newOther != null)
        msgs = ((InternalEObject)newOther).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgclPackage.PSL_EXPRESSION__OTHER, null, msgs);
      msgs = basicSetOther(newOther, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgclPackage.PSL_EXPRESSION__OTHER, newOther, newOther));
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
      case AgclPackage.PSL_EXPRESSION__CONDITION:
        return basicSetCondition(null, msgs);
      case AgclPackage.PSL_EXPRESSION__CONCLUSION:
        return basicSetConclusion(null, msgs);
      case AgclPackage.PSL_EXPRESSION__OTHER:
        return basicSetOther(null, msgs);
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
      case AgclPackage.PSL_EXPRESSION__CONDITION:
        return getCondition();
      case AgclPackage.PSL_EXPRESSION__IMPLICATION:
        return isImplication();
      case AgclPackage.PSL_EXPRESSION__CONCLUSION:
        return getConclusion();
      case AgclPackage.PSL_EXPRESSION__BICONDITIONAL:
        return isBiconditional();
      case AgclPackage.PSL_EXPRESSION__OTHER:
        return getOther();
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
      case AgclPackage.PSL_EXPRESSION__CONDITION:
        setCondition((PSLBooleanExpression)newValue);
        return;
      case AgclPackage.PSL_EXPRESSION__IMPLICATION:
        setImplication((Boolean)newValue);
        return;
      case AgclPackage.PSL_EXPRESSION__CONCLUSION:
        setConclusion((PSLBooleanExpression)newValue);
        return;
      case AgclPackage.PSL_EXPRESSION__BICONDITIONAL:
        setBiconditional((Boolean)newValue);
        return;
      case AgclPackage.PSL_EXPRESSION__OTHER:
        setOther((PSLBooleanExpression)newValue);
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
      case AgclPackage.PSL_EXPRESSION__CONDITION:
        setCondition((PSLBooleanExpression)null);
        return;
      case AgclPackage.PSL_EXPRESSION__IMPLICATION:
        setImplication(IMPLICATION_EDEFAULT);
        return;
      case AgclPackage.PSL_EXPRESSION__CONCLUSION:
        setConclusion((PSLBooleanExpression)null);
        return;
      case AgclPackage.PSL_EXPRESSION__BICONDITIONAL:
        setBiconditional(BICONDITIONAL_EDEFAULT);
        return;
      case AgclPackage.PSL_EXPRESSION__OTHER:
        setOther((PSLBooleanExpression)null);
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
      case AgclPackage.PSL_EXPRESSION__CONDITION:
        return condition != null;
      case AgclPackage.PSL_EXPRESSION__IMPLICATION:
        return implication != IMPLICATION_EDEFAULT;
      case AgclPackage.PSL_EXPRESSION__CONCLUSION:
        return conclusion != null;
      case AgclPackage.PSL_EXPRESSION__BICONDITIONAL:
        return biconditional != BICONDITIONAL_EDEFAULT;
      case AgclPackage.PSL_EXPRESSION__OTHER:
        return other != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (implication: ");
    result.append(implication);
    result.append(", biconditional: ");
    result.append(biconditional);
    result.append(')');
    return result.toString();
  }

} //PSLExpressionImpl
