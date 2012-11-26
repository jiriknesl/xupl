
package org.nicerobot.xupl.parser;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class XuplBaseListener implements XuplListener {
	@Override public void enterNode(XuplParser.NodeContext ctx) { }
	@Override public void exitNode(XuplParser.NodeContext ctx) { }
	@Override public void enterAttrs(XuplParser.AttrsContext ctx) { }
	@Override public void exitAttrs(XuplParser.AttrsContext ctx) { }
	@Override public void enterName(XuplParser.NameContext ctx) { }
	@Override public void exitName(XuplParser.NameContext ctx) { }
	@Override public void enterValue(XuplParser.ValueContext ctx) { }
	@Override public void exitValue(XuplParser.ValueContext ctx) { }
	@Override public void enterXupl(XuplParser.XuplContext ctx) { }
	@Override public void exitXupl(XuplParser.XuplContext ctx) { }
	@Override public void enterBlock(XuplParser.BlockContext ctx) { }
	@Override public void exitBlock(XuplParser.BlockContext ctx) { }
	@Override public void enterAttr(XuplParser.AttrContext ctx) { }
	@Override public void exitAttr(XuplParser.AttrContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext<Token> ctx) { }
	@Override public void exitEveryRule(ParserRuleContext<Token> ctx) { }
	@Override public void visitTerminal(TerminalNode<Token> node) { }
	@Override public void visitErrorNode(ErrorNode<Token> node) { }
}