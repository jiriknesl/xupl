#!/bin/sh
./xupl <<'TEST'
a a="b"





a a<"b"
a a>"b"
a a~"b"
a a$"b"
a a%"b"
a a^"b"
a a<"b"
a a&"b"
a a*"b"
a a-"b"
a a+"b"
a a="b"
a a|"b"
a a/"b"
a a?"b"
a a<<"b"
a a<-"b"
a a<->"b"
a a->"b"
a a>>"b"
a a&&"b"
a a**"b"
a a||"b"
a a="b",a<"b"
a a>"b",a~"b"
a a$"b",a%"b"
a a^"b",a<"b"
a a&"b",a*"b"
a a-"b",a+"b"
a a="b",a|"b"
a a/"b",a?"b"
a a<<"b",a<-"b"
a a<->"b",a->"b"
a a>>"b",a&&"b"
a a**"b",a||"b"
a a="b",a<"b",a>"b",a~"b"
a a$"b",a%"b",a^"b",a<"b"
a a&"b",a*"b",a-"b",a+"b"
a a="b",a|"b",a/"b",a?"b"
a a<<"b",a<-"b",a<->"b",a->"b"
a a>>"b",a&&"b",a**"b",a||"b"
a a="b",a<"b",a>"b",a~"b",a$"b",a%"b",a^"b",a<"b"
a a&"b",a*"b",a-"b",a+"b",a="b",a|"b",a/"b",a?"b"
a a<<"b",a<-"b",a<->"b",a->"b",a>>"b",a&&"b",a**"b",a||"b"
a a="b",a<"b",a>"b",a~"b",a$"b",a%"b",a^"b",a<"b",a&"b",a*"b",a-"b",a+"b",a="b",a|"b",a/"b",a?"b",a<<"b",a<-"b",a<->"b",a->"b",a>>"b",a&&"b",a**"b",a||"b"
a a="b"
a "b"<a
a "b">a
a "b"~a
a "b"$a
a "b"%a
a "b"^a
a "b"<a
a "b"&a
a "b"*a
a "b"-a
a "b"+a
a "b"=a
a "b"|a
a "b"/a
a "b"?a
a "b"<<a
a "b"<-a
a "b"<->a
a "b"->a
a "b">>a
a "b"&&a
a "b"**a
a "b"||a
a "b"=a,"b"<a
a "b">a,"b"~a
a "b"$a,"b"%a
a "b"^a,"b"<a
a "b"&a,"b"*a
a "b"-a,"b"+a
a "b"=a,"b"|a
a "b"/a,"b"?a
a "b"<<a,"b"<-a
a "b"<->a,"b"->a
a "b">>a,"b"&&a
a "b"**a,"b"||a
a "b"=a,"b"<a,"b">a,"b"~a
a "b"$a,"b"%a,"b"^a,"b"<a
a "b"&a,"b"*a,"b"-a,"b"+a
a "b"=a,"b"|a,"b"/a,"b"?a
a "b"<<a,"b"<-a,"b"<->a,"b"->a
a "b">>a,"b"&&a,"b"**a,"b"||a
a "b"=a,"b"<a,"b">a,"b"~a,"b"$a,"b"%a,"b"^a,"b"<a
a "b"&a,"b"*a,"b"-a,"b"+a,"b"=a,"b"|a,"b"/a,"b"?a
a "b"<<a,"b"<-a,"b"<->a,"b"->a,"b">>a,"b"&&a,"b"**a,"b"||a
a "b"=a,"b"<a,"b">a,"b"~a,"b"$a,"b"%a,"b"^a,"b"<a,"b"&a,"b"*a,"b"-a,"b"+a,"b"=a,"b"|a,"b"/a,"b"?a,"b"<<a,"b"<-a,"b"<->a,"b"->a,"b">>a,"b"&&a,"b"**a,"b"||a
a "b" %%%%% a
a "b" $$ a
a 1 %%%%% a
a 0xA $$ a
a #ddA $$ a
a 0xA $$ a@b
a #ddA $$ a#b
a img http://example.com
a (img ^^^ http://example.com)
a (img ^^^ http://example.com, a = b)
TEST
