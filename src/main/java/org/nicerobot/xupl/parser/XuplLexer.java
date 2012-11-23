// $ANTLR ANTLRVersion> XuplLexer.java generatedTimestamp>

package org.nicerobot.xupl.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XuplLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, START=2, BLOCK=3, ID=4, NID=5, OPEN=6, CLOSE=7, SPACE=8, WS=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"','", "START", "BLOCK", "ID", "NID", "OPEN", "CLOSE", "SPACE", "WS"
	};
	public static final String[] ruleNames = {
		"T__0", "START", "BLOCK", "ID", "NID", "OPEN", "CLOSE", "SPACE", "WS"
	};


	public XuplLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Xupl.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }


	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch ( ruleIndex ) {
			case 0 : T__0_action((RuleContext)_localctx, actionIndex); break;
			case 1 : START_action((RuleContext)_localctx, actionIndex); break;
			case 2 : BLOCK_action((RuleContext)_localctx, actionIndex); break;
			case 3 : ID_action((RuleContext)_localctx, actionIndex); break;
			case 4 : NID_action((RuleContext)_localctx, actionIndex); break;
			case 5 : OPEN_action((RuleContext)_localctx, actionIndex); break;
			case 6 : CLOSE_action((RuleContext)_localctx, actionIndex); break;
			case 7 : SPACE_action((RuleContext)_localctx, actionIndex); break;
			case 8 : WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	public void OPEN_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void START_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void WS_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void CLOSE_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void ID_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void BLOCK_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__0_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void NID_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}

	public static final String _serializedATN =
		"\2\t\65\6\uffff\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2\6\7"+
		"\6\2\7\7\7\2\b\7\b\1\0\1\0\1\1\1\1\1\2\1\2\1\2\1\2\3\2\34\b\2\1\3\1\3"+
		"\5\3 \b\3\n\3\f\3#\t\3\1\4\1\4\5\4\'\b\4\n\4\f\4*\t\4\1\5\1\5\1\6\1\6"+
		"\1\7\1\7\1\b\1\b\3\b\64\b\b\t\1\1\uffff\3\2\uffff\5\3\uffff\7\4\uffff"+
		"\t\5\uffff\13\6\uffff\r\7\uffff\17\b\uffff\21\t\uffff\1\0\t\3AZ__az\2"+
		"(([[\2))]]\1\uffff\uffff\1\uffff\uffff\1\uffff\uffff\2::{{\2..}}\2\t\t"+
		"  :\0\1\1\0\0\0\0\3\1\0\0\0\0\5\1\0\0\0\0\7\1\0\0\0\0\t\1\0\0\0\0\13\1"+
		"\0\0\0\0\r\1\0\0\0\0\17\1\0\0\0\0\21\1\0\0\0\1\23\1\0\0\0\3\25\1\0\0\0"+
		"\5\33\1\0\0\0\7\35\1\0\0\0\t$\1\0\0\0\13+\1\0\0\0\r-\1\0\0\0\17/\1\0\0"+
		"\0\21\63\1\0\0\0\23\24\5,\0\0\24\2\1\0\0\0\25\26\7\0\0\0\26\4\1\0\0\0"+
		"\27\34\7\1\0\0\30\34\3\13\5\0\31\34\3\r\6\0\32\34\7\2\0\0\33\27\1\0\0"+
		"\0\33\30\1\0\0\0\33\31\1\0\0\0\33\32\1\0\0\0\34\6\1\0\0\0\35!\3\3\1\0"+
		"\36 \b\3\0\0\37\36\1\0\0\0 #\1\0\0\0!\37\1\0\0\0!\"\1\0\0\0\"\b\1\0\0"+
		"\0#!\1\0\0\0$(\b\4\0\0%\'\b\5\0\0&%\1\0\0\0\'*\1\0\0\0(&\1\0\0\0()\1\0"+
		"\0\0)\n\1\0\0\0*(\1\0\0\0+,\7\6\0\0,\f\1\0\0\0-.\7\7\0\0.\16\1\0\0\0/"+
		"\60\7\b\0\0\60\20\1\0\0\0\61\64\3\17\7\0\62\64\5\n\0\0\63\61\1\0\0\0\63"+
		"\62\1\0\0\0\64\22\1\0\0\0\5\0\33!(\63";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		//org.antlr.v4.tool.DOTGenerator dot = new org.antlr.v4.tool.DOTGenerator(null);
		//System.out.println(dot.getDOT(_ATN.decisionToState.get(0), ruleNames, false));
		//System.out.println(dot.getDOT(_ATN.ruleToStartState[2], ruleNames, false));
	}
}