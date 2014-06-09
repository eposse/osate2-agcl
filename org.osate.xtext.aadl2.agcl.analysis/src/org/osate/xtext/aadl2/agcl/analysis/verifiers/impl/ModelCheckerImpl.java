/**
 */
package org.osate.xtext.aadl2.agcl.analysis.verifiers.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.core.resources.IFolder;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.osate.xtext.aadl2.agcl.analysis.util.AGCLUtil;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Component;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Model;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerInput;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerOutput;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ResultEntry;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ResultsCollection;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.UniversalModel;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationResult;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersFactory;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Viewpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Checker</b></em>'.
 * 
 * Typical use:
 * 
 * <p><blockquote><pre>
 * Resource r = ...;
 * Model m = ...;
 * Specification s = ...;
 * ModelChecker mc = new SomeModelCheckerImpl(); // A concrete subclass of ModelCheckerImpl
 * mc.setResourceContext(r);
 * mc.setUp();
 * VerificationResult result = mc.check(m,s);
 * </pre></blockquote><p>
 * 
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ModelCheckerImpl#getResourceContext <em>Resource Context</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ModelCheckerImpl#getResults <em>Results</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.impl.ModelCheckerImpl#getVerificationUnits <em>Verification Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ModelCheckerImpl extends MinimalEObjectImpl.Container implements ModelChecker {
	/**
	 * The default value of the '{@link #getResourceContext() <em>Resource Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceContext()
	 * @generated
	 * @ordered
	 */
	protected static final Resource RESOURCE_CONTEXT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getResourceContext() <em>Resource Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceContext()
	 * @generated
	 * @ordered
	 */
	protected Resource resourceContext = RESOURCE_CONTEXT_EDEFAULT;
	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected ResultsCollection results;
	/**
	 * The cached value of the '{@link #getVerificationUnits() <em>Verification Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<VerificationUnit> verificationUnits;
	protected IFolder inputFolder;
	protected IFolder outputFolder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelCheckerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VerifiersPackage.Literals.MODEL_CHECKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResourceContext() {
		return resourceContext;
	}

	@Override
	public void setUp(Resource resource) {
		setResourceContext(resource);
		inputFolder = AGCLUtil.openInputDir(resourceContext);
		outputFolder = AGCLUtil.openOutputDir(resourceContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public VerificationUnit makeVerificationUnit(Model model, Specification spec, Viewpoint viewpoint, Component component) {
		VerificationUnit verificationUnit = VerifiersFactory.eINSTANCE.createVerificationUnit();
		verificationUnit.setModel(model);
		verificationUnit.setSpecification(spec);
		verificationUnit.setViewpoint(viewpoint);
		verificationUnit.setComponent(component);
		verificationUnit.setName("vunit_" + viewpoint.getName() + "_" + component.getName());
		return verificationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public VerificationUnit makeVerificationUnit(Specification spec, Viewpoint viewpoint, Component component) {
		UniversalModel model = makeUniversalModelFromSpec(spec);
		return makeVerificationUnit(model, spec, viewpoint, component);
	}

	/**
	 * This method should be overriden by subclasses
	 * @param spec	a specification
	 * @return a universal model build from the specification
	 */
	public abstract UniversalModel makeUniversalModelFromSpec(Specification spec); 

	/**
	 * <!-- begin-user-doc -->
	 * <!-- begin-user-doc -->
	 * Performs model-checking. This consists of three steps:
	 * 
	 * <ol>
	 * 		<li> Prepare the input for the external model-checker from the given model and specification.
	 * 		<li> Execute the external model-checker with the prepared input.
	 * 		<li> Obtain and process the results generated by the external model-checker and turn them into
	 * 				a {@link VerificationResult} object.
	 * </ol>
	 * 
	 * <p>Subclasses should provide a concrete implementation of these steps in the following methods:
	 * 
	 * <ol>
	 * 		<li> {@link #prepareInput}
	 * 		<li> {@link #callExternal}
	 * 		<li> {@link #processOutput}
	 * </ol>
	 * 
	 * @param verificationUnit		a {@link VerificationUnit}
	 * @return 			a {@link VerificationResult}
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public VerificationResult checkVerificationUnit(VerificationUnit verificationUnit) {
		ModelCheckerInput input = prepareInput(verificationUnit);
		ModelCheckerOutput output = callExternal(input);
		VerificationResult result = processOutput(output);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Takes a model and a specification and produces a representation suitable to pass to the external
	 * model-checker, e.g., an object that contains (references to) some input file(s).
	 * 
	 * <p>This method must be implemented by subclasses.
	 * 
	 * @param verificationUnit		a representation of the verification unit
	 * @return an object encapsulating the input expected by the external model-checker
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract ModelCheckerInput prepareInput(VerificationUnit verificationUnit);
	
	/**
	 * <!-- begin-user-doc -->
	 * Invokes an external model-checker by performing a system call.
	 * 
	 * <p> This method must be implemented by subclasses.
	 * 
	 * @param input   an object encapsulating the input expected by the model-checker 
	 * 					(e.g., containing references to input files provided to the model-checker)
	 * @return an object encapsulating the results produced by the model-checker
	 * 					(e.g., containing references to files produced by the model-checker) 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract ModelCheckerOutput callExternal(ModelCheckerInput input);

	/**
	 * <!-- begin-user-doc -->
	 * Takes an object containing the information generated by the external model-checker and turns it into
	 * a {@link VerificationResult} object.
	 * 
	 * <p>This method must be implemented by subclasses.
	 * 
	 * @param output	an object encapsulating the output produced by the external model-checker
	 * @return a {@link VerificationResult} object
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract VerificationResult processOutput(ModelCheckerOutput output);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addVerificationUnit(VerificationUnit verificationUnit) {
		getVerificationUnits().add(verificationUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeVerificationUnit(String verificationUnitName) {
		getVerificationUnits().remove(getVerificationUnit(verificationUnitName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public VerificationUnit getVerificationUnit(String verificationUnitName) {
		VerificationUnit result = null;
		for (VerificationUnit vu : getVerificationUnits()) {
			if (vu.getName().equals(verificationUnitName)) {
				result = vu;
				break;
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void checkAll() {
		EList<VerificationUnit> verificationUnits = getVerificationUnits();
		for (VerificationUnit vu : verificationUnits) {
			VerificationResult r = checkVerificationUnit(vu);
			ResultEntry entry = VerifiersFactory.eINSTANCE.createResultEntry();
			entry.setVerificationUnit(vu);
			entry.setResult(r);
			getResults().getEntries().add(entry);
		}
	}

	/**
	 * @return the inputFolder
	 */
	public IFolder getInputFolder() {
		return inputFolder;
	}

	/**
	 * @return the outputFolder
	 */
	public IFolder getOutputFolder() {
		return outputFolder;
	}

	/**
	 * @param inputFolder the inputFolder to set
	 */
	public void setInputFolder(IFolder inputFolder) {
		this.inputFolder = inputFolder;
	}

	/**
	 * @param outputFolder the outputFolder to set
	 */
	public void setOutputFolder(IFolder outputFolder) {
		this.outputFolder = outputFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VerifiersPackage.MODEL_CHECKER__RESOURCE_CONTEXT:
				return getResourceContext();
			case VerifiersPackage.MODEL_CHECKER__RESULTS:
				if (resolve) return getResults();
				return basicGetResults();
			case VerifiersPackage.MODEL_CHECKER__VERIFICATION_UNITS:
				return getVerificationUnits();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VerifiersPackage.MODEL_CHECKER__RESOURCE_CONTEXT:
				setResourceContext((Resource)newValue);
				return;
			case VerifiersPackage.MODEL_CHECKER__RESULTS:
				setResults((ResultsCollection)newValue);
				return;
			case VerifiersPackage.MODEL_CHECKER__VERIFICATION_UNITS:
				getVerificationUnits().clear();
				getVerificationUnits().addAll((Collection<? extends VerificationUnit>)newValue);
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
			case VerifiersPackage.MODEL_CHECKER__RESOURCE_CONTEXT:
				setResourceContext(RESOURCE_CONTEXT_EDEFAULT);
				return;
			case VerifiersPackage.MODEL_CHECKER__RESULTS:
				setResults((ResultsCollection)null);
				return;
			case VerifiersPackage.MODEL_CHECKER__VERIFICATION_UNITS:
				getVerificationUnits().clear();
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
			case VerifiersPackage.MODEL_CHECKER__RESOURCE_CONTEXT:
				return RESOURCE_CONTEXT_EDEFAULT == null ? resourceContext != null : !RESOURCE_CONTEXT_EDEFAULT.equals(resourceContext);
			case VerifiersPackage.MODEL_CHECKER__RESULTS:
				return results != null;
			case VerifiersPackage.MODEL_CHECKER__VERIFICATION_UNITS:
				return verificationUnits != null && !verificationUnits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceContext(Resource newResourceContext) {
		Resource oldResourceContext = resourceContext;
		resourceContext = newResourceContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.MODEL_CHECKER__RESOURCE_CONTEXT, oldResourceContext, resourceContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsCollection getResults() {
		if (results != null && results.eIsProxy()) {
			InternalEObject oldResults = (InternalEObject)results;
			results = (ResultsCollection)eResolveProxy(oldResults);
			if (results != oldResults) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VerifiersPackage.MODEL_CHECKER__RESULTS, oldResults, results));
			}
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsCollection basicGetResults() {
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResults(ResultsCollection newResults) {
		ResultsCollection oldResults = results;
		results = newResults;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerifiersPackage.MODEL_CHECKER__RESULTS, oldResults, results));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VerificationUnit> getVerificationUnits() {
		if (verificationUnits == null) {
			verificationUnits = new EObjectResolvingEList<VerificationUnit>(VerificationUnit.class, this, VerifiersPackage.MODEL_CHECKER__VERIFICATION_UNITS);
		}
		return verificationUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case VerifiersPackage.MODEL_CHECKER___SET_UP__RESOURCE:
				setUp((Resource)arguments.get(0));
				return null;
			case VerifiersPackage.MODEL_CHECKER___MAKE_VERIFICATION_UNIT__MODEL_SPECIFICATION_VIEWPOINT_COMPONENT:
				return makeVerificationUnit((Model)arguments.get(0), (Specification)arguments.get(1), (Viewpoint)arguments.get(2), (Component)arguments.get(3));
			case VerifiersPackage.MODEL_CHECKER___MAKE_VERIFICATION_UNIT__SPECIFICATION_VIEWPOINT_COMPONENT:
				return makeVerificationUnit((Specification)arguments.get(0), (Viewpoint)arguments.get(1), (Component)arguments.get(2));
			case VerifiersPackage.MODEL_CHECKER___CHECK_VERIFICATION_UNIT__VERIFICATIONUNIT:
				return checkVerificationUnit((VerificationUnit)arguments.get(0));
			case VerifiersPackage.MODEL_CHECKER___PREPARE_INPUT__MODEL_SPECIFICATION:
				return prepareInput((VerificationUnit)arguments.get(0));
			case VerifiersPackage.MODEL_CHECKER___CALL_EXTERNAL__MODELCHECKERINPUT:
				return callExternal((ModelCheckerInput)arguments.get(0));
			case VerifiersPackage.MODEL_CHECKER___PROCESS_OUTPUT__MODELCHECKEROUTPUT:
				return processOutput((ModelCheckerOutput)arguments.get(0));
			case VerifiersPackage.MODEL_CHECKER___ADD_VERIFICATION_UNIT__VERIFICATIONUNIT:
				addVerificationUnit((VerificationUnit)arguments.get(0));
				return null;
			case VerifiersPackage.MODEL_CHECKER___REMOVE_VERIFICATION_UNIT__STRING:
				removeVerificationUnit((String)arguments.get(0));
				return null;
			case VerifiersPackage.MODEL_CHECKER___GET_VERIFICATION_UNIT__STRING:
				return getVerificationUnit((String)arguments.get(0));
			case VerifiersPackage.MODEL_CHECKER___CHECK_ALL:
				checkAll();
				return null;
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
		result.append(" (resourceContext: ");
		result.append(resourceContext);
		result.append(')');
		return result.toString();
	}

} //ModelCheckerImpl
