package zyx;

//�w�q���OCar
class Car {
	//�w�q���O�����ݩ�
	int number;
	String color = new String();
	float speed;
	//�w�q���O������k
	  //��X������T
	void carinfo(){
		System.out.println("������T:");
		System.out.println("���X:"+number);
		System.out.println("�C��:"+color);
		System.out.println("��l�t��:"+speed);
	}
	//�h���ϥάۦP��ƦW�A���P�޼ƫ��A
	  //�[�t
	float setspeed(float speed){
		speed=speed+15;
		return speed;
	}
	  //��t
	float setspeed(int remove,float speed){
		speed=speed-4;
		return speed;
	}
	  //�ϥΪ̦ۦ��J��t
	float setspeed(float speed,float removespeed){
		speed=speed-removespeed;
		return speed;
	}
}

public class carspeed {

	public static void main(String[] args) {
		//�إ�Car���O���������
		Car car1= new Car();
		Car car2= new Car();
		Car car3= new Car();
		//�]�w�U���骺�ӧO�ݩ�(number,color,speed)
		car1.number=43748;
		car1.color="�Ŧ�";
		car1.speed=12f;
		car2.number=843566;
		car2.color="����";
		car2.speed=0f;
		car3.number=12087;
		car3.color="�¦�";
		car3.speed=20f;
		//�ϥΪ��󤤪���k��X��T
		System.out.print("A");
		car1.carinfo();
		System.out.print("B");
		car2.carinfo();
		System.out.print("C");
		car3.carinfo();
		
		//�ϥΪ��󤤪���k�[��t
		//A��
		car1.speed=car1.setspeed(2,car1.speed);
		car1.speed=car1.setspeed(2,car1.speed);
		System.out.println("A���g�L��t2�����t��:"+car1.speed);
		car1.speed=car1.setspeed(car1.speed,2.3f);
		System.out.println("A���A�g�L�ϥΪ̿�J��t���t��:"+car1.speed);
		//B��
		car2.speed=car2.setspeed(car2.speed);
		System.out.println("B���g�L�[�t1�����t��:"+car2.speed);
		car2.speed=car2.setspeed(2,car2.speed);
		car2.speed=car2.setspeed(2,car2.speed);
		car2.speed=car2.setspeed(2,car2.speed);
		System.out.println("B���A�g�L��t3�����t��:"+car2.speed);
		//C��
		car3.speed=car3.setspeed(car3.speed);
		System.out.println("C���g�L�[�t1�����t��:"+car3.speed);
		car3.speed=car3.setspeed(car3.speed,32.5f);
		System.out.println("C���A�g�L�ϥΪ̿�J��t���t��:"+car3.speed);
	}

}
