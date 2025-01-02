package zyx;

//定義類別Car
class Car {
	//定義類別中的屬性
	private int number;
	private String color = new String();
	private float speed;
	static int count;
	//創立建構元讓新物件直接設值
	//再加上計算車輛數量
	public Car(int Number,String Color,float Speed){
		this.number=Number;
		this.color=Color;
		this.speed=Speed;
		count++;
	}
	//定義類別中的方法
	  //輸出車輛資訊
	void carinfo(){
		System.out.println("車的資訊:");
		System.out.println("號碼:"+number);
		System.out.println("顏色:"+color);
		System.out.println("初始速度:"+speed);
	}
	  //單獨輸出車輛速度
	void carspeed(){
		System.out.println(this.speed);
	}
	//多載使用相同函數名，不同引數型態
	//統一傳回建構元再做設定
	//因重新建構新物件要再扣除先前計算車輛的數量
	  //加速
	void setspeed(float speed){
		new Car(this.number,this.color,this.speed+=15);
		count--;
	}
	  //減速
	void setspeed(int remove,float speed){
		new Car(this.number,this.color,this.speed-=4);
		count--;
	}
	  //使用者自行輸入減速
	void setspeed(float speed,float removespeed){
		new Car(this.number,this.color,this.speed-=removespeed);
		count--;
	}
}

public class carplus2 {

	public static void main(String[] args) {
		//建立Car類別的物件實體
		//設定各實體的個別屬性(number,color,speed)
		Car car1= new Car(43748,"藍色",12f);
		Car car2= new Car(843566,"黃色",0f);
		Car car3= new Car(12087,"黑色",20f);
		//使用物件中的方法輸出資訊
		System.out.print("A");
		car1.carinfo();
		System.out.print("B");
		car2.carinfo();
		System.out.print("C");
		car3.carinfo();
		
		//使用物件中的方法加減速
		//A車
		car1.setspeed(2,1f);
		car1.setspeed(2,1f);
		System.out.print("A車經過減速2次的速度:");
		car1.carspeed();
		car1.setspeed(1f,2.3f);
		System.out.print("A車再經過使用者輸入減速的速度:");
		car1.carspeed();
		//B車
		car2.setspeed(2f);
		System.out.print("B車經過加速1次的速度:");
		car2.carspeed();
		car2.setspeed(2,2f);
		car2.setspeed(2,2f);
		car2.setspeed(2,2f);
		System.out.print("B車再經過減速3次的速度:");
		car2.carspeed();
		//C車
		car3.setspeed(3f);
		System.out.print("C車經過加速1次的速度:");
		car3.carspeed();
		car3.setspeed(3f,32.5f);
		System.out.print("C車再經過使用者輸入減速的速度:");
		car3.carspeed();
		System.out.println("總共有幾台車:"+Car.count);
	}

}
