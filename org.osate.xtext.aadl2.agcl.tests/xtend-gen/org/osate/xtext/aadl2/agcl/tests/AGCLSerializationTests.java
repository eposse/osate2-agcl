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
      final String libSrc = "\r\n            library \r\n                viewpoint v1 ;\r\n                viewpoint v2 ; \r\n        ";
      String _plus = ("lib src: \"" + libSrc);
      String _plus_1 = (_plus + "\"");
      InputOutput.<String>println(_plus_1);
      String _trim = libSrc.trim();
      String _replaceAll = _trim.replaceAll("\\s+", " ");
      final String libSrcNormalized = _replaceAll.trim();
      String _plus_2 = ("lib src normalized: \"" + libSrcNormalized);
      String _plus_3 = (_plus_2 + "\"");
      InputOutput.<String>println(_plus_3);
      final AGCLGrammarRoot libAST = this.parser.parse(libSrc);
      String _plus_4 = ("lib AST: \"" + libAST);
      String _plus_5 = (_plus_4 + "\"");
      InputOutput.<String>println(_plus_5);
      final AGCLGrammarRoot libNormalizedAST = this.parser.parse(libSrcNormalized);
      String _plus_6 = ("lib normalized AST: \"" + libNormalizedAST);
      String _plus_7 = (_plus_6 + "\"");
      InputOutput.<String>println(_plus_7);
      final String serializedLibAST = this.serializer.serialize(libAST);
      String _plus_8 = ("serialized lib AST: \"" + serializedLibAST);
      String _plus_9 = (_plus_8 + "\"");
      InputOutput.<String>println(_plus_9);
      final String serializedLibNormalizedAST = this.serializer.serialize(libNormalizedAST);
      String _plus_10 = ("serialized lib normalized AST: \"" + serializedLibNormalizedAST);
      String _plus_11 = (_plus_10 + "\"");
      InputOutput.<String>println(_plus_11);
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
      final String annexSrc = "\r\n            subclause\r\n                property A1 = true ;\r\n                property A2 = false ;\r\n                property G1 = true ;\r\n                behaviour in p1 : e1 -> out p2 : e2 ;\r\n                contract c1\r\n                    assumption A1 && A2 ;\r\n                    guarantee G1 ;\r\n                end c1 ;\r\n        ";
      String _plus = ("annex: \"" + annexSrc);
      String _plus_1 = (_plus + "\"");
      InputOutput.<String>println(_plus_1);
      String _trim = annexSrc.trim();
      String _replaceAll = _trim.replaceAll("\\s+", " ");
      final String annexSrcNormalized = _replaceAll.trim();
      String _plus_2 = ("annex src normalized: \"" + annexSrcNormalized);
      String _plus_3 = (_plus_2 + "\"");
      InputOutput.<String>println(_plus_3);
      final AGCLGrammarRoot annexAST = this.parser.parse(annexSrc);
      String _plus_4 = ("annex AST: \"" + annexAST);
      String _plus_5 = (_plus_4 + "\"");
      InputOutput.<String>println(_plus_5);
      final AGCLGrammarRoot annexNormalizedAST = this.parser.parse(annexSrcNormalized);
      String _plus_6 = ("annex normalized AST: \"" + annexNormalizedAST);
      String _plus_7 = (_plus_6 + "\"");
      InputOutput.<String>println(_plus_7);
      final String serializedAnnexAST = this.serializer.serialize(annexAST);
      String _plus_8 = ("serialized annex AST: \"" + serializedAnnexAST);
      String _plus_9 = (_plus_8 + "\"");
      InputOutput.<String>println(_plus_9);
      final String serializedannexNormalizedAST = this.serializer.serialize(annexNormalizedAST);
      String _plus_10 = ("serialized annex normalized AST: \"" + serializedannexNormalizedAST);
      String _plus_11 = (_plus_10 + "\"");
      InputOutput.<String>println(_plus_11);
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
      final String annexSrc = "\r\n            subclause\r\n                property A1 = true ;\r\n                property A2 = false ;\r\n                property G1 = true ;\r\n                behaviour in p1 : e1 -> out p2 : e2 ;\r\n                contract c1\r\n                    assumption A1 && A2 ;\r\n                    guarantee G1 ;\r\n                end c1 ;\r\n        ";
      final String contractSrc = "\r\n            contract c1\r\n                assumption A1 && A2 ;\r\n                guarantee G1 ;\r\n            end c1 ;\r\n        ";
      String _plus = ("annex: \"" + annexSrc);
      String _plus_1 = (_plus + "\"");
      InputOutput.<String>println(_plus_1);
      final AGCLGrammarRoot annexAST = this.parser.parse(annexSrc);
      String _plus_2 = ("annex AST: \"" + annexAST);
      String _plus_3 = (_plus_2 + "\"");
      InputOutput.<String>println(_plus_3);
      final String serializedAnnexAST = this.serializer.serialize(annexAST);
      String _plus_4 = ("serialized annex AST: \"" + serializedAnnexAST);
      String _plus_5 = (_plus_4 + "\"");
      InputOutput.<String>println(_plus_5);
      String _plus_6 = ("contract: \"" + contractSrc);
      String _plus_7 = (_plus_6 + "\"");
      InputOutput.<String>println(_plus_7);
      String _trim = contractSrc.trim();
      String _replaceAll = _trim.replaceAll("\\s+", " ");
      final String contractSrcNormalized = _replaceAll.trim();
      String _plus_8 = ("contract src normalized: \"" + contractSrcNormalized);
      String _plus_9 = (_plus_8 + "\"");
      InputOutput.<String>println(_plus_9);
      AGCLAnnexSubclause _subclause = annexAST.getSubclause();
      EList<AGCLContract> _contracts = _subclause.getContracts();
      final AGCLContract contractAST = _contracts.get(0);
      String _plus_10 = ("contract AST: \"" + contractAST);
      String _plus_11 = (_plus_10 + "\"");
      InputOutput.<String>println(_plus_11);
      final String serializedContract = this.serializer.serialize(contractAST);
      String _plus_12 = ("contract AST serialized: \"" + serializedContract);
      String _plus_13 = (_plus_12 + "\"");
      InputOutput.<String>println(_plus_13);
      Assert.assertEquals(contractSrcNormalized, serializedContract);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
