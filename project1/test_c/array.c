#include<stdio.h>
#include<stdlib.h>
#include<string.h>


int main(){
    int x = 100, y = 50;
    printf("x = %d, y = %d\n", x, y);
    int a[10];
    a[0] = x;
	char c = 'c';
	c = ' ';
    c = '\'';
    for(int i=1;i<10;i++){
        a[i] = a[i-1] * y;
		printf("a[%d] = %d\n", i, a[i]);
    }
    return 0;
}
