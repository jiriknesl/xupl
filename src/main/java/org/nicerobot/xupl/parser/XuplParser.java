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
		T__0=1, START=2, BLOCK=3, ID=4, NID=5, OPEN=6, CLOSE=7, SPACE=8, WS=9;
	public static final String[] tokenNames = {
		"<INVALID>", "','", "START", "BLOCK", "ID", "NID", "OPEN", "CLOSE", "SPACE", 
		"WS"
	};
	public static final int
		RULE_xupl = 0, RULE_node = 1, RULE_attrs = 2, RULE_attr = 3, RULE_name = 4, 
		RULE_value = 5;
	public static final String[] ruleNames = {
		"xupl", "node", "attrs", "attr", "name", "value"
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
			setState(12); node();
			setState(13); match(EOF);
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
		public TerminalNode<Token> OPEN() { return getToken(XuplParser.OPEN, 0); }
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public List<? extends NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public List<TerminalNode<Token>> WS() { return getTokens(XuplParser.WS); }
		public AttrsContext attrs() {
			return getRuleContext(AttrsContext.class,0);
		}
		public TerminalNode<Token> CLOSE() { return getToken(XuplParser.CLOSE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode<Token> WS(int i) {
			return getToken(XuplParser.WS, i);
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
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ( _la==WS ) {
				{
				{
				setState(15); match(WS);
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(21); name();
			setState(23);
			//_errHandler.sync(this);
			_la = _input.LA(1);
			if ( _la==SPACE ) {
				{
				setState(22); attrs();
				}
			}

			setState(33);
			//_errHandler.sync(this);
			_la = _input.LA(1);
			if ( _la==OPEN ) {
				{
				setState(25); match(OPEN);
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(26); node();
					}
					}
					setState(29); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID || _la==WS );
				setState(31); match(CLOSE);
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

	public static class AttrsContext extends ParserRuleContext<Token> {
		public TerminalNode<Token> SPACE(int i) {
			return getToken(XuplParser.SPACE, i);
		}
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public List<TerminalNode<Token>> SPACE() { return getTokens(XuplParser.SPACE); }
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
		AttrsContext _localctx = new AttrsContext(_ctx, 4);
		enterRule(_localctx, RULE_attrs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			do {
				switch ( _alt ) {
					case 1:
						{
						{
						setState(35); match(SPACE);
						}
						}
						break;
					default :
						throw new NoViableAltException(this);
				}
				setState(38); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(40); attr();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ( _la==1 || _la==SPACE ) {
				{
				{
				setState(42);
				//_errHandler.sync(this);
				_la = _input.LA(1);
				if ( _la==SPACE ) {
					{
					setState(41); match(SPACE);
					}
				}

				setState(44); match(1);
				setState(46);
				//_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(45); match(SPACE);
						}
						break;
				}
				setState(48); attr();
				}
				}
				setState(53);
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
		AttrContext _localctx = new AttrContext(_ctx, 6);
		enterRule(_localctx, RULE_attr);
		try {
			setState(60);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case ID:
					enterOuterAlt(_localctx, 1);
					{
					setState(54); name();
					setState(55); value();
					}
					break;
				case 1:
				case START:
				case BLOCK:
				case NID:
				case OPEN:
				case CLOSE:
				case SPACE:
				case WS:
					enterOuterAlt(_localctx, 2);
					{
					setState(57); value();
					setState(58); name();
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
		public TerminalNode<Token> ID() { return getToken(XuplParser.ID, 0); }
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
		NameContext _localctx = new NameContext(_ctx, 8);
		enterRule(_localctx, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); match(ID);
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
		public TerminalNode<Token> ID() { return getToken(XuplParser.ID, 0); }
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
		ValueContext _localctx = new ValueContext(_ctx, 10);
		enterRule(_localctx, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_input.LT(1);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\tC\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\1\0\1\0\1\0\1\1"+
		"\5\1\21\b\1\n\1\f\1\24\t\1\1\1\1\1\3\1\30\b\1\1\1\1\1\4\1\34\b\1\13\1"+
		"\f\1\35\1\1\1\1\3\1\"\b\1\1\2\4\2%\b\2\13\2\f\2&\1\2\1\2\3\2+\b\2\1\2"+
		"\1\2\3\2/\b\2\1\2\5\2\62\b\2\n\2\f\2\65\t\2\1\3\1\3\1\3\1\3\1\3\1\3\3"+
		"\3=\b\3\1\4\1\4\1\5\1\5\1\5\6\0\2\4\6\b\n\0\1\1\4\4E\0\f\1\0\0\0\2\22"+
		"\1\0\0\0\4$\1\0\0\0\6<\1\0\0\0\b>\1\0\0\0\n@\1\0\0\0\f\r\3\2\1\0\r\16"+
		"\5\uffff\0\0\16\1\1\0\0\0\17\21\5\t\0\0\20\17\1\0\0\0\21\24\1\0\0\0\22"+
		"\20\1\0\0\0\22\23\1\0\0\0\23\25\1\0\0\0\24\22\1\0\0\0\25\27\3\b\4\0\26"+
		"\30\3\4\2\0\27\26\1\0\0\0\27\30\1\0\0\0\30!\1\0\0\0\31\33\5\6\0\0\32\34"+
		"\3\2\1\0\33\32\1\0\0\0\34\35\1\0\0\0\35\33\1\0\0\0\35\36\1\0\0\0\36\37"+
		"\1\0\0\0\37 \5\7\0\0 \"\1\0\0\0!\31\1\0\0\0!\"\1\0\0\0\"\3\1\0\0\0#%\5"+
		"\b\0\0$#\1\0\0\0%&\1\0\0\0&$\1\0\0\0&\'\1\0\0\0\'(\1\0\0\0(\63\3\6\3\0"+
		")+\5\b\0\0*)\1\0\0\0*+\1\0\0\0+,\1\0\0\0,.\5\1\0\0-/\5\b\0\0.-\1\0\0\0"+
		"./\1\0\0\0/\60\1\0\0\0\60\62\3\6\3\0\61*\1\0\0\0\62\65\1\0\0\0\63\61\1"+
		"\0\0\0\63\64\1\0\0\0\64\5\1\0\0\0\65\63\1\0\0\0\66\67\3\b\4\0\678\3\n"+
		"\5\08=\1\0\0\09:\3\n\5\0:;\3\b\4\0;=\1\0\0\0<\66\1\0\0\0<9\1\0\0\0=\7"+
		"\1\0\0\0>?\5\4\0\0?\t\1\0\0\0@A\b\0\0\0A\13\1\0\0\0\t\22\27\35!&*.\63"+
		"<";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		//org.antlr.v4.tool.DOTGenerator dot = new org.antlr.v4.tool.DOTGenerator(null);
		//System.out.println(dot.getDOT(_ATN.decisionToState.get(0), ruleNames, false));
		//System.out.println(dot.getDOT(_ATN.ruleToStartState[2], ruleNames, false));
	}
}