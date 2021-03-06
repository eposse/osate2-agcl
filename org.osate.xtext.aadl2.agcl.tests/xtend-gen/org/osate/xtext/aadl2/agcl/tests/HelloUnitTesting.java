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

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.osate.xtext.aadl2.agcl.AGCLInjectorProvider;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexLibrary;
import org.osate.xtext.aadl2.agcl.agcl.AGCLGrammarRoot;
import org.osate.xtext.aadl2.agcl.agcl.AGCLViewpoint;

@InjectWith(AGCLInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class HelloUnitTesting {
  @Inject
  private ParseHelper<AGCLGrammarRoot> parser;
  
  @Test
  public void parseSimpleAGCLLibrary() {
    try {
      InputOutput.<String>println("AGCLAnnexLibrary");
      final String libText = "\n            library \n                viewpoint v1*;\n                viewpoint v2\n        ";
      final AGCLGrammarRoot libAST = this.parser.parse(libText);
      AGCLAnnexLibrary _lib = libAST.getLib();
      final EList<AGCLViewpoint> viewpoints = _lib.getViewpoints();
      InputOutput.<AGCLGrammarRoot>println(libAST);
      InputOutput.<EList<AGCLViewpoint>>println(viewpoints);
      AGCLViewpoint _get = viewpoints.get(0);
      String _name = _get.getName();
      InputOutput.<String>println(_name);
      AGCLViewpoint _get_1 = viewpoints.get(1);
      String _name_1 = _get_1.getName();
      InputOutput.<String>println(_name_1);
      AGCLViewpoint _get_2 = viewpoints.get(0);
      String _name_2 = _get_2.getName();
      Assert.assertEquals("v1", _name_2);
      AGCLViewpoint _get_3 = viewpoints.get(1);
      String _name_3 = _get_3.getName();
      Assert.assertEquals("v2", _name_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
