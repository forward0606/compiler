;i: type = INT, value = 0
;arith_expression : type = CONST_INT, value = 0
;x: type = INT, value = 0
;arith_expression : type = CONST_INT, value = 0
;y: type = INT, value = 0
;arith_expression : type = CONST_INT, value = 0
;i: type = INT, value = 0
;arith_expression : type = CONST_INT, value = 0
;i: type = INT, value = 0
;arith_expression : type = INT, value = 7
;j: type = INT, value = 0
;arith_expression : type = CONST_INT, value = 0
;j: type = INT, value = 0
;arith_expression : type = INT, value = 11
;%t12 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([16 x i8], [16 x i8]* @str0, i64 0, i64 0), i32 %t13, i32 %t14)
;%t15 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([13 x i8], [13 x i8]* @str1, i64 0, i64 0))
; === prologue ====
declare dso_local i32 @printf(i8*, ...)
@str0 = private unnamed_addr constant [16 x i8] c"i = %d, j = %d\0A\00"
@str1 = private unnamed_addr constant [13 x i8] c"Hello world\0A\00"


define dso_local i32 @main()
{
%t0 = alloca i32, align 4
%t1 = alloca i32, align 4
%t2 = alloca i32, align 4
%t3 = alloca i32, align 4
store i32 5, i32* %t1
store i32 0, i32* %t3
store i32 0, i32* %t2
store i32 0, i32* %t1
br label %L1
L1:
%t4=load i32, i32* %t1
%t5 = icmp slt i32 %t4, 5
br i1 %t5, label %L2, label %L3
L4:
%t6=load i32, i32* %t1
%t7 = add nsw i32 %t6, 1
store i32 %t7, i32* %t1
br label %L1
L2:
store i32 0, i32* %t0
br label %L5
L5:
%t8=load i32, i32* %t0
%t9 = icmp slt i32 %t8, 5
br i1 %t9, label %L6, label %L7
L8:
%t10=load i32, i32* %t0
%t11 = add nsw i32 %t10, 1
store i32 %t11, i32* %t0
br label %L5
L6:
%t13=load i32, i32* %t1
%t14=load i32, i32* %t0
%t12 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([16 x i8], [16 x i8]* @str0, i64 0, i64 0), i32 %t13, i32 %t14)
br label %L8
L7:
br label %L4
L3:
%t15 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([13 x i8], [13 x i8]* @str1, i64 0, i64 0))

; === epilogue ===
ret i32 0
}
