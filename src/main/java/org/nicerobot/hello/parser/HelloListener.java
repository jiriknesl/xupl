
package org.nicerobot.hello.parser;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface HelloListener extends ParseTreeListener<Token> {
	void enterR(HelloParser.RContext ctx);
	void exitR(HelloParser.RContext ctx);
	void enterName(HelloParser.NameContext ctx);
	void exitName(HelloParser.NameContext ctx);
	void enterValue(HelloParser.ValueContext ctx);
	void exitValue(HelloParser.ValueContext ctx);
}