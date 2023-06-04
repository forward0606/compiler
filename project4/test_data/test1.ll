;_localctx.theInfo.theVar.iValue = 2
;a: type = INT, value = 0
;arith_expression : type = CONST_INT, value = 0
;b: type = INT, value = 0
;arith_expression : type = CONST_INT, value = 0
;c: type = INT, value = 0
;arith_expression : type = INT, value = 5
;a: type = INT, value = 0
;arith_expression : type = INT, value = 7
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
%t6=load i32, i32* %t1
%t7 = add nsw i32 %t6, 198
store i32 %t7, i32* %t2
%t8=load i32, i32* %t2
%t9 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @str0, i64 0, i64 0), i32 %t8)
%t10=load i32, i32* %t1
%t11 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @str1, i64 0, i64 0), i32 %t10)
%t12=load i32, i32* %t0
%t13 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @str2, i64 0, i64 0), i32 %t12)

; === epilogue ===
ret i32 0
}
