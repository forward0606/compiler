lexer grammar mylexer;

options {
  language = Java;
}

/*----------------------*/
/*       Keywords       */
/*----------------------*/
DO          : 'do';
STRUCT      : 'struct';
DEFINE      : 'define';
INCLUDE     : 'include';
RETURN      : 'return';
CONST       : 'const';

/*----------------------*/
/*     Type Keywords    */
/*----------------------*/
INT_TYPE    : 'int';
CHAR_TYPE   : 'char';
DOUBLE_TYPE : 'double';
VOID_TYPE   : 'void';
FLOAT_TYPE  : 'float';
LONG_TYPE   : 'long';


/*----------------------*/
/*  Condition Keywords  */
/*----------------------*/
IF_CON      : 'if';
ELSE_CON    : 'else';
FOR_LOOP    : 'for';
WHILE_LOOP  : 'while';


/*----------------------*/
/*  Compound Operators  */
/*----------------------*/
BIT_AND_OP  : '&';
BIT_OR_OP   : '|';
BIT_XOR_OP  : '^';
BIT_NOT_OP  : '~';
AND_OP      : '&&';
OR_OP       : '||';
NOT_OP      : '!';
MOD_OP      : '%';
DIV_OP      : '/';
MUL_OP      : '*';
ADD_OP      : '+';
SUB_OP      : '-';
ASSIGN_OP   : '=';
EQ_OP       : '==';
LE_OP       : '<=';
GE_OP       : '>=';
NE_OP       : '!=';
SHARP_OP    : '#';
LT_OP       : '<';
BT_OP       : '>';
PP_OP       : '++';
MM_OP       : '--'; 
RSHIFT_OP   : '<<';
LSHIFT_OP   : '>>';
QUESTION_OP : '?';
COLON       : ':';

/*----------------------*/
/*     Other Symbols    */
/*----------------------*/
COMMA       : ',';
SIMICOLON   : ';';
DOT         : '.';
SP_LEFT     : '(';
SP_RIGHT    : ')';
MP_LEFT     : '[';
MP_RIGHT    : ']';
BP_LEFT     : '{';
BP_RIGHT    : '}';
QUIOT       : '\'';


/*-----------------------*/
/* Some Usefull Function */
/*-----------------------*/
PRINTF_FUNCT: 'printf';
MAIN_FUNCT  : 'main';
STD_LIB     : ('<'(.)*?'.h>');
STRING      : ('"'(.)*?'"');

DEC_NUM : ('0' | ('1'..'9')(DIGIT)*);

ID : (LETTER)(LETTER | DIGIT)*;

FLOAT_NUM: FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;
fragment FLOAT_NUM3: (DIGIT)+;
 

/* Comments */
COMMENT1 : '//'(.)*?'\n';
COMMENT2 : '/*' (.)*? '*/';


NEW_LINE: '\n';

fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';


WS  : (' '|'\r'|'\t')+
    ;
