package org.osate.xtext.aadl2.agcl.tests;

import com.google.inject.Inject;
import com.google.inject.Injector;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.osate.xtext.aadl2.agcl.AGCLInjectorProvider;
import org.osate.xtext.aadl2.agcl.AGCLStandaloneSetup;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAssumption;
import org.osate.xtext.aadl2.agcl.agcl.AGCLContract;
import org.osate.xtext.aadl2.agcl.agcl.AGCLGrammarRoot;
import org.osate.xtext.aadl2.agcl.agcl.AGCLGuarantee;
import org.osate.xtext.aadl2.agcl.agcl.PSLSpec;
import org.osate.xtext.aadl2.agcl.analysis.visitors.concrete.PSLTransformGuaranteeAtomicPropositionsSwitch;

@InjectWith(AGCLInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class AGCLPSLTransformTests {
  @Inject
  private ParseHelper<AGCLGrammarRoot> agclParser;
  
  private ISerializer serializer;
  
  private PSLTransformGuaranteeAtomicPropositionsSwitch trans;
  
  @Before
  public void setUp() {
    InputOutput.<String>println("* AGCLPSLTransformTests.setUp");
    AGCLStandaloneSetup _aGCLStandaloneSetup = new AGCLStandaloneSetup();
    final Injector injector = _aGCLStandaloneSetup.createInjectorAndDoEMFRegistration();
    Serializer _instance = injector.<Serializer>getInstance(Serializer.class);
    this.serializer = _instance;
  }
  
  @Test
  public void transformGuarantee() {
    try {
      InputOutput.<String>println("* transformGuarantee");
      final String subclauseSource = "\n\t\t\tsubclause \n\t\t\t\tcontract v\n\t\t\t\t\tassumption in a:x & out b:y;\n\t\t\t\t\tguarantee in c:u & out d:v;\n\t\t\t\tend v;\n\t\t";
      final AGCLGrammarRoot subclauseAST = this.agclParser.parse(subclauseSource);
      final String serializedSubclauseAST = this.serializer.serialize(subclauseAST);
      InputOutput.<String>println((("  serialized annex AST: \"" + serializedSubclauseAST) + "\""));
      AGCLAnnexSubclause _subclause = subclauseAST.getSubclause();
      EList<AGCLContract> _contracts = _subclause.getContracts();
      AGCLContract _get = _contracts.get(0);
      AGCLAssumption _assumption = _get.getAssumption();
      final PSLSpec assumptionSpec = _assumption.getSpec();
      AGCLAnnexSubclause _subclause_1 = subclauseAST.getSubclause();
      EList<AGCLContract> _contracts_1 = _subclause_1.getContracts();
      AGCLContract _get_1 = _contracts_1.get(0);
      AGCLGuarantee _guarantee = _get_1.getGuarantee();
      final PSLSpec guaranteeSpec = _guarantee.getSpec();
      final String serializedAssumption = this.serializer.serialize(assumptionSpec);
      final String serializedGuarantee = this.serializer.serialize(guaranteeSpec);
      InputOutput.<String>println((("  serialized assumption: \"" + serializedAssumption) + "\""));
      InputOutput.<String>println((("  serialized guarantee: \"" + serializedGuarantee) + "\""));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
