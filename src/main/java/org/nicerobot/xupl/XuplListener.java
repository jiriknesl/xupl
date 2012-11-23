package org.nicerobot.xupl;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.nicerobot.xupl.parser.XuplBaseListener;
import org.nicerobot.xupl.parser.XuplParser;

public class XuplListener extends XuplBaseListener implements ParseTreeListener<Token> {
  @Override
  public void exitNode (XuplParser.NodeContext ctx) {
    System.out.printf("exitNode %s\n", ctx.name().getText());
  }

  @Override
  public void exitAttrs (XuplParser.AttrsContext ctx) {
    System.out.printf("exitAttrs %s\n", ctx);
  }

  @Override
  public void exitName (XuplParser.NameContext ctx) {
    System.out.printf("exitName %s\n", ctx.ID().getText());
  }

  @Override
  public void exitValue (XuplParser.ValueContext ctx) {
    System.out.printf("exitValue %s\n", ctx);
  }

  @Override
  public void exitXupl (XuplParser.XuplContext ctx) {
    System.out.printf("exitXupl %s\n", ctx);
  }

  @Override
  public void exitAttr (XuplParser.AttrContext ctx) {
    System.out.printf("exitAttr %s\n", ctx);
  }

  @Override
  public void visitErrorNode (ErrorNode<Token> node) {
    System.out.printf("visitErrorNode %s\n", node);
  }
}
