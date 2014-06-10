/**
 */
package org.osate.xtext.aadl2.agcl.analysis.verifiers.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.xtext.serializer.ISerializer;
import org.osate.xtext.aadl2.agcl.agcl.PSLExpression;
import org.osate.xtext.aadl2.agcl.agcl.PSLSpec;
import org.osate.xtext.aadl2.agcl.analysis.AGCLAnalysisPlugin;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVSpecification;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage;
import org.osate.xtext.aadl2.agcl.analysis.visitors.PSLSerializerExplicit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nu SMV Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVSpecificationImpl#getSpec <em>Spec</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVSpecificationImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.NuSMVSpecificationImpl#getLogic <em>Logic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NuSMVSpecificationImpl extends MinimalEObjectImpl.Container implements NuSMVSpecification {
	
	private ISerializer serializer = AGCLAnalysisPlugin.getDefault().getSerializer();
	private PSLSerializerExplicit altSerializer = AGCLAnalysisPlugin.getDefault().getAltSerializer();
	
	/**
	 * The default value of the '{@link #getSpec() <em>Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpec()
	 * @generated
	 * @ordered
	 */
	protected static final Object SPEC_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSpec() <em>Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpec()
	 * @generated
	 * @ordered
	 */
	protected Object spec = SPEC_EDEFAULT;

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
	 * The default value of the '{@link #getLogic() <em>Logic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogic()
	 * @generated
	 * @ordered
	 */
	protected static final Object LOGIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogic() <em>Logic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogic()
	 * @generated
	 * @ordered
	 */
	protected Object logic = LOGIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NuSMVSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VerifiersPackage.Literals.NU_SMV_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSpec() {
		return spec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpec(Object newSpec) {
		Object oldSpec = spec;
		spec = newSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.NU_SMV_SPECIFICATION__SPEC, oldSpec, spec));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.NU_SMV_SPECIFICATION__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLogic() {
		return logic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogic(Object newLogic) {
		Object oldLogic = logic;
		logic = newLogic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.NU_SMV_SPECIFICATION__LOGIC, oldLogic, logic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String text(Object args) {
		Object specObj = getSpec();
		assert specObj instanceof PSLSpec;
		PSLSpec spec = (PSLSpec) specObj;
		PSLExpression expr = spec.getExpr();
//		We replace the Xtext serializer with our custom serializer because NuSMV's grammar has weird precedence
//		for some operators (-> binds tighter than & and |), so we need to put parenthesis around them, with our 
//		custom serializer
//		return serializer.serialize(expr);
		return altSerializer.serialize(expr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VerifiersPackage.NU_SMV_SPECIFICATION__SPEC:
				return getSpec();
			case VerifiersPackage.NU_SMV_SPECIFICATION__CONTEXT:
				return getContext();
			case VerifiersPackage.NU_SMV_SPECIFICATION__LOGIC:
				return getLogic();
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
			case VerifiersPackage.NU_SMV_SPECIFICATION__SPEC:
				setSpec(newValue);
				return;
			case VerifiersPackage.NU_SMV_SPECIFICATION__CONTEXT:
				setContext(newValue);
				return;
			case VerifiersPackage.NU_SMV_SPECIFICATION__LOGIC:
				setLogic(newValue);
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
			case VerifiersPackage.NU_SMV_SPECIFICATION__SPEC:
				setSpec(SPEC_EDEFAULT);
				return;
			case VerifiersPackage.NU_SMV_SPECIFICATION__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case VerifiersPackage.NU_SMV_SPECIFICATION__LOGIC:
				setLogic(LOGIC_EDEFAULT);
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
			case VerifiersPackage.NU_SMV_SPECIFICATION__SPEC:
				return SPEC_EDEFAULT == null ? spec != null : !SPEC_EDEFAULT.equals(spec);
			case VerifiersPackage.NU_SMV_SPECIFICATION__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
			case VerifiersPackage.NU_SMV_SPECIFICATION__LOGIC:
				return LOGIC_EDEFAULT == null ? logic != null : !LOGIC_EDEFAULT.equals(logic);
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
			case VerifiersPackage.NU_SMV_SPECIFICATION___TEXT__OBJECT:
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
		result.append(" (spec: ");
		result.append(spec);
		result.append(", context: ");
		result.append(context);
		result.append(", logic: ");
		result.append(logic);
		result.append(')');
		return result.toString();
	}

	@Override
	public String logicText() {
		return getLogic().toString();
	}

} //NuSMVSpecificationImpl
