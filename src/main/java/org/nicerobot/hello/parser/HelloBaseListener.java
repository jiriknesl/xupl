
package org.nicerobot.hello.parser;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class HelloBaseListener implements HelloListener {
	@Override public void enterR(HelloParser.RContext ctx) { }
	@Override public void exitR(HelloParser.RContext ctx) { }
	@Override public void enterName(HelloParser.NameContext ctx) { }
	@Override public void exitName(HelloParser.NameContext ctx) { }
	@Override public void enterValue(HelloParser.ValueContext ctx) { }
	@Override public void exitValue(HelloParser.ValueContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext<Token> ctx) { }
	@Override public void exitEveryRule(ParserRuleContext<Token> ctx) { }
	@Override public void visitTerminal(TerminalNode<Token> node) { }
	@Override public void visitErrorNode(ErrorNode<Token> node) { }
}