#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(void) {
	int ch,en,ma;
	
	printf("\n��J�q�ʰ��ҥ��ƶq:");
	scanf("%d",&ch);
	printf("\n��J�q�ʭ^��ҥ��ƶq:");
	scanf("%d",&en);
	printf("\n��J�q�ʼƾǽҥ��ƶq:");
	scanf("%d",&ma);
	
	printf("\n�o�O�q�ʦ��T�خѥ����`���B%d",(ch*300)+(en*750)+(ma*400));
	return 0;
}
