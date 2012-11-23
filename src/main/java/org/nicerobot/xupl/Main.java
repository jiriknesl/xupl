package org.nicerobot.xupl;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.nicerobot.xupl.parser.XuplLexer;
import org.nicerobot.xupl.parser.XuplParser;

public final class Main {
  public static void main (String... args) throws IOException {
    XuplLexer lexer = new XuplLexer(new ANTLRFileStream(args[0]));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    XuplParser p = new XuplParser(tokens);
    p.setBuildParseTree(true);
    p.addParseListener(new XuplListener());
    ParserRuleContext<Token> t = p.xupl();
  }
}
