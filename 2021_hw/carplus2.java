package zyx;

//�w�q���OCar
class Car {
	//�w�q���O�����ݩ�
	private int number;
	private String color = new String();
	private float speed;
	static int count;
	//�Х߫غc�����s���󪽱��]��
	//�A�[�W�p�⨮���ƶq
	public Car(int Number,String Color,float Speed){
		this.number=Number;
		this.color=Color;
		this.speed=Speed;
		count++;
	}
	//�w�q���O������k
	  //��X������T
	void carinfo(){
		System.out.println("������T:");
		System.out.println("���X:"+number);
		System.out.println("�C��:"+color);
		System.out.println("��l�t��:"+speed);
	}
	  //��W��X�����t��
	void carspeed(){
		System.out.println(this.speed);
	}
	//�h���ϥάۦP��ƦW�A���P�޼ƫ��A
	//�Τ@�Ǧ^�غc���A���]�w
	//�]���s�غc�s����n�A�������e�p�⨮�����ƶq
	  //�[�t
	void setspeed(float speed){
		new Car(this.number,this.color,this.speed+=15);
		count--;
	}
	  //��t
	void setspeed(int remove,float speed){
		new Car(this.number,this.color,this.speed-=4);
		count--;
	}
	  //�ϥΪ̦ۦ��J��t
	void setspeed(float speed,float removespeed){
		new Car(this.number,this.color,this.speed-=removespeed);
		count--;
	}
}

public class carplus2 {

	public static void main(String[] args) {
		//�إ�Car���O���������
		//�]�w�U���骺�ӧO�ݩ�(number,color,speed)
		Car car1= new Car(43748,"�Ŧ�",12f);
		Car car2= new Car(843566,"����",0f);
		Car car3= new Car(12087,"�¦�",20f);
		//�ϥΪ��󤤪���k��X��T
		System.out.print("A");
		car1.carinfo();
		System.out.print("B");
		car2.carinfo();
		System.out.print("C");
		car3.carinfo();
		
		//�ϥΪ��󤤪���k�[��t
		//A��
		car1.setspeed(2,1f);
		car1.setspeed(2,1f);
		System.out.print("A���g�L��t2�����t��:");
		car1.carspeed();
		car1.setspeed(1f,2.3f);
		System.out.print("A���A�g�L�ϥΪ̿�J��t���t��:");
		car1.carspeed();
		//B��
		car2.setspeed(2f);
		System.out.print("B���g�L�[�t1�����t��:");
		car2.carspeed();
		car2.setspeed(2,2f);
		car2.setspeed(2,2f);
		car2.setspeed(2,2f);
		System.out.print("B���A�g�L��t3�����t��:");
		car2.carspeed();
		//C��
		car3.setspeed(3f);
		System.out.print("C���g�L�[�t1�����t��:");
		car3.carspeed();
		car3.setspeed(3f,32.5f);
		System.out.print("C���A�g�L�ϥΪ̿�J��t���t��:");
		car3.carspeed();
		System.out.println("�`�@���X�x��:"+Car.count);
	}

}
