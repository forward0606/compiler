; === prologue ====
declare dso_local i32 @printf(i8*, ...)
@str0 = private unnamed_addr constant [13 x i8] c"Hello world\0A\00"
@str1 = private unnamed_addr constant [18 x i8] c"Hel\08lo world\09ddd\0A\00"
@str2 = private unnamed_addr constant [15 x i8] c"Hel\0Clo wo\5Crld\0A\00"
@str3 = private unnamed_addr constant [18 x i8] c"H\27e\27llo \22wo\22\5Crld\0A\00"


define dso_local i32 @main()
{
%t0 = alloca i32, align 4
%t1 = alloca i32, align 4
store i32 2, i32* %t1
store i32 4, i32* %t0
%t2=load i32, i32* %t1
%t3=load i32, i32* %t0
%t4 = add nsw i32 %t2, %t3
store i32 %t4, i32* %t1
%t5 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([13 x i8], [13 x i8]* @str0, i64 0, i64 0))
%t6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([18 x i8], [18 x i8]* @str1, i64 0, i64 0))
%t7 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([15 x i8], [15 x i8]* @str2, i64 0, i64 0))
%t8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([18 x i8], [18 x i8]* @str3, i64 0, i64 0))

; === epilogue ===
ret i32 0
}
