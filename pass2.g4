/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
grammar pass2;


//parser


program : {System.out.println("1-");} (classdef SEM)+ {System.out.println("InheritanceGraph:");};
classdef : {System.out.println("2");} CLASS m = TYPE (INHERITS n = TYPE)? OPENA (feature SEM)* CLOSEA {System.out.println("class defenition: "+$m.getText() );}; 
feature: {System.out.println("3");} function = ID {System.out.println("new function!");} OPENP (formal(COM formal)*)? CLOSEP DOTS returnType = TYPE OPENA expr CLOSEA {System.out.println($function.getText()+"(...) : "+$returnType.getText());}
       | {System.out.println("4");} variableId = ID DOTS variableType = TYPE (ASSIGN expr)? {System.out.println($variableId.getText()+" : "+$variableType.getText());};
formal : {System.out.println("5");} inputId = ID DOTS inputType = TYPE {System.out.println($inputId.getText()+" : "+$inputType.getText());};
expr: leftHand = ID {System.out.println("assign expresion\t" + $leftHand.getText() );} ASSIGN {System.out.println("assign right hand");} expr {System.out.println("after expression");} 
    | {System.out.println("function call");} functionName = ID OPENP ( {System.out.println("first argument");} expr(COM {System.out.println("all argument");} expr)*)? CLOSEP
    |  START_IF expr {System.out.println("condition in if");} THEN {System.out.println("if expresion");} expr {System.out.println("end if expresion");} ELSE {System.out.println("else expresion");} expr {System.out.println("end else expresion");} END_IF
    |  WHILE  expr {System.out.println("condition in while");} START_LOOP {System.out.println("while body started");} expr {System.out.println("while body finished");}END_LOOP
    |  OPENA {System.out.println("new block created");} (expr SEM)+ CLOSEA {System.out.println("new block closed");} 
    | {System.out.println("let command");} LET letId1= ID DOTS letType1= TYPE (ASSIGN  expr {System.out.println("initial for letid1");} )? (COM letIdn= ID DOTS letTypen= TYPE (ASSIGN expr {System.out.println("initial for letIDn");})?)* IN {System.out.println("let body");} expr {System.out.println("let body finished");}  
    | START_CASE expr {System.out.println("case expresion");} OF (caseId= ID DOTS caseType= TYPE {System.out.println("initial new variable! in case");} BIGER_EQUAL {System.out.println("case expresion start");} expr {System.out.println("case expresion ended");} SEM)+ END_CASE
    | NEW newType= TYPE {System.out.println("newType");} 
    | t;
t : NOT_FLAG a {System.out.println("not statement boolean");}
  | a;
a: b{System.out.println("left side in condition");} aa;
aa: LESS b {System.out.println("right Side less");} aa
 |  LESS_EQUAL b {System.out.println("right side LESS_EQUAL");} aa
 |  EQUAL b {System.out.println("right side equal");} aa
 | ;
b: c {System.out.println("left side in operation add and sub");} bb {System.out.println("return type add or sub");};
bb: ADD c {System.out.println("right side in add");} bb
 |  SUB c {System.out.println("right side in SUB");} bb
 | ;
c: f {System.out.println("left side in operation mult and div");} cc;
cc: MULTI f {System.out.println("right side in multi");} cc
 |  DIVID f {System.out.println("right side in divid");} cc
 | ;
f: d {System.out.println("store variable");} z;
z: (AT parentType = TYPE)? DOT parentFunc= ID OPENP ( parArg1 =expr {System.out.println("add father function arg1");}(COM parArg2= expr {System.out.println("add father function argN");})*)? CLOSEP {System.out.println("call father function");} z
 | ;
d: NOT g {System.out.println("not expression");}
 | g;
g: ISVOID e {System.out.println("is void expresion");}
 | e;
e: OPENP expr CLOSEP {System.out.println("expression in pranthesess");}
 | ('-'|) number = INTEGER {System.out.println("integer usage\t" + $number.getText() );}
 | STRING {System.out.println("String used");}
 | TRUE {System.out.println("true used");}
 | FALSE {System.out.println("false used");}
 | generalId = ID {System.out.println("here is id\t" + $generalId.getText() );}
 | leftHand = ID {System.out.println("assign expresion\t"+ $leftHand.getText() );} ASSIGN {System.out.println("assign right hand started");} expr {System.out.println("assign right hand finished");}
 | {System.out.println("function call");} functionName = ID OPENP ( {System.out.println("first argument");} expr(COM {System.out.println("all argument");} expr)*)? CLOSEP
 | START_IF expr {System.out.println("condition in if");} THEN {System.out.println("if expresion");} expr {System.out.println("end if expresion");} ELSE {System.out.println("else expresion");} expr {System.out.println("end else expresion");} END_IF
 | WHILE  expr {System.out.println("condition in while");} START_LOOP {System.out.println("while body started");} expr {System.out.println("while body finished");}END_LOOP
 | OPENA {System.out.println("new block created");} (expr SEM)+ CLOSEA {System.out.println("new block closed");}
 | {System.out.println("let command");} LET letId1= ID DOTS letType1 = TYPE (ASSIGN  expr {System.out.println("initial for letid1");} )? (COM letIdn= ID DOTS letTypen= TYPE (ASSIGN expr {System.out.println("initial for letIDn");})?)* IN {System.out.println("let body");} expr {System.out.println("let body finished");}   
 | START_CASE expr {System.out.println("case expresion");} OF (caseId= ID DOTS caseType= TYPE {System.out.println("initial new variable! in case");} BIGER_EQUAL {System.out.println("case expresion start");} expr {System.out.println("case expresion ended");} SEM)+ END_CASE
 | NEW newType= TYPE {System.out.println("newType");} ;
      

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
ID : [a-z]([a-z]|[A-Z]|[0-9]|'_')*;     //45
TYPE: [A-Z]([a-z]|[A-Z]|[0-9]|'_')*; //46