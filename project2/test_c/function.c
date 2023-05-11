#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int add(int a, int b){
    return a + b;
}

void display(int x){
    printf("%d\n", x);
}

int main(){
    int a = 100, b = -20;
    int c = add(a, b);
    display(c);
    return 0;
}
