grammar Samp;

/*
 * Parser Rules
 */

 message             : (info+ EOF);

 info                : from to content date NEWLINE;

 from                : WORD WHITESPACE+ ;

 to                  : WORD WHITESPACE+ WORD WHITESPACE+;

 content             : ( ( WHITESPACE )? WORD (WHITESPACE)*? )+ ;

 date                : DT;


 /*
 * Lexer Rules
 */

 fragment LOWERCASE  : [a-z] ;
 fragment UPPERCASE  : [A-Z] ;
 COMMA				 : ',' -> skip;
 QUOTE				 : '"' -> skip;

 WORD                : (LOWERCASE | UPPERCASE | '_' )+ ;

 DT                : ([0-9] | ':' | [A-Z] | '-' )+;

 WHITESPACE          : (' ' | '\t')+ ;

 NEWLINE             : ('\r'? '\n' | '\r')+ ;



