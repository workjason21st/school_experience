#include <stdio.h>
#include <stdlib.h>

int a=1,b=1;

int main() {
	f(a,b);
	return 0;
}

int f(int n,int m){
	printf("%d * %d = %2d   ",n,m,n*m);
	n+=1;
	if(n<10){
		f(n,m);
	}
	if(n==10 && b!=9){
		printf("\n");
		f(a,++b);
	}
}
