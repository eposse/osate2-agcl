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
