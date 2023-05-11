void main()
{
	int a;
	float b;
	const int c;
	a = b+1;
	if (a > 0) a = (2+4)-3;
	else if(b != 3) b = 2;
	else if(a % 2 == 0){
		b = a % 4;
	}
	else a = b - 2;
	switch(a){
		case 10:
		case 100:
			b = 5.9;
			break;
		default:
			b = 60;
		case 50:
			b = 10.58;
	}
}
