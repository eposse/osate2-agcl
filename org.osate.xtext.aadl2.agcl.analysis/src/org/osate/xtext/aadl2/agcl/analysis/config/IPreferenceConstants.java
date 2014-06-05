package org.osate.xtext.aadl2.agcl.analysis.config;

import org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersFactory;
import org.osate.xtext.aadl2.agcl.analysis.visitors.AnalysisResults;

public interface IPreferenceConstants {

	public static final String MODEL_CHECKER_NAME_PREFERENCE 			= "model.checker.name";
	public static final String MODEL_CHECKER_EXECUTABLE_PREFERENCE 		= "model.checker.executable";
	public static final String MODEL_CHECKER_INSTANCE_PREFERENCE		= "model.checker.instance";
	public static final String MODEL_CHECKER_FLAGS_PREFERENCE 			= "model.checker.flags";
	public static final String MODEL_CHECKER_SCRIPT_TEMPLATE_PREFERENCE = "model.checker.script.template";
	public static final String MODEL_CHECKER_MODEL_TEMPLATE_PREFERENCE  = "model.checker.model.template";
	public static final String MODEL_CHECKER_INPUT_DIR_PREFERENCE 		= "model.checker.input.dir";
	public static final String MODEL_CHECKER_OUTPUT_DIR_PREFERENCE 		= "model.checker.output.dir";
	public static final String ANALYSIS_RESULTS_DIR_PREFERENCE 		    = "analysis.results.dir";
	public static final String ANALYSIS_RESULTS_OPTION_PREFERENCE 		= "analysis.results.option";
	
	public static final String DEFAULT_MODEL_CHECKER_NAME				= "NuSMV";
	public static final String DEFAULT_MODEL_CHECKER_EXECUTABLE			= "NuSMV";
	public static final ModelChecker DEFAULT_MODEL_CHECKER_INSTANCE		= VerifiersFactory.eINSTANCE.createNuSMVModelChecker();
	public static final String DEFAULT_MODEL_CHECKER_FLAGS 				= "-source ${script}";
	public static final String DEFAULT_MODEL_CHECKER_SCRIPT_TEMPLATE 	= "nusmv_script.template";
	public static final String DEFAULT_MODEL_CHECKER_MODEL_TEMPLATE 	= "nusmv_model.template";
	public static final String DEFAULT_MODEL_CHECKER_INPUT_DIR 			= "agcl/analysis/nusmv_input";
	public static final String DEFAULT_MODEL_CHECKER_OUTPUT_DIR 		= "agcl/analysis/nusmv_output";
	public static final String DEFAULT_ANALYSIS_RESULTS_DIR				= "agcl/analysis/results";
	public static final String DEFAULT_ANALYSIS_RESULTS_OPTION			= AnalysisResults.BYVIEWPOINT;
	
}
