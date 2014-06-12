package org.osate.xtext.aadl2.agcl.analysis.misc;



/**
 * @see {@link Settings}
 * @author Ernesto Posses
 *
 */
@Deprecated
public class DefaultSettings extends Settings {
	protected String projectDir = "";
	protected String analysisResultsDir = "analysis.results";
	protected String templatesDir = "resources/templates";
	protected String nusmvSessionScript = "session_script.nusmvrc";
	protected String nusmvSessionTemplate = "nusmv_session.template";
}