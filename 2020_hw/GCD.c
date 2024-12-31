#include <stdio.h>

int main() {
	int a,b;
	printf("請輸入兩個整數：\n");
	scanf("%d %d",&a,&b);
	printf("\n這兩個整數的最大公因數為 %d",gcd(&a,&b));		/*將a,b兩個的位址傳入gcd函數*/ 
	return 0;
}

/*此函數使用輾轉相除法求GCD*/
int gcd(int *p1,int *p2){
	int x=1;
	while(x!=0){
		x=*p1%*p2;	/*若前者除後者餘數為0,代表後者為最大公因數*/
		*p1=*p2;	/*若前者除後者餘數不為0,就會讓後者當成下一次的被除數*/ 
		*p2=x;		/*餘數當成下次的除數,重複直到餘數為0*/
	}
	return *p1;		/*回傳指標變數*/ 
}
