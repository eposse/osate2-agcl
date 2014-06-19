package org.osate.xtext.aadl2.agcl.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.serializer.ISerializer
import org.eclipse.xtext.serializer.impl.Serializer
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.osate.aadl2.Aadl2Factory
import org.osate.xtext.aadl2.agcl.AGCLInjectorProvider
import org.osate.xtext.aadl2.agcl.AGCLStandaloneSetup
import org.osate.xtext.aadl2.agcl.agcl.AGCLGrammarRoot
import org.osate.xtext.aadl2.agcl.analysis.visitors.concrete.PSLTransformGuaranteeAtomicPropositionsSwitch

//import org.osate.core.OsateCorePlugin;
//import org.osate.xtext.aadl2.

@InjectWith(AGCLInjectorProvider)
@RunWith(XtextRunner)

class AGCLPSLTransformTests {
	   
	@Inject 
    ParseHelper<AGCLGrammarRoot> agclParser;
    
//	@Inject 
//	ParseHelper<ThreadType> aadlThreadTypeParser;
	
//    Aadl2Parser aadlParser;
     
    ISerializer serializer
    
    PSLTransformGuaranteeAtomicPropositionsSwitch trans
    
    @Before
    def void setUp() {
        println("* AGCLPSLTransformTests.setUp")
        val injector = new AGCLStandaloneSetup().createInjectorAndDoEMFRegistration();  
        serializer = injector.getInstance(Serializer);  
//        aadlParser = new Aadl2Parser();
        
    }
    
    @Test
    def void transformGuarantee() {
    	println("* transformGuarantee")
    	val subclauseSource = "
			subclause 
				contract v
					assumption in a:x & out b:y;
					guarantee in c:u & out d:v;
				end v;
		"
		val subclauseAST = agclParser.parse(subclauseSource)
		val serializedSubclauseAST = serializer.serialize(subclauseAST)
        println("  serialized annex AST: \"" + serializedSubclauseAST + "\"")
        val assumptionSpec = subclauseAST.subclause.contracts.get(0).assumption.spec
        val guaranteeSpec = subclauseAST.subclause.contracts.get(0).guarantee.spec
        val serializedAssumption = serializer.serialize(assumptionSpec)
        val serializedGuarantee = serializer.serialize(guaranteeSpec)
        println("  serialized assumption: \"" + serializedAssumption + "\"")
        println("  serialized guarantee: \"" + serializedGuarantee + "\"")
//        val modelSource = "
//			thread T
//			features
//				a : in event data port;
//				b : out event data port;
//			end T;
//		"
//		val modelAST = aadlThreadTypeParser.parse(modelSource)
//		println("  modelAST = '" + modelAST + "'")
//		println("  thread '" + modelAST.fullName + "'")
//		println("    features: " + modelAST.ownedFeatures)

//		val threadType1 = Aadl2Factory.eINSTANCE.createThreadType
//		threadType1.name = "T1"
//		threadType1.ownedFeatures.add()
//		Aadl2Factory.eINSTANCE.createF
//		val port1 = Aadl2Factory.eINSTANCE.createPortSpecification
//		port1.
//		val threadSub1 = Aadl2Factory.eINSTANCE.createThreadSubcomponent
//		threadSub1.name = "P"
//		threadSub1.componentType = 
//
//
//		val threadGrouptImpl = Aadl2Factory.eINSTANCE.createThreadGroupImplementation
//		threadGrouptImpl.name = "T"
//		val k1 = threadGrouptImpl.createOwnedThreadSubcomponent
//		k1.name = "k1"
//		k1.
//		val k2 = threadGrouptImpl.createOwnedThreadSubcomponent
//		k1.name = "k2"
//
//		val conn1 = threadGrouptImpl.createOwnedFeatureConnection
//		conn1.name = "req_link"
//		val c1s = conn1.createSource
//		val c1s.connectionEnd = Aadl2Factory.eINSTANCE.cr
//		c1s.connectionEnd.name = "a"
//		val c1d = conn1.createDestination
//		c1d.connectionEnd.name = "b"
//
//		val conn2 = threadGrouptImpl.createOwnedFeatureConnection
//		conn1.name = "ans_link"
//		val c2s = conn1.createSource
//		c1s.connectionEnd.name = "c"
//		val c2d = conn1.createDestination
//		c1d.connectionEnd.name = "d"
//		
//		val trans = new PSLTransformGuaranteeAtomicPropositionsSwitch(null, threadGrouptImpl)
//		
//		val transformedAssumptionSpec = trans.doSwitch(assumptionSpec)
//		println("  transformed assumption = \"" + serializer.serialize(transformedAssumptionSpec) + "\"")
//		
//		val transformedGuaranteeSpec = trans.doSwitch(guaranteeSpec)
//		println("  transformed guarantee = \"" + serializer.serialize(transformedGuaranteeSpec) + "\"")
//		
		
    }
    
	
}