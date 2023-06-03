grammar myparser;

options {
   language = Java;
}

@header {
    // import packages here.
}

@members {
    boolean TRACEON = false;
}

headers: '#' INCLUDE STD_LIB headers {if (TRACEON) System.out.println("headers: INCLUDE STD_LIB headers");}
        | (function)*program {if (TRACEON) System.out.println("headers: program");}
        ;


function: (VOID|type) Identifier '(' type Identifier (',' type Identifier)*')' if_then_statements
            {if (TRACEON) System.out.println("function: (VOID|type) Identifier ( type Identifier (, type Identifier)*) if_then_statements}");}
        ;

program:VOID MAIN '(' ')' '{' declarations statements '}'
        {if (TRACEON) System.out.println("program: VOID MAIN () {declarations statements}");};

declarations: (CONST)?type Identifier ('[' Integer_constant ']')?';' declarations
             { if (TRACEON) System.out.println("declarations: type Identifier ; declarations ('[' Integer_constant ']')?"); }
           | { if (TRACEON) System.out.println("declarations: ");} ;

type:INT { if (TRACEON) System.out.println("type: INT"); }
   | FLOAT {if (TRACEON) System.out.println("type: FLOAT"); }
   | CHAR {if (TRACEON) System.out.println("type: CHAR"); }
   ;

statements:statement statements{if (TRACEON) System.out.println("statements: statement statements");}
          |{if (TRACEON) System.out.println("statements: ");};

arith_expression: addExpr (comp addExpr)?{if (TRACEON) System.out.println("arith_expression: addExpr comp addExpr");}
                ;
comp: '>' {if (TRACEON) System.out.println("comp: >");}
    | '<' {if (TRACEON) System.out.println("comp: <");}
    | '==' {if (TRACEON) System.out.println("comp: ==");}
    | '!=' {if (TRACEON) System.out.println("comp: !=");}
    | '<=' {if (TRACEON) System.out.println("comp: <=");}
    | '>=' {if (TRACEON) System.out.println("comp: >=");}
    ;

addExpr: multExpr( '+' multExpr| '-' multExpr)*
         {if (TRACEON) System.out.println("addExpr: multExpr( '+' multExpr| '-' multExpr)*");}
         ;

multExpr: signExpr
          ( '*' signExpr
          | '/' signExpr
          | '%' signExpr
		  )* {if (TRACEON) System.out.println("multExpr: signExpr( '*' signExpr| '/' signExpr)*");}
		  ;

signExpr: primaryExpr{if(TRACEON) System.out.println("signExpr: primaryExpr");}
        | '-' primaryExpr{if(TRACEON) System.out.println("signExpr: -primaryExpr");}
		;
		  
primaryExpr: Integer_constant{if(TRACEON) System.out.println("primaryExpr: Integer_constant");}
           | Floating_point_constant{if(TRACEON) System.out.println("primaryExpr: Floating_point_constant");}
           | variable{if(TRACEON) System.out.println("primaryExpr: variable");}
           | CHARACTER{if(TRACEON) System.out.println("primaryExpr: CHARACTER");}
           | STRING{if(TRACEON)System.out.println("primaryExpr: STRING");}
		   | '(' arith_expression ')'{if(TRACEON) System.out.println("primaryExpr: (arith_expression)");}
           ;

statement: variable assign_statement ';'{if(TRACEON) System.out.println("statement: variable assign_statement;");}
         | IF '(' arith_expression ')' if_then_statements else_statements{if(TRACEON) System.out.println("statement: IF '(' arith_expression ')' if_then_statements else_statements");}
         | WHILE '(' arith_expression ')' if_then_statements {if(TRACEON) System.out.println("statement: WHILE '(' arith_expression ')' if_then_statements");}
         | DO if_then_statements WHILE '(' arith_expression ')'{if(TRACEON) System.out.println("statement: DO if_then_statements WHILE ( arith_expression )");}
         | FOR '('variable '=' arith_expression ';' arith_expression ';' variable assign_statement ')' if_then_statements
          {if(TRACEON) System.out.println("statement: FOR(variable = arith_expression ; arith_expression ; variable = arith_expression ) if_then_statements");}
         | PRINTF '(' STRING (',' arith_expression)* ')' ';'{if(TRACEON) System.out.println("statement: PRINTF ( STRING (, arith_expression)* );");}
         | RETURN (arith_expression)? ';' {if(TRACEON) System.out.println("statement: return ;");}
         | SWITCH '(' arith_expression ')' '{' switch_statements '}'{if(TRACEON) System.out.println("statement: SWITCH(arith_expression){switch_statements}");}
         | BREAK ';'{if(TRACEON) System.out.println("statement: break;");}
         | CONTINUE ';'{if(TRACEON) System.out.println("statement: continue;");}
		 ;

variable: Identifier('['(variable|Integer_constant)']')?
        ;

assign_statement: '=' arith_expression{if(TRACEON) System.out.println("assign_statement: '=' arith_expression");}
                | '+=' arith_expression{if(TRACEON) System.out.println("assign_statement: '+=' arith_expression");}
                | '-=' arith_expression{if(TRACEON) System.out.println("assign_statement: '-=' arith_expression");}
                | '*=' arith_expression{if(TRACEON) System.out.println("assign_statement: '*=' arith_expression");}
                | '/=' arith_expression{if(TRACEON) System.out.println("assign_statement: '/=' arith_expression");}
                | '%=' arith_expression{if(TRACEON) System.out.println("assign_statement: '%=' arith_expression");}
                | '++' {if(TRACEON) System.out.println("assign_statement: ++");}
                | '--' {if(TRACEON) System.out.println("assign_statement: --");}
                ;

if_then_statements: statement{if(TRACEON) System.out.println("if_then_statements: statement");}
                  | '{' statements '}'{if(TRACEON) System.out.println("if_then_statements: {statements}");}
				  ;
else_statements: ELSE if_then_statements{if(TRACEON) System.out.println("else_statements: ELSE if_then_statements");}
                | {if (TRACEON) System.out.println("else_statements: ");}
                ;

switch_statements: (CASE (Integer_constant|Floating_point_constant) ':'switch_statement) switch_statements
                    {if(TRACEON) System.out.println("switch_statements: (CASE (Integer_constant|Floating_point_constant):switch_statement) switch_statements");}
                   | DEFAULT ':' switch_statement switch_statements {if(TRACEON) System.out.println("switch_statements: DEFAULT : switch_statement switch_statements");}
                   |
                   ;
switch_statement: statements {if(TRACEON) System.out.println("switch_statement: statements");}
                  | {if(TRACEON) System.out.println("switch_statement: ");}
				  ;
/* description of the tokens */
FLOAT:'float';
INT:'int';
CHAR: 'char';
MAIN: 'main';
VOID: 'void';
IF: 'if';
ELSE: 'else';
DO: 'do';
WHILE: 'while';
FOR: 'for';
PRINTF: 'printf';
RETURN: 'return';
SWITCH: 'switch';
CASE: 'case';
DEFAULT: 'default';
BREAK: 'break';
CONTINUE: 'continue';
INCLUDE: 'include';
CONST: 'const';

STD_LIB: ('<'(.)*?'.h>');
CHARACTER: ('\''.'\'');
Identifier:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
Integer_constant:'0'..'9'+;
Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;
STRING:'"' ('\\"' | ~'"')* '"';

WS:( ' ' | '\t' | '\r' | '\n' ) -> channel(HIDDEN);
COMMENT:('/*' (.)*? '*/'|'//'(.)*?'\n') -> channel(HIDDEN);
