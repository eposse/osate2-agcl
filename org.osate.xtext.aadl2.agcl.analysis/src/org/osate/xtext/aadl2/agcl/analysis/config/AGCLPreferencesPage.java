/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.config;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.osate.xtext.aadl2.agcl.analysis.AGCLAnalysisPlugin;

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
		FileFieldEditor modelChecker = new FileFieldEditor(
				IPreferenceConstants.MODEL_CHECKER_PREFERENCE,
				"&Model-checker",
				true,
				parent);
		addField(modelChecker);	
		modelChecker.setPreferenceStore(store);
		IPropertyChangeListener modelCheckerListener =
			new IPropertyChangeListener() {
				public void propertyChange(PropertyChangeEvent event) {
					String newActiveModelChecker = (String) event.getNewValue();
					AGCLAnalysisPlugin.getDefault().activateModelChecker(newActiveModelChecker);
				}
			};
		store.addPropertyChangeListener(modelCheckerListener);
		StringFieldEditor flags = new StringFieldEditor(
				IPreferenceConstants.MODEL_CHECKER_FLAGS_PREFERENCE,
				"Model-checker &Flags",
				parent);
		addField(flags);
		flags.setPreferenceStore(store);
		FileFieldEditor modelCheckerScriptTemplate = new FileFieldEditor(
				IPreferenceConstants.MODEL_CHECKER_SCRIPT_TEMPLATE_PREFERENCE,
				"Model-checker &Script template",
				false,
				parent);
		addField(modelCheckerScriptTemplate);	
		modelCheckerScriptTemplate.setPreferenceStore(store);
		FileFieldEditor modelCheckerModelTemplate = new FileFieldEditor(
				IPreferenceConstants.MODEL_CHECKER_MODEL_TEMPLATE_PREFERENCE,
				"Model-checker &Model template",
				false,
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
	}

}
