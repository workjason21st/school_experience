#include <stdio.h>
#include <stdlib.h>

int main() {
	int m;
	printf("請輸入購買金額：\n");
	scanf("%d",&m);
	printf("\n你輸入的金額為：%d\n",m);
	if (m>=10000){
		printf("金額符合折扣條件\n\n");
		if (m<30000)
			m=m*0.95;
		if (m>=30000&&m<50000)
			m=m*0.9;
		if (m>=50000&&m<100000)
			m=m*0.85;
		if (m>=100000)
			m=m*0.8;
		printf("折扣後的金額為%d\n",m);
	}
	else{
		printf("金額不符合折扣條件，沒有折扣\n");
	}
	return 0;
}
