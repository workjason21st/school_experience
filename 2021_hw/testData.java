package zyx;

//�w�q�����OPerson
class Person {
	//�w�q���O�����ݩʡA�åB��private�[�j�w����
	private int id;
	private String name;
	private String phone;
	//�w�q���O������k
	  //�i���O�]�w���O���ݩʪ���k
	public void setID(int Id){
		this.id=Id;
	}
	public void setName(String Name){
		this.name=Name;
	}
	public void setPhone(String Phone){
		this.phone=Phone;
	}
	//�Х߫غc�����s���󪽱��]��
	public Person(int Id,String Name,String Phone){
		this.id=Id;
		this.name=Name;
		this.phone=Phone;
	}
	//�N�����ƿ�X����k
	public void infoShow(){
		System.out.print("Super class__");
		System.out.print("Id:"+this.id+"  ");
		System.out.print("Name:"+this.name+"  ");
		System.out.println("Phone:"+this.phone);
	}
}
//�w�q�l���OEmployee
class Employee extends Person {
	//�w�q���O�����ݩʡA�åB��private�[�j�w����
	private String title;
	private int salary;
	//�w�q���O������k
	  //�i���O�]�w���O���ݩʪ���k
	public void setTitle(String Title){
		this.title=Title;
	}
	public void setSalary(int Salary){
		this.salary=Salary;
	}
	//�Х߫غc�����s���󪽱��]��
	public Employee(int Id,String Name,String Phone,String Title,int Salary){
		//���I�s�����O���غc��
		super(Id,Name,Phone);
		this.title=Title;
		this.salary=Salary;
	}
	//��g�����O����k�A�N��ƿ�X����k�X�g
	public void infoShow(){
		//�I�s�����O����X��k
		super.infoShow();
		System.out.print("Sub class__");
		System.out.print("Title:"+this.title+"  ");
		System.out.println("Salary:"+this.salary);
	}
}
//�w�q�l���OStudent
class Student extends Person {
	//�w�q���O�����ݩʡA�åB��private�[�j�w����
	private String status;
	//�w�q���O������k
	  //�i���O�]�w���O���ݩʪ���k
	public void setStatus(String Status){
		this.status=Status;
	}
	//�Х߫غc�����s���󪽱��]��
	public Student(int Id,String Name,String Phone,String Status){
		//���I�s�����O���غc��
		super(Id,Name,Phone);
		this.status=Status;
	}
	//��g�����O����k�A�N��ƿ�X����k�X�g
	public void infoShow(){
		//�I�s�����O����X��k
		super.infoShow();
		System.out.print("Sub class__");
		System.out.println("Status:"+this.status+"  ");
	}
}

//�w�q�D���O
public class testData {
	
	public static void main(String[] args) {
	//�إ�Person���O���x�}
	Person obj[]=new Person[7];
	//�ä��O�Q�Τl���O�إ߹���
	obj[0]=new Employee(130,"David","994706941","Doctor",56000);
	obj[1]=new Student(131,"Judy","941005644","senior");
	obj[2]=new Employee(132,"Alva","913217986","Police",50000);
	obj[3]=new Employee(133,"Dana","981156196","Engineer",52000);
	obj[4]=new Student(134,"Merry","967139013","freshman");
	obj[5]=new Student(135,"Andy","900231060","junior");
	obj[6]=new Employee(136,"Nora","981156196","Programmer",52000);
	//�ϥΰ}�C�����רӳ]�w�j�����
	for(int i=0;i<obj.length;i++) {
		System.out.println("Data:"+(i+1));
		//�̾ڪ��󤤤��P����g��k��X��T
		obj[i].infoShow();
		System.out.println("_______________________");
		}
	}
}
