#include<stdio.h>
#include<stdlib.h>

int sum(int a, int b){
	return a + b;
}

void main()
{
	int a;
	float b;
	const int c;
	a = b+1;

	
	printf("%d", a);
	printf("%d%lf", a, b);
	printf("%d%lf", a, b, 5);
	return ;
}
