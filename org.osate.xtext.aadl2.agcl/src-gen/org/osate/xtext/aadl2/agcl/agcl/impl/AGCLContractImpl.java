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

import org.osate.xtext.aadl2.agcl.agcl.AGCLAssumption;
import org.osate.xtext.aadl2.agcl.agcl.AGCLContract;
import org.osate.xtext.aadl2.agcl.agcl.AGCLGuarantee;
import org.osate.xtext.aadl2.agcl.agcl.AGCLPropertyDecl;
import org.osate.xtext.aadl2.agcl.agcl.AgclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AGCL Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLContractImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLContractImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLContractImpl#getAssumption <em>Assumption</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLContractImpl#getGuarantee <em>Guarantee</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLContractImpl#getEname <em>Ename</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AGCLContractImpl extends MinimalEObjectImpl.Container implements AGCLContract
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The cached value of the '{@link #getAssumption() <em>Assumption</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssumption()
   * @generated
   * @ordered
   */
  protected AGCLAssumption assumption;

  /**
   * The cached value of the '{@link #getGuarantee() <em>Guarantee</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuarantee()
   * @generated
   * @ordered
   */
  protected AGCLGuarantee guarantee;

  /**
   * The default value of the '{@link #getEname() <em>Ename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEname()
   * @generated
   * @ordered
   */
  protected static final String ENAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEname() <em>Ename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEname()
   * @generated
   * @ordered
   */
  protected String ename = ENAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AGCLContractImpl()
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
    return AgclPackage.Literals.AGCL_CONTRACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgclPackage.AGCL_CONTRACT__NAME, oldName, name));
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
      declarations = new EObjectContainmentEList<AGCLPropertyDecl>(AGCLPropertyDecl.class, this, AgclPackage.AGCL_CONTRACT__DECLARATIONS);
    }
    return declarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AGCLAssumption getAssumption()
  {
    return assumption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssumption(AGCLAssumption newAssumption, NotificationChain msgs)
  {
    AGCLAssumption oldAssumption = assumption;
    assumption = newAssumption;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgclPackage.AGCL_CONTRACT__ASSUMPTION, oldAssumption, newAssumption);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssumption(AGCLAssumption newAssumption)
  {
    if (newAssumption != assumption)
    {
      NotificationChain msgs = null;
      if (assumption != null)
        msgs = ((InternalEObject)assumption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgclPackage.AGCL_CONTRACT__ASSUMPTION, null, msgs);
      if (newAssumption != null)
        msgs = ((InternalEObject)newAssumption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgclPackage.AGCL_CONTRACT__ASSUMPTION, null, msgs);
      msgs = basicSetAssumption(newAssumption, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgclPackage.AGCL_CONTRACT__ASSUMPTION, newAssumption, newAssumption));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AGCLGuarantee getGuarantee()
  {
    return guarantee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGuarantee(AGCLGuarantee newGuarantee, NotificationChain msgs)
  {
    AGCLGuarantee oldGuarantee = guarantee;
    guarantee = newGuarantee;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgclPackage.AGCL_CONTRACT__GUARANTEE, oldGuarantee, newGuarantee);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGuarantee(AGCLGuarantee newGuarantee)
  {
    if (newGuarantee != guarantee)
    {
      NotificationChain msgs = null;
      if (guarantee != null)
        msgs = ((InternalEObject)guarantee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgclPackage.AGCL_CONTRACT__GUARANTEE, null, msgs);
      if (newGuarantee != null)
        msgs = ((InternalEObject)newGuarantee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgclPackage.AGCL_CONTRACT__GUARANTEE, null, msgs);
      msgs = basicSetGuarantee(newGuarantee, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgclPackage.AGCL_CONTRACT__GUARANTEE, newGuarantee, newGuarantee));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEname()
  {
    return ename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEname(String newEname)
  {
    String oldEname = ename;
    ename = newEname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgclPackage.AGCL_CONTRACT__ENAME, oldEname, ename));
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
      case AgclPackage.AGCL_CONTRACT__DECLARATIONS:
        return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
      case AgclPackage.AGCL_CONTRACT__ASSUMPTION:
        return basicSetAssumption(null, msgs);
      case AgclPackage.AGCL_CONTRACT__GUARANTEE:
        return basicSetGuarantee(null, msgs);
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
      case AgclPackage.AGCL_CONTRACT__NAME:
        return getName();
      case AgclPackage.AGCL_CONTRACT__DECLARATIONS:
        return getDeclarations();
      case AgclPackage.AGCL_CONTRACT__ASSUMPTION:
        return getAssumption();
      case AgclPackage.AGCL_CONTRACT__GUARANTEE:
        return getGuarantee();
      case AgclPackage.AGCL_CONTRACT__ENAME:
        return getEname();
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
      case AgclPackage.AGCL_CONTRACT__NAME:
        setName((String)newValue);
        return;
      case AgclPackage.AGCL_CONTRACT__DECLARATIONS:
        getDeclarations().clear();
        getDeclarations().addAll((Collection<? extends AGCLPropertyDecl>)newValue);
        return;
      case AgclPackage.AGCL_CONTRACT__ASSUMPTION:
        setAssumption((AGCLAssumption)newValue);
        return;
      case AgclPackage.AGCL_CONTRACT__GUARANTEE:
        setGuarantee((AGCLGuarantee)newValue);
        return;
      case AgclPackage.AGCL_CONTRACT__ENAME:
        setEname((String)newValue);
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
      case AgclPackage.AGCL_CONTRACT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AgclPackage.AGCL_CONTRACT__DECLARATIONS:
        getDeclarations().clear();
        return;
      case AgclPackage.AGCL_CONTRACT__ASSUMPTION:
        setAssumption((AGCLAssumption)null);
        return;
      case AgclPackage.AGCL_CONTRACT__GUARANTEE:
        setGuarantee((AGCLGuarantee)null);
        return;
      case AgclPackage.AGCL_CONTRACT__ENAME:
        setEname(ENAME_EDEFAULT);
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
      case AgclPackage.AGCL_CONTRACT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AgclPackage.AGCL_CONTRACT__DECLARATIONS:
        return declarations != null && !declarations.isEmpty();
      case AgclPackage.AGCL_CONTRACT__ASSUMPTION:
        return assumption != null;
      case AgclPackage.AGCL_CONTRACT__GUARANTEE:
        return guarantee != null;
      case AgclPackage.AGCL_CONTRACT__ENAME:
        return ENAME_EDEFAULT == null ? ename != null : !ENAME_EDEFAULT.equals(ename);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", ename: ");
    result.append(ename);
    result.append(')');
    return result.toString();
  }

} //AGCLContractImpl
