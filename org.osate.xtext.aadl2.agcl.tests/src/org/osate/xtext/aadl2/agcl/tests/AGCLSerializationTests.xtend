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
import org.osate.xtext.aadl2.agcl.AGCLInjectorProvider
import org.osate.xtext.aadl2.agcl.AGCLStandaloneSetup
import org.osate.xtext.aadl2.agcl.agcl.AGCLGrammarRoot

import static org.junit.Assert.*
import org.junit.Ignore
import static org.osate.xtext.aadl2.agcl.tests.EcoreStructuralEqualityMatcher.*

@InjectWith(AGCLInjectorProvider)
@RunWith(XtextRunner)

class AGCLSerializationTests {
    
    @Inject 
    ParseHelper<AGCLGrammarRoot> parser;
    
    ISerializer serializer
    
    @Before
    def void setUp() {
        println("* AGCLSerializationTests.setUp")
        val injector = new AGCLStandaloneSetup().createInjectorAndDoEMFRegistration();  
        serializer = injector.getInstance(Serializer);   
    }
    
//    @Ignore ("serialized ASTs do not reflect the source code whitespace layout")
    @Test
    def serializeAnnexLibrary() {
        println("* AGCLAnnexLibrary")
        val libSrc = "
            library 
                viewpoint v1 ;
                viewpoint v2 ; 
        "
        println("lib src: \"" + libSrc + "\"") 
        val libSrcNormalized = libSrc.trim.replaceAll("\\s+", " ").trim
        println("lib src normalized: \"" + libSrcNormalized + "\"") 
        val libAST = parser.parse(libSrc)
        println("lib AST: \"" + libAST + "\"")
        val libNormalizedAST = parser.parse(libSrcNormalized)
        println("lib normalized AST: \"" + libNormalizedAST + "\"")
        val serializedLibAST = serializer.serialize(libAST)
        println("serialized lib AST: \"" + serializedLibAST + "\"")
        val serializedLibNormalizedAST = serializer.serialize(libNormalizedAST)
        println("serialized lib normalized AST: \"" + serializedLibNormalizedAST + "\"")
        assertNotEquals(libAST, libNormalizedAST)       // Ecore objects' equals method does not perform structural equality, therefore
        assertThat(libAST, structuralEqualTo(libNormalizedAST))  // We need a Matcher that invokes EcoreUtil.equals which does perform structural equality.
        assertEquals(libSrcNormalized, serializedLibAST)
        assertNotEquals(libSrc, serializedLibAST)
    }
    
    @Test
    def serializeAnnexSubclause() {
        println("* AGCLAnnexSubclause")
        val annexSrc = "
            subclause
                property A1 = true ;
                property A2 = false ;
                property G1 = true ;
                behaviour in p1 : e1 -> out p2 : e2 ;
                contract c1
                    assumption A1 && A2 ;
                    guarantee G1 ;
                end c1 ;
        "
        println("annex: \"" + annexSrc + "\"")
        val annexSrcNormalized = annexSrc.trim.replaceAll("\\s+", " ").trim
        println("annex src normalized: \"" + annexSrcNormalized + "\"") 
        val annexAST = parser.parse(annexSrc)
        println("annex AST: \"" + annexAST + "\"")
        val annexNormalizedAST = parser.parse(annexSrcNormalized)
        println("annex normalized AST: \"" + annexNormalizedAST + "\"")
        val serializedAnnexAST = serializer.serialize(annexAST)
        println("serialized annex AST: \"" + serializedAnnexAST + "\"")
        val serializedannexNormalizedAST = serializer.serialize(annexNormalizedAST)
        println("serialized annex normalized AST: \"" + serializedannexNormalizedAST + "\"")
        
        assertNotEquals(annexAST, annexNormalizedAST)       // Ecore objects' equals method does not perform structural equality, therefore
        assertThat(annexAST, structuralEqualTo(annexNormalizedAST))  // We need a Matcher that invokes EcoreUtil.equals which does perform structural equality.
        assertEquals(annexSrcNormalized, serializedAnnexAST)
        assertNotEquals(annexSrc, serializedAnnexAST)
    }
    
    @Test
    def serializeAnnexSubclauseItem() {
        println("* AGCLAnnexSubclauseItem")
        val annexSrc = "
            subclause
                property A1 = true ;
                property A2 = false ;
                property G1 = true ;
                behaviour in p1 : e1 -> out p2 : e2 ;
                contract c1
                    assumption A1 && A2 ;
                    guarantee G1 ;
                end c1 ;
        "
        val contractSrc = "
            contract c1
                assumption A1 && A2 ;
                guarantee G1 ;
            end c1 ;
        "
        println("annex: \"" + annexSrc + "\"")
        val annexAST = parser.parse(annexSrc)
        println("annex AST: \"" + annexAST + "\"")
        val serializedAnnexAST = serializer.serialize(annexAST)
        println("serialized annex AST: \"" + serializedAnnexAST + "\"")
        
        println("contract: \"" + contractSrc + "\"")
        val contractSrcNormalized = contractSrc.trim.replaceAll("\\s+", " ").trim
        println("contract src normalized: \"" + contractSrcNormalized + "\"")
        
        val contractAST = annexAST.subclause.contracts.get(0)
        println("contract AST: \"" + contractAST + "\"")
        val serializedContract = serializer.serialize(contractAST)
        println("contract AST serialized: \"" + serializedContract + "\"")
        
        assertEquals(contractSrcNormalized, serializedContract)
    }
}