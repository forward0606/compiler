grammar myCompiler;

options {
   language = Java;
}

@header {
   // import packages here.
   import java.util.HashMap;
   import java.util.ArrayList;
   import java.util.List;
}

@members {
   boolean TRACEON = false;

   // Type information.
   public enum Type{
      ERR, BOOL, INT, FLOAT, CHAR, CONST_INT;
   }

   // This structure is used to record the information of a variable or a constant.
   class tVar {
      int   varIndex; // temporary variable's index. Ex: t1, t2, ..., etc.
      int   iValue;   // value of constant integer. Ex: 123.
      float fValue;   // value of constant floating point. Ex: 2.314.
	};

   class Info {
      Type theType;  // type information.
      tVar theVar;
   
      Info() {
         theType = Type.ERR;
         theVar = new tVar();
      }
   };

	
   // ============================================
   // Create a symbol table.
	// ArrayList is easy to extend to add more info. into symbol table.
	//
	// The structure of symbol table:
	// <variable ID, [Type, [varIndex or iValue, or fValue]]>
	//    - type: the variable type   (please check "enum Type")
	//    - varIndex: the variable's index, ex: t1, t2, ...
	//    - iValue: value of integer constant.
	//    - fValue: value of floating-point constant.
   // ============================================

   HashMap<String, Info> symtab = new HashMap<String, Info>();

   // labelCount is used to represent temporary label.
   // The first index is 0.
   int labelCount = 0;

   // varCount is used to represent temporary variables.
   // The first index is 0.
   int varCount = 0;
   int strCount = 0;

   // Record all assembly instructions.
   List<String> GlobalCode = new ArrayList<String>();
   List<String> TextCode = new ArrayList<String>();
   List<String> Code = new ArrayList<String>();


    /*
     * Output prologue.
     */
   void prologue(){
      GlobalCode.add("; === prologue ====");
      GlobalCode.add("declare dso_local i32 @printf(i8*, ...)");
   }
    
	
    /*
     * Output epilogue.
     */
   void epilogue(){
      /* handle epilogue */
      TextCode.add("\n; === epilogue ===");
      TextCode.add("ret i32 0");
      TextCode.add("}");
      
      for (int i=0; i < GlobalCode.size(); i++){
         Code.add(GlobalCode.get(i));
      }
      Code.add("\n");
      for (int i=0; i < TextCode.size(); i++){
         Code.add(TextCode.get(i));
      }
   }
    
   int add_global_string(String s){
      String t = new String();
      int len = 1;
      for(int i=1;i<s.length()-1;i++){
         len += 1;
         if(s.charAt(i) == '\\'){
         // '\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')
         char c = s.charAt(i+1);
         if(c == 'b'){
            t += "\\08";
         }else if(c == 't'){
            t += "\\09";
         }else if(c == 'n'){
            t += "\\0A";
         }else if(c == 'f'){
            t += "\\0C";
         }else if(c == 'r'){
            t += "\\0D";
         }else if(c == '\"'){
            t += "\\22";
         }else if(c == '\''){
            t += "\\27";
         }else if(c == '\\'){
            t += "\\5C";
         }
         i++;
         }else{
            t += s.charAt(i);
         }
      }
      t += "\\00";
      GlobalCode.add("@str" + strCount + " = private unnamed_addr constant [" + len + " x i8] c\"" + t +"\"");
      strCount += 1;
      return len;
   }


   /* Generate a new label */
   String newLabel(){
         labelCount ++;
         return (new String("L")) + Integer.toString(labelCount);
   } 
    
    
   public List<String> getTextCode()
   {
      return Code;
   }
}

program: VOID MAIN '(' ')'{
            /* Output function prologue */
            prologue();
            TextCode.add("define dso_local i32 @main()");
            TextCode.add("{");
         }
        '{' 
            declarations
            statements
        '}'{
	         if (TRACEON)
	            System.out.println("VOID MAIN () {declarations statements}");

            /* output function epilogue */	  
            epilogue();
         }
         ;


declarations: type Identifier ';' declarations{
            if (TRACEON)
               System.out.println("declarations: type Identifier : declarations");

            if (symtab.containsKey($Identifier.text)) {
               // variable re-declared.
               System.out.println("Type Error: " + $Identifier.getLine() + ": Redeclared identifier.");
               System.exit(0);
            }
                 
            /* Add ID and its info into the symbol table. */
            Info the_entry = new Info();
            the_entry.theType = $type.attr_type;
            the_entry.theVar.varIndex = varCount;
            varCount ++;
            symtab.put($Identifier.text, the_entry);

            // issue the instruction.
            // Ex: \%a = alloca i32, align 4
            if ($type.attr_type == Type.INT) { 
               TextCode.add("%t" + the_entry.theVar.varIndex + " = alloca i32, align 4");
            }
         }
         |{
            if (TRACEON)
               System.out.println("declarations: ");
         }
         ;


type
returns [Type attr_type]
      : INT { if (TRACEON) System.out.println("type: INT"); $attr_type=Type.INT; }
      | CHAR { if (TRACEON) System.out.println("type: CHAR"); $attr_type=Type.CHAR; }
      | FLOAT {if (TRACEON) System.out.println("type: FLOAT"); $attr_type=Type.FLOAT; }
      ;


statements: statement statements
            |
            ;


statement: assign_stmt ';'
         | if_stmt
         | func_no_return_stmt ';'
         | for_stmt
         | printf_stmt ';'
         | while_stmt ';'
         ;

printf_stmt:'printf''(' STRING_LITERAL{
               int len = add_global_string($STRING_LITERAL.text);
               String text_code = "%t" + varCount + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([" + len + " x i8], [" +  len + " x i8]* @str" + (strCount-1) + ", i64 0, i64 0)";
               varCount += 1;

            } (',' arith_expression {
               Info para = $arith_expression.theInfo;
               if(para.theType == Type.INT){
                  //theRHS.theVar.varIndex
                  text_code += ", i32 %t" + para.theVar.varIndex;
               }else if(para.theType == Type.CONST_INT){
                  text_code += ", i32 " + para.theVar.iValue;
               }
            })* ')'{
                  text_code += ")";
                  System.out.println(";"+text_code);
                  TextCode.add(text_code);
            }
         ;

for_stmt: FOR '(' assign_stmt{
                  String backLabel = newLabel();
                  TextCode.add("br label %" + backLabel);
                  TextCode.add(backLabel + ":");
               } ';'cond_expression{
                  String iftrue = newLabel();
                  String falseLabel = newLabel();
                  if($cond_expression.theInfo.theType == Type.INT){
                     TextCode.add("br i1 %t" + $cond_expression.theInfo.theVar.varIndex+", label %" + iftrue + ", label %" + falseLabel);
                  }
                  String back = newLabel();
                  TextCode.add(back+":");
               }';' assign_stmt{
                  TextCode.add("br label %"+backLabel);
                  TextCode.add(iftrue+":");
               }
              ')'
                  block_stmt{
                  TextCode.add("br label %" + back);
                  TextCode.add(falseLabel+":");
               }
         ;

while_stmt: 
            'while'{
               String backLabel = newLabel();
               TextCode.add("br label %" + backLabel);
               TextCode.add(backLabel + ":");
            } '(' cond_expression{
               String iftrue = newLabel();
               String falseLabel = newLabel();
               if($cond_expression.theInfo.theType == Type.INT){
                  TextCode.add("br i1 %t" + $cond_expression.theInfo.theVar.varIndex+", label %" + iftrue + ", label %" + falseLabel);
               }
               TextCode.add(iftrue+":");
            }')'block_stmt{
               TextCode.add("br label %" + backLabel);
               TextCode.add(falseLabel+":");
            }
            ;
		 
if_stmt
      : if_then_stmt{
         String endLabel = newLabel();
         TextCode.add("br label %" + endLabel);
         TextCode.add($if_then_stmt.falseLabel+":");
      } if_else_stmt{
         TextCode.add("br label %" + endLabel);
         TextCode.add(endLabel+":");
      }
      ;

	   
if_then_stmt
returns [String falseLabel]
@init {$falseLabel = new String();}
            : IF '(' cond_expression ')'{
               String iftrue = newLabel();
               $falseLabel = newLabel();
               if($cond_expression.theInfo.theType == Type.INT){
                  TextCode.add("br i1 %t" + $cond_expression.theInfo.theVar.varIndex+", label %" + iftrue + ", label %"+$falseLabel);
               }
               TextCode.add(iftrue+":");
            } block_stmt
            ;


if_else_stmt
            : ELSE block_stmt{
               TextCode.add("; if_else_stmt -> ELSE block_stmt");
            }
            |
            ;

				  
block_stmt: '{' statements '}'
	   ;


assign_stmt: Identifier '=' arith_expression {
               Info theRHS = $arith_expression.theInfo;
				   Info theLHS = symtab.get($Identifier.text); 
               System.out.println(";" + $Identifier.text + ": type = " + theLHS.theType + ", value = " + theLHS.theVar.iValue);
               System.out.println(";" + "arith_expression : type = " + theRHS.theType + ", value = " + theRHS.theVar.varIndex);
		   
               if ((theLHS.theType == Type.INT) && (theRHS.theType == Type.INT)) {		   
                  // issue store insruction.
                  // Ex: store i32 \%tx, i32* \%ty
                  TextCode.add("store i32 %t" + theRHS.theVar.varIndex + ", i32* %t" + theLHS.theVar.varIndex);
				   } else if ((theLHS.theType == Type.INT) && (theRHS.theType == Type.CONST_INT)) {
                  // issue store insruction.
                  // Ex: store i32 value, i32* \%ty
                  TextCode.add("store i32 " + theRHS.theVar.iValue + ", i32* %t" + theLHS.theVar.varIndex);				
				   } 
			   }
            ;

		   
func_no_return_stmt: Identifier '(' argument ')'
                   ;


argument: arg (',' arg)*
        ;

arg: arith_expression
   | STRING_LITERAL
   ;
		   
cond_expression
returns [Info theInfo]
@init {$theInfo = new Info();}
               : a=arith_expression{
                  $theInfo = $a.theInfo;
               }
               (RelationOP b=arith_expression{
                  if($theInfo.theType != Type.INT && $theInfo.theType != Type.CONST_INT){
                     $theInfo.theType = Type.ERR;
                  }
                  if($b.theInfo.theType != Type.INT && $b.theInfo.theType != Type.CONST_INT){
                     $theInfo.theType = Type.ERR;
                  }
                  //RelationOP: '>' |'>=' | '<' | '<=' | '==' | '!=';
                  String op="";
                  switch ($RelationOP.text) {
                  case ">":
                     op = "sgt";
                     break; 
                  case ">=":
                     op = "sge";
                     break;
                  case "<":
                     op = "slt";
                     break;
                  case "<=":
                     op = "sle";
                     break;
                  case "==":
                     op = "eq";
                     break;
                  case "!=":
                     op = "ne";
                     break;
                  }
                  if(op == ""){
                     $theInfo.theType = Type.ERR;
                  }else{
                     String code = "%t"+varCount+" = "+"icmp "+ op + " i32 ";
                     if($theInfo.theType == Type.INT && $b.theInfo.theType == Type.INT){
                        TextCode.add(code+"%t"+$theInfo.theVar.varIndex+", %t"+$b.theInfo.theVar.varIndex);
                        $theInfo.theVar.varIndex = varCount;
                        varCount++;
                     }else if($theInfo.theType == Type.INT && $b.theInfo.theType == Type.CONST_INT){
                        TextCode.add(code+"%t"+$theInfo.theVar.varIndex+", "+$b.theInfo.theVar.iValue);
                        $theInfo.theVar.varIndex = varCount;
                        varCount++;
                     }else if($theInfo.theType == Type.CONST_INT && $b.theInfo.theType == Type.INT){
                        TextCode.add(code+$theInfo.theVar.iValue+", %t"+$b.theInfo.theVar.varIndex);
                        $theInfo.theVar.varIndex = varCount;
                        varCount++;
                     }else if($theInfo.theType == Type.CONST_INT && $b.theInfo.theType == Type.CONST_INT){
                        TextCode.add(code+$theInfo.theVar.iValue+", "+$b.theInfo.theVar.iValue);
                        $theInfo.theType = Type.INT;
                        $theInfo.theVar.varIndex = varCount;
                        varCount++;
                     }
                  }
               })
               ;
			   
arith_expression
returns [Info theInfo]
@init {$theInfo = new Info();}
               : a=multExpr { $theInfo=$a.theInfo; }
                  ( c='+' b=multExpr{
                     // We need to do type checking first.
                     if($a.theInfo.theType != Type.INT && $a.theInfo.theType != Type.CONST_INT){
                        System.out.println("Error! " + $c.getLine() + ": the type of operator + is incorrent!");
                        $theInfo.theType = Type.ERR;
                     }
                     if($b.theInfo.theType != Type.INT && $b.theInfo.theType != Type.CONST_INT){
                        System.out.println("Error! " + $c.getLine() + ": the type of operator + is incorrent!");
                        $theInfo.theType = Type.ERR;
                     }
                     // code generation.

                     if (($a.theInfo.theType == Type.INT) && ($b.theInfo.theType == Type.INT)) {
                        TextCode.add("%t" + varCount + " = add nsw i32 %t" + $theInfo.theVar.varIndex + ", %t" + $b.theInfo.theVar.varIndex);   
                        // Update arith_expression's theInfo.
                        $theInfo.theType = Type.INT;
                        $theInfo.theVar.varIndex = varCount;
                        varCount++;
                     } else if (($a.theInfo.theType == Type.INT) && ($b.theInfo.theType == Type.CONST_INT)) {
                        TextCode.add("%t" + varCount + " = add nsw i32 %t" + $theInfo.theVar.varIndex + ", " + $b.theInfo.theVar.iValue);
                        $theInfo.theType = Type.INT;
                        $theInfo.theVar.varIndex = varCount;
                        varCount++;
                     } else if (($a.theInfo.theType == Type.CONST_INT) && ($b.theInfo.theType == Type.INT)) {
                        TextCode.add("%t" + varCount + " = add nsw i32 " + $theInfo.theVar.iValue + ", " + $b.theInfo.theVar.varIndex);
                        $theInfo.theType = Type.INT;
                        $theInfo.theVar.varIndex = varCount;
                        varCount++;
                     }else if(($a.theInfo.theType == Type.CONST_INT) && ($b.theInfo.theType == Type.CONST_INT)) {
                        $theInfo.theType = Type.CONST_INT;
                        $theInfo.theVar.iValue += $b.theInfo.theVar.iValue;
                     }
                  }
                  | c='-' b=multExpr{
                     // We need to do type checking first.
                     if($a.theInfo.theType != Type.INT && $a.theInfo.theType != Type.CONST_INT){
                        System.out.println("Error! " + $c.getLine() + ": the type of operator - is incorrent!");
                        $theInfo.theType = Type.ERR;
                     }
                     if($b.theInfo.theType != Type.INT && $b.theInfo.theType != Type.CONST_INT){
                        System.out.println("Error! " + $c.getLine() + ": the type of operator - is incorrent!");
                        $theInfo.theType = Type.ERR;
                     }
                     // code generation.

                     if (($a.theInfo.theType == Type.INT) && ($b.theInfo.theType == Type.INT)) {
                        TextCode.add("%t" + varCount + " = sub nsw i32 %t" + $theInfo.theVar.varIndex + ", %t" + $b.theInfo.theVar.varIndex);   
                        // Update arith_expression's theInfo.
                        $theInfo.theType = Type.INT;
                        $theInfo.theVar.varIndex = varCount;
                        varCount++;
                     } else if (($a.theInfo.theType == Type.INT) && ($b.theInfo.theType == Type.CONST_INT)) {
                        TextCode.add("%t" + varCount + " = sub nsw i32 %t" + $theInfo.theVar.varIndex + ", " + $b.theInfo.theVar.iValue);
                        $theInfo.theType = Type.INT;
                        $theInfo.theVar.varIndex = varCount;
                        varCount++;
                     } else if (($a.theInfo.theType == Type.CONST_INT) && ($b.theInfo.theType == Type.INT)) {
                        TextCode.add("%t" + varCount + " = sub nsw i32 " + $theInfo.theVar.iValue + ", " + $b.theInfo.theVar.varIndex);
                        $theInfo.theType = Type.INT;
                        $theInfo.theVar.varIndex = varCount;
                        varCount++;
                     }else if(($a.theInfo.theType == Type.CONST_INT) && ($b.theInfo.theType == Type.CONST_INT)) {
                        $theInfo.theType = Type.CONST_INT;
                        $theInfo.theVar.iValue -= $b.theInfo.theVar.iValue;
                     }
                  }
               )*
               ;

multExpr
returns [Info theInfo]
@init {$theInfo = new Info();}
          : a=signExpr { $theInfo=$a.theInfo; }
          ( c='*' b=signExpr{
            //type check
            if($a.theInfo.theType != Type.INT && $a.theInfo.theType != Type.CONST_INT){
               System.out.println("Error! " + $c.getLine() + ": the type of operator * is incorrent!");
               $theInfo.theType = Type.ERR;
            }
            if($b.theInfo.theType != Type.INT && $b.theInfo.theType != Type.CONST_INT){
               System.out.println("Error! " + $c.getLine() + ": the type of operator * is incorrent!");
               $theInfo.theType = Type.ERR;
            }
            if($a.theInfo.theType == Type.INT && $b.theInfo.theType == Type.INT){
               TextCode.add("%t"+varCount+" = mul i32 %t" + $a.theInfo.theVar.varIndex + ", %t" + $b.theInfo.theVar.varIndex);
               $theInfo.theType = Type.INT;
               $theInfo.theVar.varIndex = varCount;
               varCount++;
            }else if($a.theInfo.theType == Type.CONST_INT && $b.theInfo.theType == Type.INT){
               TextCode.add("%t"+varCount+" = mul i32 " + $a.theInfo.theVar.iValue + ", %t" + $b.theInfo.theVar.varIndex);
               $theInfo.theType = Type.INT;
               $theInfo.theVar.varIndex = varCount;
               varCount++;
            }else if($a.theInfo.theType == Type.INT && $b.theInfo.theType == Type.CONST_INT){
               TextCode.add("%t"+varCount+" = mul i32 %t" + $a.theInfo.theVar.varIndex + ", " + $b.theInfo.theVar.iValue);
               $theInfo.theType = Type.INT;
               $theInfo.theVar.varIndex = varCount;
               varCount++;
            }else if($a.theInfo.theType == Type.CONST_INT && $b.theInfo.theType == Type.CONST_INT){
               $theInfo.theType = Type.CONST_INT;
               $theInfo.theVar.iValue = $a.theInfo.theVar.iValue * $b.theInfo.theVar.iValue;
            }
          }
          | c='/' b=signExpr{
            //type check
            if($a.theInfo.theType != Type.INT && $a.theInfo.theType != Type.CONST_INT){
               System.out.println("Error! " + $c.getLine() + ": the type of operator / is incorrent!");
               $theInfo.theType = Type.ERR;
            }
            if($b.theInfo.theType != Type.INT && $b.theInfo.theType != Type.CONST_INT){
               System.out.println("Error! " + $c.getLine() + ": the type of operator / is incorrent!");
               $theInfo.theType = Type.ERR;
            }
            if($a.theInfo.theType == Type.INT && $b.theInfo.theType == Type.INT){
               TextCode.add("%t"+varCount+" = sdiv i32 %t" + $a.theInfo.theVar.varIndex + ", %t" + $b.theInfo.theVar.varIndex);
               $theInfo.theType = Type.INT;
               $theInfo.theVar.varIndex = varCount;
               varCount++;
            }else if($a.theInfo.theType == Type.CONST_INT && $b.theInfo.theType == Type.INT){
               TextCode.add("%t"+varCount+" = sdiv i32 " + $a.theInfo.theVar.iValue + ", %t" + $b.theInfo.theVar.varIndex);
               $theInfo.theType = Type.INT;
               $theInfo.theVar.varIndex = varCount;
               varCount++;
            }else if($a.theInfo.theType == Type.INT && $b.theInfo.theType == Type.CONST_INT){
               TextCode.add("%t"+varCount+" = sdiv i32 %t" + $a.theInfo.theVar.varIndex + ", " + $b.theInfo.theVar.iValue);
               $theInfo.theType = Type.INT;
               $theInfo.theVar.varIndex = varCount;
               varCount++;
            }else if($a.theInfo.theType == Type.CONST_INT && $b.theInfo.theType == Type.CONST_INT){
               TextCode.add("%t"+varCount+" = sdiv i32 " + $a.theInfo.theVar.iValue + ", " + $b.theInfo.theVar.iValue);
               $theInfo.theType = Type.INT;
               $theInfo.theVar.varIndex = varCount;
               varCount++;
            }
          }
	  )*
	  ;

signExpr
returns [Info theInfo]
@init {$theInfo = new Info();}
         : a=primaryExpr { $theInfo=$a.theInfo; } 
         | c='-' a=primaryExpr{
            $theInfo=$a.theInfo;
            //type check
            if($a.theInfo.theType != Type.INT && $a.theInfo.theType != Type.CONST_INT){
               System.out.println("Error! " + $c.getLine() + ": the type of operator * is incorrent!");
               $theInfo.theType = Type.ERR;
            }
            if($a.theInfo.theType == Type.INT){
               TextCode.add("%t"+varCount+" = mul i32 %t" + $a.theInfo.theVar.varIndex + ", -1");
               $theInfo.theVar.varIndex = varCount;
               varCount++;
            }else{
               System.out.println(";$theInfo.theVar.iValue = " + $theInfo.theVar.iValue);
               $theInfo.theVar.iValue *= -1;
            }
         }
	;
		  
primaryExpr
returns [Info theInfo]
@init {$theInfo = new Info();}
           : Integer_constant{
               $theInfo.theType = Type.CONST_INT;
			      $theInfo.theVar.iValue = Integer.parseInt($Integer_constant.text);
            }
           | Floating_point_constant
           | Identifier{
               // get type information from symtab.
               Type the_type = symtab.get($Identifier.text).theType;
               $theInfo.theType = the_type;

               // get variable index from symtab.
               int vIndex = symtab.get($Identifier.text).theVar.varIndex;
         
               switch (the_type) {
               case INT: 
                  // get a new temporary variable and
                  // load the variable into the temporary variable.
                        
                  // Ex: \%tx = load i32, i32* \%ty.
                  TextCode.add("%t" + varCount + "=load i32, i32* %t" + vIndex);
                  
                  // Now, Identifier's value is at the temporary variable \%t[varCount].
                  // Therefore, update it.
                  $theInfo.theVar.varIndex = varCount;
                  varCount ++;
                  break;
               case FLOAT:
                  break;
               case CHAR:
                  break;
               }
            }
	         | '&' Identifier
	         | '(' arith_expression ')'{
               $theInfo = $arith_expression.theInfo;
            }
            ;

		   
/* description of the tokens */
FLOAT:'float';
INT:'int';
CHAR: 'char';

MAIN: 'main';
VOID: 'void';
IF: 'if';
ELSE: 'else';
FOR: 'for';

RelationOP: '>' |'>=' | '<' | '<=' | '==' | '!=';

Identifier:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
Integer_constant:'0'..'9'+;
Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;

STRING_LITERAL
   :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
   ;

// WS:( ' ' | '\t' | '\r' | '\n' ) -> channel(HIDDEN);
// COMMENT:'/*' .* '*/' -> channel(HIDDEN);
WS:( ' ' | '\t' | '\r' | '\n' ) -> channel(HIDDEN);
COMMENT:('/*' (.)*? '*/'|'//'(.)*?'\n') -> channel(HIDDEN);

fragment
EscapeSequence
   :   '\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')
   ;
