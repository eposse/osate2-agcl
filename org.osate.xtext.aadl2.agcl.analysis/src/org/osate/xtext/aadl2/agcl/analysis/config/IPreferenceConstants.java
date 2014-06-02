package org.osate.xtext.aadl2.agcl.analysis.config;

public interface IPreferenceConstants {

	public static final String MODEL_CHECKER_PREFERENCE 				= "model.checker";
	public static final String MODEL_CHECKER_FLAGS_PREFERENCE 			= "model.checker.flags";
	public static final String MODEL_CHECKER_SCRIPT_TEMPLATE_PREFERENCE = "model.checker.script.template";
	public static final String MODEL_CHECKER_MODEL_TEMPLATE_PREFERENCE  = "model.checker.model.template";
	public static final String MODEL_CHECKER_INPUT_DIR_PREFERENCE 		= "model.checker.input.dir";
	public static final String MODEL_CHECKER_OUTPUT_DIR_PREFERENCE 		= "model.checker.output.dir";
	
	public static final String DEFAULT_MODEL_CHECKER 					= "NuSMV";
	public static final String DEFAULT_MODEL_CHECKER_FLAGS 				= "-source ${script}";
	public static final String DEFAULT_MODEL_CHECKER_SCRIPT_TEMPLATE 	= "nusmv_script.template";
	public static final String DEFAULT_MODEL_CHECKER_MODEL_TEMPLATE 	= "nusmv_model.template";
	public static final String DEFAULT_MODEL_CHECKER_INPUT_DIR 			= "nusmv_input";
	public static final String DEFAULT_MODEL_CHECKER_OUTPUT_DIR 		= "nusmv_output";
	
}
