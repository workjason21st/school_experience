package zyx;

//�w�q��H�����Oairobject
abstract class airobject {
	//�w�q���O�����ݩ�
	protected int speed;		//����{�b�t��
	protected int maxspeed;		//����i�F�쪺�̤j�t��
	protected int weight;		//���󭫶q
	public int durability;	//����@�[��
	//�w�q���O������k
	protected abstract void takeoff();	//�_������H��k
	protected void land() {				//��������k
		this.speed=0;					//�N�t�׭����s
	}
	protected void service() {			//���ת���k
		this.durability=100;			//�����@�[�ר�̤j
	}
	protected void show() {				//��ܪ����ƪ���k
		System.out.print("Speed:"+this.speed+"  ");
		System.out.println("Maxspeed:"+this.maxspeed);
		System.out.print("Weight:"+this.weight+"  ");
		System.out.println("Durability:"+this.durability);
	}
}
//�w�q�l���O�Ⱦ�(airliner)
class airliner extends airobject {
	//�w�q�l���O�����ݩ�
	protected int passenger;	//����{�b���ȤH��
	protected int maxpassenger;	//����̤j�e�ǤH��
	//�Х߫غc�����s���󪽱��]��
	public airliner(int Maxspeed,int Weight,int Maxpassenger) {
		this.maxspeed=Maxspeed;
		this.weight=Weight;
		this.durability=100;
		this.maxpassenger=Maxpassenger;
	}
	//��@�����O������k
	public void takeoff() {
		if(this.durability>=20) {		//�p�G�@�[�פj��20�N��_��
			this.speed=this.maxspeed;	//�N�t�׹F��̤j��
			this.durability-=20;		//�@�[�׭��C
		}
	}
	//��g�����O������k
	public void show() {
		super.show();
		System.out.println("Passenger:"+this.passenger);
		System.out.println("Maxpassenger:"+this.maxpassenger);
	}
	//�w�q�l���O������k
	public void carry(int people) {				//���Ȫ���k
		if((this.passenger+people)<=this.maxpassenger) {		//�p�G�{�b�ȼ�+���ȼƤ��W�L�̤j�e�ǤH�ơA�N���`����
			this.passenger+=people;								//�p�G�{�b�ȼ�+���ȼƷ|�W�L�̤j�e�ǤH�ơA�N���ȹF��̤j�q
		}
		else if((this.passenger+people)>this.maxpassenger) {//�p�G���ȼƤ��W�L���ȼƶq�A�N���`�U��
			this.passenger=this.maxpassenger;
		}
	}
	public void dropoff(int people) {			//�U�Ȫ���k
		if(this.passenger>=people) {			//�p�G�U�ȼƤ��W�L���ȼƶq�A�N���`�U��
			this.passenger-=people;
		}
	}
	
}
//�w�q�l���O���ɾ�(helicopter)
class helicopter extends airobject {
	//�Х߫غc�����s���󪽱��]��
	public helicopter(int Maxspeed,int Weight) {
		this.maxspeed=Maxspeed;
		this.weight=Weight;
		this.durability=100;
	}
	//��@�����O������k
	public void takeoff() {
		if(this.durability>=10) {		//�p�G�@�[�פj��10�N��_��
			this.speed=this.maxspeed;	//�N�t�׹F��̤j��
			this.durability-=10;		//�@�[�׭��C
		}
	}
}
//�w�q�l���O�Ծ�(fighterplane)
class fighterplane extends airobject {
	//�w�q�l���O�����ݩ�
	protected int attack;	//���󪺧����O
	//�Х߫غc�����s���󪽱��]��
	public fighterplane(int Maxspeed,int Weight,int Attack) {
		this.maxspeed=Maxspeed;
		this.weight=Weight;
		this.durability=100;
		this.attack=Attack;
	}
	//��@�����O������k
	public void takeoff() {
		if(this.durability>=30) {		//�p�G�@�[�פj��30�N��_��
			this.speed=this.maxspeed;	//�N�t�׹F��̤j��
			this.durability-=30;		//�@�[�׭��C
		}
	}
	//��g�����O������k
	public void show() {
		super.show();
		System.out.println("Attack:"+this.attack);
	}
}
//�w�q�D���O
public class aircraft {
	
	public static void main(String[] args) {
		//�H���P�l���O�إ߹��骫��
		fighterplane obj1=new fighterplane(900,350,30);
		airliner obj2=new airliner(500,650,300);
		helicopter obj3=new helicopter(80,100);
		//�̾ڪ��󤤤��P����g��k��X��T
		System.out.println("_________obj1__________");
		obj1.show();
		System.out.println("_________obj2__________");
		obj2.show();
		System.out.println("_________obj3__________");
		obj3.show();
		System.out.println("");
		//����ϥΤ�k
		obj3.takeoff();
		obj2.carry(200);
		obj2.takeoff();
		obj2.land();
		obj2.dropoff(100);
		obj2.takeoff();
		obj1.takeoff();
		obj3.land();
		obj3.service();
		//�̾ڪ��󤤤��P����g��k��X��T
		System.out.println("_________After_________");
		System.out.println("_________obj1__________");
		obj1.show();
		System.out.println("_________obj2__________");
		obj2.show();
		System.out.println("_________obj3__________");
		obj3.show();
	}
}
