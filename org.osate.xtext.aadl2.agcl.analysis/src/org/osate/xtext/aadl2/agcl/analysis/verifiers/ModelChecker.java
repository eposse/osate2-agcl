/**
 * Copyright (c) 2014 Ernesto Posse
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 * @author Ernesto Posse
 * @version 0.1 
 */
package org.osate.xtext.aadl2.agcl.analysis.verifiers;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * The interface of model checkers.
 * 
 * <p>This interface is intended to be used in two possible ways:
 * 
 * <ol>
 * 		<li> verify a single {@link VerificationUnit} and return a {@link VerificationResult}
 * 		<li> verifiy of a collection of {@link VerificationUnit}s and collect all results in a 
 * 				{@link ResultsCollection}.
 * </ol>
 * 
 * Typical use:
 * 
 * <p><blockquote><pre>
 * Resource r = ...;
 * Model m1 = ...;
 * Specification s1 = ...;
 * Viewpoint v1 = ...;
 * Component c1 = ...;
 * VerificationUnit vc1 = VerifiersFactory.eINSTANCE.createVerificationUnit();
 * vc1.setModel(m1);
 * vc1.setSpecification(s1);
 * vc1.setViewpoint(v1);
 * vc1.setComponetn(c1);
 * // possibly more VerificationUnits
 * ModelChecker mc = SomeModelCheckerFactory.eINSTANCE.createSomeModelChecker(); // A concrete subclass of ModelCheckerImpl
 * mc.setUp(r);
 * // use case 1
 * VerificationResult result = mc.checkVerificationUnit(vc);
 * // ... or 
 * // use case 2
 * mc.addVerificationUnit(vc1);
 * mc.addVerificationUnit(vc2);
 * // ...
 * mv.checkAll();
 * ResultsCollection rc = mc.getResultsCollection();
 * </pre></blockquote><p>
 * 
 * <p> The {@link #setUp} method records the {@link Resource} context and creates a {@link ResultsCollection} to
 * record all results when invoked with {@link #checkAll()}.
 * 
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#getResourceContext <em>Resource Context</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#getResults <em>Results</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#getVerificationUnits <em>Verification Units</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#getViewpointCollection <em>Viewpoint Collection</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#getComponentCollection <em>Component Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getModelChecker()
 * @model abstract="true"
 * @generated
 */
public interface ModelChecker extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Context</em>' attribute.
	 * @see #setResourceContext(Resource)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getModelChecker_ResourceContext()
	 * @model transient="true"
	 * @generated
	 */
	Resource getResourceContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setUp(Resource resource);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	VerificationUnit makeVerificationUnit(Model model, Specification spec, Viewpoint viewpoint, Component component);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	VerificationUnit makeVerificationUnit(Specification spec, Viewpoint viewpoint, Component component);

	UniversalModel makeUniversalModelFromSpec(Specification spec); 

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	VerificationResult checkVerificationUnit(VerificationUnit verificationUnit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	ModelCheckerInput prepareInput(VerificationUnit verificationUnit);

	/**
	 * <!-- begin-user-doc -->
	 * Invokes an external model-checker by performing a system call.
	 * 
	 * <p> This method must be implemented by subclasses.
	 * 
	 * @param input   an object encapsulating the input expected by the model-checker 
	 * 					(e.g., containing references to input files provided to the model-checker)
	 * @return an object encapsulating the results produced by the model-checker
	 * 					(e.g., containing references to files produced by the model-checker) 
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	ModelCheckerOutput callExternal(ModelCheckerInput input);

	/**
	 * <!-- begin-user-doc -->
	 * Takes an object containing the information generated by the external model-checker and turns it into
	 * a {@link VerificationResult} object.
	 * 
	 * <p>This method must be implemented by subclasses.
	 * 
	 * @param output	an object encapsulating the output produced by the external model-checker
	 * @return a {@link VerificationResult} object
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	VerificationResult processOutput(ModelCheckerOutput output);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addVerificationUnit(VerificationUnit verificationUnit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeVerificationUnit(String verificationUnitName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	VerificationUnit getVerificationUnit(String verificationUnitName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void checkAll();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#getResourceContext <em>Resource Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Context</em>' attribute.
	 * @see #getResourceContext()
	 * @generated
	 */
	void setResourceContext(Resource value);

	/**
	 * Returns the value of the '<em><b>Results</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Results</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' reference.
	 * @see #setResults(ResultsCollection)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getModelChecker_Results()
	 * @model
	 * @generated
	 */
	ResultsCollection getResults();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#getResults <em>Results</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Results</em>' reference.
	 * @see #getResults()
	 * @generated
	 */
	void setResults(ResultsCollection value);

	/**
	 * Returns the value of the '<em><b>Verification Units</b></em>' reference list.
	 * The list contents are of type {@link org.osate.xtext.aadl2.agcl.analysis.verifiers.VerificationUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verification Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification Units</em>' reference list.
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getModelChecker_VerificationUnits()
	 * @model
	 * @generated
	 */
	EList<VerificationUnit> getVerificationUnits();

	/**
	 * Returns the value of the '<em><b>Viewpoint Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Viewpoint Collection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewpoint Collection</em>' reference.
	 * @see #setViewpointCollection(ViewpointCollection)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getModelChecker_ViewpointCollection()
	 * @model
	 * @generated
	 */
	ViewpointCollection getViewpointCollection();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#getViewpointCollection <em>Viewpoint Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viewpoint Collection</em>' reference.
	 * @see #getViewpointCollection()
	 * @generated
	 */
	void setViewpointCollection(ViewpointCollection value);

	/**
	 * Returns the value of the '<em><b>Component Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Collection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Collection</em>' reference.
	 * @see #setComponentCollection(ComponentCollection)
	 * @see org.osate.xtext.aadl2.agcl.analysis.verifiers.VerifiersPackage#getModelChecker_ComponentCollection()
	 * @model
	 * @generated
	 */
	ComponentCollection getComponentCollection();

	/**
	 * Sets the value of the '{@link org.osate.xtext.aadl2.agcl.analysis.verifiers.ModelChecker#getComponentCollection <em>Component Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Collection</em>' reference.
	 * @see #getComponentCollection()
	 * @generated
	 */
	void setComponentCollection(ComponentCollection value);

	IFolder getInputFolder();
	
	IFolder getOutputFolder();
	
	void setInputFolder(IFolder inputFolder);
	
	void setOutputFolder(IFolder outputFolder);

	IProgressMonitor getProgressMonitor();

	void setProgressMonitor(IProgressMonitor progressMonitor);

} // ModelChecker
