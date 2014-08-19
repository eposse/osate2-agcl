/**
 * Copyright (c) 2014 Ernesto Posse
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 * @author Ernesto Posse
 * @version 0.1 
 */
package org.osate.xtext.aadl2.agcl.analysis.verifiers.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.osate.xtext.aadl2.agcl.analysis.verifiers.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage
 * @generated
 */
public class VerifiersSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VerifiersPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerifiersSwitch() {
		if (modelPackage == null) {
			modelPackage = VerifiersPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case VerifiersPackage.VERIFICATION_RESULT: {
				VerificationResult verificationResult = (VerificationResult)theEObject;
				T result = caseVerificationResult(verificationResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerifiersPackage.POSITIVE: {
				Positive positive = (Positive)theEObject;
				T result = casePositive(positive);
				if (result == null) result = caseVerificationResult(positive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerifiersPackage.NEGATIVE: {
				Negative negative = (Negative)theEObject;
				T result = caseNegative(negative);
				if (result == null) result = caseVerificationResult(negative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerifiersPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerifiersPackage.SPECIFICATION: {
				Specification specification = (Specification)theEObject;
				T result = caseSpecification(specification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerifiersPackage.COUNTER_EXAMPLE: {
				CounterExample counterExample = (CounterExample)theEObject;
				T result = caseCounterExample(counterExample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerifiersPackage.UNIVERSAL_MODEL: {
				UniversalModel universalModel = (UniversalModel)theEObject;
				T result = caseUniversalModel(universalModel);
				if (result == null) result = caseModel(universalModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerifiersPackage.MODEL_CHECKER: {
				ModelChecker modelChecker = (ModelChecker)theEObject;
				T result = caseModelChecker(modelChecker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerifiersPackage.NU_SMV_MODEL_CHECKER: {
				NuSMVModelChecker nuSMVModelChecker = (NuSMVModelChecker)theEObject;
				T result = caseNuSMVModelChecker(nuSMVModelChecker);
				if (result == null) result = caseModelChecker(nuSMVModelChecker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerifiersPackage.MODEL_CHECKER_INPUT: {
				ModelCheckerInput modelCheckerInput = (ModelCheckerInput)theEObject;
				T result = caseModelCheckerInput(modelCheckerInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerifiersPackage.MODEL_CHECKER_OUTPUT: {
				ModelCheckerOutput modelCheckerOutput = (ModelCheckerOutput)theEObject;
				T result = caseModelCheckerOutput(modelCheckerOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerifiersPackage.NU_SMV_INPUT: {
				NuSMVInput nuSMVInput = (NuSMVInput)theEObject;
				T result = caseNuSMVInput(nuSMVInput);
				if (result == null) result = caseModelCheckerInput(nuSMVInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerifiersPackage.NU_SMV_OUTPUT: {
				NuSMVOutput nuSMVOutput = (NuSMVOutput)theEObject;
				T result = caseNuSMVOutput(nuSMVOutput);
				if (result == null) result = caseModelCheckerOutput(nuSMVOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerifiersPackage.NU_SMV_MODEL: {
				NuSMVModel nuSMVModel = (NuSMVModel)theEObject;
				T result = caseNuSMVModel(nuSMVModel);
				if (result == null) result = caseModel(nuSMVModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerifiersPackage.NU_SMV_UNIVERSAL_MODEL: {
				NuSMVUniversalModel nuSMVUniversalModel = (NuSMVUniversalModel)theEObject;
				T result = caseNuSMVUniversalModel(nuSMVUniversalModel);
				if (result == null) result = caseNuSMVModel(nuSMVUniversalModel);
				if (result == null) result = caseUniversalModel(nuSMVUniversalModel);
				if (result == null) result = caseModel(nuSMVUniversalModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerifiersPackage.NU_SMV_SPECIFICATION: {
				NuSMVSpecification nuSMVSpecification = (NuSMVSpecification)theEObject;
				T result = caseNuSMVSpecification(nuSMVSpecification);
				if (result == null) result = caseSpecification(nuSMVSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerifiersPackage.UNKNOWN: {
				Unknown unknown = (Unknown)theEObject;
				T result = caseUnknown(unknown);
				if (result == null) result = caseVerificationResult(unknown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerifiersPackage.RESULTS_COLLECTION: {
				ResultsCollection resultsCollection = (ResultsCollection)theEObject;
				T result = caseResultsCollection(resultsCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerifiersPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerifiersPackage.VIEWPOINT: {
				Viewpoint viewpoint = (Viewpoint)theEObject;
				T result = caseViewpoint(viewpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerifiersPackage.VERIFICATION_UNIT: {
				VerificationUnit verificationUnit = (VerificationUnit)theEObject;
				T result = caseVerificationUnit(verificationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerifiersPackage.RESULT_ENTRY: {
				ResultEntry resultEntry = (ResultEntry)theEObject;
				T result = caseResultEntry(resultEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerifiersPackage.VIEWPOINT_COLLECTION: {
				ViewpointCollection viewpointCollection = (ViewpointCollection)theEObject;
				T result = caseViewpointCollection(viewpointCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerifiersPackage.COMPONENT_COLLECTION: {
				ComponentCollection componentCollection = (ComponentCollection)theEObject;
				T result = caseComponentCollection(componentCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verification Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verification Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerificationResult(VerificationResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositive(Positive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegative(Negative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecification(Specification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Counter Example</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Counter Example</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCounterExample(CounterExample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Universal Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Universal Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversalModel(UniversalModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Checker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Checker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelChecker(ModelChecker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nu SMV Model Checker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nu SMV Model Checker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNuSMVModelChecker(NuSMVModelChecker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Checker Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Checker Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelCheckerInput(ModelCheckerInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Checker Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Checker Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelCheckerOutput(ModelCheckerOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nu SMV Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nu SMV Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNuSMVInput(NuSMVInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nu SMV Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nu SMV Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNuSMVOutput(NuSMVOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nu SMV Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nu SMV Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNuSMVModel(NuSMVModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nu SMV Universal Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nu SMV Universal Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNuSMVUniversalModel(NuSMVUniversalModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nu SMV Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nu SMV Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNuSMVSpecification(NuSMVSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknown(Unknown object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Results Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Results Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultsCollection(ResultsCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Viewpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Viewpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewpoint(Viewpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verification Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verification Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerificationUnit(VerificationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultEntry(ResultEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Viewpoint Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Viewpoint Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewpointCollection(ViewpointCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentCollection(ComponentCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //VerifiersSwitch
