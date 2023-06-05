;_localctx.theInfo.theVar.iValue = 2
;a: type = INT, value = 0
;arith_expression : type = CONST_INT, value = 0
;b: type = INT, value = 0
;arith_expression : type = CONST_INT, value = 0
;c: type = INT, value = 0
;arith_expression : type = INT, value = 5
; === prologue ====
declare dso_local i32 @printf(i8*, ...)
@str0 = private unnamed_addr constant [7 x i8] c"a > b\0A\00"
@str1 = private unnamed_addr constant [8 x i8] c"a <= b\0A\00"
@str2 = private unnamed_addr constant [8 x i8] c"a == b\0A\00"
@str3 = private unnamed_addr constant [7 x i8] c"a < b\0A\00"


define dso_local i32 @main()
{
%t0 = alloca i32, align 4
%t1 = alloca i32, align 4
%t2 = alloca i32, align 4
store i32 -2, i32* %t2
store i32 6, i32* %t1
%t3=load i32, i32* %t1
%t4=load i32, i32* %t2
%t5 = sdiv i32 %t3, %t4
store i32 %t5, i32* %t0
%t6=load i32, i32* %t2
%t7=load i32, i32* %t1
%t8 = icmp sgt i32 %t6, %t7
br i1 %t8, label %L1, label %L2
L1:
%t9 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([7 x i8], [7 x i8]* @str0, i64 0, i64 0))
br label %L3
L2:
%t10 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @str1, i64 0, i64 0))
; if_else_stmt -> ELSE block_stmt
br label %L3
L3:
%t11=load i32, i32* %t2
%t12=load i32, i32* %t1
%t13 = icmp eq i32 %t11, %t12
br i1 %t13, label %L4, label %L5
L4:
%t14 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @str2, i64 0, i64 0))
br label %L6
L5:
br label %L6
L6:
%t15=load i32, i32* %t2
%t16=load i32, i32* %t1
%t17 = icmp slt i32 %t15, %t16
br i1 %t17, label %L7, label %L8
L7:
%t18 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([7 x i8], [7 x i8]* @str3, i64 0, i64 0))
br label %L9
L8:
br label %L9
L9:

; === epilogue ===
ret i32 0
}
