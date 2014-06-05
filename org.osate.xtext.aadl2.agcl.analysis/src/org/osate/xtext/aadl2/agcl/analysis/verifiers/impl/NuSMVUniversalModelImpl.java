/**
 */
package org.osate.xtext.aadl2.agcl.analysis.verifiers.impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.serializer.ISerializer;
import org.osate.xtext.aadl2.agcl.agcl.AtomicProp;
import org.osate.xtext.aadl2.agcl.agcl.PSLSpec;
import org.osate.xtext.aadl2.agcl.analysis.AGCLAnalysisPlugin;
import org.osate.xtext.aadl2.agcl.analysis.config.IPreferenceConstants;
import org.osate.xtext.aadl2.agcl.analysis.util.AGCLSyntaxUtil;
import org.osate.xtext.aadl2.agcl.analysis.util.Template;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.NuSMVUniversalModel;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nu SMV Universal Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NuSMVUniversalModelImpl extends NuSMVModelImpl implements NuSMVUniversalModel {
	
	private ISerializer serializer = AGCLAnalysisPlugin.getDefault().getSerializer();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NuSMVUniversalModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String text(Object args) {
		String varsText  = variablesText();
		String initText  = initText();
		String transText = transText(); 
		String specText = "true";

		Template template = AGCLAnalysisPlugin.getDefault()
				.getTemplateManager()
				.get(IPreferenceConstants.MODEL_CHECKER_MODEL_TEMPLATE_PREFERENCE);
		Logger.getLogger(getClass()).debug("template = \n" + template.getPattern());
		Map<String,Object> substitution = new HashMap<String,Object>();
		substitution.put("variables", varsText);
		substitution.put("init", initText);
		substitution.put("trans", transText);
		substitution.put("logic", "PSL");
		substitution.put("spec", specText);
		substitution.put("fairness", "true");
		String result = template.substitute(substitution);
		return result;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VerifiersPackage.Literals.NU_SMV_UNIVERSAL_MODEL;
	}

	@Override
	public void synthesizeModelFromSpec() {
		Logger.getLogger(getClass()).debug("synthesizing model from spec");
		List<String> variables = new LinkedList<String>();
		assert getContext() instanceof PSLSpec;
		PSLSpec spec = (PSLSpec) getContext();
		Set<AtomicProp> aps = AGCLSyntaxUtil.getAtomicPropositions(spec.getExpr());
		for (AtomicProp ap : aps) {
			variables.add(serializer.serialize(ap));
		}
		setModel(variables);
		setVars(variables);
		setInit("");
		setTrans("");
	}

} //NuSMVUniversalModelImpl
