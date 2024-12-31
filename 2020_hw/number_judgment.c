#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int a;
	printf("叫块俱计");
	scanf("%d",&a);
	fflush(stdin);
	if(a%2!=0){
		printf("\n块计%d琌计",a);
	}
	if(a%2==0){
		printf("\n块计%d琌案计",a);
	}
	return 0;
}
