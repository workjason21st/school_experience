#include <stdio.h>

int main() {
	int a,b;
	printf("�п�J��Ӿ�ơG\n");
	scanf("%d %d",&a,&b);
	printf("\n�o��Ӿ�ƪ��̤j���]�Ƭ� %d",gcd(&a,&b));		/*�Na,b��Ӫ���}�ǤJgcd���*/ 
	return 0;
}

/*����ƨϥ�����۰��k�DGCD*/
int gcd(int *p1,int *p2){
	int x=1;
	while(x!=0){
		x=*p1%*p2;	/*�Y�e�̰���̾l�Ƭ�0,�N���̬��̤j���]��*/
		*p1=*p2;	/*�Y�e�̰���̾l�Ƥ���0,�N�|����̷��U�@�����Q����*/ 
		*p2=x;		/*�l�Ʒ��U��������,���ƪ���l�Ƭ�0*/
	}
	return *p1;		/*�^�ǫ����ܼ�*/ 
}
