#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int year,month,day;
	char id[15],ids[15],name[5],names[5],ch[5],chs[5],en[5],ens[5];
	/*��J*/
	printf("�п�J���骺���(yyyy-mm-dd)�G");
	scanf(" %d- %d- %d",&year,&month,&day);
	fflush(stdin);
	printf("\n�п�J�Ĥ@��P�Ǫ��Ǹ��G");
	gets(id);
	printf("�п�J�Ĥ@��P�Ǫ��m�W�G");
	gets(name);
	printf("�п�J�Ĥ@��P�Ǫ���妨�Z�G");
	gets(ch);
	printf("�п�J�Ĥ@��P�Ǫ��^�妨�Z�G");
	gets(en);
	printf("\n�п�J�ĤG��P�Ǫ��Ǹ��G");
	gets(ids);
	printf("�п�J�ĤG��P�Ǫ��m�W�G");
	gets(names);
	printf("�п�J�ĤG��P�Ǫ���妨�Z�G");
	gets(chs);
	printf("�п�J�ĤG��P�Ǫ��^�妨�Z�G");
	gets(ens);
    /*��X*/
	printf("\n\n�A��J����Ʀp�U�G\n########################################################\n");
	printf("�Ǹ�\t\t�m�W\t\t��妨�Z\t�^�妨�Z\n");
	printf("--------------------------------------------------------\n");
	printf("%-15s\t%-5s\t\t%-5s\t\t%-5s\n",id,name,ch,en);
	printf("%-15s\t%-5s\t\t%-5s\t\t%-5s\n",ids,names,chs,ens);
	printf("########################################################\n");
	printf("����G%d/%02d/%02d\n\n\n",year,month,day);
	return 0;
}
