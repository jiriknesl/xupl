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
		WS=1, NAME=2, VALUE=3, NEXT=4, OPEN=5, CLOSE=6;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"WS", "NAME", "VALUE", "NEXT", "OPEN", "CLOSE"
	};
	public static final String[] ruleNames = {
		"WS", "NAME", "VALUE", "START", "BLOCK", "NSB", "NEXT", "OPEN", "CLOSE"
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
			case 0 : WS_action((RuleContext)_localctx, actionIndex); break;
			case 1 : NAME_action((RuleContext)_localctx, actionIndex); break;
			case 2 : VALUE_action((RuleContext)_localctx, actionIndex); break;
			case 3 : START_action((RuleContext)_localctx, actionIndex); break;
			case 4 : BLOCK_action((RuleContext)_localctx, actionIndex); break;
			case 5 : NSB_action((RuleContext)_localctx, actionIndex); break;
			case 6 : NEXT_action((RuleContext)_localctx, actionIndex); break;
			case 7 : OPEN_action((RuleContext)_localctx, actionIndex); break;
			case 8 : CLOSE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	public void OPEN_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void NSB_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void START_action(RuleContext _localctx, int actionIndex) {
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
	public void BLOCK_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}

	public static final String _serializedATN =
		"\2\6\65\6\uffff\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2\6\7"+
		"\6\2\7\7\7\2\b\7\b\1\0\5\0\25\b\0\n\0\f\0\30\t\0\1\0\1\0\1\1\1\1\5\1\36"+
		"\b\1\n\1\f\1!\t\1\1\2\1\2\5\2%\b\2\n\2\f\2(\t\2\1\3\1\3\1\4\1\4\1\5\1"+
		"\5\1\6\1\6\1\7\1\7\1\b\1\b\t\1\1\0\3\2\uffff\5\3\uffff\7\0\uffff\t\0\uffff"+
		"\13\0\uffff\r\4\uffff\17\5\uffff\21\6\uffff\1\0\7\3\t\n\r\r  \3AZ__az"+
		"\n\t\n\r\r  (),,..::[]{{}}\13\t\n\r\r  (),,..::A]__a{}}\1,,\3::\\\\{{"+
		"\3..\\\\}}\64\0\1\1\0\0\0\0\3\1\0\0\0\0\5\1\0\0\0\0\r\1\0\0\0\0\17\1\0"+
		"\0\0\0\21\1\0\0\0\1\26\1\0\0\0\3\33\1\0\0\0\5\"\1\0\0\0\7)\1\0\0\0\t+"+
		"\1\0\0\0\13-\1\0\0\0\r/\1\0\0\0\17\61\1\0\0\0\21\63\1\0\0\0\23\25\7\0"+
		"\0\0\24\23\1\0\0\0\25\30\1\0\0\0\26\24\1\0\0\0\26\27\1\0\0\0\27\31\1\0"+
		"\0\0\30\26\1\0\0\0\31\32\6\0\0\0\32\2\1\0\0\0\33\37\3\7\3\0\34\36\3\t"+
		"\4\0\35\34\1\0\0\0\36!\1\0\0\0\37\35\1\0\0\0\37 \1\0\0\0 \4\1\0\0\0!\37"+
		"\1\0\0\0\"&\3\13\5\0#%\3\t\4\0$#\1\0\0\0%(\1\0\0\0&$\1\0\0\0&\'\1\0\0"+
		"\0\'\6\1\0\0\0(&\1\0\0\0)*\7\1\0\0*\b\1\0\0\0+,\b\2\0\0,\n\1\0\0\0-.\b"+
		"\3\0\0.\f\1\0\0\0/\60\7\4\0\0\60\16\1\0\0\0\61\62\7\5\0\0\62\20\1\0\0"+
		"\0\63\64\7\6\0\0\64\22\1\0\0\0\4\0\26\37&";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		//org.antlr.v4.tool.DOTGenerator dot = new org.antlr.v4.tool.DOTGenerator(null);
		//System.out.println(dot.getDOT(_ATN.decisionToState.get(0), ruleNames, false));
		//System.out.println(dot.getDOT(_ATN.ruleToStartState[2], ruleNames, false));
	}
}