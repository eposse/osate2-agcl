/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.visitors;

import org.osate.aadl2.Element;
import org.osate.aadl2.modelsupport.errorreporting.AnalysisErrorReporterManager;
import org.osate.aadl2.modelsupport.modeltraversal.ForAllElement;
import org.osate.xtext.aadl2.agcl.agcl.util.AgclSwitch;

/**
 * @author eposse
 *
 */
public class AgclProcessingSwitch<T> extends ForAllElement {

	protected AgclSwitch<T> agclSwitch;
	
	/**
	 * @param defTraversal
	 * @param errMgr
	 */
	public AgclProcessingSwitch(int defTraversal,
			AnalysisErrorReporterManager errMgr) {
		super(defTraversal, errMgr);
		initSwitch();
	}

	/**
	 * @param defTraversal
	 */
	public AgclProcessingSwitch(int defTraversal) {
		this(defTraversal, AnalysisErrorReporterManager.NULL_ERROR_MANANGER);
	}

	/**
	 * @param errMgr
	 */
	public AgclProcessingSwitch(AnalysisErrorReporterManager errMgr) {
		this(DEFAULT_DEFAULT_TRAVERSAL, errMgr);
	}

	/**
	 * 
	 */
	public AgclProcessingSwitch() {
		this(AnalysisErrorReporterManager.NULL_ERROR_MANANGER);
	}
	
	public void initSwitch() {
		agclSwitch = new AgclSwitch<T>() {};
	}

	public final void process(final Element element) {
		agclSwitch.doSwitch(element);
	}
}
