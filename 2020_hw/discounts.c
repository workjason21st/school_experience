#include <stdio.h>
#include <stdlib.h>

int main() {
	int m;
	printf("�п�J�ʶR���B�G\n");
	scanf("%d",&m);
	printf("\n�A��J�����B���G%d\n",m);
	if (m>=10000){
		printf("���B�ŦX�馩����\n\n");
		if (m<30000)
			m=m*0.95;
		if (m>=30000&&m<50000)
			m=m*0.9;
		if (m>=50000&&m<100000)
			m=m*0.85;
		if (m>=100000)
			m=m*0.8;
		printf("�馩�᪺���B��%d\n",m);
	}
	else{
		printf("���B���ŦX�馩����A�S���馩\n");
	}
	return 0;
}
