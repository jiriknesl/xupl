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
		T__0=1, WS=2, NAME=3, VALUE=4;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'hello'", "WS", "NAME", "VALUE"
	};
	public static final String[] ruleNames = {
		"T__0", "WS", "NAME", "VALUE", "START", "BLOCK"
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
			case 1 : WS_action((RuleContext)_localctx, actionIndex); break;
			case 2 : NAME_action((RuleContext)_localctx, actionIndex); break;
			case 3 : VALUE_action((RuleContext)_localctx, actionIndex); break;
			case 4 : START_action((RuleContext)_localctx, actionIndex); break;
			case 5 : BLOCK_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	public void START_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
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
	public void VALUE_action(RuleContext _localctx, int actionIndex) {
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

	public static final String _serializedATN =
		"\2\4-\6\uffff\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\1\0\1\0"+
		"\1\0\1\0\1\0\1\0\1\1\5\1\25\b\1\n\1\f\1\30\t\1\1\1\1\1\1\2\1\2\5\2\36"+
		"\b\2\n\2\f\2!\t\2\1\3\1\3\5\3%\b\3\n\3\f\3(\t\3\1\4\1\4\1\5\1\5\6\1\1"+
		"\uffff\3\2\0\5\3\uffff\7\4\uffff\t\0\uffff\13\0\uffff\1\0\4\3\t\n\r\r"+
		"  \13\t\n\r\r  (),,..::A]__a{}}\3AZ__az\n\t\n\r\r  (),,..::[]{{}}-\0\1"+
		"\1\0\0\0\0\3\1\0\0\0\0\5\1\0\0\0\0\7\1\0\0\0\1\r\1\0\0\0\3\26\1\0\0\0"+
		"\5\33\1\0\0\0\7\"\1\0\0\0\t)\1\0\0\0\13+\1\0\0\0\r\16\5h\0\0\16\17\5e"+
		"\0\0\17\20\5l\0\0\20\21\5l\0\0\21\22\5o\0\0\22\2\1\0\0\0\23\25\7\0\0\0"+
		"\24\23\1\0\0\0\25\30\1\0\0\0\26\24\1\0\0\0\26\27\1\0\0\0\27\31\1\0\0\0"+
		"\30\26\1\0\0\0\31\32\6\1\0\0\32\4\1\0\0\0\33\37\3\t\4\0\34\36\3\13\5\0"+
		"\35\34\1\0\0\0\36!\1\0\0\0\37\35\1\0\0\0\37 \1\0\0\0 \6\1\0\0\0!\37\1"+
		"\0\0\0\"&\b\1\0\0#%\3\13\5\0$#\1\0\0\0%(\1\0\0\0&$\1\0\0\0&\'\1\0\0\0"+
		"\'\b\1\0\0\0(&\1\0\0\0)*\7\2\0\0*\n\1\0\0\0+,\b\3\0\0,\f\1\0\0\0\4\0\26"+
		"\37&";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		//org.antlr.v4.tool.DOTGenerator dot = new org.antlr.v4.tool.DOTGenerator(null);
		//System.out.println(dot.getDOT(_ATN.decisionToState.get(0), ruleNames, false));
		//System.out.println(dot.getDOT(_ATN.ruleToStartState[2], ruleNames, false));
	}
}