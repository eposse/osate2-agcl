/**
 */
package org.osate.xtext.aadl2.agcl.analysis.verifiers.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModel;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nu SMV Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVModelImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVModelImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVModelImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVModelImpl#getInit <em>Init</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVModelImpl#getTrans <em>Trans</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NuSMVModelImpl extends MinimalEObjectImpl.Container implements NuSMVModel {
	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final Object MODEL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Object model = MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final Object CONTEXT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Object context = CONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVars() <em>Vars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVars()
	 * @generated
	 * @ordered
	 */
	protected static final Object VARS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getVars() <em>Vars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVars()
	 * @generated
	 * @ordered
	 */
	protected Object vars = VARS_EDEFAULT;
	/**
	 * The default value of the '{@link #getInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected static final Object INIT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected Object init = INIT_EDEFAULT;
	/**
	 * The default value of the '{@link #getTrans() <em>Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrans()
	 * @generated
	 * @ordered
	 */
	protected static final Object TRANS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTrans() <em>Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrans()
	 * @generated
	 * @ordered
	 */
	protected Object trans = TRANS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NuSMVModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VerifiersPackage.Literals.NU_SMV_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Object newModel) {
		Object oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.NU_SMV_MODEL__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Object newContext) {
		Object oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.NU_SMV_MODEL__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getVars() {
		return vars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVars(Object newVars) {
		Object oldVars = vars;
		vars = newVars;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.NU_SMV_MODEL__VARS, oldVars, vars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit(Object newInit) {
		Object oldInit = init;
		init = newInit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.NU_SMV_MODEL__INIT, oldInit, init));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTrans() {
		return trans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrans(Object newTrans) {
		Object oldTrans = trans;
		trans = newTrans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.NU_SMV_MODEL__TRANS, oldTrans, trans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String text(Object args) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VerifiersPackage.NU_SMV_MODEL__MODEL:
				return getModel();
			case VerifiersPackage.NU_SMV_MODEL__CONTEXT:
				return getContext();
			case VerifiersPackage.NU_SMV_MODEL__VARS:
				return getVars();
			case VerifiersPackage.NU_SMV_MODEL__INIT:
				return getInit();
			case VerifiersPackage.NU_SMV_MODEL__TRANS:
				return getTrans();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VerifiersPackage.NU_SMV_MODEL__MODEL:
				setModel(newValue);
				return;
			case VerifiersPackage.NU_SMV_MODEL__CONTEXT:
				setContext(newValue);
				return;
			case VerifiersPackage.NU_SMV_MODEL__VARS:
				setVars(newValue);
				return;
			case VerifiersPackage.NU_SMV_MODEL__INIT:
				setInit(newValue);
				return;
			case VerifiersPackage.NU_SMV_MODEL__TRANS:
				setTrans(newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case VerifiersPackage.NU_SMV_MODEL__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case VerifiersPackage.NU_SMV_MODEL__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case VerifiersPackage.NU_SMV_MODEL__VARS:
				setVars(VARS_EDEFAULT);
				return;
			case VerifiersPackage.NU_SMV_MODEL__INIT:
				setInit(INIT_EDEFAULT);
				return;
			case VerifiersPackage.NU_SMV_MODEL__TRANS:
				setTrans(TRANS_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VerifiersPackage.NU_SMV_MODEL__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case VerifiersPackage.NU_SMV_MODEL__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
			case VerifiersPackage.NU_SMV_MODEL__VARS:
				return VARS_EDEFAULT == null ? vars != null : !VARS_EDEFAULT.equals(vars);
			case VerifiersPackage.NU_SMV_MODEL__INIT:
				return INIT_EDEFAULT == null ? init != null : !INIT_EDEFAULT.equals(init);
			case VerifiersPackage.NU_SMV_MODEL__TRANS:
				return TRANS_EDEFAULT == null ? trans != null : !TRANS_EDEFAULT.equals(trans);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case VerifiersPackage.NU_SMV_MODEL___TEXT__OBJECT:
				return text(arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (model: ");
		result.append(model);
		result.append(", context: ");
		result.append(context);
		result.append(", vars: ");
		result.append(vars);
		result.append(", init: ");
		result.append(init);
		result.append(", trans: ");
		result.append(trans);
		result.append(')');
		return result.toString();
	}

	public String variablesText() {
		Object vars = getVars();
		assert vars instanceof List<?>;
		List<String> variables = (List<String>) vars;
		Iterator<String> iterator = variables.iterator();
		String result = "";
		while (iterator.hasNext()) {
			String item = iterator.next();
			result += item;
			result += " : boolean;\n    ";
		}
		return result;
	}

	@Override
	public String initText() {
		// TODO Auto-generated method stub
		return getInit().toString();
	}

	@Override
	public String transText() {
		// TODO Auto-generated method stub
		return getTrans().toString();
	}

} //NuSMVModelImpl
