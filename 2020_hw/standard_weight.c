#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(void) {
	float test;
	
	printf("\n��J�z������(cm):");
	scanf("%f",&test);
	
	printf("\n�b���������k�ʼз��魫��%.1f",(test-80)*0.7);
	printf("\n�b���������k�ʼз��魫��%.1f",(test-70)*0.6);
	return 0;
}
