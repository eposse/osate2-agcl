/**
 */
package org.osate.xtext.aadl2.agcl.analysis.verifiers.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.serializer.ISerializer;
import org.osate.xtext.aadl2.agcl.agcl.PSLSpec;
import org.osate.xtext.aadl2.agcl.analysis.AGCLAnalysisPlugin;
import org.osate.xtext.aadl2.agcl.analysis.config.IPreferenceConstants;
import org.osate.xtext.aadl2.agcl.analysis.util.AGCLUtil;
import org.osate.xtext.aadl2.agcl.analysis.util.Template;
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
	
	private ISerializer serializer = AGCLAnalysisPlugin.getDefault().getSerializer();
	private String label;
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
		
		IFile modelFile  = prepareModelFile(nusmvModel, nusmvSpec);
		IFile scriptFile = prepareScriptFile(modelFile);
		// Create NuSMV input with references to the file
		NuSMVInput modelCheckerInput = VerifiersFactory.eINSTANCE.createNuSMVInput();
		// TODO: instantiate script template and save it
		// TODO: pass new file names to the NuSMVInput
//		modelCheckerInput.setModelSourceFile(value);
//		modelCheckerInput.setSessionScript(value);
		return modelCheckerInput;
	}
	
	private String makeFileLabel() {
		URI uri = resourceContext.getURI();
		String resourceName = uri.lastSegment().replace('.', '_');
		return resourceName + "_" + label.replace('.', '_');
	}
	
	private IFile prepareModelFile(NuSMVModel nusmvModel, NuSMVSpecification nusmvSpec) {
		// Extract NuSMVModel elements
		String varsText  = nusmvModel.variablesText();
		String initText  = nusmvModel.initText();
		String transText = nusmvModel.transText(); 
		String specText = nusmvSpec.text(null);
		
		// Substitute in template
		Template template = AGCLAnalysisPlugin.getDefault()
				.getTemplateManager()
				.get(IPreferenceConstants.MODEL_CHECKER_MODEL_TEMPLATE_PREFERENCE);
		Map<String,Object> substitution = new HashMap<String,Object>();
		substitution.put("variables", varsText);
		substitution.put("init", initText);
		substitution.put("trans", transText);
		substitution.put("logic", "PSL");
		substitution.put("spec", specText);
		substitution.put("fairness", "true");
		String result = template.substitute(substitution);
		Logger.getLogger(getClass()).debug("resulting nusmv source:\n"+result);
		
		// Save result in a file
		String newNuSMVInputModelFileName = makeFileLabel() + ".smv";
		IFile newNuSMVInputModelFile = inputFolder.getFile(newNuSMVInputModelFileName);
		AGCLUtil.saveFile(newNuSMVInputModelFile, result);
		return newNuSMVInputModelFile;
	}
	
	private IFile prepareScriptFile(IFile inputModelFile) {
		String stderrPath = "stderr";
		String stdoutPath = "stdout";
		IPath path = inputFolder.getFullPath().append(inputModelFile.getName()).makeAbsolute();
		String inputmodelPath = path.toOSString();
		String counterexamplesPath = "counterexamplesPath";
		Template template = AGCLAnalysisPlugin.getDefault()
				.getTemplateManager()
				.get(IPreferenceConstants.MODEL_CHECKER_SCRIPT_TEMPLATE_PREFERENCE);
		Map<String,Object> substitution = new HashMap<String,Object>();
		substitution.put("stderr", stderrPath);
		substitution.put("stdout", stdoutPath);
		substitution.put("inputmodel", inputmodelPath);
		substitution.put("counterexamples", counterexamplesPath);
		String result = template.substitute(substitution);
		URI uri = resourceContext.getURI();
		String resourceName = uri.lastSegment().replace('.', '_');
		String newNuSMVScriptFileName = "session_script.nusmvrc"; 
		IFile newNuSMVScriptFile = inputFolder.getFile(newNuSMVScriptFileName);
		AGCLUtil.saveFile(newNuSMVScriptFile, result);
		return newNuSMVScriptFile; 
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
		universalModel.setContext(spec.getSpec());
		universalModel.synthesizeModelFromSpec();
		Logger.getLogger(getClass()).debug("NuSMV univ. model: [" + universalModel.text(null) + "]");
		return check(universalModel, spec);
	}

	@Override
	public VerificationResult checkSpecValidity(PSLSpec pslSpec, String label) {
		Logger.getLogger(getClass()).debug("checking validity of " + serializer.serialize(pslSpec) + " for " + label);
		this.label = label;
		NuSMVSpecification nusmvSpec = nusmvSpecFromPSLSpec(pslSpec);
		return checkSpecValidity(nusmvSpec);
	}

	/**
	 * Transforms a PSLSpec AST into a proper NuSMV PSL Specification, where the atomic propositions have been
	 * rewritten to conform to NuSMV syntax, i.e. {@code in x:y} becomes {@code in_x_y} and {@code out x:y}
	 * becomes {@code out_x_y}.
	 * @param pslSpec	a PSL specification according to the AGCL meta-model
	 * @return an {@code Specification} instance with the transformed specification 
	 */
	public NuSMVSpecification nusmvSpecFromPSLSpec(PSLSpec pslSpec) {
		Logger.getLogger(getClass()).debug("transforming psl spec into nusmv spec: " + serializer.serialize(pslSpec) );
		NuSMVSpecification result = VerifiersFactory.eINSTANCE.createNuSMVSpecification();
		PSL2NuSMVSpecConverterExplicitSwitch conv = new PSL2NuSMVSpecConverterExplicitSwitch();
		PSLSpec transformed = (PSLSpec)conv.doSwitch(pslSpec);
		result.setSpec(transformed);
		Logger.getLogger(getClass()).debug("transformed nusmv spec:                " + serializer.serialize(transformed) );
		return result;
	}

} //NuSMVModelCheckerImpl
