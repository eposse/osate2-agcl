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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.osate.xtext.aadl2.agcl.analysis.verifiers.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage
 * @generated
 */
public class VerifiersAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VerifiersPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerifiersAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VerifiersPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerifiersSwitch<Adapter> modelSwitch =
		new VerifiersSwitch<Adapter>() {
			@Override
			public Adapter caseVerificationResult(VerificationResult object) {
				return createVerificationResultAdapter();
			}
			@Override
			public Adapter casePositive(Positive object) {
				return createPositiveAdapter();
			}
			@Override
			public Adapter caseNegative(Negative object) {
				return createNegativeAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseSpecification(Specification object) {
				return createSpecificationAdapter();
			}
			@Override
			public Adapter caseCounterExample(CounterExample object) {
				return createCounterExampleAdapter();
			}
			@Override
			public Adapter caseUniversalModel(UniversalModel object) {
				return createUniversalModelAdapter();
			}
			@Override
			public Adapter caseModelChecker(ModelChecker object) {
				return createModelCheckerAdapter();
			}
			@Override
			public Adapter caseNuSMVModelChecker(NuSMVModelChecker object) {
				return createNuSMVModelCheckerAdapter();
			}
			@Override
			public Adapter caseModelCheckerInput(ModelCheckerInput object) {
				return createModelCheckerInputAdapter();
			}
			@Override
			public Adapter caseModelCheckerOutput(ModelCheckerOutput object) {
				return createModelCheckerOutputAdapter();
			}
			@Override
			public Adapter caseNuSMVInput(NuSMVInput object) {
				return createNuSMVInputAdapter();
			}
			@Override
			public Adapter caseNuSMVOutput(NuSMVOutput object) {
				return createNuSMVOutputAdapter();
			}
			@Override
			public Adapter caseNuSMVModel(NuSMVModel object) {
				return createNuSMVModelAdapter();
			}
			@Override
			public Adapter caseNuSMVUniversalModel(NuSMVUniversalModel object) {
				return createNuSMVUniversalModelAdapter();
			}
			@Override
			public Adapter caseNuSMVSpecification(NuSMVSpecification object) {
				return createNuSMVSpecificationAdapter();
			}
			@Override
			public Adapter caseUnknown(Unknown object) {
				return createUnknownAdapter();
			}
			@Override
			public Adapter caseResultsCollection(ResultsCollection object) {
				return createResultsCollectionAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseViewpoint(Viewpoint object) {
				return createViewpointAdapter();
			}
			@Override
			public Adapter caseVerificationUnit(VerificationUnit object) {
				return createVerificationUnitAdapter();
			}
			@Override
			public Adapter caseResultEntry(ResultEntry object) {
				return createResultEntryAdapter();
			}
			@Override
			public Adapter caseViewpointCollection(ViewpointCollection object) {
				return createViewpointCollectionAdapter();
			}
			@Override
			public Adapter caseComponentCollection(ComponentCollection object) {
				return createComponentCollectionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationResult <em>Verification Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationResult
	 * @generated
	 */
	public Adapter createVerificationResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Positive <em>Positive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Positive
	 * @generated
	 */
	public Adapter createPositiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Negative <em>Negative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Negative
	 * @generated
	 */
	public Adapter createNegativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification
	 * @generated
	 */
	public Adapter createSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.CounterExample <em>Counter Example</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.CounterExample
	 * @generated
	 */
	public Adapter createCounterExampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.UniversalModel <em>Universal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.UniversalModel
	 * @generated
	 */
	public Adapter createUniversalModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker <em>Model Checker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker
	 * @generated
	 */
	public Adapter createModelCheckerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModelChecker <em>Nu SMV Model Checker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModelChecker
	 * @generated
	 */
	public Adapter createNuSMVModelCheckerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerInput <em>Model Checker Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerInput
	 * @generated
	 */
	public Adapter createModelCheckerInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerOutput <em>Model Checker Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerOutput
	 * @generated
	 */
	public Adapter createModelCheckerOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVInput <em>Nu SMV Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVInput
	 * @generated
	 */
	public Adapter createNuSMVInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVOutput <em>Nu SMV Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVOutput
	 * @generated
	 */
	public Adapter createNuSMVOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModel <em>Nu SMV Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModel
	 * @generated
	 */
	public Adapter createNuSMVModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVUniversalModel <em>Nu SMV Universal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVUniversalModel
	 * @generated
	 */
	public Adapter createNuSMVUniversalModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVSpecification <em>Nu SMV Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVSpecification
	 * @generated
	 */
	public Adapter createNuSMVSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Unknown <em>Unknown</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Unknown
	 * @generated
	 */
	public Adapter createUnknownAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ResultsCollection <em>Results Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ResultsCollection
	 * @generated
	 */
	public Adapter createResultsCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.Viewpoint <em>Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.Viewpoint
	 * @generated
	 */
	public Adapter createViewpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit <em>Verification Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit
	 * @generated
	 */
	public Adapter createVerificationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ResultEntry <em>Result Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ResultEntry
	 * @generated
	 */
	public Adapter createResultEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ViewpointCollection <em>Viewpoint Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ViewpointCollection
	 * @generated
	 */
	public Adapter createViewpointCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ComponentCollection <em>Component Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.ComponentCollection
	 * @generated
	 */
	public Adapter createComponentCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //VerifiersAdapterFactory
