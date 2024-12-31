#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,j,n;
	printf("請輸入一個正整數:");
	scanf("%d",&n);
	for(i=1;i<=n;i++){
		for(j=1;j<=i;j++){
			printf("%d",j);
		}
		printf("\n");
	}
	return 0;
}
