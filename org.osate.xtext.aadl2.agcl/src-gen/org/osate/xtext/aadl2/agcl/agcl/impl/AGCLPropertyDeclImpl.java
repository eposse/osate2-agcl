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

import org.osate.xtext.aadl2.agcl.agcl.AGCLPropertyDecl;
import org.osate.xtext.aadl2.agcl.agcl.AgclPackage;
import org.osate.xtext.aadl2.agcl.agcl.PSLSpec;
import org.osate.xtext.aadl2.agcl.agcl.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AGCL Property Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLPropertyDeclImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLPropertyDeclImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.agcl.impl.AGCLPropertyDeclImpl#getSpec <em>Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AGCLPropertyDeclImpl extends MinimalEObjectImpl.Container implements AGCLPropertyDecl
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
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<Parameter> params;

  /**
   * The cached value of the '{@link #getSpec() <em>Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpec()
   * @generated
   * @ordered
   */
  protected PSLSpec spec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AGCLPropertyDeclImpl()
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
    return AgclPackage.Literals.AGCL_PROPERTY_DECL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AgclPackage.AGCL_PROPERTY_DECL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<Parameter>(Parameter.class, this, AgclPackage.AGCL_PROPERTY_DECL__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PSLSpec getSpec()
  {
    return spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpec(PSLSpec newSpec, NotificationChain msgs)
  {
    PSLSpec oldSpec = spec;
    spec = newSpec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgclPackage.AGCL_PROPERTY_DECL__SPEC, oldSpec, newSpec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpec(PSLSpec newSpec)
  {
    if (newSpec != spec)
    {
      NotificationChain msgs = null;
      if (spec != null)
        msgs = ((InternalEObject)spec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgclPackage.AGCL_PROPERTY_DECL__SPEC, null, msgs);
      if (newSpec != null)
        msgs = ((InternalEObject)newSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgclPackage.AGCL_PROPERTY_DECL__SPEC, null, msgs);
      msgs = basicSetSpec(newSpec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgclPackage.AGCL_PROPERTY_DECL__SPEC, newSpec, newSpec));
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
      case AgclPackage.AGCL_PROPERTY_DECL__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case AgclPackage.AGCL_PROPERTY_DECL__SPEC:
        return basicSetSpec(null, msgs);
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
      case AgclPackage.AGCL_PROPERTY_DECL__NAME:
        return getName();
      case AgclPackage.AGCL_PROPERTY_DECL__PARAMS:
        return getParams();
      case AgclPackage.AGCL_PROPERTY_DECL__SPEC:
        return getSpec();
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
      case AgclPackage.AGCL_PROPERTY_DECL__NAME:
        setName((String)newValue);
        return;
      case AgclPackage.AGCL_PROPERTY_DECL__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends Parameter>)newValue);
        return;
      case AgclPackage.AGCL_PROPERTY_DECL__SPEC:
        setSpec((PSLSpec)newValue);
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
      case AgclPackage.AGCL_PROPERTY_DECL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AgclPackage.AGCL_PROPERTY_DECL__PARAMS:
        getParams().clear();
        return;
      case AgclPackage.AGCL_PROPERTY_DECL__SPEC:
        setSpec((PSLSpec)null);
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
      case AgclPackage.AGCL_PROPERTY_DECL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AgclPackage.AGCL_PROPERTY_DECL__PARAMS:
        return params != null && !params.isEmpty();
      case AgclPackage.AGCL_PROPERTY_DECL__SPEC:
        return spec != null;
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
    result.append(')');
    return result.toString();
  }

} //AGCLPropertyDeclImpl
