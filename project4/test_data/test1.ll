;_localctx.theInfo.theVar.iValue = 2
;a: type = INT, value = 0
;arith_expression : type = CONST_INT, value = 0
;b: type = INT, value = 0
;arith_expression : type = CONST_INT, value = 0
;c: type = INT, value = 0
;arith_expression : type = INT, value = 5
; === prologue ====
declare dso_local i32 @printf(i8*, ...)
@str0 = private unnamed_addr constant [8 x i8] c"a = %d\0A\00"
@str1 = private unnamed_addr constant [8 x i8] c"b = %d\0A\00"
@str2 = private unnamed_addr constant [8 x i8] c"c = %d\0A\00"


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
%t7=load i32, i32* %t2
%t8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @str0, i64 0, i64 0), i32 %t7)
%t9=load i32, i32* %t1
%t10 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @str1, i64 0, i64 0), i32 %t9)
%t11=load i32, i32* %t0
%t12 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @str2, i64 0, i64 0), i32 %t11)

; === epilogue ===
ret i32 0
}
