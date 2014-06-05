/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.config;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.osate.xtext.aadl2.agcl.analysis.AGCLAnalysisPlugin;
import org.osate.xtext.aadl2.agcl.analysis.visitors.AnalysisResults;

/**
 * Preference page for the AGCL analysis plug-in.
 * @author eposse
 *
 */
public class AGCLPreferencesPage 
	extends FieldEditorPreferencePage 
	implements IWorkbenchPreferencePage {

	/**
	 * 
	 */
	public AGCLPreferencesPage() {
		super(FieldEditorPreferencePage.GRID);
		IPreferenceStore store = AGCLAnalysisPlugin.getDefault().getPreferenceStore();
		setPreferenceStore(store);	
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	@Override
	public void init(IWorkbench workbench) {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.FieldEditorPreferencePage#createFieldEditors()
	 */
	@Override
	protected void createFieldEditors() {
		Composite parent = getFieldEditorParent();
		IPreferenceStore store = getPreferenceStore();
		StringFieldEditor modelCheckerName = new StringFieldEditor(
				IPreferenceConstants.MODEL_CHECKER_NAME_PREFERENCE,
				"Model-checker &Name",
				parent);
		addField(modelCheckerName);
		modelCheckerName.setPreferenceStore(store);
		FileFieldEditor modelCheckerExecutable = new FileFieldEditor(
				IPreferenceConstants.MODEL_CHECKER_EXECUTABLE_PREFERENCE,
				"Model-checker &Executable",
				true,
				parent);
		addField(modelCheckerExecutable);	
		modelCheckerExecutable.setPreferenceStore(store);
		IPropertyChangeListener modelCheckerListener =
			new IPropertyChangeListener() {
				public void propertyChange(PropertyChangeEvent event) {
					String newActiveModelChecker = (String) event.getNewValue();
					// TODO: register new instance
					// TODO: change executable
//					AGCLAnalysisPlugin.getDefault().activateModelChecker(newActiveModelChecker);
				}
			};
		store.addPropertyChangeListener(modelCheckerListener);
		StringFieldEditor flags = new StringFieldEditor(
				IPreferenceConstants.MODEL_CHECKER_FLAGS_PREFERENCE,
				"Model-checker &Flags",
				parent);
		addField(flags);
		flags.setPreferenceStore(store);
//		FileFieldEditor modelCheckerScriptTemplate = new FileFieldEditor(
//		IPreferenceConstants.MODEL_CHECKER_SCRIPT_TEMPLATE_PREFERENCE,
//		"Model-checker &Script template",
//		false,
//		parent);
		StringFieldEditor modelCheckerScriptTemplate = new StringFieldEditor(
				IPreferenceConstants.MODEL_CHECKER_SCRIPT_TEMPLATE_PREFERENCE,
				"Model-checker &Script template",
				parent);
		addField(modelCheckerScriptTemplate);	
		modelCheckerScriptTemplate.setPreferenceStore(store);
//		FileFieldEditor modelCheckerModelTemplate = new FileFieldEditor(
//				IPreferenceConstants.MODEL_CHECKER_MODEL_TEMPLATE_PREFERENCE,
//				"Model-checker &Model template",
//				false,
//				parent);
		StringFieldEditor modelCheckerModelTemplate = new StringFieldEditor(
				IPreferenceConstants.MODEL_CHECKER_MODEL_TEMPLATE_PREFERENCE,
				"Model-checker &Model template",
				parent);
		addField(modelCheckerModelTemplate);	
		modelCheckerModelTemplate.setPreferenceStore(store);
		StringFieldEditor modelCheckerInputDir = new StringFieldEditor(
				IPreferenceConstants.MODEL_CHECKER_INPUT_DIR_PREFERENCE,
				"Model-checker &Input directory",
				parent);
		addField(modelCheckerInputDir);
		modelCheckerInputDir.setPreferenceStore(store);
		StringFieldEditor modelCheckerOutputDir = new StringFieldEditor(
				IPreferenceConstants.MODEL_CHECKER_OUTPUT_DIR_PREFERENCE,
				"Model-checker &Output directory",
				parent);
		addField(modelCheckerOutputDir);
		modelCheckerOutputDir.setPreferenceStore(store);
		StringFieldEditor analysisResultsDir = new StringFieldEditor(
				IPreferenceConstants.ANALYSIS_RESULTS_DIR_PREFERENCE,
				"Analysis &Results directory",
				parent);
		addField(analysisResultsDir);
		analysisResultsDir.setPreferenceStore(store);
		RadioGroupFieldEditor analysisResultsOption = new RadioGroupFieldEditor(
				IPreferenceConstants.ANALYSIS_RESULTS_OPTION_PREFERENCE, 
				"Analysis Results sorting option", 
				1,
				new String[][] {
					{"By viewpoint", AnalysisResults.BYVIEWPOINT},
					{"By component", AnalysisResults.BYCOMPONENT}
				},
	          parent);
        addField(analysisResultsOption);
        analysisResultsOption.setPreferenceStore(store);
	}

}
