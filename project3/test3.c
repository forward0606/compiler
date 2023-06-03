#include<stdio.h>
#include<stdlib.h>

// int sum(int a, int b){
// 	return a + b;
// }

void main()
{
	int a;
	int b;
	float c;
	char d;
	char string[50];
    bool res;

	a = b + 1;
	a = b - 2;
	a = b * 2;
	a = b / 2;
	a = b % 2;

	a += 2;
	a -= 4;
	a *= 5;
	a /= 5;
	a %= 10;

	res = (a > b);
	res = (a < b);
	res = (a == b);
	res = (a != b);
	res = (a <= b);
	res = (a >= b);
    res = false;
	a++;
	b--;
	for(a = 0;a<10;a++){
		b++;
	}

	d = 'c';
	d = string[0];
	string[1] = 'f';
	break;
	continue;
	printf("%d", a);
	printf("%d%lf", a, b);
	printf("%d%lf", a, b, 5);
	if (a > 0){
		a = (2+4)-3;
	}
	else if(b == 3){
		b = 2;
		while(b>0)b++;
	}
	else if(a % 2 == 0){
		b = a % 4;
	}

	return ;
}
