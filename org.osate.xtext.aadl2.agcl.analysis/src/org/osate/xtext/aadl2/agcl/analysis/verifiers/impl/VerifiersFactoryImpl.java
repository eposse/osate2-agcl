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
package org.osate.xtext.aadl2.agcl.analysis.verifiers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.osate.xtext.aadl2.agcl.analysis.verifiers.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VerifiersFactoryImpl extends EFactoryImpl implements VerifiersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VerifiersFactory init() {
		try {
			VerifiersFactory theVerifiersFactory = (VerifiersFactory)EPackage.Registry.INSTANCE.getEFactory(VerifiersPackage.eNS_URI);
			if (theVerifiersFactory != null) {
				return theVerifiersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VerifiersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerifiersFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VerifiersPackage.POSITIVE: return createPositive();
			case VerifiersPackage.NEGATIVE: return createNegative();
			case VerifiersPackage.NU_SMV_MODEL_CHECKER: return createNuSMVModelChecker();
			case VerifiersPackage.NU_SMV_INPUT: return createNuSMVInput();
			case VerifiersPackage.NU_SMV_OUTPUT: return createNuSMVOutput();
			case VerifiersPackage.NU_SMV_MODEL: return createNuSMVModel();
			case VerifiersPackage.NU_SMV_UNIVERSAL_MODEL: return createNuSMVUniversalModel();
			case VerifiersPackage.NU_SMV_SPECIFICATION: return createNuSMVSpecification();
			case VerifiersPackage.UNKNOWN: return createUnknown();
			case VerifiersPackage.RESULTS_COLLECTION: return createResultsCollection();
			case VerifiersPackage.COMPONENT: return createComponent();
			case VerifiersPackage.VIEWPOINT: return createViewpoint();
			case VerifiersPackage.VERIFICATION_UNIT: return createVerificationUnit();
			case VerifiersPackage.RESULT_ENTRY: return createResultEntry();
			case VerifiersPackage.VIEWPOINT_COLLECTION: return createViewpointCollection();
			case VerifiersPackage.COMPONENT_COLLECTION: return createComponentCollection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Positive createPositive() {
		PositiveImpl positive = new PositiveImpl();
		return positive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Negative createNegative() {
		NegativeImpl negative = new NegativeImpl();
		return negative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NuSMVModelChecker createNuSMVModelChecker() {
		NuSMVModelCheckerImpl nuSMVModelChecker = new NuSMVModelCheckerImpl();
		return nuSMVModelChecker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NuSMVInput createNuSMVInput() {
		NuSMVInputImpl nuSMVInput = new NuSMVInputImpl();
		return nuSMVInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NuSMVOutput createNuSMVOutput() {
		NuSMVOutputImpl nuSMVOutput = new NuSMVOutputImpl();
		return nuSMVOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NuSMVModel createNuSMVModel() {
		NuSMVModelImpl nuSMVModel = new NuSMVModelImpl();
		return nuSMVModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NuSMVUniversalModel createNuSMVUniversalModel() {
		NuSMVUniversalModelImpl nuSMVUniversalModel = new NuSMVUniversalModelImpl();
		return nuSMVUniversalModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NuSMVSpecification createNuSMVSpecification() {
		NuSMVSpecificationImpl nuSMVSpecification = new NuSMVSpecificationImpl();
		return nuSMVSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unknown createUnknown() {
		UnknownImpl unknown = new UnknownImpl();
		return unknown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsCollection createResultsCollection() {
		ResultsCollectionImpl resultsCollection = new ResultsCollectionImpl();
		return resultsCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Viewpoint createViewpoint() {
		ViewpointImpl viewpoint = new ViewpointImpl();
		return viewpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationUnit createVerificationUnit() {
		VerificationUnitImpl verificationUnit = new VerificationUnitImpl();
		return verificationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultEntry createResultEntry() {
		ResultEntryImpl resultEntry = new ResultEntryImpl();
		return resultEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewpointCollection createViewpointCollection() {
		ViewpointCollectionImpl viewpointCollection = new ViewpointCollectionImpl();
		return viewpointCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentCollection createComponentCollection() {
		ComponentCollectionImpl componentCollection = new ComponentCollectionImpl();
		return componentCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerifiersPackage getVerifiersPackage() {
		return (VerifiersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VerifiersPackage getPackage() {
		return VerifiersPackage.eINSTANCE;
	}

} //VerifiersFactoryImpl
