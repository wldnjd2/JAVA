package date0924;
//�߰����� ����
//personŬ������ private �ʵ� weight�� studentŬ�������� ���� �Ұ���
//����Ŭ������ getter setter���ؼ� ���� ����
public class Code01 {

	public static void main(String[] args) {
		Student std = new Student();
		std.info();
	}
}

class Person{
	int age;
	public String name;
	protected int height;					//protected ���� ��Ű�� �ڽ� Ŭ����
	private int weight;
	
	//getter setter
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}

class Student extends Person{
/*	age = 20;
	name = "��浿";
	height = 180;
	super.setWeight(80);
	�ʵ忡�� �̷��� ���� �Ҽ� ���� ���� (�ż��峪 ������ �ȿ��� ���Ǹ� �������)*/
	
	void info() {
		age = 20;							//this.age�� ���� (�޼��� �ȿ����� ����)
		name = "��浿";
		height = 180;
		super.setWeight(80);
		System.out.println(getWeight());
	}
	
}
