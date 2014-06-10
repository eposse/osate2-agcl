/**
 */
package org.osate.xtext.aadl2.agcl.agcl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.xtext.aadl2.agcl.agcl.AgclPackage;
import org.osate.xtext.aadl2.agcl.agcl.PSLExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PSL Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.PSLExpressionImpl#getSubterm <em>Subterm</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.PSLExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.PSLExpressionImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.PSLExpressionImpl#getNegated <em>Negated</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.PSLExpressionImpl#getTerms <em>Terms</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.PSLExpressionImpl#getFactors <em>Factors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PSLExpressionImpl extends MinimalEObjectImpl.Container implements PSLExpression
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
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected PSLExpression left;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected PSLExpression right;

  /**
   * The cached value of the '{@link #getNegated() <em>Negated</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNegated()
   * @generated
   * @ordered
   */
  protected PSLExpression negated;

  /**
   * The cached value of the '{@link #getTerms() <em>Terms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerms()
   * @generated
   * @ordered
   */
  protected EList<PSLExpression> terms;

  /**
   * The cached value of the '{@link #getFactors() <em>Factors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactors()
   * @generated
   * @ordered
   */
  protected EList<PSLExpression> factors;

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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgclPackage.PSL_EXPRESSION__SUBTERM, oldSubterm, newSubterm);
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
        msgs = ((InternalEObject)subterm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgclPackage.PSL_EXPRESSION__SUBTERM, null, msgs);
      if (newSubterm != null)
        msgs = ((InternalEObject)newSubterm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgclPackage.PSL_EXPRESSION__SUBTERM, null, msgs);
      msgs = basicSetSubterm(newSubterm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgclPackage.PSL_EXPRESSION__SUBTERM, newSubterm, newSubterm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PSLExpression getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(PSLExpression newLeft, NotificationChain msgs)
  {
    PSLExpression oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgclPackage.PSL_EXPRESSION__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(PSLExpression newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgclPackage.PSL_EXPRESSION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgclPackage.PSL_EXPRESSION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgclPackage.PSL_EXPRESSION__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PSLExpression getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(PSLExpression newRight, NotificationChain msgs)
  {
    PSLExpression oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgclPackage.PSL_EXPRESSION__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(PSLExpression newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgclPackage.PSL_EXPRESSION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgclPackage.PSL_EXPRESSION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgclPackage.PSL_EXPRESSION__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PSLExpression getNegated()
  {
    return negated;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNegated(PSLExpression newNegated, NotificationChain msgs)
  {
    PSLExpression oldNegated = negated;
    negated = newNegated;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgclPackage.PSL_EXPRESSION__NEGATED, oldNegated, newNegated);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNegated(PSLExpression newNegated)
  {
    if (newNegated != negated)
    {
      NotificationChain msgs = null;
      if (negated != null)
        msgs = ((InternalEObject)negated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgclPackage.PSL_EXPRESSION__NEGATED, null, msgs);
      if (newNegated != null)
        msgs = ((InternalEObject)newNegated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgclPackage.PSL_EXPRESSION__NEGATED, null, msgs);
      msgs = basicSetNegated(newNegated, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgclPackage.PSL_EXPRESSION__NEGATED, newNegated, newNegated));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PSLExpression> getTerms()
  {
    if (terms == null)
    {
      terms = new EObjectContainmentEList<PSLExpression>(PSLExpression.class, this, AgclPackage.PSL_EXPRESSION__TERMS);
    }
    return terms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PSLExpression> getFactors()
  {
    if (factors == null)
    {
      factors = new EObjectContainmentEList<PSLExpression>(PSLExpression.class, this, AgclPackage.PSL_EXPRESSION__FACTORS);
    }
    return factors;
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
      case AgclPackage.PSL_EXPRESSION__SUBTERM:
        return basicSetSubterm(null, msgs);
      case AgclPackage.PSL_EXPRESSION__LEFT:
        return basicSetLeft(null, msgs);
      case AgclPackage.PSL_EXPRESSION__RIGHT:
        return basicSetRight(null, msgs);
      case AgclPackage.PSL_EXPRESSION__NEGATED:
        return basicSetNegated(null, msgs);
      case AgclPackage.PSL_EXPRESSION__TERMS:
        return ((InternalEList<?>)getTerms()).basicRemove(otherEnd, msgs);
      case AgclPackage.PSL_EXPRESSION__FACTORS:
        return ((InternalEList<?>)getFactors()).basicRemove(otherEnd, msgs);
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
      case AgclPackage.PSL_EXPRESSION__SUBTERM:
        return getSubterm();
      case AgclPackage.PSL_EXPRESSION__LEFT:
        return getLeft();
      case AgclPackage.PSL_EXPRESSION__RIGHT:
        return getRight();
      case AgclPackage.PSL_EXPRESSION__NEGATED:
        return getNegated();
      case AgclPackage.PSL_EXPRESSION__TERMS:
        return getTerms();
      case AgclPackage.PSL_EXPRESSION__FACTORS:
        return getFactors();
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
      case AgclPackage.PSL_EXPRESSION__SUBTERM:
        setSubterm((PSLExpression)newValue);
        return;
      case AgclPackage.PSL_EXPRESSION__LEFT:
        setLeft((PSLExpression)newValue);
        return;
      case AgclPackage.PSL_EXPRESSION__RIGHT:
        setRight((PSLExpression)newValue);
        return;
      case AgclPackage.PSL_EXPRESSION__NEGATED:
        setNegated((PSLExpression)newValue);
        return;
      case AgclPackage.PSL_EXPRESSION__TERMS:
        getTerms().clear();
        getTerms().addAll((Collection<? extends PSLExpression>)newValue);
        return;
      case AgclPackage.PSL_EXPRESSION__FACTORS:
        getFactors().clear();
        getFactors().addAll((Collection<? extends PSLExpression>)newValue);
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
      case AgclPackage.PSL_EXPRESSION__SUBTERM:
        setSubterm((PSLExpression)null);
        return;
      case AgclPackage.PSL_EXPRESSION__LEFT:
        setLeft((PSLExpression)null);
        return;
      case AgclPackage.PSL_EXPRESSION__RIGHT:
        setRight((PSLExpression)null);
        return;
      case AgclPackage.PSL_EXPRESSION__NEGATED:
        setNegated((PSLExpression)null);
        return;
      case AgclPackage.PSL_EXPRESSION__TERMS:
        getTerms().clear();
        return;
      case AgclPackage.PSL_EXPRESSION__FACTORS:
        getFactors().clear();
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
      case AgclPackage.PSL_EXPRESSION__SUBTERM:
        return subterm != null;
      case AgclPackage.PSL_EXPRESSION__LEFT:
        return left != null;
      case AgclPackage.PSL_EXPRESSION__RIGHT:
        return right != null;
      case AgclPackage.PSL_EXPRESSION__NEGATED:
        return negated != null;
      case AgclPackage.PSL_EXPRESSION__TERMS:
        return terms != null && !terms.isEmpty();
      case AgclPackage.PSL_EXPRESSION__FACTORS:
        return factors != null && !factors.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PSLExpressionImpl
