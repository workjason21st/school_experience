#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(void) {
	int ch,en,ma;
	
	printf("\n輸入訂購國文課本數量:");
	scanf("%d",&ch);
	printf("\n輸入訂購英文課本數量:");
	scanf("%d",&en);
	printf("\n輸入訂購數學課本數量:");
	scanf("%d",&ma);
	
	printf("\n這是訂購此三種書本的總金額%d",(ch*300)+(en*750)+(ma*400));
	return 0;
}
