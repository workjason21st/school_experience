#include <stdio.h>
#include <stdlib.h>

int main() {
	int m=1104,n,c=0,money=1000,add,d;
	char a;
	printf("�п�J���ĥd�K�X�G");
	scanf("%d",&n);
	while(n!=m){
		printf("�нT�{���ĥd�K�X�í��s��J�G");
		scanf("%d",&n);
	}
	
	do{
		printf("----------Welcome to  TKU ATM Service-----------\n");
		printf("1. �l�B�d�� Balance Inquiry\n2. �sï���� Withdraw\n3. �sï�s�� Deposit\n4. Quit\n");
		printf("------------------------------------------------\n\n Enter your choice�G");
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
		printf("\n\nDo you with to have another transcation�H(y/n)");
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
