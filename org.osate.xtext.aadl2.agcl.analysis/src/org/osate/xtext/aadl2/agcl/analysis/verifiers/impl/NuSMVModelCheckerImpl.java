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

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.serializer.ISerializer;
import org.osate.aadl2.Classifier;
import org.osate.xtext.aadl2.agcl.agcl.PSLSpec;
import org.osate.xtext.aadl2.agcl.analysis.AGCLAnalysisPlugin;
import org.osate.xtext.aadl2.agcl.analysis.config.IPreferenceConstants;
import org.osate.xtext.aadl2.agcl.analysis.util.AGCLUtil;
import org.osate.xtext.aadl2.agcl.analysis.util.Template;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Component;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerInput;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelCheckerOutput;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVInput;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModel;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVModelChecker;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVOutput;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVSpecification;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVUniversalModel;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Specification;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.UniversalModel;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Unknown;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationResult;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersFactory;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.Viewpoint;
import org.osate.xtext.aadl2.agcl.analysis.visitors.concrete.PSL2NuSMVSpecConverterExplicitSwitch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nu SMV Model Checker</b></em>'.
 * 
 * <p> 
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
	private static String regexp = "-- specification ([()\\w\\d\\s\\-\\+\\*\\?\\=\\>\\<\\[\\]\\|\\.\\!\\^&,{}/%:;]+) is ((true|false))";
	private static Pattern pattern = Pattern.compile(regexp);
	private IProgressMonitor progressMonitor;
	private long progressMonitorPollingPeriod = 1000L; // In miliseconds
	
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

	@Override
	public UniversalModel makeUniversalModelFromSpec(Specification spec) {
		assert spec instanceof NuSMVSpecification;
		NuSMVSpecification nusmvSpec = (NuSMVSpecification) spec;
		NuSMVUniversalModel universalModel = VerifiersFactory.eINSTANCE.createNuSMVUniversalModel();
		universalModel.setContext(nusmvSpec.getSpec());
		universalModel.synthesizeModelFromSpec();
		return universalModel;
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
	@Override
	public ModelCheckerInput prepareInput(VerificationUnit verificationUnit) {
		Logger.getLogger(getClass()).info("preparing input for NuSMV");
		NuSMVModel nusmvModel = (NuSMVModel) verificationUnit.getModel();
		NuSMVSpecification nusmvSpec = (NuSMVSpecification) verificationUnit.getSpecification();
		
		IFile modelFile  = prepareModelFile(nusmvModel, nusmvSpec);
		IFile scriptFile = prepareScriptFile(modelFile);
		NuSMVInput modelCheckerInput = createNuSMVInputInstance(verificationUnit, modelFile, scriptFile);
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
		Logger.getLogger(getClass()).debug("preparing NuSMV model file");
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
		Logger.getLogger(getClass()).debug("prepared NuSMV model file");
		return newNuSMVInputModelFile;
	}
	
	/**
	 * @param inputModelFile	the handle to the NuSMV source file
	 * @return	the handle to the corresponding NuSMV session script file
	 */
	private IFile prepareScriptFile(IFile inputModelFile) {
		Logger.getLogger(getClass()).debug("preparing NuSMV session script file");
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
		Logger.getLogger(getClass()).debug("prepared NuSMV session script file");
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
		IPath counterexamplePath 	= outputFolder.getLocation().append(counterexamplesFileName).makeAbsolute();
		String stderrPathStr 		= stderrPath.toOSString();
		String stdoutPathStr 		= stdoutPath.toOSString();
		String inputModelPathStr 	= inputModelPath.toOSString();
		String counterexamplesPath 	= counterexamplePath.toOSString();
		commonPathsTable.put("stderr", stderrPathStr);
		commonPathsTable.put("stdout", stdoutPathStr);
		commonPathsTable.put("inputmodel", inputModelPathStr);
		commonPathsTable.put("counterexamples", counterexamplesPath);
	}

	/**
	 * Create NuSMV input with references to the file
	 * @param verificationUnit a verification unit
	 * @param modelFile		a handle to the input model file
	 * @param scriptFile	a handle to the session script file
	 * @return	an instance of the NuSMV input
	 */
	private NuSMVInput createNuSMVInputInstance(VerificationUnit verificationUnit, IFile modelFile,
			IFile scriptFile) {
		NuSMVInput modelCheckerInput = VerifiersFactory.eINSTANCE.createNuSMVInput();
		modelCheckerInput.setVerificationUnit(verificationUnit);
		modelCheckerInput.setModelFileName(modelFile.getName());
		modelCheckerInput.setModelFile(modelFile);
		modelCheckerInput.setSessionScriptFile(scriptFile);
		modelCheckerInput.setSessionScriptFileName(scriptFile.getName());
		return modelCheckerInput;
	}

	@Override
	public ModelCheckerOutput callExternal(ModelCheckerInput input) {
		Logger.getLogger(getClass()).info("calling external program (NuSMV)");
		assert input instanceof NuSMVInput;
		NuSMVInput nusmvInput = (NuSMVInput) input;
		String nusmvPathStr = getCommandPath();
		String[] commandArgs = getCommandLineArgs(nusmvInput);
		ProcessBuilder procBuilder = buildCommand(nusmvPathStr, commandArgs);
		runCommand(procBuilder);
		NuSMVOutput modelCheckerOutput = createNuSMVOutputInstance(nusmvInput);
		Logger.getLogger(getClass()).info("externeal program executed");
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
	private String[] getCommandLineArgs(NuSMVInput nusmvInput) {
		String[] commandArgs;
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
		String concatenatedCommandArgs = template.substitute(substitution);
		Logger.getLogger(getClass()).debug("concat flags:'" + concatenatedCommandArgs + "'");
		commandArgs = concatenatedCommandArgs.split(" ");
		Logger.getLogger(getClass()).debug("command args:" + Arrays.asList(commandArgs));
		return commandArgs;
	}
	
	/**
	 * @param commandPath 	the full path to the NuSMV executable
	 * @param commandArgs	the command-line arguments
	 * @return a process builder with redirected stdout and stderr streams
	 */
	private ProcessBuilder buildCommand(String commandPath, String[] commandArgs) {
		List<String> commandArgsList = Arrays.asList(commandArgs);
		List<String> command = new ArrayList<String>();
		command.add(commandPath);
		command.addAll(commandArgsList);
		Logger.getLogger(getClass()).debug("full command: '" + command + "'");
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
	 * 
	 * <p> Note: this will block the current thread until the external program ends.
	 * 
	 * <p> It checks if the progress monitor says the task should be canceled ({@code monitor.isCanceled()}) 
	 * and if so, forces the process to stop.
	 *  
	 * @param procBuilder the process builder for NuSMV
	 */
	private void runCommand(ProcessBuilder procBuilder) {
		CommandRunner runner = new CommandRunner(procBuilder);
		runner.start();
		try {
			synchronized (runner) {
				while (!runner.isFinished() && !progressMonitor.isCanceled()) {
					// I'm using the runner object as a monitor here
					// The timeout is necessary because progress monitors don't have callbacks for the cancel button
					// so it has to be polled periodically.
					runner.wait(progressMonitorPollingPeriod);	
				}
			}
			if (progressMonitor.isCanceled()) {
				runner.cancel();
			}
			runner.join(); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private class CommandRunner extends Thread {
		
		private boolean finished;
		private boolean interrupted;
		private ProcessBuilder procBuilder;
		private Process externalProcess;
		
		public CommandRunner(ProcessBuilder procBuilder) {
			this.procBuilder = procBuilder;
			this.finished = false;
			this.interrupted = false;
		}

		public synchronized boolean isFinished() {
			return finished;
		}

		/**
		 * Notify other threads that this one has finished. It should be invoked only by the terminating thread.
		 */
		private synchronized void finished() {
			this.finished = true;
			notifyAll();
			Logger.getLogger(getClass()).debug("command runner finished");
		}

		/**
		 * Tell the thread to stop. It kills the subprocess.
		 */
		public void cancel() {
			Logger.getLogger(getClass()).debug("command runner cancelled: destroying the external process");
			externalProcess.destroy();
			interrupted = true;
//			interrupt(); // Is this necessary? I don't think so: by destroying the process, the thread should wake up from the waitFor and end normally.
		}

		@Override
		public void run() {
			try {
				externalProcess = procBuilder.start();
				Logger.getLogger(getClass()).debug("process started: " + externalProcess);
				int exitCode = externalProcess.waitFor();
				if (interrupted) {
					Logger.getLogger(getClass()).debug("external process interrupted");
				}
				// TODO: check other exit codes
				switch (exitCode) {
				case 0:
					Logger.getLogger(getClass()).info("NuSMV finished normally");
					break;
				case -1: 
					Logger.getLogger(getClass()).error("NuSMV finished with error code -1 (syntax error)");
					break;
				case 255:
					Logger.getLogger(getClass()).error("NuSMV finished with error code 255 (other error)");
					break;
				default:
					Logger.getLogger(getClass()).error("NuSMV finished with error code " + exitCode);
				}
				Logger.getLogger(getClass()).debug("process finished: " + externalProcess.exitValue());
			} catch (IOException e) {
				Logger.getLogger(getClass()).error("There was an I/O error when calling NuSMV");
				e.printStackTrace();
			} catch (InterruptedException e) {
				Logger.getLogger(getClass()).info("NuSMV process interrupted");
			}
			finally {
				finished();
			}
		}

	}

	/**
	 * Create the output object with the appropriate files
	 * @param nusmvInput  	the instance of the NuSMV input object from which this output was generated
	 * @return an instance of the NuSMV output with the names and file handles for the output generated by NuSMV
	 */
	private NuSMVOutput createNuSMVOutputInstance(NuSMVInput nusmvInput) {
		NuSMVOutput modelCheckerOutput = VerifiersFactory.eINSTANCE.createNuSMVOutput();
		modelCheckerOutput.setInput(nusmvInput);
		nusmvInput.setOutput(modelCheckerOutput);
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
		Logger.getLogger(getClass()).info("processing output generated by NuSMV");
		assert output instanceof NuSMVOutput;
		NuSMVOutput nusmvOutput = (NuSMVOutput) output;
		IFile outputFile = nusmvOutput.getOutputFile();
		VerificationResult result = parseOutputFile(outputFile);
		nusmvOutput.setResult(result);
		return result;
	}
	
	/**
	 * Reads the output generated by NuSMV and tries to obtain the result. If it unable to do so, the result will be {@link Unknown}
	 * 
	 * <p> NuSMV gives its result by writing in standard output, or in the output file, a line with the following form:
	 * 
	 * <p> {@code -- specification ... is (true|false)}
	 * 
	 * <p> In the case of a negative answer, this line is followed by a counter-example trace.
	 * 
	 * <p> This method goes through the file looking for such result. If the input file fed to NuSMV contains several temporal logic
	 * specifications, it will produce one such result for each spec. However, in our case we always generate a NuSMV input file
	 * with only one PSL spec, therefore we check for this line only once.
	 * 
	 * <p>Note: this implementation reads the output line by line, so it may fail to find the result if the message sating it spans 
	 * multiple lines. As far as I can tell NuSMV always writes the result in one line, but there is no official documentation about
	 * the actual format of this output, and hence it might be subject to change in future versions of NuSMV. In that case, this
	 * method has to be adapted accordingly.
	 * 
	 * @param outputFile a handle to the file generated by NuSMV
	 * 
	 * @return either {@link Positive}, {@link Negative} (possibly with a {@link Counterexample}), or {@link Unknown} (possibly with a
	 * 		{@link Unknown#reason})
	 */
	private VerificationResult parseOutputFile(IFile outputFile) {
		Logger.getLogger(getClass()).debug("parsing NuSMV output file: " + outputFile.getName());
		VerificationResult result = null;
		Matcher matcher;
		String line = "";
		InputStream inputStream = null;
		BufferedReader reader = null;
		boolean foundResult = false;
		try {
			// We need to refresh the files because an external tool updated them
			inputFolder.refreshLocal(IResource.DEPTH_INFINITE, null);
			outputFolder.refreshLocal(IResource.DEPTH_INFINITE, null);
			inputStream = outputFile.getContents();
			reader = new BufferedReader(new InputStreamReader(inputStream));
			line = reader.readLine();
			while (line != null) {
				matcher = pattern.matcher(line);
				if (matcher.find()) {
					String r = matcher.group(2);  // In the REGEX for the line, group 0 is the whole line, group 1 is the spec and group 2 is either "true" or "false"
					Logger.getLogger(getClass()).info("result reported by NuSMV: " + r);
					if (r.equals("true")) {
						result = VerifiersFactory.eINSTANCE.createPositive();
					}
					else if (r.equals("false")) {
						result = VerifiersFactory.eINSTANCE.createNegative();
						// TODO: add ref to counter-example
					}
					else {
						result = VerifiersFactory.eINSTANCE.createUnknown();
						((Unknown) result).setReason("undecidable??");;  
					}
					foundResult = true;
					break;
				}
				line = reader.readLine();
			}
		} catch (CoreException e) {
			Logger.getLogger(getClass()).error("Unable to open NuSMV output file: " + outputFile.getName());
			e.printStackTrace();
		} catch (IOException e) {
			Logger.getLogger(getClass()).error("Error while reading NuSMV output file: " + outputFile.getName());
			e.printStackTrace();
		}
		finally {
			if (reader != null)
				try {
					reader.close();
				} catch (IOException e) {
					Logger.getLogger(getClass()).error("Unable to close input stream for " + outputFile.getName());
					e.printStackTrace();
				}
		}
		if (!foundResult) {
			Logger.getLogger(getClass()).error("no result fould in NuSMV output file (this is bizarre)");
			result = VerifiersFactory.eINSTANCE.createUnknown();
			((Unknown) result).setReason("result not found in output file");;
		}
		return result;
	}

	public void checkSpecValidity(Specification spec, String viewpointName, String componentName) {
		// Create a universal model from the specification
		NuSMVUniversalModel universalModel = VerifiersFactory.eINSTANCE.createNuSMVUniversalModel();
		universalModel.setContext(spec.getSpec());
		universalModel.synthesizeModelFromSpec();
		Logger.getLogger(getClass()).debug("NuSMV univ. model: [" + universalModel.text(null) + "]");
		// Create a verification unit with the universal model, the spec, the viewpoint and component
		VerificationUnit verificationUnit = VerifiersFactory.eINSTANCE.createVerificationUnit();
		verificationUnit.setModel(universalModel);
		verificationUnit.setSpecification(spec);
		Viewpoint viewpoint = getViewpointCollection().addViewpoint(viewpointName, null);
		verificationUnit.setViewpoint(viewpoint);
		Component component = getComponentCollection().addComponent(componentName, null);
		verificationUnit.setComponent(component);
		// Perform the actual verification
		VerificationResult result = checkVerificationUnit(verificationUnit);
		// Record the result
		results.recordResult(verificationUnit, result);
	}


	@Override
	public void checkSpecValidity(PSLSpec pslSpec, String viewpointName, String componentName, String label) {
		this.label = label + "_" + viewpointName + "_" + componentName;
		Logger.getLogger(getClass()).debug("checking validity of " + serializer.serialize(pslSpec) + " for " + label);
		// TODO: here we add the extra transformation of atomic propositions.
		NuSMVSpecification nusmvSpec = nusmvSpecFromPSLSpec(pslSpec);
		checkSpecValidity(nusmvSpec, viewpointName, componentName);
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
	
	/**
	 * @return the progressMonitor
	 */
	@Override
	public IProgressMonitor getProgressMonitor() {
		return progressMonitor;
	}

	/**
	 * @param progressMonitor the progressMonitor to set
	 */
	@Override
	public void setProgressMonitor(IProgressMonitor progressMonitor) {
		this.progressMonitor = progressMonitor;
	}

} //NuSMVModelCheckerImpl
