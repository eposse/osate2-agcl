/**
 */
package org.osate.xtext.aadl2.agcl.analysis.verifiers.impl;

import org.eclipse.emf.ecore.EClass;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Model;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerInput;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerOutput;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVInput;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModel;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModelChecker;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVSpecification;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVUniversalModel;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationResult;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersFactory;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nu SMV Model Checker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NuSMVModelCheckerImpl extends ModelCheckerImpl implements NuSMVModelChecker {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NuSMVModelCheckerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VerifiersPackage.Literals.NU_SMV_MODEL_CHECKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public ModelCheckerInput prepareInput(Model model, Specification spec) {
		assert model instanceof NuSMVModel;
		assert spec instanceof NuSMVSpecification;
		NuSMVModel nusmvModel = (NuSMVModel) model;
		NuSMVSpecification nusmvSpec = (NuSMVSpecification) spec;
		// Obtain the files
		String modelText = nusmvModel.text(null);
		String specText = nusmvSpec.text(null);
		NuSMVInput modelCheckerInput = VerifiersFactory.eINSTANCE.createNuSMVInput();
//		modelCheckerInput.setModelSourceFile(value);
//		modelCheckerInput.setSessionScript(value);
		return modelCheckerInput;
	}

	@Override
	public VerificationResult processOutput(ModelCheckerOutput output) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelCheckerOutput callExternal(ModelCheckerInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VerificationResult checkSpecValidity(Specification spec) {
		NuSMVUniversalModel universalModel = VerifiersFactory.eINSTANCE.createNuSMVUniversalModel();
		return check(universalModel, spec);
	}

} //NuSMVModelCheckerImpl
