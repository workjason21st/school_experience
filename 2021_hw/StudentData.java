package zyx;

//定義類別Student
class Student {
	//定義類別中的屬性，並且用private加強安全性
	private int id;
	private String name;
	private String phone;
	private static int count;
	//創立建構元讓新物件直接設值，並且可以計算物件總數量
	public Student(int Id,String Name,String Phone){
		this.id=Id;
		this.name=Name;
		this.phone=Phone;
		count++;
	}
	//定義類別中的方法
	//傳遞物件陣列到方法裡，將陣列中的資料全部輸出
	public static void show(Student abc[]){
		System.out.println("-------Student information-------");
		//利用先前計算的物件總數量來停止迴圈
		for(int i=0;i<Student.count;i++) {
			System.out.print("No."+i+"- ");
			System.out.print("Id:"+abc[i].id+" ， ");
			System.out.print("Name:"+abc[i].name+" ， ");
			System.out.println("Phone:"+abc[i].phone);
		}
	}
}

//定義主類別
public class StudentData {

	public static void main(String[] args) {
		//定義Student類別裡的物件陣列並建立實體
		Student abc[];
		abc=new Student[9];
		abc[0]=new Student(210101,"ANDY","03-17484674");
		abc[1]=new Student(210102,"DENNY","09-79324148");
		abc[2]=new Student(210103,"JULLY","02-09713010");
		//使用Student裡的類別函數將資料輸出
		Student.show(abc);
	}

}
