package org.osate.xtext.aadl2.agcl.analysis.visitors;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.ThreadImplementation;
import org.osate.aadl2.ThreadType;
import org.osate.aadl2.modelsupport.errorreporting.AnalysisErrorReporterManager;
import org.osate.aadl2.modelsupport.modeltraversal.AadlProcessingSwitchWithProgress;
import org.osate.aadl2.util.Aadl2Switch;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexLibrary;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause;
import org.osate.xtext.aadl2.agcl.agcl.AGCLBehaviour;
import org.osate.xtext.aadl2.agcl.agcl.AGCLContract;
import org.osate.xtext.aadl2.agcl.agcl.AGCLEnforce;
import org.osate.xtext.aadl2.agcl.agcl.AGCLViewpoint;
import org.osate.xtext.aadl2.agcl.agcl.impl.AGCLAnnexSubclauseImpl;
import org.osate.xtext.aadl2.agcl.agcl.util.AgclSwitch;
import org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationResult;

/**
 * This class implements the main algorithm for A/G analysis of atomic capsules, i.e. thread 
 * implementations.
 *  
 * <p>A thread implementation must have an AGCL annex with a 'behaviour' clause B and a 'contract' clause C with 
 * assumption A and guarantee G, all given as PSL expressions. 
 * 
 * <p> The analysis performed by this class consists of verifying that the behaviour B satisfies the 
 * contract C. This is done by constructing the formula
 * 
 * <p>
 *      B & A -> G
 * 
 * <p>(B and A imply G). Then, this formula is sent to a model-checker to verify if it is a *valid* formula,
 * i.e., true in every possible model (execution). Validity checking is performed by giving the model-checker
 * a "universal model" that contains all possible executions. 
 * 
 * <p>Note: The default model-checker used is NuSMV, which has limited support for PSL: NuSMV translates PSL
 * formulas into LTL formulas, but since PSL is strictly more expressive than LTL, some PSL formulas may not
 * be checked or may give incorrect results.
 * 
 * @author Ernesto Posse
 *
 */
public class AtomicAnalysisSwitch extends AadlProcessingSwitchWithProgress {

	private AgclSwitch<Void> agclSwitch;
	private ViewpointContext viewpointContext;
	private AnalysisResults analysisResults;

	/**
	 * @param pm				a progress monitor
	 * @param viewpointContext	a viewpoint context specifying which viewpoints to verify
	 * @param analysisResults	an object to record the analysis results
	 */
	public AtomicAnalysisSwitch(IProgressMonitor pm, ViewpointContext viewpointContext, AnalysisResults analysisResults) {
		super(pm);
		this.viewpointContext = viewpointContext;
		this.analysisResults = analysisResults;
	}

	@Override
	protected void initSwitches() {
		agclSwitch = new AgclSwitch<Void>() {
			public Void caseAGCLAnnexSubclause(AGCLAnnexSubclause obj) {
				monitor.subTask("AGCLAnnexSubclause" + obj.getName());
				Classifier component = obj.getContainingClassifier();
				String componentName = component.getName();
				Logger.getLogger(getClass()).info("processing AGCL annex subclause for '" + componentName + "'");
				// Get the component's behaviour specified in this annex sub-clause
				AGCLBehaviour behaviour = obj.getBehaviour();
				// Go through all contracts in this annex  sub-clause...
				for (AGCLContract contract : obj.getContracts()) {
					String viewpointName = contract.getName();
					if (viewpointContext.containsViewpointToVerify(viewpointName)) {
						// We verify only the contracts which belong to a viewpoint maked for verification 
						VerificationResult result = checkBehaviourWRTContract(behaviour, contract);
						analysisResults.record(viewpointName, componentName, result);
					}
				}
				monitor.worked(1);
				return null;
			}
		};
		aadl2Switch = new Aadl2Switch<String>() {
			public String caseThreadImplementation(ThreadImplementation obj) {
				monitor.subTask("ThreadImplementation" + obj.getName());
				Logger.getLogger(getClass()).info("processing thread implementation '" + obj.getName() + "'");
				// We look for an *owned* (non-inherited) AGCL annex for this thread implementation.
				// We don't look for inherited annexes because that is a separate analysis.
				EList<AnnexSubclause> annexes = obj.getOwnedAnnexSubclauses();
				AGCLAnnexSubclause agclAnnexSubclause = null;
				for (AnnexSubclause annexSubclause : annexes) {
					if (annexSubclause.getName().equals("AGCL")) {
						agclAnnexSubclause = (AGCLAnnexSubclause) annexSubclause;
						break; // We chose the first annex sub-clause named AGCL; others are ignored.
					}
				}
				// We process the thread implementation's AGCL annex. 
				// If no AGCL annex was found, we ignore this thread implementation.
				if (agclAnnexSubclause != null) {
					agclSwitch.doSwitch(agclAnnexSubclause);  // Could be optimized by invoking caseAGCLAnnexSubclause directly
				}
				monitor.worked(1);
				return obj.toString();
			}
		};
	}
	
	/**
	 * Checks whether a behaviour B, given as a temporal-logic (PSL) specification, satisfies the given
	 * contract C with assumption A and guarantee G (also temporal-logic specifications).
	 * 
	 * <p> This verification is realized by verifying that the formula:
	 * 
	 * <p> B & A -> G
	 * 
	 * <p>is a *valid* formula in the temporal-logic, i.e., that it holds for all models. Validity
	 * checking is performed by model-checking the formula for a <em>universal model</em>, a model that
	 * contains all possible behaviours. 
	 * 
	 * @param behaviour 	a temporal-logic specification of the behaviour of a thread implementation
	 * @param contract		an assume/guarantee contract 
	 * @return a {@link VerificationResult} which is {@link Positive} if the behaviour satisfies the
	 * 			contract, and {@link Negative} otherwise.
	 */
	public VerificationResult checkBehaviourWRTContract(AGCLBehaviour behaviour, AGCLContract contract) {
		return null;
		
	}

}
