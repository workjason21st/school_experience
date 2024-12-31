#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(void) {
	float test;
	
	printf("\n輸入您的身高(cm):");
	scanf("%f",&test);
	
	printf("\n在此身高的男性標準體重為%.1f",(test-80)*0.7);
	printf("\n在此身高的女性標準體重為%.1f",(test-70)*0.6);
	return 0;
}
