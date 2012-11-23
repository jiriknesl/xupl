
package org.nicerobot.hello.parser;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface HelloListener extends ParseTreeListener<Token> {
	void enterR(HelloParser.RContext ctx);
	void exitR(HelloParser.RContext ctx);
}