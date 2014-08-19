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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Component;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ComponentCollection;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.CounterExample;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Model;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerInput;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerOutput;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Negative;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVInput;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModel;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModelChecker;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVOutput;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVSpecification;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVUniversalModel;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Positive;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ResultEntry;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ResultsCollection;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.UniversalModel;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Unknown;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationResult;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersFactory;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Viewpoint;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ViewpointCollection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VerifiersPackageImpl extends EPackageImpl implements VerifiersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verificationResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass counterExampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universalModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelCheckerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuSMVModelCheckerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelCheckerInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelCheckerOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuSMVInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuSMVOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuSMVModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuSMVUniversalModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuSMVSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultsCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verificationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewpointCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentCollectionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VerifiersPackageImpl() {
		super(eNS_URI, VerifiersFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link VerifiersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VerifiersPackage init() {
		if (isInited) return (VerifiersPackage)EPackage.Registry.INSTANCE.getEPackage(VerifiersPackage.eNS_URI);

		// Obtain or create and register package
		VerifiersPackageImpl theVerifiersPackage = (VerifiersPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VerifiersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VerifiersPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theVerifiersPackage.createPackageContents();

		// Initialize created meta-data
		theVerifiersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVerifiersPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VerifiersPackage.eNS_URI, theVerifiersPackage);
		return theVerifiersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerificationResult() {
		return verificationResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositive() {
		return positiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegative() {
		return negativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegative_Counterexample() {
		return (EReference)negativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Model() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Context() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModel__Text__Object() {
		return modelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecification() {
		return specificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecification_Spec() {
		return (EAttribute)specificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecification_Context() {
		return (EAttribute)specificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpecification__Text__Object() {
		return specificationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCounterExample() {
		return counterExampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniversalModel() {
		return universalModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelChecker() {
		return modelCheckerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelChecker_ResourceContext() {
		return (EAttribute)modelCheckerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelChecker_Results() {
		return (EReference)modelCheckerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelChecker_VerificationUnits() {
		return (EReference)modelCheckerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelChecker_ViewpointCollection() {
		return (EReference)modelCheckerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelChecker_ComponentCollection() {
		return (EReference)modelCheckerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelChecker__SetUp__Resource() {
		return modelCheckerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelChecker__MakeVerificationUnit__Model_Specification_Viewpoint_Component() {
		return modelCheckerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelChecker__MakeVerificationUnit__Specification_Viewpoint_Component() {
		return modelCheckerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelChecker__CheckVerificationUnit__VerificationUnit() {
		return modelCheckerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelChecker__PrepareInput__VerificationUnit() {
		return modelCheckerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelChecker__ProcessOutput__ModelCheckerOutput() {
		return modelCheckerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelChecker__CallExternal__ModelCheckerInput() {
		return modelCheckerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelChecker__AddVerificationUnit__VerificationUnit() {
		return modelCheckerEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelChecker__RemoveVerificationUnit__String() {
		return modelCheckerEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelChecker__GetVerificationUnit__String() {
		return modelCheckerEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelChecker__CheckAll() {
		return modelCheckerEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNuSMVModelChecker() {
		return nuSMVModelCheckerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelCheckerInput() {
		return modelCheckerInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelCheckerInput_Specification() {
		return (EReference)modelCheckerInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelCheckerInput_Output() {
		return (EReference)modelCheckerInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelCheckerInput_VerificationUnit() {
		return (EReference)modelCheckerInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelCheckerOutput() {
		return modelCheckerOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelCheckerOutput_Result() {
		return (EReference)modelCheckerOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelCheckerOutput_Input() {
		return (EReference)modelCheckerOutputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNuSMVInput() {
		return nuSMVInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNuSMVInput_ModelFileName() {
		return (EAttribute)nuSMVInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNuSMVInput_SessionScriptFileName() {
		return (EAttribute)nuSMVInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNuSMVOutput() {
		return nuSMVOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNuSMVOutput_OutputFileName() {
		return (EAttribute)nuSMVOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNuSMVOutput_CounterExampleFileName() {
		return (EAttribute)nuSMVOutputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNuSMVModel() {
		return nuSMVModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNuSMVModel_Vars() {
		return (EAttribute)nuSMVModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNuSMVModel_Init() {
		return (EAttribute)nuSMVModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNuSMVModel_Trans() {
		return (EAttribute)nuSMVModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNuSMVUniversalModel() {
		return nuSMVUniversalModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNuSMVSpecification() {
		return nuSMVSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNuSMVSpecification_Logic() {
		return (EAttribute)nuSMVSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnknown() {
		return unknownEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnknown_Reason() {
		return (EAttribute)unknownEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultsCollection() {
		return resultsCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultsCollection_Entries() {
		return (EReference)resultsCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResultsCollection__RecordResult__VerificationUnit_VerificationResult() {
		return resultsCollectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Name() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Object() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewpoint() {
		return viewpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewpoint_Name() {
		return (EAttribute)viewpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewpoint_Object() {
		return (EAttribute)viewpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerificationUnit() {
		return verificationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerificationUnit_Model() {
		return (EReference)verificationUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerificationUnit_Specification() {
		return (EReference)verificationUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerificationUnit_Viewpoint() {
		return (EReference)verificationUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerificationUnit_Component() {
		return (EReference)verificationUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerificationUnit_Name() {
		return (EAttribute)verificationUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultEntry() {
		return resultEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultEntry_VerificationUnit() {
		return (EReference)resultEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultEntry_Result() {
		return (EReference)resultEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewpointCollection() {
		return viewpointCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewpointCollection_Viewpoints() {
		return (EReference)viewpointCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getViewpointCollection__GetViewpoint__String() {
		return viewpointCollectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getViewpointCollection__AddViewpoint__String_Object() {
		return viewpointCollectionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getViewpointCollection__RemoveViewpoint__String() {
		return viewpointCollectionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getViewpointCollection__ContainsViewpoint__String() {
		return viewpointCollectionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentCollection() {
		return componentCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentCollection_Components() {
		return (EReference)componentCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComponentCollection__GetComponent__String() {
		return componentCollectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComponentCollection__AddComponent__String_Object() {
		return componentCollectionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComponentCollection__RemoveComponent__String() {
		return componentCollectionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComponentCollection__ContainsComponent__String() {
		return componentCollectionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerifiersFactory getVerifiersFactory() {
		return (VerifiersFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		verificationResultEClass = createEClass(VERIFICATION_RESULT);

		positiveEClass = createEClass(POSITIVE);

		negativeEClass = createEClass(NEGATIVE);
		createEReference(negativeEClass, NEGATIVE__COUNTEREXAMPLE);

		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__MODEL);
		createEAttribute(modelEClass, MODEL__CONTEXT);
		createEOperation(modelEClass, MODEL___TEXT__OBJECT);

		specificationEClass = createEClass(SPECIFICATION);
		createEAttribute(specificationEClass, SPECIFICATION__SPEC);
		createEAttribute(specificationEClass, SPECIFICATION__CONTEXT);
		createEOperation(specificationEClass, SPECIFICATION___TEXT__OBJECT);

		counterExampleEClass = createEClass(COUNTER_EXAMPLE);

		universalModelEClass = createEClass(UNIVERSAL_MODEL);

		modelCheckerEClass = createEClass(MODEL_CHECKER);
		createEAttribute(modelCheckerEClass, MODEL_CHECKER__RESOURCE_CONTEXT);
		createEReference(modelCheckerEClass, MODEL_CHECKER__RESULTS);
		createEReference(modelCheckerEClass, MODEL_CHECKER__VERIFICATION_UNITS);
		createEReference(modelCheckerEClass, MODEL_CHECKER__VIEWPOINT_COLLECTION);
		createEReference(modelCheckerEClass, MODEL_CHECKER__COMPONENT_COLLECTION);
		createEOperation(modelCheckerEClass, MODEL_CHECKER___SET_UP__RESOURCE);
		createEOperation(modelCheckerEClass, MODEL_CHECKER___MAKE_VERIFICATION_UNIT__MODEL_SPECIFICATION_VIEWPOINT_COMPONENT);
		createEOperation(modelCheckerEClass, MODEL_CHECKER___MAKE_VERIFICATION_UNIT__SPECIFICATION_VIEWPOINT_COMPONENT);
		createEOperation(modelCheckerEClass, MODEL_CHECKER___CHECK_VERIFICATION_UNIT__VERIFICATIONUNIT);
		createEOperation(modelCheckerEClass, MODEL_CHECKER___PREPARE_INPUT__VERIFICATIONUNIT);
		createEOperation(modelCheckerEClass, MODEL_CHECKER___CALL_EXTERNAL__MODELCHECKERINPUT);
		createEOperation(modelCheckerEClass, MODEL_CHECKER___PROCESS_OUTPUT__MODELCHECKEROUTPUT);
		createEOperation(modelCheckerEClass, MODEL_CHECKER___ADD_VERIFICATION_UNIT__VERIFICATIONUNIT);
		createEOperation(modelCheckerEClass, MODEL_CHECKER___REMOVE_VERIFICATION_UNIT__STRING);
		createEOperation(modelCheckerEClass, MODEL_CHECKER___GET_VERIFICATION_UNIT__STRING);
		createEOperation(modelCheckerEClass, MODEL_CHECKER___CHECK_ALL);

		nuSMVModelCheckerEClass = createEClass(NU_SMV_MODEL_CHECKER);

		modelCheckerInputEClass = createEClass(MODEL_CHECKER_INPUT);
		createEReference(modelCheckerInputEClass, MODEL_CHECKER_INPUT__SPECIFICATION);
		createEReference(modelCheckerInputEClass, MODEL_CHECKER_INPUT__OUTPUT);
		createEReference(modelCheckerInputEClass, MODEL_CHECKER_INPUT__VERIFICATION_UNIT);

		modelCheckerOutputEClass = createEClass(MODEL_CHECKER_OUTPUT);
		createEReference(modelCheckerOutputEClass, MODEL_CHECKER_OUTPUT__RESULT);
		createEReference(modelCheckerOutputEClass, MODEL_CHECKER_OUTPUT__INPUT);

		nuSMVInputEClass = createEClass(NU_SMV_INPUT);
		createEAttribute(nuSMVInputEClass, NU_SMV_INPUT__MODEL_FILE_NAME);
		createEAttribute(nuSMVInputEClass, NU_SMV_INPUT__SESSION_SCRIPT_FILE_NAME);

		nuSMVOutputEClass = createEClass(NU_SMV_OUTPUT);
		createEAttribute(nuSMVOutputEClass, NU_SMV_OUTPUT__OUTPUT_FILE_NAME);
		createEAttribute(nuSMVOutputEClass, NU_SMV_OUTPUT__COUNTER_EXAMPLE_FILE_NAME);

		nuSMVModelEClass = createEClass(NU_SMV_MODEL);
		createEAttribute(nuSMVModelEClass, NU_SMV_MODEL__VARS);
		createEAttribute(nuSMVModelEClass, NU_SMV_MODEL__INIT);
		createEAttribute(nuSMVModelEClass, NU_SMV_MODEL__TRANS);

		nuSMVUniversalModelEClass = createEClass(NU_SMV_UNIVERSAL_MODEL);

		nuSMVSpecificationEClass = createEClass(NU_SMV_SPECIFICATION);
		createEAttribute(nuSMVSpecificationEClass, NU_SMV_SPECIFICATION__LOGIC);

		unknownEClass = createEClass(UNKNOWN);
		createEAttribute(unknownEClass, UNKNOWN__REASON);

		resultsCollectionEClass = createEClass(RESULTS_COLLECTION);
		createEReference(resultsCollectionEClass, RESULTS_COLLECTION__ENTRIES);
		createEOperation(resultsCollectionEClass, RESULTS_COLLECTION___RECORD_RESULT__VERIFICATIONUNIT_VERIFICATIONRESULT);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__NAME);
		createEAttribute(componentEClass, COMPONENT__OBJECT);

		viewpointEClass = createEClass(VIEWPOINT);
		createEAttribute(viewpointEClass, VIEWPOINT__NAME);
		createEAttribute(viewpointEClass, VIEWPOINT__OBJECT);

		verificationUnitEClass = createEClass(VERIFICATION_UNIT);
		createEReference(verificationUnitEClass, VERIFICATION_UNIT__MODEL);
		createEReference(verificationUnitEClass, VERIFICATION_UNIT__SPECIFICATION);
		createEReference(verificationUnitEClass, VERIFICATION_UNIT__VIEWPOINT);
		createEReference(verificationUnitEClass, VERIFICATION_UNIT__COMPONENT);
		createEAttribute(verificationUnitEClass, VERIFICATION_UNIT__NAME);

		resultEntryEClass = createEClass(RESULT_ENTRY);
		createEReference(resultEntryEClass, RESULT_ENTRY__VERIFICATION_UNIT);
		createEReference(resultEntryEClass, RESULT_ENTRY__RESULT);

		viewpointCollectionEClass = createEClass(VIEWPOINT_COLLECTION);
		createEReference(viewpointCollectionEClass, VIEWPOINT_COLLECTION__VIEWPOINTS);
		createEOperation(viewpointCollectionEClass, VIEWPOINT_COLLECTION___GET_VIEWPOINT__STRING);
		createEOperation(viewpointCollectionEClass, VIEWPOINT_COLLECTION___ADD_VIEWPOINT__STRING_OBJECT);
		createEOperation(viewpointCollectionEClass, VIEWPOINT_COLLECTION___REMOVE_VIEWPOINT__STRING);
		createEOperation(viewpointCollectionEClass, VIEWPOINT_COLLECTION___CONTAINS_VIEWPOINT__STRING);

		componentCollectionEClass = createEClass(COMPONENT_COLLECTION);
		createEReference(componentCollectionEClass, COMPONENT_COLLECTION__COMPONENTS);
		createEOperation(componentCollectionEClass, COMPONENT_COLLECTION___GET_COMPONENT__STRING);
		createEOperation(componentCollectionEClass, COMPONENT_COLLECTION___ADD_COMPONENT__STRING_OBJECT);
		createEOperation(componentCollectionEClass, COMPONENT_COLLECTION___REMOVE_COMPONENT__STRING);
		createEOperation(componentCollectionEClass, COMPONENT_COLLECTION___CONTAINS_COMPONENT__STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		positiveEClass.getESuperTypes().add(this.getVerificationResult());
		negativeEClass.getESuperTypes().add(this.getVerificationResult());
		universalModelEClass.getESuperTypes().add(this.getModel());
		nuSMVModelCheckerEClass.getESuperTypes().add(this.getModelChecker());
		nuSMVInputEClass.getESuperTypes().add(this.getModelCheckerInput());
		nuSMVOutputEClass.getESuperTypes().add(this.getModelCheckerOutput());
		nuSMVModelEClass.getESuperTypes().add(this.getModel());
		nuSMVUniversalModelEClass.getESuperTypes().add(this.getNuSMVModel());
		nuSMVUniversalModelEClass.getESuperTypes().add(this.getUniversalModel());
		nuSMVSpecificationEClass.getESuperTypes().add(this.getSpecification());
		unknownEClass.getESuperTypes().add(this.getVerificationResult());

		// Initialize classes, features, and operations; add parameters
		initEClass(verificationResultEClass, VerificationResult.class, "VerificationResult", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positiveEClass, Positive.class, "Positive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negativeEClass, Negative.class, "Negative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNegative_Counterexample(), this.getCounterExample(), null, "counterexample", null, 0, 1, Negative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_Model(), ecorePackage.getEJavaObject(), "model", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_Context(), ecorePackage.getEJavaObject(), "context", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getModel__Text__Object(), ecorePackage.getEString(), "text", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "args", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(specificationEClass, Specification.class, "Specification", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecification_Spec(), ecorePackage.getEJavaObject(), "spec", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecification_Context(), ecorePackage.getEJavaObject(), "context", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSpecification__Text__Object(), ecorePackage.getEString(), "text", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "args", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(counterExampleEClass, CounterExample.class, "CounterExample", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(universalModelEClass, UniversalModel.class, "UniversalModel", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelCheckerEClass, ModelChecker.class, "ModelChecker", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelChecker_ResourceContext(), ecorePackage.getEResource(), "resourceContext", null, 0, 1, ModelChecker.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelChecker_Results(), this.getResultsCollection(), null, "results", null, 0, 1, ModelChecker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelChecker_VerificationUnits(), this.getVerificationUnit(), null, "verificationUnits", null, 0, -1, ModelChecker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelChecker_ViewpointCollection(), this.getViewpointCollection(), null, "viewpointCollection", null, 0, 1, ModelChecker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelChecker_ComponentCollection(), this.getComponentCollection(), null, "componentCollection", null, 0, 1, ModelChecker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getModelChecker__SetUp__Resource(), null, "setUp", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEResource(), "resource", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelChecker__MakeVerificationUnit__Model_Specification_Viewpoint_Component(), this.getVerificationUnit(), "makeVerificationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getModel(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSpecification(), "spec", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getViewpoint(), "viewpoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getComponent(), "component", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelChecker__MakeVerificationUnit__Specification_Viewpoint_Component(), this.getVerificationUnit(), "makeVerificationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSpecification(), "spec", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getViewpoint(), "viewpoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getComponent(), "component", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelChecker__CheckVerificationUnit__VerificationUnit(), this.getVerificationResult(), "checkVerificationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVerificationUnit(), "verificationUnit", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelChecker__PrepareInput__VerificationUnit(), this.getModelCheckerInput(), "prepareInput", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVerificationUnit(), "verificationUnit", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelChecker__CallExternal__ModelCheckerInput(), this.getModelCheckerOutput(), "callExternal", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getModelCheckerInput(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelChecker__ProcessOutput__ModelCheckerOutput(), this.getVerificationResult(), "processOutput", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getModelCheckerOutput(), "output", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelChecker__AddVerificationUnit__VerificationUnit(), null, "addVerificationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVerificationUnit(), "verificationUnit", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelChecker__RemoveVerificationUnit__String(), null, "removeVerificationUnit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "verificationUnitName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelChecker__GetVerificationUnit__String(), this.getVerificationUnit(), "getVerificationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "verificationUnitName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getModelChecker__CheckAll(), null, "checkAll", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(nuSMVModelCheckerEClass, NuSMVModelChecker.class, "NuSMVModelChecker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelCheckerInputEClass, ModelCheckerInput.class, "ModelCheckerInput", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelCheckerInput_Specification(), this.getSpecification(), null, "specification", null, 0, 1, ModelCheckerInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelCheckerInput_Output(), this.getModelCheckerOutput(), this.getModelCheckerOutput_Input(), "output", null, 0, 1, ModelCheckerInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelCheckerInput_VerificationUnit(), this.getVerificationUnit(), null, "verificationUnit", null, 0, 1, ModelCheckerInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelCheckerOutputEClass, ModelCheckerOutput.class, "ModelCheckerOutput", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelCheckerOutput_Result(), this.getVerificationResult(), null, "result", null, 0, 1, ModelCheckerOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelCheckerOutput_Input(), this.getModelCheckerInput(), this.getModelCheckerInput_Output(), "input", null, 0, 1, ModelCheckerOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuSMVInputEClass, NuSMVInput.class, "NuSMVInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNuSMVInput_ModelFileName(), ecorePackage.getEString(), "modelFileName", null, 0, 1, NuSMVInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNuSMVInput_SessionScriptFileName(), ecorePackage.getEString(), "sessionScriptFileName", null, 0, 1, NuSMVInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuSMVOutputEClass, NuSMVOutput.class, "NuSMVOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNuSMVOutput_OutputFileName(), ecorePackage.getEString(), "outputFileName", null, 0, 1, NuSMVOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNuSMVOutput_CounterExampleFileName(), ecorePackage.getEString(), "counterExampleFileName", null, 0, 1, NuSMVOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuSMVModelEClass, NuSMVModel.class, "NuSMVModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNuSMVModel_Vars(), ecorePackage.getEJavaObject(), "vars", null, 0, 1, NuSMVModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNuSMVModel_Init(), ecorePackage.getEJavaObject(), "init", null, 0, 1, NuSMVModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNuSMVModel_Trans(), ecorePackage.getEJavaObject(), "trans", null, 0, 1, NuSMVModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuSMVUniversalModelEClass, NuSMVUniversalModel.class, "NuSMVUniversalModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nuSMVSpecificationEClass, NuSMVSpecification.class, "NuSMVSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNuSMVSpecification_Logic(), ecorePackage.getEJavaObject(), "logic", null, 0, 1, NuSMVSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unknownEClass, Unknown.class, "Unknown", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnknown_Reason(), ecorePackage.getEString(), "reason", null, 0, 1, Unknown.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultsCollectionEClass, ResultsCollection.class, "ResultsCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultsCollection_Entries(), this.getResultEntry(), null, "entries", null, 0, -1, ResultsCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getResultsCollection__RecordResult__VerificationUnit_VerificationResult(), null, "recordResult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVerificationUnit(), "verificationUnit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVerificationResult(), "result", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Object(), ecorePackage.getEJavaObject(), "object", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewpointEClass, Viewpoint.class, "Viewpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewpoint_Name(), ecorePackage.getEString(), "name", null, 0, 1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewpoint_Object(), ecorePackage.getEJavaObject(), "object", null, 0, 1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verificationUnitEClass, VerificationUnit.class, "VerificationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVerificationUnit_Model(), this.getModel(), null, "model", null, 0, 1, VerificationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerificationUnit_Specification(), this.getSpecification(), null, "specification", null, 0, 1, VerificationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerificationUnit_Viewpoint(), this.getViewpoint(), null, "viewpoint", null, 0, 1, VerificationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerificationUnit_Component(), this.getComponent(), null, "component", null, 0, 1, VerificationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerificationUnit_Name(), ecorePackage.getEString(), "name", null, 0, 1, VerificationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultEntryEClass, ResultEntry.class, "ResultEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultEntry_VerificationUnit(), this.getVerificationUnit(), null, "verificationUnit", null, 0, 1, ResultEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultEntry_Result(), this.getVerificationResult(), null, "result", null, 0, 1, ResultEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewpointCollectionEClass, ViewpointCollection.class, "ViewpointCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewpointCollection_Viewpoints(), this.getViewpoint(), null, "viewpoints", null, 0, -1, ViewpointCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getViewpointCollection__GetViewpoint__String(), this.getViewpoint(), "getViewpoint", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "viewpointName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getViewpointCollection__AddViewpoint__String_Object(), this.getViewpoint(), "addViewpoint", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "viewpointName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getViewpointCollection__RemoveViewpoint__String(), null, "removeViewpoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "viewpointName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getViewpointCollection__ContainsViewpoint__String(), ecorePackage.getEBoolean(), "containsViewpoint", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "viewpointName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(componentCollectionEClass, ComponentCollection.class, "ComponentCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentCollection_Components(), this.getComponent(), null, "components", null, 0, -1, ComponentCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getComponentCollection__GetComponent__String(), this.getComponent(), "getComponent", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "componentName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComponentCollection__AddComponent__String_Object(), this.getComponent(), "addComponent", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "componentName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComponentCollection__RemoveComponent__String(), null, "removeComponent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "componentName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComponentCollection__ContainsComponent__String(), ecorePackage.getEBoolean(), "containsComponent", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "componentName", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";				
		addAnnotation
		  (getNuSMVInput_ModelFileName(), 
		   source, 
		   new String[] {
			 "processing", "skip"
		   });		
		addAnnotation
		  (getNuSMVInput_SessionScriptFileName(), 
		   source, 
		   new String[] {
			 "processing", "skip"
		   });		
		addAnnotation
		  (getNuSMVOutput_OutputFileName(), 
		   source, 
		   new String[] {
			 "processing", "skip"
		   });		
		addAnnotation
		  (getNuSMVOutput_CounterExampleFileName(), 
		   source, 
		   new String[] {
			 "processing", "skip"
		   });
	}

} //VerifiersPackageImpl
