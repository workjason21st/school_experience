#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int a;
	printf("�п�J�@�Ӿ�ơG");
	scanf("%d",&a);
	fflush(stdin);
	if(a%2!=0){
		printf("\n�A��J���Ʀr%d�O�_��",a);
	}
	if(a%2==0){
		printf("\n�A��J���Ʀr%d�O����",a);
	}
	return 0;
}
