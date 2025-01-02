package zyx;

//定義類別Car
class Car {
	//定義類別中的屬性
	int number;
	String color = new String();
	float speed;
	//定義類別中的方法
	  //輸出車輛資訊
	void carinfo(){
		System.out.println("車的資訊:");
		System.out.println("號碼:"+number);
		System.out.println("顏色:"+color);
		System.out.println("初始速度:"+speed);
	}
	//多載使用相同函數名，不同引數型態
	  //加速
	float setspeed(float speed){
		speed=speed+15;
		return speed;
	}
	  //減速
	float setspeed(int remove,float speed){
		speed=speed-4;
		return speed;
	}
	  //使用者自行輸入減速
	float setspeed(float speed,float removespeed){
		speed=speed-removespeed;
		return speed;
	}
}

public class carspeed {

	public static void main(String[] args) {
		//建立Car類別的物件實體
		Car car1= new Car();
		Car car2= new Car();
		Car car3= new Car();
		//設定各實體的個別屬性(number,color,speed)
		car1.number=43748;
		car1.color="藍色";
		car1.speed=12f;
		car2.number=843566;
		car2.color="黃色";
		car2.speed=0f;
		car3.number=12087;
		car3.color="黑色";
		car3.speed=20f;
		//使用物件中的方法輸出資訊
		System.out.print("A");
		car1.carinfo();
		System.out.print("B");
		car2.carinfo();
		System.out.print("C");
		car3.carinfo();
		
		//使用物件中的方法加減速
		//A車
		car1.speed=car1.setspeed(2,car1.speed);
		car1.speed=car1.setspeed(2,car1.speed);
		System.out.println("A車經過減速2次的速度:"+car1.speed);
		car1.speed=car1.setspeed(car1.speed,2.3f);
		System.out.println("A車再經過使用者輸入減速的速度:"+car1.speed);
		//B車
		car2.speed=car2.setspeed(car2.speed);
		System.out.println("B車經過加速1次的速度:"+car2.speed);
		car2.speed=car2.setspeed(2,car2.speed);
		car2.speed=car2.setspeed(2,car2.speed);
		car2.speed=car2.setspeed(2,car2.speed);
		System.out.println("B車再經過減速3次的速度:"+car2.speed);
		//C車
		car3.speed=car3.setspeed(car3.speed);
		System.out.println("C車經過加速1次的速度:"+car3.speed);
		car3.speed=car3.setspeed(car3.speed,32.5f);
		System.out.println("C車再經過使用者輸入減速的速度:"+car3.speed);
	}

}
