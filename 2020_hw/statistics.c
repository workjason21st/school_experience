#include <stdio.h>
#include <stdlib.h>

int main() {
	int a,b,sum=0,max=0,min=100,i=1;
	float mean;
	do{
		printf("�п�J�@���X����ơG");
		scanf("%d",&a);
		fflush(stdin);
	}while(a<=0);
	
	while(i<=a){
		do{
			printf("\n�п�J�� %d ����ƭ�(0~100)�G",i);
			scanf("%d",&b);
			fflush(stdin);
		}while(b>100||b<0);
		
		sum=sum+b;
		mean=(float)sum/i;
		if(b>max){
			max=b;
		}
		if(b<min){
			min=b;
		}
		i++;
	}
	printf("\n�o%d����ƪ��`�X���G%d�A�̤j�Ȭ��G%d�A�̤p�Ȭ��G%d�A�����Ȭ��G%.2f",a,sum,max,min,mean);
	return 0;
}
