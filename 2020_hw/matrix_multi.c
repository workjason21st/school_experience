#include <stdio.h>
#include <stdlib.h>

int main() {
	int fir[3][3]={{1,2,3},{0,1,4},{5,6,0}};
	int sec[3][3]={{-24,18,5},{20,-15,-4},{-5,4,1}};
	int end[3][3]={0};
	/*�N�x�}�N�Jshow��� �N�x�}��ܥX��*/
	printf("�Ĥ@�ӯx�}�G\n");
	show(fir);
	printf("\n�ĤG�ӯx�}�G\n");
	show(sec);
	
	/*�N�x�}�N�Jmatrix��� �����̶i��x�}���k*/
	matrix(fir,sec,end);
	
	/*�bmain function�̧e�{�̫᪺���G*/
	printf("\n�g�x�}���k�᪺���G�G\n");
	int m,n;
	for(m=0;m<3;m++){							/*����x�}���C*/
		for(n=0;n<3;n++){						/*����x�}����*/
			printf("%3d		",*(*(end+m)+n)); 	/*�Q���������бN�x�}��ܥX��*/
		}
		printf("\n");
	}
	return 0;
}
/*�x�}���k*/
int matrix(int a[3][3],int b[3][3],int c[3][3]){
	int i,j,k,l;						/*i,j,k,l�̧ǥN��Fa���C�B���b���C�B��*/
	for(i=0;i<3;i++){    				/*�C�� �C��C��ۭ���A�W�[�Ĥ@�ӯx�}�����w�C*/
		for(l=0;l<3;l++){				/*�C�� �C���ۭ���A�W�[�ĤG�ӯx�}�����w��*/
			for(j=0,k=0;j<3,k<3;j++,k++){	/*�o�N��Ĥ@�ӯx�}�����w�C���W�ĤG�ӯx�}�����w��*/
			/*i�Ml�]�N��Fc���C�B��*/   									/*�C�����|��ۭ��᪺�ƦA�[���e��*/ 
			(*(*(c+i)+l))=(*(*(c+i)+l)) + (*(*(a+i)+j)) * (*(*(b+k)+l));	/*�x�}�O3*3 �ҥH�o�Ӱʧ@�C������T��*/ 
			}
		}
	}
	return c[3][3];/*�^�Ǹg�x�}���k�᪺���G*/ 
}

/*�N�x�}��ܥX��*/ 
int show(int x[3][3]){
	int m,n;
	for(m=0;m<3;m++){
		for(n=0;n<3;n++){
			printf("%3d		",*(*(x+m)+n));
		}
		printf("\n");
	}
}
