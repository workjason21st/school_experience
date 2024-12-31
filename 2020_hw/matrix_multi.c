#include <stdio.h>
#include <stdlib.h>

int main() {
	int fir[3][3]={{1,2,3},{0,1,4},{5,6,0}};
	int sec[3][3]={{-24,18,5},{20,-15,-4},{-5,4,1}};
	int end[3][3]={0};
	/*將矩陣代入show函數 將矩陣顯示出來*/
	printf("第一個矩陣：\n");
	show(fir);
	printf("\n第二個矩陣：\n");
	show(sec);
	
	/*將矩陣代入matrix函數 讓它們進行矩陣乘法*/
	matrix(fir,sec,end);
	
	/*在main function裡呈現最後的結果*/
	printf("\n經矩陣乘法後的結果：\n");
	int m,n;
	for(m=0;m<3;m++){							/*控制矩陣的列*/
		for(n=0;n<3;n++){						/*控制矩陣的行*/
			printf("%3d		",*(*(end+m)+n)); 	/*利用雙重指標將矩陣顯示出來*/
		}
		printf("\n");
	}
	return 0;
}
/*矩陣乘法*/
int matrix(int a[3][3],int b[3][3],int c[3][3]){
	int i,j,k,l;						/*i,j,k,l依序代表了a的列、行及b的列、行*/
	for(i=0;i<3;i++){    				/*每次 列跟每行相乘後，增加第一個矩陣的指定列*/
		for(l=0;l<3;l++){				/*每次 列跟行相乘後，增加第二個矩陣的指定行*/
			for(j=0,k=0;j<3,k<3;j++,k++){	/*這代表第一個矩陣的指定列乘上第二個矩陣的指定行*/
			/*i和l也代表了c的列、行*/   									/*每次都會把相乘後的數再加先前的*/ 
			(*(*(c+i)+l))=(*(*(c+i)+l)) + (*(*(a+i)+j)) * (*(*(b+k)+l));	/*矩陣是3*3 所以這個動作每次執行三次*/ 
			}
		}
	}
	return c[3][3];/*回傳經矩陣乘法後的結果*/ 
}

/*將矩陣顯示出來*/ 
int show(int x[3][3]){
	int m,n;
	for(m=0;m<3;m++){
		for(n=0;n<3;n++){
			printf("%3d		",*(*(x+m)+n));
		}
		printf("\n");
	}
}
