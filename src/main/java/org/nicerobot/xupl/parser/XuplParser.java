// $ANTLR ANTLRVersion> XuplParser.java generatedTimestamp>

package org.nicerobot.xupl.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XuplParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, NAME=2, VALUE=3, NEXT=4, OPEN=5, CLOSE=6;
	public static final String[] tokenNames = {
		"<INVALID>", "WS", "NAME", "VALUE", "NEXT", "OPEN", "CLOSE"
	};
	public static final int
		RULE_xupl = 0, RULE_node = 1, RULE_block = 2, RULE_attrs = 3, RULE_attr = 4, 
		RULE_name = 5, RULE_value = 6;
	public static final String[] ruleNames = {
		"xupl", "node", "block", "attrs", "attr", "name", "value"
	};

	@Override
	public String getGrammarFileName() { return "Xupl.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public XuplParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class XuplContext extends ParserRuleContext<Token> {
		public NodeContext node() {
			return getRuleContext(NodeContext.class,0);
		}
		public TerminalNode<Token> EOF() { return getToken(XuplParser.EOF, 0); }
		public XuplContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_xupl; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof XuplListener ) ((XuplListener)listener).enterXupl(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof XuplListener ) ((XuplListener)listener).exitXupl(this);
		}
	}

	public final XuplContext xupl() throws RecognitionException {
		XuplContext _localctx = new XuplContext(_ctx, 0);
		enterRule(_localctx, RULE_xupl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); node();
			setState(15); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodeContext extends ParserRuleContext<Token> {
		public AttrsContext attrs() {
			return getRuleContext(AttrsContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public NodeContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_node; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof XuplListener ) ((XuplListener)listener).enterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof XuplListener ) ((XuplListener)listener).exitNode(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, 2);
		enterRule(_localctx, RULE_node);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); name();
			setState(19);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(18); attrs();
					}
					break;
			}
			setState(22);
			//_errHandler.sync(this);
			_la = _input.LA(1);
			if ( _la==OPEN ) {
				{
				setState(21); block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext<Token> {
		public TerminalNode<Token> OPEN() { return getToken(XuplParser.OPEN, 0); }
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public List<? extends NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public TerminalNode<Token> CLOSE() { return getToken(XuplParser.CLOSE, 0); }
		public BlockContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof XuplListener ) ((XuplListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof XuplListener ) ((XuplListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, 4);
		enterRule(_localctx, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); match(OPEN);
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(25); node();
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(30); match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttrsContext extends ParserRuleContext<Token> {
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public List<TerminalNode<Token>> NEXT() { return getTokens(XuplParser.NEXT); }
		public TerminalNode<Token> NEXT(int i) {
			return getToken(XuplParser.NEXT, i);
		}
		public List<? extends AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public AttrsContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_attrs; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof XuplListener ) ((XuplListener)listener).enterAttrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof XuplListener ) ((XuplListener)listener).exitAttrs(this);
		}
	}

	public final AttrsContext attrs() throws RecognitionException {
		AttrsContext _localctx = new AttrsContext(_ctx, 6);
		enterRule(_localctx, RULE_attrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); attr();
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ( _la==NEXT ) {
				{
				{
				setState(33); match(NEXT);
				setState(34); attr();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttrContext extends ParserRuleContext<Token> {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AttrContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof XuplListener ) ((XuplListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof XuplListener ) ((XuplListener)listener).exitAttr(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, 8);
		enterRule(_localctx, RULE_attr);
		try {
			setState(46);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case NAME:
					enterOuterAlt(_localctx, 1);
					{
					setState(40); name();
					setState(41); value();
					}
					break;
				case VALUE:
					enterOuterAlt(_localctx, 2);
					{
					setState(43); value();
					setState(44); name();
					}
					break;
				default :
					throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext<Token> {
		public TerminalNode<Token> NAME() { return getToken(XuplParser.NAME, 0); }
		public NameContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof XuplListener ) ((XuplListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof XuplListener ) ((XuplListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, 10);
		enterRule(_localctx, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext<Token> {
		public TerminalNode<Token> VALUE() { return getToken(XuplParser.VALUE, 0); }
		public ValueContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof XuplListener ) ((XuplListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof XuplListener ) ((XuplListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, 12);
		enterRule(_localctx, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\6\65\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2\6\7\6\1\0\1"+
		"\0\1\0\1\1\1\1\3\1\24\b\1\1\1\3\1\27\b\1\1\2\1\2\4\2\33\b\2\13\2\f\2\34"+
		"\1\2\1\2\1\3\1\3\1\3\5\3$\b\3\n\3\f\3\'\t\3\1\4\1\4\1\4\1\4\1\4\1\4\3"+
		"\4/\b\4\1\5\1\5\1\6\1\6\1\6\7\0\2\4\6\b\n\f\0\0\62\0\16\1\0\0\0\2\21\1"+
		"\0\0\0\4\30\1\0\0\0\6 \1\0\0\0\b.\1\0\0\0\n\60\1\0\0\0\f\62\1\0\0\0\16"+
		"\17\3\2\1\0\17\20\5\uffff\0\0\20\1\1\0\0\0\21\23\3\n\5\0\22\24\3\6\3\0"+
		"\23\22\1\0\0\0\23\24\1\0\0\0\24\26\1\0\0\0\25\27\3\4\2\0\26\25\1\0\0\0"+
		"\26\27\1\0\0\0\27\3\1\0\0\0\30\32\5\5\0\0\31\33\3\2\1\0\32\31\1\0\0\0"+
		"\33\34\1\0\0\0\34\32\1\0\0\0\34\35\1\0\0\0\35\36\1\0\0\0\36\37\5\6\0\0"+
		"\37\5\1\0\0\0 %\3\b\4\0!\"\5\4\0\0\"$\3\b\4\0#!\1\0\0\0$\'\1\0\0\0%#\1"+
		"\0\0\0%&\1\0\0\0&\7\1\0\0\0\'%\1\0\0\0()\3\n\5\0)*\3\f\6\0*/\1\0\0\0+"+
		",\3\f\6\0,-\3\n\5\0-/\1\0\0\0.(\1\0\0\0.+\1\0\0\0/\t\1\0\0\0\60\61\5\2"+
		"\0\0\61\13\1\0\0\0\62\63\5\3\0\0\63\r\1\0\0\0\5\23\26\34%.";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		//org.antlr.v4.tool.DOTGenerator dot = new org.antlr.v4.tool.DOTGenerator(null);
		//System.out.println(dot.getDOT(_ATN.decisionToState.get(0), ruleNames, false));
		//System.out.println(dot.getDOT(_ATN.ruleToStartState[2], ruleNames, false));
	}
}