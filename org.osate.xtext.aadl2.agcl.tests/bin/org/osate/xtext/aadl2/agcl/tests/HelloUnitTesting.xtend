package org.osate.xtext.aadl2.agcl.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.osate.xtext.aadl2.agcl.AGCLInjectorProvider
import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause
import static org.junit.Assert.*;
import org.osate.xtext.aadl2.agcl.agcl.BooleanConstant
import org.osate.xtext.aadl2.agcl.agcl.AGCLGrammarRoot

@InjectWith(AGCLInjectorProvider)
@RunWith(XtextRunner)
class HelloUnitTesting {
    
    @Inject 
    ParseHelper<AGCLGrammarRoot> parser;
    
    @Test
    def parseSimpleAGCLLibrary() {
        println("AGCLAnnexLibrary")
        val libText = "
            library 
                viewpoint v1*;
                viewpoint v2
        "
        val libAST = parser.parse(libText)
        val viewpoints = libAST.lib.viewpoints
        println(libAST)
        println(viewpoints)
        println(viewpoints.get(0).name)
        println(viewpoints.get(1).name)
        assertEquals("v1", viewpoints.get(0).name)
        assertEquals("v2", viewpoints.get(1).name)
    }
    
//    @Test
//    def parseBooleanConstantCheck() {
//        println("BooleanConstant")
//        val boolText1 = "T"
//        val boolAST = parser.parse(boolText1)
//        println(boolAST)
//        println(boolAST.getVal)
//        assertSame(boolText1, boolAST.getVal)
//    }
    
//    @Test
//    def simpleContractNameCheck() {
//        print("simpleContractNameCheck")
//        val contractText = "
//            contract c1
//                assumption A1;
//                guarantee G1;
//            end c1;"
//        val contractAST = parser.parse(contractText)
//        print(contractAST)
//        assertSame("c1", contractAST.contracts.get(0).name)
//    }
     
}