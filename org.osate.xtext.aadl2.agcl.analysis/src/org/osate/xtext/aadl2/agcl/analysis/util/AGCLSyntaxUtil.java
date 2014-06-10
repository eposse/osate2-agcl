/**
 * 
 */
package org.osate.xtext.aadl2.agcl.analysis.util;

import java.util.Map.Entry;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.serializer.ISerializer;
import org.osate.xtext.aadl2.agcl.agcl.AtomicProposition;
import org.osate.xtext.aadl2.agcl.agcl.PSLExpression;
import org.osate.xtext.aadl2.agcl.agcl.PSLSpec;
import org.osate.xtext.aadl2.agcl.analysis.AGCLAnalysisPlugin;
import org.osate.xtext.aadl2.agcl.analysis.visitors.PSLASTPrinter;
import org.osate.xtext.aadl2.agcl.analysis.visitors.PSLDeepCopyerExplicitSwitch;
import org.osate.xtext.aadl2.agcl.analysis.visitors.concrete.PSLAtomicPropositionsSwitch;

/**
 * Helper class with useful methods for manipulating AGCL syntax
 * 
 * @author Ernesto Posse
 *
 */
public class AGCLSyntaxUtil {
	
	public static final SaveOptions serializerOptions = SaveOptions.newBuilder().format().noValidation().getOptions();
	public static ISerializer serializer = AGCLAnalysisPlugin.getDefault().getSerializer();
	
	/**
	 * @param expr  a PSL expression
	 * @return a deep copy of the expression
	 */
	public static PSLExpression deepCopy(PSLExpression expr) {
		PSLDeepCopyerExplicitSwitch copier = new PSLDeepCopyerExplicitSwitch();
		return (PSLExpression) copier.doSwitch(expr);
	}
	
//	/**
//	 * In PSL syntax, a 'PSL Expression' may have the form 
//	 * 
//	 * <ol>
//	 *   <li> bexpr
//	 *   <li> bexpr1 -> bexpr2
//	 * </ol>
//	 * 
//	 * where each 'bexpr' is a 'PSL Boolean Expression'.
//	 * 
//	 * <p>This method takes an expression, and if it is the first form, it returns the bexpr, and if it is of the 
//	 * second form, it returns the equivalen boolean expression of the form "not bexpr1 or bexpr2".
//	 * @param expr
//	 * @return
//	 */
//	public static PSLBooleanExpression getBooleanExpressionFromExpression(PSLExpression expr) {
//		PSLExpression exprCopy = deepCopy(expr);
//		PSLBooleanExpression newBoolExpr = null;
//		if (expr.isImplication()) {
//			// Transform "b1 -> b2" into "not b1 or b2" 
//			PSLDisjunction newDisj = AgclFactory.eINSTANCE.createPSLDisjunction();
//			PSLConjunction newDisjLeft = AgclFactory.eINSTANCE.createPSLConjunction();
//			PSLNegation negCond = AgclFactory.eINSTANCE.createPSLNegation();
//			negCond.setNegated(exprCopy.getCondition());
//			newDisjLeft.getFactors().add(negCond);
//			// newDisjLeft = 'not b1'
//			PSLConjunction newDisjRight = AgclFactory.eINSTANCE.createPSLConjunction();
//			newDisjRight.getFactors().add(exprCopy.getConclusion());
//			// newDisjRight = 'b2'
//			newDisj.getTerms().add(newDisjLeft);
//			newDisj.getTerms().add(newDisjRight);
//			// newDisj = '(not b1) or b2'
//			newBoolExpr = newDisj;
//		}
//		else if (expr.isBiconditional()) {
//			// TODO: Transform "b1 <-> b2" into "(b1 and b2) or (not b1 and not b2)"
//		}
//		else {
//			newBoolExpr = exprCopy.getCondition();
//		}
//		return newBoolExpr;
//	}

	/**
	 * This method collects the set of all atomic propositions present in a PSL formula.
	 * 
	 * <p> It uses the {@link PSLAtomicPropositionsSwitch} visitor which returns, for each {@link AtomicProposition}
	 * node in the AST, a singleton set with the node itself. This method collects all the results and returns the
	 * union of those singleton sets.
	 * 
	 * @param expr   a PSL expression
	 * @return the set of atomic propositions of a PSL formula
	 */
	public static Set<AtomicProposition> getAtomicPropositions(PSLExpression expr) {
		Set<AtomicProposition> combinedResult = SetFactory.getNewSet();
		PSLAtomicPropositionsSwitch aps = new PSLAtomicPropositionsSwitch();
		aps.processPreOrderAll(expr);
		EMap<EObject, Set<AtomicProposition>> results = aps.getResults();
		for (Entry<EObject, Set<AtomicProposition>> entry : results.entrySet()) {
			EObject node = entry.getKey();
			Set<AtomicProposition> nodeResult = entry.getValue();
			Set<String> nodeResultStringsSet = SetFactory.getNewSet();
			if (nodeResult != null) {
				for (AtomicProposition ap : nodeResult) {
					combinedResult.add(ap);
					nodeResultStringsSet.add(serializer.serialize(ap));
				}
			}
			Logger.getLogger(AGCLSyntaxUtil.class).debug("the atomic propositions of node: " + node + " (" + serializer.serialize(node) + ") are " + nodeResultStringsSet);
		};
		return combinedResult;
	}

	public static String astStr(PSLExpression expr) {
		return pslAstPrinter.doSwitch(expr);
	}

	public static String astStr(PSLSpec spec) {
		return pslAstPrinter.doSwitch(spec);
	}

	private static PSLASTPrinter pslAstPrinter = new PSLASTPrinter();
}
