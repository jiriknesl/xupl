
package org.nicerobot.xupl.parser;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface XuplListener extends ParseTreeListener<Token> {
	void enterNode(XuplParser.NodeContext ctx);
	void exitNode(XuplParser.NodeContext ctx);
	void enterAttrs(XuplParser.AttrsContext ctx);
	void exitAttrs(XuplParser.AttrsContext ctx);
	void enterName(XuplParser.NameContext ctx);
	void exitName(XuplParser.NameContext ctx);
	void enterValue(XuplParser.ValueContext ctx);
	void exitValue(XuplParser.ValueContext ctx);
	void enterXupl(XuplParser.XuplContext ctx);
	void exitXupl(XuplParser.XuplContext ctx);
	void enterAttr(XuplParser.AttrContext ctx);
	void exitAttr(XuplParser.AttrContext ctx);
}