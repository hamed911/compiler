/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
grammar pass1;


//parser


program : {System.out.println("1-");} (classdef SEM)+ {System.out.println("InheritanceGraph:");};
classdef : {System.out.println("2");} CLASS m = TYPE (INHERITS n = TYPE)? OPENA (feature SEM)* CLOSEA {System.out.println("class defenition: "+$m.getText() );}; 
feature: {System.out.println("3");} function = ID {System.out.println("new function!");} OPENP (formal(COM formal)*)? CLOSEP DOTS returnType = TYPE OPENA expr CLOSEA {System.out.println($function.getText()+"(...) : "+$returnType.getText());}
       | {System.out.println("4");} variableId = ID DOTS variableType = TYPE (ASSIGN expr)? {System.out.println($variableId.getText()+" : "+$variableType.getText());};
formal : {System.out.println("5");} inputId = ID DOTS inputType = TYPE {System.out.println($inputId.getText()+" : "+$inputType.getText());};
expr: {System.out.println("6");} ID ASSIGN expr 
    | {System.out.println("8");} ID OPENP (expr(COM expr)*)? CLOSEP
    | {System.out.println("9");} START_IF expr THEN expr ELSE expr END_IF
    | {System.out.println("10");} WHILE expr START_LOOP expr END_LOOP
    | {System.out.println("11");} OPENA (expr SEM)+ CLOSEA 
    | {System.out.println("12");} LET ID DOTS TYPE (ASSIGN expr)? (COM ID DOTS TYPE (ASSIGN expr)?)* IN expr  
    | {System.out.println("13");} START_CASE expr OF (ID DOTS TYPE BIGER_EQUAL expr SEM)+ END_CASE
    | {System.out.println("14");} NEW TYPE 
    | t;
t : {System.out.println("24");} NOT_FLAG a
  | a;
a: b aa;
aa: {System.out.println("21");} LESS b aa
 | {System.out.println("22");} LESS_EQUAL b aa
 | {System.out.println("23");} EQUAL b aa
 | ;
b: c bb;
bb: {System.out.println("16");} ADD c bb
 | {System.out.println("17");} SUB c bb
 | ;
c: f cc;
cc: {System.out.println("18");} MULTI f cc
 | {System.out.println("19");} DIVID f cc
 | ;
f: d z;
z: {System.out.println("7");} (AT TYPE)? DOT ID OPENP (expr(COM expr)*)? CLOSEP z
 | ;
d: {System.out.println("20");} NOT g
 | g;
g: {System.out.println("15");} ISVOID e
 | e;
e: {System.out.println("25");} OPENP expr CLOSEP
 | {System.out.println("27");} ('-'|) INTEGER 
 | {System.out.println("28");} STRING
 | {System.out.println("29");} TRUE
 | {System.out.println("30");} FALSE
 | {System.out.println("26");} ID
 | {System.out.println("6");} ID ASSIGN expr 
 | {System.out.println("8");} ID OPENP (expr(COM expr)*)? CLOSEP
 | {System.out.println("9");} START_IF expr THEN expr ELSE expr END_IF
 | {System.out.println("10");} WHILE expr START_LOOP expr END_LOOP
 | {System.out.println("11");} OPENA (expr SEM)+ CLOSEA 
 | {System.out.println("12");} LET ID DOTS TYPE (ASSIGN expr)? (COM ID DOTS TYPE (ASSIGN expr)?)* IN expr  
 | {System.out.println("13");} START_CASE expr OF (ID DOTS TYPE BIGER_EQUAL expr SEM)+ END_CASE
 | {System.out.println("14");} NEW TYPE ;
      

//lexer

WHITESPACE : [ ' '|'\r'|'\n'|'\t'|'\f'|'\v']+ ->skip ;
LINECOMMENT: ('--' (~('\n'|'\r')*))->skip;
COMMENT: ('(*' .*? '*)') -> skip;
INTEGER : ('0'..'9')+;
INHERITS: [iI][nN][hH][eE][rR][iI][tT][sS];
CLASS: [cC][lL][aA][sS][sS];
LET: [lL][eE][tT];
MULTI : '*';
DIVID : '/';
ADD : '+';
SUB : '-';
ASSIGN : '<-';
TRUE : 't'[rR][uU][eE];
FALSE : 'f'[aA][lL][sS][eE];
DOUBLE_COT : '"';
OPENP : '(';
CLOSEP : ')';
NOT_FLAG : [nN][oO][tT];
EQUAL : '=';
LESS_EQUAL : '<=';
LESS : '<' ;
NOT : '~';
ISVOID : [iI][sS][vV][oO][iI][dD];
NEW: [nN][eE][wW];
START_CASE: [cC][aA][sS][eE];
END_CASE: [eE][sS][aA][cC];
OF: [oO][fF];
BIGER_EQUAL: '=>';
IN: [iI][nN];
WHILE: [wW][hH][iI][lL][eE];
START_LOOP: [lL][oO][oO][pP];
END_LOOP: [pP][oO][oO][lL];
START_IF: [iI][fF];
END_IF: [fF][iI];
ELSE: [eE][lL][sS][eE];
THEN: [tT][hH][eE][nN];
OPENA: '{';
CLOSEA: '}';
SEM: ';';
COM: ',';
DOTS: ':';
DOT: '.';
AT: '@';
STRING : ('"')(.*?)('"');
ID : [a-z]([a-z]|[A-Z]|[0-9]|'_')*;		//45
TYPE: [A-Z]([a-z]|[A-Z]|[0-9]|'_')*; //46