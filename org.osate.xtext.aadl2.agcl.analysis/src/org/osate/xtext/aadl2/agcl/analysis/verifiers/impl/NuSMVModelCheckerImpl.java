/**
 */
package org.osate.xtext.aadl2.agcl.analysis.verifiers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.osate.xtext.aadl2.agcl.agcl.PSLSpec;
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
import org.osate.xtext.aadl2.agcl.analysis.visitors.PSL2NuSMVSpecConverterExplicitSwitch;

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

	/**
	 * Transforms a PSLSpec AST into a proper NuSMV PSL Specification, where the atomic propositions have been
	 * rewritten to conform to NuSMV syntax, i.e. {@code in x:y} becomes {@code in_x_y} and {@code out x:y}
	 * becomes {@code out_x_y}.
	 * @param pslSpec	a PSL specification according to the AGCL meta-model
	 * @return an {@code Specification} instance with the transformed specification 
	 */
	public NuSMVSpecification nusmvSpecFromPSLSpec(PSLSpec pslSpec) {
		NuSMVSpecification result = VerifiersFactory.eINSTANCE.createNuSMVSpecification();
		PSL2NuSMVSpecConverterExplicitSwitch conv = new PSL2NuSMVSpecConverterExplicitSwitch();
		PSLSpec transformed = (PSLSpec)conv.doSwitch(pslSpec);
		result.setSpec(transformed);
		return result;
	}

} //NuSMVModelCheckerImpl
