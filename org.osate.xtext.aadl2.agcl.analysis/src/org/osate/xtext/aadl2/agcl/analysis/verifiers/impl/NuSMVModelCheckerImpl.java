/**
 */
package org.osate.xtext.aadl2.agcl.analysis.verifiers.impl;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVOutput;
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
	private Map<String,Object> commonPathsTable;
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
		Logger.getLogger(getClass()).info("preparing input for NuSMV");
		assert model instanceof NuSMVModel;
		assert spec instanceof NuSMVSpecification;
		NuSMVModel nusmvModel = (NuSMVModel) model;
		NuSMVSpecification nusmvSpec = (NuSMVSpecification) spec;
		
		IFile modelFile  = prepareModelFile(nusmvModel, nusmvSpec);
		IFile scriptFile = prepareScriptFile(modelFile);
		NuSMVInput modelCheckerInput = createNuSMVInputInstance(modelFile, scriptFile);
		return modelCheckerInput;
	}
	
	/**
	 * Create NuSMV input with references to the file
	 * @param modelFile		a handle to the input model file
	 * @param scriptFile	a handle to the session script file
	 * @return	an instance of the NuSMV input
	 */
	private NuSMVInput createNuSMVInputInstance(IFile modelFile,
			IFile scriptFile) {
		NuSMVInput modelCheckerInput = VerifiersFactory.eINSTANCE.createNuSMVInput();
		modelCheckerInput.setModelFileName(modelFile.getName());
		modelCheckerInput.setModelFile(modelFile);
		modelCheckerInput.setSessionScriptFile(scriptFile);
		modelCheckerInput.setSessionScriptFileName(scriptFile.getName());
		Logger.getLogger(getClass()).info("input for NuSMV ready");
		return modelCheckerInput;
	}

	/**
	 * @return a label for naming generated files
	 */
	private String makeFileLabel() {
		URI uri = resourceContext.getURI();
		String resourceName = uri.lastSegment().replace('.', '_');
		return resourceName + "_" + label.replace('.', '_');
	}
	
	/**
	 * @param nusmvModel 	a NuSMV model object with variables, initial states and transitions
	 * @param nusmvSpec 	a NuSMV specification with a temporal logic formula
	 * @return	a handle to the NuSMV source file 
	 */
	private IFile prepareModelFile(NuSMVModel nusmvModel, NuSMVSpecification nusmvSpec) {
		// Extract NuSMVModel elements
		String varsText  = nusmvModel.variablesText();
		String initText  = nusmvModel.initText();
		String transText = nusmvModel.transText(); 
		String specText = nusmvSpec.text(null);
		String logicText = nusmvSpec.logicText();
		
		// Substitute in template
		Template template = AGCLAnalysisPlugin.getDefault()
				.getTemplateManager()
				.get(IPreferenceConstants.MODEL_CHECKER_MODEL_TEMPLATE_PREFERENCE);
		Map<String,Object> substitution = new HashMap<String,Object>();
		substitution.put("variables", varsText);
		substitution.put("init", initText);
		substitution.put("trans", transText);
		substitution.put("logic", logicText);
		substitution.put("spec", specText);
		substitution.put("fairness", "TRUE");
		String result = template.substitute(substitution);
		Logger.getLogger(getClass()).debug("resulting nusmv source:\n"+result);
		
		// Save result in a file
		String newNuSMVInputModelFileName = makeFileLabel() + ".smv";
		IFile newNuSMVInputModelFile = inputFolder.getFile(newNuSMVInputModelFileName);
		AGCLUtil.saveFile(newNuSMVInputModelFile, result);
		return newNuSMVInputModelFile;
	}
	
	/**
	 * @param inputModelFile	the handle to the NuSMV source file
	 * @return	the handle to the corresponding NuSMV session script file
	 */
	private IFile prepareScriptFile(IFile inputModelFile) {
		final String makeFileLabel = makeFileLabel();
		populateCommonPathsTable(inputModelFile, makeFileLabel);
		Template template = AGCLAnalysisPlugin.getDefault()
				.getTemplateManager()
				.get(IPreferenceConstants.MODEL_CHECKER_SCRIPT_TEMPLATE_PREFERENCE);
		Map<String,Object> substitution = commonPathsTable;
		String result = template.substitute(substitution);
		String newNuSMVScriptFileName = makeFileLabel + "_session_script.nusmvrc"; 
		IFile newNuSMVScriptFile = inputFolder.getFile(newNuSMVScriptFileName);
		AGCLUtil.saveFile(newNuSMVScriptFile, result);
		return newNuSMVScriptFile; 
	}
	
	/**
	 * Fills out the local table with paths used in invoking NuSMV, the input model, scripts, output, and redirected streams.
	 * @param inputModelFile	the handle to the NuSMV source file
	 * @param makeFileLabel		a label for naming generated files
	 */
	private void populateCommonPathsTable(IFile inputModelFile, String makeFileLabel) {
		commonPathsTable = new HashMap<String,Object>();
		String stderrFileName 			= makeFileLabel + ".stderr";
		String stdoutFileName 			= makeFileLabel + ".stdout";
		String inputModelFileName 		= inputModelFile.getName();
		String counterexamplesFileName 	= makeFileLabel + "_counterexample.xml";
		IPath stderrPath 			= outputFolder.getLocation().append(stderrFileName).makeAbsolute();
		IPath stdoutPath 			= outputFolder.getLocation().append(stdoutFileName).makeAbsolute();
		IPath inputModelPath 		= inputFolder.getLocation().append(inputModelFileName).makeAbsolute();
		IPath counterexamplePath 	= inputFolder.getLocation().append(counterexamplesFileName).makeAbsolute();
		String stderrPathStr 		= stderrPath.toOSString();
		String stdoutPathStr 		= stdoutPath.toOSString();
		String inputModelPathStr 	= inputModelPath.toOSString();
		String counterexamplesPath 	= counterexamplePath.toOSString();
		commonPathsTable.put("stderr", stderrPathStr);
		commonPathsTable.put("stdout", stdoutPathStr);
		commonPathsTable.put("inputmodel", inputModelPathStr);
		commonPathsTable.put("counterexamples", counterexamplesPath);
	}

	@Override
	public ModelCheckerOutput callExternal(ModelCheckerInput input) {
		Logger.getLogger(getClass()).info("calling external program (NuSMV)");
		assert input instanceof NuSMVInput;
		NuSMVInput nusmvInput = (NuSMVInput) input;
		String nusmvPathStr = getCommandPath();
		String commandArgs = getCommandLineArgs(nusmvInput);
		ProcessBuilder procBuilder = buildCommand(nusmvPathStr, commandArgs);
		runCommand(procBuilder);
		NuSMVOutput modelCheckerOutput = createNuSMVOutputInstance();
		
		return modelCheckerOutput;
	}
	
	/**
	 * @return the full path to the NuSMV executable
	 */
	private String getCommandPath() {
		String nusmvPathStr = AGCLAnalysisPlugin.getDefault()
				.getPreferenceStore()
				.getString(IPreferenceConstants.MODEL_CHECKER_EXECUTABLE_PREFERENCE);
		Logger.getLogger(getClass()).info("NuSMV path: " + nusmvPathStr);
		return nusmvPathStr;
	}
	
	/**
	 * @param nusmvInput a NuSMV input instance with the input model and script 
	 * @return the command-line arguments to feed NuSMV
	 */
	private String getCommandLineArgs(NuSMVInput nusmvInput) {
		String commandArgs;
		// Obtain the model's full path
		String inputmodelAbsPathStr = nusmvInput.getModelFile().getLocation().toOSString();
		// Obtain the session script's full path
		String scriptAbsPathStr = nusmvInput.getSessionScriptFile().getLocation().toOSString();
		String flagsTemplate = AGCLAnalysisPlugin.getDefault()
				.getPreferenceStore()
				.getString(IPreferenceConstants.MODEL_CHECKER_FLAGS_PREFERENCE);
		Template template = new Template(flagsTemplate);
		Map<String, Object> substitution = new HashMap<String, Object>();
		substitution.put("script", scriptAbsPathStr);
		substitution.put("inputmodel", inputmodelAbsPathStr);
		commandArgs =  template.substitute(substitution);
		Logger.getLogger(getClass()).debug("flags:" + commandArgs);
		return commandArgs;
	}
	
	/**
	 * @param commandPath 	the full path to the NuSMV executable
	 * @param commandArgs	the command-line arguments
	 * @return a process builder with redirected stdout and stderr streams
	 */
	private ProcessBuilder buildCommand(String commandPath, String commandArgs) {
		String[] commandArray = { commandPath, commandArgs };
		List<String> command = Arrays.asList(commandArray);
		ProcessBuilder procBuilder = new ProcessBuilder(command);
		// Get paths for redirected stdout and stderr
		String stderrPathStr 	= (String) commonPathsTable.get("stderr");
		String stdoutPathStr 	= (String) commonPathsTable.get("stdout");
		File stderrFile = new File(stderrPathStr);
		File stdoutFile = new File(stdoutPathStr);
		procBuilder.redirectError(stderrFile);
		procBuilder.redirectOutput(stdoutFile);
		Logger.getLogger(getClass()).debug("process builder repr: " + procBuilder);
		return procBuilder;
	}
	
	/**
	 * Call the external process that runs NuSMV
	 * @param procBuilder the process builder for NuSMV
	 */
	private void runCommand(ProcessBuilder procBuilder) {
		try {
			Process proc = procBuilder.start();
			Logger.getLogger(getClass()).debug("process started: " + proc);
			int exitCode = proc.waitFor();
			Logger.getLogger(getClass()).debug("process finished: " + proc.exitValue());
			// TODO: check other exit codes
			switch (exitCode) {
			case 0:
				Logger.getLogger(getClass()).info("NuSMV finished normally");
				break;
			case 255:
				Logger.getLogger(getClass()).error("NuSMV finished with error code 255");
				break;
			default:
				Logger.getLogger(getClass()).error("NuSMV finished with error code " + exitCode);
			}
		} catch (IOException e) {
			Logger.getLogger(getClass()).error("There was an I/O error when calling NuSMV");
		} catch (InterruptedException e) {
			Logger.getLogger(getClass()).error("There was an interruption error when calling NuSMV");
		}
	}
	
	/**
	 * Create the output object with the appropriate files
	 * @return an instance of the NuSMV output with the names and file handles for the outut generated by NuSMV
	 */
	private NuSMVOutput createNuSMVOutputInstance() {
		NuSMVOutput modelCheckerOutput = VerifiersFactory.eINSTANCE.createNuSMVOutput();
		IFile outputFile = getOutputFile();
		modelCheckerOutput.setOutputFile(outputFile);
		modelCheckerOutput.setOutputFileName(outputFile.getName());
		IFile counterexamplesFile = getCounterexamplesFile();
		modelCheckerOutput.setCounterexampleFile(counterexamplesFile);
		modelCheckerOutput.setCounterExampleFileName(counterexamplesFile.getName());
		return modelCheckerOutput;
	}

	/**
	 * @return the handle of the output file generated by NuSMV
	 */
	private IFile getOutputFile() {
		final String makeFileLabel = makeFileLabel();
		String stdoutFileName = makeFileLabel + ".stdout";
//		IPath stdoutPath	  = outputFolder.getLocation().append(stdoutFileName).makeAbsolute();
//		String stdoutPathStr  = stdoutPath.toOSString();
		return outputFolder.getFile(stdoutFileName);
	}
	
	/**
	 * @return the handle of the counterexample file generated by NuSMV
	 */
	private IFile getCounterexamplesFile() {
		final String makeFileLabel = makeFileLabel();
		String counterexamplesFileName 	= makeFileLabel + "_counterexample.xml";
//		IPath counterexamplePath 		= inputFolder.getLocation().append(counterexamplesFileName).makeAbsolute();
//		String counterexamplesPath 		= counterexamplePath.toOSString();
		return outputFolder.getFile(counterexamplesFileName);
	}

	@Override
	public VerificationResult processOutput(ModelCheckerOutput output) {
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
		result.setLogic("PSL");
		Logger.getLogger(getClass()).debug("transformed nusmv spec:                " + serializer.serialize(transformed) );
		return result;
	}

} //NuSMVModelCheckerImpl
