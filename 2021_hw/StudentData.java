package zyx;

//�w�q���OStudent
class Student {
	//�w�q���O�����ݩʡA�åB��private�[�j�w����
	private int id;
	private String name;
	private String phone;
	private static int count;
	//�Х߫غc�����s���󪽱��]�ȡA�åB�i�H�p�⪫���`�ƶq
	public Student(int Id,String Name,String Phone){
		this.id=Id;
		this.name=Name;
		this.phone=Phone;
		count++;
	}
	//�w�q���O������k
	//�ǻ�����}�C���k�̡A�N�}�C������ƥ�����X
	public static void show(Student abc[]){
		System.out.println("-------Student information-------");
		//�Q�Υ��e�p�⪺�����`�ƶq�Ӱ���j��
		for(int i=0;i<Student.count;i++) {
			System.out.print("No."+i+"- ");
			System.out.print("Id:"+abc[i].id+" �A ");
			System.out.print("Name:"+abc[i].name+" �A ");
			System.out.println("Phone:"+abc[i].phone);
		}
	}
}

//�w�q�D���O
public class StudentData {

	public static void main(String[] args) {
		//�w�qStudent���O�̪�����}�C�ëإ߹���
		Student abc[];
		abc=new Student[9];
		abc[0]=new Student(210101,"ANDY","03-17484674");
		abc[1]=new Student(210102,"DENNY","09-79324148");
		abc[2]=new Student(210103,"JULLY","02-09713010");
		//�ϥ�Student�̪����O��ƱN��ƿ�X
		Student.show(abc);
	}

}
