attribute = ^(space | ‘/’ | ‘>’ | ‘=’)+ >buffer %attributeName space* ‘=’ space*
((‘\” ^’\”* >buffer %attribute ‘\”) | (‘”‘ ^’”‘* >buffer %attribute ‘”‘));

element = ‘<' space* ^(space | '/' | '>‘)+ >buffer %elementStart (space+ attribute)*
:>> (space* (‘/’ %elementEndSingle)? space* ‘>’ @element);

elementBody := space* <: ((^'<'+ >buffer %text) <: space*)?

element? :>> (‘<' space* '/' ^'>‘+ ‘>’ @elementEnd);

main := space* element space*;
