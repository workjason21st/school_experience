#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int year,month,day;
	char id[15],ids[15],name[5],names[5],ch[5],chs[5],en[5],ens[5];
	/*輸入*/
	printf("請輸入今日的日期(yyyy-mm-dd)：");
	scanf(" %d- %d- %d",&year,&month,&day);
	fflush(stdin);
	printf("\n請輸入第一位同學的學號：");
	gets(id);
	printf("請輸入第一位同學的姓名：");
	gets(name);
	printf("請輸入第一位同學的國文成績：");
	gets(ch);
	printf("請輸入第一位同學的英文成績：");
	gets(en);
	printf("\n請輸入第二位同學的學號：");
	gets(ids);
	printf("請輸入第二位同學的姓名：");
	gets(names);
	printf("請輸入第二位同學的國文成績：");
	gets(chs);
	printf("請輸入第二位同學的英文成績：");
	gets(ens);
    /*輸出*/
	printf("\n\n你輸入的資料如下：\n########################################################\n");
	printf("學號\t\t姓名\t\t國文成績\t英文成績\n");
	printf("--------------------------------------------------------\n");
	printf("%-15s\t%-5s\t\t%-5s\t\t%-5s\n",id,name,ch,en);
	printf("%-15s\t%-5s\t\t%-5s\t\t%-5s\n",ids,names,chs,ens);
	printf("########################################################\n");
	printf("日期：%d/%02d/%02d\n\n\n",year,month,day);
	return 0;
}
