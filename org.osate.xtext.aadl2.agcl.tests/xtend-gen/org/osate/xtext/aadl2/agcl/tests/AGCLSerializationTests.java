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
import com.google.inject.Injector;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.osate.xtext.aadl2.agcl.AGCLInjectorProvider;
import org.osate.xtext.aadl2.agcl.AGCLStandaloneSetup;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause;
import org.osate.xtext.aadl2.agcl.agcl.AGCLContract;
import org.osate.xtext.aadl2.agcl.agcl.AGCLGrammarRoot;
import org.osate.xtext.aadl2.agcl.tests.EcoreStructuralEqualityMatcher;

@InjectWith(AGCLInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class AGCLSerializationTests {
  @Inject
  private ParseHelper<AGCLGrammarRoot> parser;
  
  private ISerializer serializer;
  
  @Before
  public void setUp() {
    InputOutput.<String>println("* AGCLSerializationTests.setUp");
    AGCLStandaloneSetup _aGCLStandaloneSetup = new AGCLStandaloneSetup();
    final Injector injector = _aGCLStandaloneSetup.createInjectorAndDoEMFRegistration();
    Serializer _instance = injector.<Serializer>getInstance(Serializer.class);
    this.serializer = _instance;
  }
  
  @Test
  public void serializeAnnexLibrary() {
    try {
      InputOutput.<String>println("* AGCLAnnexLibrary");
      final String libSrc = "\n            library \n                viewpoint v1 ;\n                viewpoint v2 ; \n        ";
      InputOutput.<String>println((("lib src: \"" + libSrc) + "\""));
      String _trim = libSrc.trim();
      String _replaceAll = _trim.replaceAll("\\s+", " ");
      final String libSrcNormalized = _replaceAll.trim();
      InputOutput.<String>println((("lib src normalized: \"" + libSrcNormalized) + "\""));
      final AGCLGrammarRoot libAST = this.parser.parse(libSrc);
      InputOutput.<String>println((("lib AST: \"" + libAST) + "\""));
      final AGCLGrammarRoot libNormalizedAST = this.parser.parse(libSrcNormalized);
      InputOutput.<String>println((("lib normalized AST: \"" + libNormalizedAST) + "\""));
      final String serializedLibAST = this.serializer.serialize(libAST);
      InputOutput.<String>println((("serialized lib AST: \"" + serializedLibAST) + "\""));
      final String serializedLibNormalizedAST = this.serializer.serialize(libNormalizedAST);
      InputOutput.<String>println((("serialized lib normalized AST: \"" + serializedLibNormalizedAST) + "\""));
      Assert.assertNotEquals(libAST, libNormalizedAST);
      Matcher<EObject> _structuralEqualTo = EcoreStructuralEqualityMatcher.structuralEqualTo(libNormalizedAST);
      Assert.<AGCLGrammarRoot>assertThat(libAST, _structuralEqualTo);
      Assert.assertEquals(libSrcNormalized, serializedLibAST);
      Assert.assertNotEquals(libSrc, serializedLibAST);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void serializeAnnexSubclause() {
    try {
      InputOutput.<String>println("* AGCLAnnexSubclause");
      final String annexSrc = "\n            subclause\n                property A1 = true ;\n                property A2 = false ;\n                property G1 = true ;\n                behaviour in p1 : e1 -> out p2 : e2 ;\n                contract c1\n                    assumption A1 && A2 ;\n                    guarantee G1 ;\n                end c1 ;\n        ";
      InputOutput.<String>println((("annex: \"" + annexSrc) + "\""));
      String _trim = annexSrc.trim();
      String _replaceAll = _trim.replaceAll("\\s+", " ");
      final String annexSrcNormalized = _replaceAll.trim();
      InputOutput.<String>println((("annex src normalized: \"" + annexSrcNormalized) + "\""));
      final AGCLGrammarRoot annexAST = this.parser.parse(annexSrc);
      InputOutput.<String>println((("annex AST: \"" + annexAST) + "\""));
      final AGCLGrammarRoot annexNormalizedAST = this.parser.parse(annexSrcNormalized);
      InputOutput.<String>println((("annex normalized AST: \"" + annexNormalizedAST) + "\""));
      final String serializedAnnexAST = this.serializer.serialize(annexAST);
      InputOutput.<String>println((("serialized annex AST: \"" + serializedAnnexAST) + "\""));
      final String serializedannexNormalizedAST = this.serializer.serialize(annexNormalizedAST);
      InputOutput.<String>println((("serialized annex normalized AST: \"" + serializedannexNormalizedAST) + "\""));
      Assert.assertNotEquals(annexAST, annexNormalizedAST);
      Matcher<EObject> _structuralEqualTo = EcoreStructuralEqualityMatcher.structuralEqualTo(annexNormalizedAST);
      Assert.<AGCLGrammarRoot>assertThat(annexAST, _structuralEqualTo);
      Assert.assertEquals(annexSrcNormalized, serializedAnnexAST);
      Assert.assertNotEquals(annexSrc, serializedAnnexAST);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void serializeAnnexSubclauseItem() {
    try {
      InputOutput.<String>println("* AGCLAnnexSubclauseItem");
      final String annexSrc = "\n            subclause\n                property A1 = true ;\n                property A2 = false ;\n                property G1 = true ;\n                behaviour in p1 : e1 -> out p2 : e2 ;\n                contract c1\n                    assumption A1 && A2 ;\n                    guarantee G1 ;\n                end c1 ;\n        ";
      final String contractSrc = "\n            contract c1\n                assumption A1 && A2 ;\n                guarantee G1 ;\n            end c1 ;\n        ";
      InputOutput.<String>println((("annex: \"" + annexSrc) + "\""));
      final AGCLGrammarRoot annexAST = this.parser.parse(annexSrc);
      InputOutput.<String>println((("annex AST: \"" + annexAST) + "\""));
      final String serializedAnnexAST = this.serializer.serialize(annexAST);
      InputOutput.<String>println((("serialized annex AST: \"" + serializedAnnexAST) + "\""));
      InputOutput.<String>println((("contract: \"" + contractSrc) + "\""));
      String _trim = contractSrc.trim();
      String _replaceAll = _trim.replaceAll("\\s+", " ");
      final String contractSrcNormalized = _replaceAll.trim();
      InputOutput.<String>println((("contract src normalized: \"" + contractSrcNormalized) + "\""));
      AGCLAnnexSubclause _subclause = annexAST.getSubclause();
      EList<AGCLContract> _contracts = _subclause.getContracts();
      final AGCLContract contractAST = _contracts.get(0);
      InputOutput.<String>println((("contract AST: \"" + contractAST) + "\""));
      final String serializedContract = this.serializer.serialize(contractAST);
      InputOutput.<String>println((("contract AST serialized: \"" + serializedContract) + "\""));
      Assert.assertEquals(contractSrcNormalized, serializedContract);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
