package org.osate.xtext.aadl2.agcl.parsing;

import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.modelsupport.errorreporting.ParseErrorReporter;
import org.osate.annexsupport.AnnexParseUtil;
import org.osate.annexsupport.AnnexParser;
import org.osate.core.OsateCorePlugin;
import org.osate.xtext.aadl2.agcl.parser.antlr.AGCLParser;
import org.osate.xtext.aadl2.agcl.services.AGCLGrammarAccess;

import com.google.inject.Injector;

import antlr.RecognitionException;

public class AGCLAnnexParser implements AnnexParser {

    private Injector injector = OsateCorePlugin.getDefault().getInjector("org.osate.xtext.aadl2.agcl.AGCL");

	private AGCLParser theAGCLParser ;

	protected AGCLParser getParser() {
		if (theAGCLParser == null) {
			if (injector == null) {
				injector = OsateCorePlugin.getDefault().getInjector("org.osate.xtext.aadl2.agcl.AGCL");
			}
			theAGCLParser = injector.getInstance(AGCLParser.class);
		}
		return theAGCLParser;
	}

	protected AGCLGrammarAccess getGrammarAccess() {
		return getParser().getGrammarAccess();
	}
	

	@Override
	public AnnexLibrary parseAnnexLibrary(String annexName, String source,
			String filename, int line, int column,
			ParseErrorReporter errReporter) throws RecognitionException {
		AnnexLibrary annex_lib_ast_root = (AnnexLibrary) AnnexParseUtil.parse(getParser(),source,getGrammarAccess().getAGCLAnnexLibraryRule(),filename,line,column, errReporter);
		return annex_lib_ast_root;
	}

	@Override
	public AnnexSubclause parseAnnexSubclause(String annexName, String source,
			String filename, int line, int column,
			ParseErrorReporter errReporter) throws RecognitionException {
		AnnexSubclause annex_clause_ast_root = (AnnexSubclause) AnnexParseUtil.parse(getParser(),source,getGrammarAccess().getAGCLAnnexSubclauseRule(),filename,line,column, errReporter);
		return annex_clause_ast_root;
	}

}