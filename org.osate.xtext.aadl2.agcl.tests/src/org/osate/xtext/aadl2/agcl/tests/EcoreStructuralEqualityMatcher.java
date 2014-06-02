package org.osate.xtext.aadl2.agcl.tests;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class EcoreStructuralEqualityMatcher extends BaseMatcher<EObject> {

	private EObject objectToCompare;
	
	public EcoreStructuralEqualityMatcher(EObject objectToCompare) {
		super();
		this.objectToCompare = objectToCompare;
	}

	@Override
	public boolean matches(Object anotherObject) {
		if (anotherObject instanceof EObject) {
			return EcoreUtil.equals(objectToCompare, (EObject)anotherObject);
		}
		else {
			return false;
		}
	}

	@Override
	public void describeTo(Description description) {
		// TODO Auto-generated method stub
		
	}
	
	public static Matcher<EObject> structuralEqualTo(EObject operand) {
		return new EcoreStructuralEqualityMatcher(operand);
	}

}
