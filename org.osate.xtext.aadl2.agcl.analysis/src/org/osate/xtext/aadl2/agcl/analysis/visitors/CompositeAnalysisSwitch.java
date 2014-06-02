/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.visitors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.aadl2.modelsupport.errorreporting.AnalysisErrorReporterManager;
import org.osate.aadl2.modelsupport.modeltraversal.AadlProcessingSwitchWithProgress;

/**
 * This class implements the main algorithm for A/G analysis of composite capsules, i.e. thread group
 * implementations.
 *
 * <p> A thread group implementation must have an AGCL annex with a contract C with assumption A and
 * guarantee G, both PSL expressions. Each of thread sub-component K_i must also have a contract C_i in the
 * same viewpoint (i.e. with the same contract name), with assumption A_i and guarantee G_i.
 * 
 * <p>The analysis performed by this class consists of collecting the contracts C_i = (A_i,G_i) for all
 * subcomponents and build the "contract composition" C' = (A',G') where
 * 
 * <p>A' = ((G_2 & ... & G_n) -> A_1) & (G_1 & G_3 & ... & G_n) -> A_2) & ... & ((G_1 & ... & G_{n-1}) -> A_n)
 * <p>G' = G_1 & ... & G_n
 * 
 * <p>Here the assumption A' says that for each component K_i, its assumption A_i must be implied by the 
 * conjunction of the guarantees G_j of all other components (this can be optimized to include only components
 * actually connected to K_i). The composite guarantee G' is simply the conjunction of the guarantees of all
 * sub-components.
 * 
 * <p> Once we have this contract composition C', we check whether C' refines the contract C of the composite. 
 * This is done by checking that the following two implications are valid (i.e., true in all models):
 * 
 * <p>A -> A'
 * <p>G' -> G
 * 
 * <p> This is, the assumptions of the composite K must imply the composition of assumptions of the 
 * sub-components and the guarantees of the sub-components must imply the guarantee of the composite.
 * 
 * <p>These formulas are sent to a model-checker to verify if they are *valid* formulas, i.e., true in every
 * possible model (execution). Validity checking is performed by giving the model-checker a 
 * "universal model" that contains all possible executions. 
 * 
 * <p>Note: The default model-checker used is NuSMV, which has limited support for PSL: NuSMV translates PSL
 * formulas into LTL formulas, but since PSL is strictly more expressive than LTL, some PSL formulas may not
 * be checked or may give incorrect results.
 * 
 * @author eposse
 *
 */
public class CompositeAnalysisSwitch extends AadlProcessingSwitchWithProgress {

	/**
	 * @param pm
	 */
	public CompositeAnalysisSwitch(IProgressMonitor pm) {
		super(pm);
	}

	/* (non-Javadoc)
	 * @see org.osate.aadl2.modelsupport.modeltraversal.AadlProcessingSwitch#initSwitches()
	 */
	@Override
	protected void initSwitches() {
		// TODO Auto-generated method stub

	}

}
