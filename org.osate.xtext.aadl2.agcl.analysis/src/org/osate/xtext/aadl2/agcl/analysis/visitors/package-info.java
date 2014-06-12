/**
 * This package contains visitors (Ecore switches) for processing the AADL models and the AGCL clauses.
 * 
 * <p>It provides the link between actions in the {@link org.osate.xtext.aadl2.agcl.analysis.actions} package and
 * the corresponding algorithms in the {@link org.osate.xtext.aadl2.agcl.analysis.actions}.
 * 
 * <p>When an action is invoked, the visitors in this package, traverse the AADL model, visiting the relevant
 * AGCL clauses from which the visitor extracts the relevant model and clause information, and invokes the 
 * corresponding analysis algorithm. 
 * 
 * <p>This core functionality is defined in a common base class {@link org.osate.xtext.aadl2.agcl.analysis.visitors.CommonAGCLAnalysisSwitch} which finds general
 * {@link org.osate.aadl2.AnnexLibrary} and {@link org.osate.aadl2.AnnexSubclause} nodes and delegates processing to the concrete visitors to process
 * {@link org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexLibrary} and {@link org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause} nodes. 
 * 
 * <p>It also provides other useful visitors for processing AGCL clauses and PSL specifications.
 * 
 * @author Ernesto Posse
 *
 */
package org.osate.xtext.aadl2.agcl.analysis.visitors;