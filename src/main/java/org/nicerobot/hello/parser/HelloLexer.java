// $ANTLR ANTLRVersion> HelloLexer.java generatedTimestamp>

package org.nicerobot.hello.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NAME=2, WS=3;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'hello'", "NAME", "WS"
	};
	public static final String[] ruleNames = {
		"T__0", "NAME", "WS"
	};


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

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
			case 1 : NAME_action((RuleContext)_localctx, actionIndex); break;
			case 2 : WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	public void NAME_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void WS_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 0 : skip();  break;
		}
	}
	public void T__0_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}

	public static final String _serializedATN =
		"\2\3\34\6\uffff\2\0\7\0\2\1\7\1\2\2\7\2\1\0\1\0\1\0\1\0\1\0\1\0\1\1\1"+
		"\1\5\1\20\b\1\n\1\f\1\23\t\1\1\2\5\2\26\b\2\n\2\f\2\31\t\2\1\2\1\2\3\1"+
		"\1\uffff\3\2\uffff\5\3\0\1\0\3\1AZ\1\609\2\t\n  \35\0\1\1\0\0\0\0\3\1"+
		"\0\0\0\0\5\1\0\0\0\1\7\1\0\0\0\3\r\1\0\0\0\5\27\1\0\0\0\7\b\5h\0\0\b\t"+
		"\5e\0\0\t\n\5l\0\0\n\13\5l\0\0\13\f\5o\0\0\f\2\1\0\0\0\r\21\7\0\0\0\16"+
		"\20\b\1\0\0\17\16\1\0\0\0\20\23\1\0\0\0\21\17\1\0\0\0\21\22\1\0\0\0\22"+
		"\4\1\0\0\0\23\21\1\0\0\0\24\26\7\2\0\0\25\24\1\0\0\0\26\31\1\0\0\0\27"+
		"\25\1\0\0\0\27\30\1\0\0\0\30\32\1\0\0\0\31\27\1\0\0\0\32\33\6\2\0\0\33"+
		"\6\1\0\0\0\3\0\21\27";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		//org.antlr.v4.tool.DOTGenerator dot = new org.antlr.v4.tool.DOTGenerator(null);
		//System.out.println(dot.getDOT(_ATN.decisionToState.get(0), ruleNames, false));
		//System.out.println(dot.getDOT(_ATN.ruleToStartState[2], ruleNames, false));
	}
}