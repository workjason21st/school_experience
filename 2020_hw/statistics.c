#include <stdio.h>
#include <stdlib.h>

int main() {
	int a,b,sum=0,max=0,min=100,i=1;
	float mean;
	do{
		printf("請輸入共有幾筆資料：");
		scanf("%d",&a);
		fflush(stdin);
	}while(a<=0);
	
	while(i<=a){
		do{
			printf("\n請輸入第 %d 筆資料值(0~100)：",i);
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
	printf("\n這%d筆資料的總合為：%d，最大值為：%d，最小值為：%d，平均值為：%.2f",a,sum,max,min,mean);
	return 0;
}
