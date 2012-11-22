package org.nicerobot

import scala.util.parsing.combinator._

object Xupl extends JavaTokenParsers {
 
  val ID = """[a-zA-Z]([a-zA-Z0-9]|_[a-zA-Z0-9])*"""r

  val STR = "\".*?\""r
 
  def open = "{" | ":"

  def close = "}" | "."

  def attribute = ID ~ ( STR | ID )

  def attributes = repsep(attribute, "," )

  def node:Parser[Any] = ID ~ (attributes?) | ID ~ (attributes?) ~ (open ~> (node*) <~ close)

}