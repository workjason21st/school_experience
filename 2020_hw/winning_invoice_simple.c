#include <stdio.h>
int i=0,j=1,a=0,n=1,m=0;
int b[8]={0};

int main(){
	int c,d;
	int SP[8]={4,2,0,2,4,7,2,3};
	int S[8]={6,4,1,5,7,8,5,8};
	int One[8]={6,8,5,5,0,8,2,6};
	int ONe[8]={8,4,6,4,3,1,2,4};
	int ONE[8]={4,6,6,6,5,8,1,0};
	int six[8]={0,0,0,0,0,6,5,1};
	int SIX[8]={0,0,0,0,0,3,4,1};
	
	while(a>=0){
		printf("�п�J�z���Τ@�o�����X�G");
		scanf("%d",&c);
		d=c;
		/*���j��N��J������ন�}�C*/
		for(i=7;i>=0;i--){
			b[i]=d%10;
			d=d/10;
		}
		/*�N���P�������N�J�çP�_�O�_�ۦP*/
		n=0;
		m=8;
		a=1000;
		other(SP);
		if(a==1000){		/*�p�G�S���A�P�_�S��*/ 
			a=200;
			other(S);
		}
		if(a==200){			/*�p�G�S���A�P�_�Y��*/ 
			a=20;
			other(One);
			other(ONe);
			other(ONE);
		}
		/*�p�G�������N�P�_��L����*/
		if(a==20){
			for(n=1,m=7;n<7;n++,m--){		/*�q�G���}�l�P�_�A�S���N���U�P�_*/ 
				other(One);
				other(ONe);
				other(ONE);
			}
		}
		/*�p�G�٬O�������N�P�_�W�}����*/
		if(a==20){
			n=5;
			m=3;
			other(six);
			other(SIX);
		}
		/*�p�G�����F�N���L,�A����U�Ӥj�j��*/
		if(a==0){
			continue;
		}
		/*�������S�����N88*/
		else{
			printf("��p�I�z�S������\n\n");
		}
	}	
	return 0;
}

/*���Ƶ{���P�_��J���X�򤤼����X������ƬۦP�X��*/
int other(int s[8]){
	for(i=n,j=1;i<9&&j>=1;i++){				/*�q�}�C����n�Ӧ�ƶ}�l�P�_�B�u�n�@�Ӥ��P�N����*/
		if(b[i]==s[i]){						/*��J�Ʀr�O�_�򤤼����X�ۦP*/ 
			if(j==m){                       /*j�N��P�_���\�����ơAm�N��Ӽ����ݬۦP�����X��ơA�Y��̬ۦP�N���椤�X��*/
				if(j==8&&a==1000){						/*�p�G�b�P�_�S�O���ίS�����Y���ɸ��X���ۦP�N��X�ó]a=0*/
					printf("���߱z���S�O�� 1000 �U��\n\n");
					a=0;
					}
				else if(j==8&&a==200){
					printf("���߱z���S�� 200 �U��\n\n");
					a=0;
				}
				else if(j==8&&a==20){
					printf("���߱z���Y�� 20 �U��\n\n");
					a=0;
				}
				if(m==7&&a==20){						/*�Υ��X��ƧP�_�O���X��,�B�Ya�٬O20�N������,�Y�����N��X�ó]a=0*/
					printf("���߱z���G�� 4 �U��\n\n");
					a=0;
				}
				else if(m==6&&a==20){
					printf("���߱z���T�� 1 �U��\n\n");
					a=0;
				}
				else if(m==5&&a==20){
					printf("���߱z���|�� 4000 ��\n\n");
					a=0;
				}
				else if(m==4&&a==20){
					printf("���߱z������ 1000 ��\n\n");
					a=0;
				}
				else if(m==3&&a==20){
					printf("���߱z������ 200 ��\n\n");
					a=0;
					}
			}
			j++;										/*�p�G���\�ۦP�N�[�@*/
		}
		else{
			j=0;										/*�u�n���@�Ӥ��P�N�]j=0*/
		}
	}
}
