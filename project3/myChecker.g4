grammar myChecker;

options {
   language = Java;
}

@header {
    // import packages here.
    import java.util.HashMap;
}

@members {
    boolean TRACEON = false;
    public interface TypeInfo {
        int Integer = 1;
		int Float = 2;
        int Char = 3;
		int Unknown = 4;
		int No_Exist = 5;
		int Error = 6;
        int Boolean = 7;
    }
    HashMap<String, Integer> symtab = new HashMap<String,Integer>();
}

headers: '#' INCLUDE STD_LIB headers {if (TRACEON) System.out.println("headers: INCLUDE STD_LIB headers");}
        | (function)*program {if (TRACEON) System.out.println("headers: program");}
        ;


function: (VOID|type) Identifier '(' type Identifier (',' type Identifier)*')' if_then_statements
            {if (TRACEON) System.out.println("function: (VOID|type) Identifier ( type Identifier (, type Identifier)*) if_then_statements}");}
        ;

program:VOID MAIN '(' ')' '{' declarations statements '}'
        {if (TRACEON) System.out.println("program: VOID MAIN () {declarations statements}");};

declarations: (CONST)?type Identifier ('[' Integer_constant ']')?';' declarations{
                if (TRACEON) System.out.println("declarations: type Identifier ; declarations"); 
                if (symtab.containsKey($Identifier.text)) {
                    System.out.println("Error! " + $Identifier.getLine() + ": Redeclared identifier " + $Identifier.text + ".");
                } else {
                    /* Add ID and its attr_type into the symbol table. */
                    symtab.put($Identifier.text, $type.attr_type);	   
                }
             }
           | { if (TRACEON) System.out.println("declarations: ");} ;

type returns [int attr_type]
    :INT{ 
            if (TRACEON) System.out.println("type: INT"); 
            $attr_type = TypeInfo.Integer;
        }
    | FLOAT{
            if (TRACEON) System.out.println("type: FLOAT"); 
            $attr_type = TypeInfo.Float;
        }
    | CHAR{
            if (TRACEON) System.out.println("type: CHAR"); 
            $attr_type = TypeInfo.Char;
        }
    | BOOL{
            if (TRACEON) System.out.println("type: CHAR"); 
            $attr_type = TypeInfo.Boolean;
        }
    ;

statements:statement statements{if (TRACEON) System.out.println("statements: statement statements");}
          |{if (TRACEON) System.out.println("statements: ");};

arith_expression returns [int attr_type]
        : a = addExpr{$attr_type=$a.attr_type;} (comp b = addExpr{
            if($a.attr_type == $b.attr_type){
                $attr_type = TypeInfo.Boolean;
            }else{
                $attr_type = TypeInfo.Error;
                System.out.println("Error! " + $a.start.getLine() + ": Type mismatch for the compare operand in an arith_expression.");
            }
        }
        )?{
            if (TRACEON) System.out.println("arith_expression: addExpr comp addExpr");
        }
                ;
comp: '>' {if (TRACEON) System.out.println("comp: >");}
    | '<' {if (TRACEON) System.out.println("comp: <");}
    | '==' {if (TRACEON) System.out.println("comp: ==");}
    | '!=' {if (TRACEON) System.out.println("comp: !=");}
    | '<=' {if (TRACEON) System.out.println("comp: <=");}
    | '>=' {if (TRACEON) System.out.println("comp: >=");}
    ;

addExpr returns [int attr_type]
        :a=multExpr{$attr_type=$a.attr_type;}( '+' b=multExpr{
            if(($a.attr_type == TypeInfo.Integer || $a.attr_type == TypeInfo.Float) && $a.attr_type == $b.attr_type){
                $attr_type = $a.attr_type;
            }else{
                $attr_type = TypeInfo.Error;
                System.out.println("Error! " + $a.start.getLine() + ": Type mismatch for the operator + in an expression.");
            }
        }| '-' c=multExpr{
            if(($a.attr_type == TypeInfo.Integer || $a.attr_type == TypeInfo.Float) && $a.attr_type == $c.attr_type){
                $attr_type = $a.attr_type;
            }else{
                $attr_type = TypeInfo.Error;
                System.out.println("Error! " + $a.start.getLine() + ": Type mismatch for the operator - in an expression.");
            }
        })*
        {if (TRACEON) System.out.println("addExpr: multExpr( '+' multExpr| '-' multExpr)*");}
         ;

multExpr returns [int attr_type]
        : a=signExpr{$attr_type=$a.attr_type;}
          ( '*' b=signExpr{
            if(($a.attr_type == TypeInfo.Integer || $a.attr_type == TypeInfo.Float) && $a.attr_type == $b.attr_type){
                $attr_type = $a.attr_type;
            }else{
                $attr_type = TypeInfo.Error;
                System.out.println("Error! " + $a.start.getLine() + ": Type mismatch for the operator * in an expression.");
            }
          }
          | '/' c=signExpr{
            if(($a.attr_type == TypeInfo.Integer || $a.attr_type == TypeInfo.Float) && $a.attr_type == $c.attr_type){
                $attr_type = $a.attr_type;
            }else{
                $attr_type = TypeInfo.Error;
                System.out.println("Error! " + $a.start.getLine() + ": Type mismatch for the operator / in an expression.");
            }
          }
          | '%' d=signExpr{
            if($a.attr_type == TypeInfo.Integer && $d.attr_type == TypeInfo.Integer){
                $attr_type = $a.attr_type;
            }else{
                $attr_type = TypeInfo.Error;
                System.out.println("Error! " + $a.start.getLine() + ": Type mismatch for the operator % in an expression.");
            }
          }
		  )* {if (TRACEON) System.out.println("multExpr: signExpr( '*' signExpr| '/' signExpr)*");}
		  ;

signExpr returns [int attr_type]
        :primaryExpr{
            if(TRACEON) System.out.println("signExpr: primaryExpr");
            $attr_type = $primaryExpr.attr_type;
        }
        | c='-' primaryExpr{
            if(TRACEON) System.out.println("signExpr: -primaryExpr");
            if($primaryExpr.attr_type == TypeInfo.Integer || $primaryExpr.attr_type ==  TypeInfo.Float){
                $attr_type = $primaryExpr.attr_type;
            }else{
                System.out.println("Error! " + $c.getLine() + ": Type mismatch for operator - (expected integer or float).");
                $attr_type = TypeInfo.Error;
            }
        }
		;
		  
primaryExpr returns [int attr_type]
           : Integer_constant{
                if(TRACEON) System.out.println("primaryExpr: Integer_constant");
                $attr_type = TypeInfo.Integer;
            }
           | Floating_point_constant{
                if(TRACEON) System.out.println("primaryExpr: Floating_point_constant");
                $attr_type = TypeInfo.Float;
            }
           | variable{
                if(TRACEON) System.out.println("primaryExpr: Identifier");
                $attr_type = $variable.attr_type;
            }
           | CHARACTER{
                if(TRACEON) System.out.println("primaryExpr: CHARACTER");
                $attr_type = TypeInfo.Char;
            }
           | STRING{if(TRACEON)System.out.println("primaryExpr: STRING");}
		   | '(' arith_expression ')'{
                if(TRACEON) System.out.println("primaryExpr: (arith_expression)");
                $attr_type = $arith_expression.attr_type;
            }
            | TRUE{
                $attr_type = TypeInfo.Boolean;
            }
            | FALSE{
                $attr_type = TypeInfo.Boolean;
            }
           ;

statement returns [int attr_type]
         : variable assign_statement e=';'{
                if(TRACEON) System.out.println("statement: Identifier = arith_expression ;");
                if($variable.attr_type != $assign_statement.attr_type){
                    $attr_type = TypeInfo.Error;
                    System.out.println("Error! " + $e.getLine() + ": Type mismatch for the operator = expression");
                }else{
                    $attr_type = $variable.attr_type;
                }
            }
         | IF '(' arith_expression ')' if_then_statements else_statements{
                if(TRACEON) System.out.println("statement: IF '(' arith_expression ')' if_then_statements else_statements");
                if($arith_expression.attr_type != TypeInfo.Boolean){
                    $attr_type = TypeInfo.Error;
                    System.out.println("Error! " + $IF.getLine() + ": Type mismatch for the if statement");
                }else{
                    $attr_type = TypeInfo.Boolean;
                }
            }
         | WHILE '(' arith_expression ')' if_then_statements {
                if(TRACEON) System.out.println("statement: WHILE '(' arith_expression ')' if_then_statements");
                if($arith_expression.attr_type != TypeInfo.Boolean){
                    $attr_type = TypeInfo.Error;
                    System.out.println("Error! " + $WHILE.getLine() + ": Type mismatch for the while statement");
                }else{
                    $attr_type = TypeInfo.Boolean;
                }
            }
         | DO if_then_statements WHILE '(' arith_expression ')'{
                if(TRACEON) System.out.println("statement: DO if_then_statements WHILE ( arith_expression )");
                if($arith_expression.attr_type != TypeInfo.Boolean){
                    $attr_type = TypeInfo.Error;
                    System.out.println("Error! " + $WHILE.getLine() + ": Type mismatch for the while statement");
                }else{
                    $attr_type = TypeInfo.Boolean;
                }
            }
         | FOR '('variable '=' arith_expression ';' arith_expression ';' variable assign_statement ')' if_then_statements{
                if(TRACEON) System.out.println("statement: FOR(variable = arith_expression ; arith_expression ; variable = arith_expression ) if_then_statements");
                if($arith_expression.attr_type != TypeInfo.Boolean){
                    $attr_type = TypeInfo.Error;
                    System.out.println("Error! " + $FOR.getLine() + ": Type mismatch for the for statement");
                }else{
                    $attr_type = TypeInfo.Boolean;
                }    
            }
         | PRINTF '(' STRING (',' arith_expression)* ')' ';'{
                if(TRACEON) System.out.println("statement: PRINTF ( STRING (, arith_expression)* );");
                $attr_type = TypeInfo.Integer;
            }
         | RETURN (arith_expression)? ';' {
                if(TRACEON) System.out.println("statement: return ;");
                $attr_type = TypeInfo.No_Exist;
            }
         | SWITCH '(' arith_expression ')' '{' switch_statements '}'{if(TRACEON) System.out.println("statement: SWITCH(arith_expression){switch_statements}");}
         | BREAK ';'{if(TRACEON) System.out.println("statement: break;");}
         | CONTINUE ';'{if(TRACEON) System.out.println("statement: continue;");}
		 ;


variable returns [int attr_type]:
         Identifier{
            if (symtab.containsKey($Identifier.text)) {
                $attr_type = symtab.get($Identifier.text);   
            } else {	
                System.out.println("Error! " + $Identifier.getLine() + ": variable " + $Identifier.text + " wasn't declared before.");
                $attr_type = TypeInfo.Error; 
            }
         }(b='['(v=variable{
            if($v.attr_type == TypeInfo.Integer){
                $attr_type = $v.attr_type;
            }else{
                $attr_type = TypeInfo.Error;
                System.out.println("Error! " + $b.getLine() + ": the type in [] should be integer.");
            }
         }|Integer_constant)']')?
        ;

assign_statement returns [int attr_type]
        : '=' arith_expression{
                if(TRACEON) System.out.println("assign_statement: '=' arith_expression");
                $attr_type = $arith_expression.attr_type;
            }
        | '+=' arith_expression{
                if(TRACEON) System.out.println("assign_statement: '+=' arith_expression");
                $attr_type = $arith_expression.attr_type;
            }
        | '-=' arith_expression{
                if(TRACEON) System.out.println("assign_statement: '-=' arith_expression");
                $attr_type = $arith_expression.attr_type;
            }
        | '*=' arith_expression{
                if(TRACEON) System.out.println("assign_statement: '*=' arith_expression");
                $attr_type = $arith_expression.attr_type;
            }
        | '/=' arith_expression{
                if(TRACEON) System.out.println("assign_statement: '/=' arith_expression");
                $attr_type = $arith_expression.attr_type;
            }
        | '%=' arith_expression{
                if(TRACEON) System.out.println("assign_statement: '%=' arith_expression");
                $attr_type = $arith_expression.attr_type;
            }
        | '++' {
                if(TRACEON) System.out.println("assign_statement: ++");
                $attr_type = TypeInfo.Integer;
            }
        | '--' {
                if(TRACEON) System.out.println("assign_statement: --");
                $attr_type = TypeInfo.Integer;
            }
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
BOOL: 'bool';
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
TRUE: 'true';
FALSE: 'false';

STD_LIB: ('<'(.)*?'.h>');
CHARACTER: ('\''.'\'');
Identifier:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
Integer_constant:'0'..'9'+;
Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;
STRING:'"' ('\\"' | ~'"')* '"';

WS:( ' ' | '\t' | '\r' | '\n' ) -> channel(HIDDEN);
COMMENT:('/*' (.)*? '*/'|'//'(.)*?'\n') -> channel(HIDDEN);
