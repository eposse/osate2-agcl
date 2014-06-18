/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.algorithms.concrete;

import java.util.ArrayList;
import java.util.List;

import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.ComponentImplementation;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAssumption;
import org.osate.xtext.aadl2.agcl.agcl.AGCLContract;
import org.osate.xtext.aadl2.agcl.agcl.AGCLGuarantee;
import org.osate.xtext.aadl2.agcl.agcl.AgclFactory;
import org.osate.xtext.aadl2.agcl.agcl.PSLSpec;
import org.osate.xtext.aadl2.agcl.analysis.algorithms.AnalysisAlgorithmBase;
import org.osate.xtext.aadl2.agcl.analysis.util.AGCLSyntaxUtil;
import org.osate.xtext.aadl2.agcl.analysis.visitors.ViewpointContext;

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
 * @author Ernesto Posse
 *
 */
public class CompositeAnalysis extends AnalysisAlgorithmBase {

	/**
	 * @param viewpointContext
	 */
	public CompositeAnalysis(ViewpointContext viewpointContext) {
		super(viewpointContext);
	}

	public AGCLContract makeContractComposition(ComponentImplementation composite, List<ComponentClassifier> subcomponents, List<AGCLContract> contracts) {
		assert subcomponents.size() == contracts.size();
		// Gather all assumptions and guarantees
		List<PSLSpec> assumptionSpecs = new ArrayList<PSLSpec>();
		List<PSLSpec> guaranteeSpecs = new ArrayList<PSLSpec>();
		for (int i = 0; i < subcomponents.size(); i++) {
			ComponentClassifier subcomponent = subcomponents.get(i);
			AGCLContract contract = contracts.get(i);
			AGCLAssumption assumption = contract.getAssumption();
			AGCLGuarantee guarantee = contract.getGuarantee();
			PSLSpec assumptionSpec = AGCLSyntaxUtil.deepCopy(assumption.getSpec());
			PSLSpec guaranteeSpec = AGCLSyntaxUtil.deepCopy(guarantee.getSpec());
			PSLSpec adjustedAssumptionSpec = adjustAssumption(subcomponent, composite, assumptionSpec);
			PSLSpec adjustedGuaranteeSpec = adjustGuarantee(subcomponent, composite, guaranteeSpec);
			
			assumptionSpecs.add(adjustedAssumptionSpec);
			guaranteeSpecs.add(adjustedGuaranteeSpec);
		}
		
		// Build new guarantee
		PSLSpec guaranteeConjunction = makeNaryConjunction(guaranteeSpecs);
		PSLSpec compositeGuaranteeSpec = guaranteeConjunction;
		
		// Build new assumption
		List<PSLSpec> assumptionImplications = new ArrayList<PSLSpec>();
		for (int i = 0; i < assumptionSpecs.size(); i++) {
			PSLSpec assumptionSpec = AGCLSyntaxUtil.deepCopy(assumptionSpecs.get(i));
			
			// Get the guarantees of all other components
			List<PSLSpec> otherComponentsGuaranteeSpecs = new ArrayList<PSLSpec>();
			int j = 0;
			for (PSLSpec guarantee : guaranteeSpecs) {
				if (j != i) {
					PSLSpec otherGuarantee = AGCLSyntaxUtil.deepCopy(guarantee);
					otherComponentsGuaranteeSpecs.add(otherGuarantee);
				}
				j++;
			}
			PSLSpec otherGuaranteesConjunction = makeNaryConjunction(otherComponentsGuaranteeSpecs);
			
			// The conjunction of the guarantees of all other components must imply this assumption
			PSLSpec assumptionImplication = makeImplication(otherGuaranteesConjunction, assumptionSpec);
			assumptionImplications.add(assumptionImplication);
		}
		PSLSpec compositeAssumptionSpec = makeNaryConjunction(assumptionImplications);
		
		AGCLAssumption newAssumption = AgclFactory.eINSTANCE.createAGCLAssumption();
		newAssumption.setSpec(compositeAssumptionSpec);
		AGCLGuarantee newGuarantee = AgclFactory.eINSTANCE.createAGCLGuarantee();
		newGuarantee.setSpec(compositeGuaranteeSpec);
		
		AGCLContract newContract = AgclFactory.eINSTANCE.createAGCLContract();
		newContract.setAssumption(newAssumption);
		newContract.setGuarantee(newGuarantee);
		
		return newContract;
	}
	
	public void checkSubcontractsSatisfyCompositeContainerContract(
			List<ComponentClassifier> subcomponents, ComponentImplementation component,
			List<AGCLContract> contracts, AGCLContract containerContract, 
			String viewpointName, String componentName) {
		AGCLContract contractComposition = makeContractComposition(component, subcomponents, contracts);
		checkContractRefinement(contractComposition, containerContract, viewpointName, componentName);
	}
}
