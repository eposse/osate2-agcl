/**
 * This package provides actions that are executed when the user clicks on one of the plug-in buttons or menu options.
 * 
 * <p> All concrete actions are classes in the subpackage {@link org.osate.xtext.aadl2.agcl.analysis.actions.concrete} and
 * they inherit from the base class {@link CommonAGCLAction} which provides the skeleton for each of the actions. 
 * This follows the <a href="http://en.wikipedia.org/wiki/Template_method_pattern">template method</a> design pattern.
 * 
 * <p>Each action performs some setup, such as finding the appropriate resource locations, initializing required
 * resources, the model-checker, and the results table, and then delegates the execution of the analysis to a visitor
 * (Ecore switch) class in the {@link org.osate.xtext.aadl2.agcl.analysis.visitors} package.
 * 
 * @author Ernesto Posse
 *
 */
package org.osate.xtext.aadl2.agcl.analysis.actions;