package zyx;

//定義父類別Person
class Person {
	//定義類別中的屬性，並且用private加強安全性
	private int id;
	private String name;
	private String phone;
	//定義類別中的方法
	  //可分別設定類別中屬性的方法
	public void setID(int Id){
		this.id=Id;
	}
	public void setName(String Name){
		this.name=Name;
	}
	public void setPhone(String Phone){
		this.phone=Phone;
	}
	//創立建構元讓新物件直接設值
	public Person(int Id,String Name,String Phone){
		this.id=Id;
		this.name=Name;
		this.phone=Phone;
	}
	//將物件資料輸出的方法
	public void infoShow(){
		System.out.print("Super class__");
		System.out.print("Id:"+this.id+"  ");
		System.out.print("Name:"+this.name+"  ");
		System.out.println("Phone:"+this.phone);
	}
}
//定義子類別Employee
class Employee extends Person {
	//定義類別中的屬性，並且用private加強安全性
	private String title;
	private int salary;
	//定義類別中的方法
	  //可分別設定類別中屬性的方法
	public void setTitle(String Title){
		this.title=Title;
	}
	public void setSalary(int Salary){
		this.salary=Salary;
	}
	//創立建構元讓新物件直接設值
	public Employee(int Id,String Name,String Phone,String Title,int Salary){
		//先呼叫父類別的建構元
		super(Id,Name,Phone);
		this.title=Title;
		this.salary=Salary;
	}
	//改寫父類別的方法，將資料輸出的方法擴寫
	public void infoShow(){
		//呼叫父類別的輸出方法
		super.infoShow();
		System.out.print("Sub class__");
		System.out.print("Title:"+this.title+"  ");
		System.out.println("Salary:"+this.salary);
	}
}
//定義子類別Student
class Student extends Person {
	//定義類別中的屬性，並且用private加強安全性
	private String status;
	//定義類別中的方法
	  //可分別設定類別中屬性的方法
	public void setStatus(String Status){
		this.status=Status;
	}
	//創立建構元讓新物件直接設值
	public Student(int Id,String Name,String Phone,String Status){
		//先呼叫父類別的建構元
		super(Id,Name,Phone);
		this.status=Status;
	}
	//改寫父類別的方法，將資料輸出的方法擴寫
	public void infoShow(){
		//呼叫父類別的輸出方法
		super.infoShow();
		System.out.print("Sub class__");
		System.out.println("Status:"+this.status+"  ");
	}
}

//定義主類別
public class testData {
	
	public static void main(String[] args) {
	//建立Person類別的矩陣
	Person obj[]=new Person[7];
	//並分別利用子類別建立實體
	obj[0]=new Employee(130,"David","994706941","Doctor",56000);
	obj[1]=new Student(131,"Judy","941005644","senior");
	obj[2]=new Employee(132,"Alva","913217986","Police",50000);
	obj[3]=new Employee(133,"Dana","981156196","Engineer",52000);
	obj[4]=new Student(134,"Merry","967139013","freshman");
	obj[5]=new Student(135,"Andy","900231060","junior");
	obj[6]=new Employee(136,"Nora","981156196","Programmer",52000);
	//使用陣列的長度來設定迴圈條件
	for(int i=0;i<obj.length;i++) {
		System.out.println("Data:"+(i+1));
		//依據物件中不同的改寫方法輸出資訊
		obj[i].infoShow();
		System.out.println("_______________________");
		}
	}
}
