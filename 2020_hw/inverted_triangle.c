#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,j,n;
	printf("�п�J�@�ӥ����:");
	scanf("%d",&n);
	for(i=1;i<=n;n--){
		for(j=1;j<=n;j++){
			printf("%d",j);
		}
		printf("\n");
	}
	return 0;
}
