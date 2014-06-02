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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.impl.AnnexSubclauseImpl;

import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause;
import org.osate.xtext.aadl2.agcl.agcl.AGCLBehaviour;
import org.osate.xtext.aadl2.agcl.agcl.AGCLContract;
import org.osate.xtext.aadl2.agcl.agcl.AGCLPropertyDecl;
import org.osate.xtext.aadl2.agcl.agcl.AgclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AGCL Annex Subclause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLAnnexSubclauseImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLAnnexSubclauseImpl#getBehaviour <em>Behaviour</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLAnnexSubclauseImpl#getContracts <em>Contracts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AGCLAnnexSubclauseImpl extends AnnexSubclauseImpl implements AGCLAnnexSubclause
{
  /**
   * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarations()
   * @generated
   * @ordered
   */
  protected EList<AGCLPropertyDecl> declarations;

  /**
   * The cached value of the '{@link #getBehaviour() <em>Behaviour</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviour()
   * @generated
   * @ordered
   */
  protected AGCLBehaviour behaviour;

  /**
   * The cached value of the '{@link #getContracts() <em>Contracts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContracts()
   * @generated
   * @ordered
   */
  protected EList<AGCLContract> contracts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AGCLAnnexSubclauseImpl()
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
    return AgclPackage.Literals.AGCL_ANNEX_SUBCLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AGCLPropertyDecl> getDeclarations()
  {
    if (declarations == null)
    {
      declarations = new EObjectContainmentEList<AGCLPropertyDecl>(AGCLPropertyDecl.class, this, AgclPackage.AGCL_ANNEX_SUBCLAUSE__DECLARATIONS);
    }
    return declarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AGCLBehaviour getBehaviour()
  {
    return behaviour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBehaviour(AGCLBehaviour newBehaviour, NotificationChain msgs)
  {
    AGCLBehaviour oldBehaviour = behaviour;
    behaviour = newBehaviour;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgclPackage.AGCL_ANNEX_SUBCLAUSE__BEHAVIOUR, oldBehaviour, newBehaviour);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBehaviour(AGCLBehaviour newBehaviour)
  {
    if (newBehaviour != behaviour)
    {
      NotificationChain msgs = null;
      if (behaviour != null)
        msgs = ((InternalEObject)behaviour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgclPackage.AGCL_ANNEX_SUBCLAUSE__BEHAVIOUR, null, msgs);
      if (newBehaviour != null)
        msgs = ((InternalEObject)newBehaviour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgclPackage.AGCL_ANNEX_SUBCLAUSE__BEHAVIOUR, null, msgs);
      msgs = basicSetBehaviour(newBehaviour, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgclPackage.AGCL_ANNEX_SUBCLAUSE__BEHAVIOUR, newBehaviour, newBehaviour));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AGCLContract> getContracts()
  {
    if (contracts == null)
    {
      contracts = new EObjectContainmentEList<AGCLContract>(AGCLContract.class, this, AgclPackage.AGCL_ANNEX_SUBCLAUSE__CONTRACTS);
    }
    return contracts;
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
      case AgclPackage.AGCL_ANNEX_SUBCLAUSE__DECLARATIONS:
        return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
      case AgclPackage.AGCL_ANNEX_SUBCLAUSE__BEHAVIOUR:
        return basicSetBehaviour(null, msgs);
      case AgclPackage.AGCL_ANNEX_SUBCLAUSE__CONTRACTS:
        return ((InternalEList<?>)getContracts()).basicRemove(otherEnd, msgs);
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
      case AgclPackage.AGCL_ANNEX_SUBCLAUSE__DECLARATIONS:
        return getDeclarations();
      case AgclPackage.AGCL_ANNEX_SUBCLAUSE__BEHAVIOUR:
        return getBehaviour();
      case AgclPackage.AGCL_ANNEX_SUBCLAUSE__CONTRACTS:
        return getContracts();
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
      case AgclPackage.AGCL_ANNEX_SUBCLAUSE__DECLARATIONS:
        getDeclarations().clear();
        getDeclarations().addAll((Collection<? extends AGCLPropertyDecl>)newValue);
        return;
      case AgclPackage.AGCL_ANNEX_SUBCLAUSE__BEHAVIOUR:
        setBehaviour((AGCLBehaviour)newValue);
        return;
      case AgclPackage.AGCL_ANNEX_SUBCLAUSE__CONTRACTS:
        getContracts().clear();
        getContracts().addAll((Collection<? extends AGCLContract>)newValue);
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
      case AgclPackage.AGCL_ANNEX_SUBCLAUSE__DECLARATIONS:
        getDeclarations().clear();
        return;
      case AgclPackage.AGCL_ANNEX_SUBCLAUSE__BEHAVIOUR:
        setBehaviour((AGCLBehaviour)null);
        return;
      case AgclPackage.AGCL_ANNEX_SUBCLAUSE__CONTRACTS:
        getContracts().clear();
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
      case AgclPackage.AGCL_ANNEX_SUBCLAUSE__DECLARATIONS:
        return declarations != null && !declarations.isEmpty();
      case AgclPackage.AGCL_ANNEX_SUBCLAUSE__BEHAVIOUR:
        return behaviour != null;
      case AgclPackage.AGCL_ANNEX_SUBCLAUSE__CONTRACTS:
        return contracts != null && !contracts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AGCLAnnexSubclauseImpl
