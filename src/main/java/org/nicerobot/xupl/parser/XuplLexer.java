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
		NAME=1, VALUE=2, NEXT=3, OPEN=4, CLOSE=5, WS=6;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"NAME", "VALUE", "NEXT", "OPEN", "CLOSE", "WS"
	};
	public static final String[] ruleNames = {
		"NAME", "VALUE", "NEXT", "OPEN", "CLOSE", "WS"
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
			case 0 : NAME_action((RuleContext)_localctx, actionIndex); break;
			case 1 : VALUE_action((RuleContext)_localctx, actionIndex); break;
			case 2 : NEXT_action((RuleContext)_localctx, actionIndex); break;
			case 3 : OPEN_action((RuleContext)_localctx, actionIndex); break;
			case 4 : CLOSE_action((RuleContext)_localctx, actionIndex); break;
			case 5 : WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	public void OPEN_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void NEXT_action(RuleContext _localctx, int actionIndex) {
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
	public void CLOSE_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void VALUE_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}

	public static final String _serializedATN =
		"\2\6)\6\uffff\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\1\0\1\0"+
		"\5\0\20\b\0\n\0\f\0\23\t\0\1\1\1\1\5\1\27\b\1\n\1\f\1\32\t\1\1\2\1\2\1"+
		"\3\1\3\1\4\1\4\1\5\5\5#\b\5\n\5\f\5&\t\5\1\5\1\5\6\1\1\uffff\3\2\uffff"+
		"\5\3\uffff\7\4\uffff\t\5\uffff\13\6\0\1\0\b\3AZ__az\t\t\n  (),,..::[]"+
		"{{}}\n\t\n  (),,..::A]__a{}}\t\t\n  (),,..::[]{{}}\1,,\3::\\\\{{\3..\\"+
		"\\}}\2\t\n  +\0\1\1\0\0\0\0\3\1\0\0\0\0\5\1\0\0\0\0\7\1\0\0\0\0\t\1\0"+
		"\0\0\0\13\1\0\0\0\1\r\1\0\0\0\3\24\1\0\0\0\5\33\1\0\0\0\7\35\1\0\0\0\t"+
		"\37\1\0\0\0\13$\1\0\0\0\r\21\7\0\0\0\16\20\b\1\0\0\17\16\1\0\0\0\20\23"+
		"\1\0\0\0\21\17\1\0\0\0\21\22\1\0\0\0\22\2\1\0\0\0\23\21\1\0\0\0\24\30"+
		"\b\2\0\0\25\27\b\3\0\0\26\25\1\0\0\0\27\32\1\0\0\0\30\26\1\0\0\0\30\31"+
		"\1\0\0\0\31\4\1\0\0\0\32\30\1\0\0\0\33\34\7\4\0\0\34\6\1\0\0\0\35\36\7"+
		"\5\0\0\36\b\1\0\0\0\37 \7\6\0\0 \n\1\0\0\0!#\7\7\0\0\"!\1\0\0\0#&\1\0"+
		"\0\0$\"\1\0\0\0$%\1\0\0\0%\'\1\0\0\0&$\1\0\0\0\'(\6\5\0\0(\f\1\0\0\0\4"+
		"\0\21\30$";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		//org.antlr.v4.tool.DOTGenerator dot = new org.antlr.v4.tool.DOTGenerator(null);
		//System.out.println(dot.getDOT(_ATN.decisionToState.get(0), ruleNames, false));
		//System.out.println(dot.getDOT(_ATN.ruleToStartState[2], ruleNames, false));
	}
}