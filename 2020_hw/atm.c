#include <stdio.h>
#include <stdlib.h>

int main() {
	int m=1104,n,c=0,money=1000,add,d;
	char a;
	printf("請輸入金融卡密碼：");
	scanf("%d",&n);
	while(n!=m){
		printf("請確認金融卡密碼並重新輸入：");
		scanf("%d",&n);
	}
	
	do{
		printf("----------Welcome to  TKU ATM Service-----------\n");
		printf("1. 餘額查詢 Balance Inquiry\n2. 存簿提款 Withdraw\n3. 存簿存款 Deposit\n4. Quit\n");
		printf("------------------------------------------------\n\n Enter your choice：");
		scanf("%d",&c);
		switch(c){
			case 1:
				printf("\nYour Balance is %d",money);
				break;
			case 2:
				printf("\nEnter the amount to withdraw :");
				scanf("%d",&d);
				if(d>money){
					printf("\nInsufficent Balance");
				}
				else{
					money=money-d;
					printf("Your Balance is %d",money);
				}
				break;
			case 3:
				printf("\nEnter the amount to deposit :");
				scanf("%d",&add);
				money=money+add;
				printf("Your Balance is %d",money);
				break;
			default:
				break;
		}
		if(c!=4){
		printf("\n\nDo you with to have another transcation？(y/n)");
		fflush(stdin);
		scanf("%c",&a);
		switch(a){
			case 'y':
				break;
			case 'n':
				break;
		}
		}
		else if(c=4){
			a="y";
		}
	}while(a=='y');
	return 0;
}
