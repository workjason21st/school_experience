package zyx;

//定義抽象父類別airobject
abstract class airobject {
	//定義類別中的屬性
	protected int speed;		//物件現在速度
	protected int maxspeed;		//物件可達到的最大速度
	protected int weight;		//物件重量
	public int durability;	//物件耐久度
	//定義類別中的方法
	protected abstract void takeoff();	//起飛的抽象方法
	protected void land() {				//降落的方法
		this.speed=0;					//將速度降為零
	}
	protected void service() {			//維修的方法
		this.durability=100;			//提高耐久度到最大
	}
	protected void show() {				//顯示物件資料的方法
		System.out.print("Speed:"+this.speed+"  ");
		System.out.println("Maxspeed:"+this.maxspeed);
		System.out.print("Weight:"+this.weight+"  ");
		System.out.println("Durability:"+this.durability);
	}
}
//定義子類別客機(airliner)
class airliner extends airobject {
	//定義子類別中的屬性
	protected int passenger;	//物件現在載客人數
	protected int maxpassenger;	//物件最大容納人數
	//創立建構元讓新物件直接設值
	public airliner(int Maxspeed,int Weight,int Maxpassenger) {
		this.maxspeed=Maxspeed;
		this.weight=Weight;
		this.durability=100;
		this.maxpassenger=Maxpassenger;
	}
	//實作父類別中的方法
	public void takeoff() {
		if(this.durability>=20) {		//如果耐久度大於20就能起飛
			this.speed=this.maxspeed;	//將速度達到最大值
			this.durability-=20;		//耐久度降低
		}
	}
	//改寫父類別中的方法
	public void show() {
		super.show();
		System.out.println("Passenger:"+this.passenger);
		System.out.println("Maxpassenger:"+this.maxpassenger);
	}
	//定義子類別中的方法
	public void carry(int people) {				//載客的方法
		if((this.passenger+people)<=this.maxpassenger) {		//如果現在客數+載客數不超過最大容納人數，就正常載客
			this.passenger+=people;								//如果現在客數+載客數會超過最大容納人數，就載客達到最大量
		}
		else if((this.passenger+people)>this.maxpassenger) {//如果載客數不超過乘客數量，就正常下客
			this.passenger=this.maxpassenger;
		}
	}
	public void dropoff(int people) {			//下客的方法
		if(this.passenger>=people) {			//如果下客數不超過乘客數量，就正常下客
			this.passenger-=people;
		}
	}
	
}
//定義子類別直升機(helicopter)
class helicopter extends airobject {
	//創立建構元讓新物件直接設值
	public helicopter(int Maxspeed,int Weight) {
		this.maxspeed=Maxspeed;
		this.weight=Weight;
		this.durability=100;
	}
	//實作父類別中的方法
	public void takeoff() {
		if(this.durability>=10) {		//如果耐久度大於10就能起飛
			this.speed=this.maxspeed;	//將速度達到最大值
			this.durability-=10;		//耐久度降低
		}
	}
}
//定義子類別戰機(fighterplane)
class fighterplane extends airobject {
	//定義子類別中的屬性
	protected int attack;	//物件的攻擊力
	//創立建構元讓新物件直接設值
	public fighterplane(int Maxspeed,int Weight,int Attack) {
		this.maxspeed=Maxspeed;
		this.weight=Weight;
		this.durability=100;
		this.attack=Attack;
	}
	//實作父類別中的方法
	public void takeoff() {
		if(this.durability>=30) {		//如果耐久度大於30就能起飛
			this.speed=this.maxspeed;	//將速度達到最大值
			this.durability-=30;		//耐久度降低
		}
	}
	//改寫父類別中的方法
	public void show() {
		super.show();
		System.out.println("Attack:"+this.attack);
	}
}
//定義主類別
public class aircraft {
	
	public static void main(String[] args) {
		//以不同子類別建立實體物件
		fighterplane obj1=new fighterplane(900,350,30);
		airliner obj2=new airliner(500,650,300);
		helicopter obj3=new helicopter(80,100);
		//依據物件中不同的改寫方法輸出資訊
		System.out.println("_________obj1__________");
		obj1.show();
		System.out.println("_________obj2__________");
		obj2.show();
		System.out.println("_________obj3__________");
		obj3.show();
		System.out.println("");
		//物件使用方法
		obj3.takeoff();
		obj2.carry(200);
		obj2.takeoff();
		obj2.land();
		obj2.dropoff(100);
		obj2.takeoff();
		obj1.takeoff();
		obj3.land();
		obj3.service();
		//依據物件中不同的改寫方法輸出資訊
		System.out.println("_________After_________");
		System.out.println("_________obj1__________");
		obj1.show();
		System.out.println("_________obj2__________");
		obj2.show();
		System.out.println("_________obj3__________");
		obj3.show();
	}
}
