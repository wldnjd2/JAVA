package date0924;

class People{
	public void printInfo() {
		System.out.println("���� ����Դϴ�");
	}
}

class Man1 extends People{
	@Override
	public void printInfo() {		
		super.printInfo();				
			System.out.println("�׸��� �����Դϴ�.");		
	}
	
	public void enlist() {
		System.out.println("���� ���븦 ���ϴ�.");
		System.out.println("�漺!");
	}
}

class Woman1 extends People{
	public void printInfo() {
		super.printInfo();
		System.out.println("�׸��� �����Դϴ�.");
	}
	public void working() {
		System.out.println("���� �մϴ�");
		System.out.println("�ּ��� ����");
	}
}


public class Code10 {

	public static void func(People people) {//�޼ҵ� ȣ��� �Ű� ������ ��ü ����
		people.printInfo();
	}

	public static void main(String[] args) {
		People man = new Man1();		
		People woman = new Woman1();
		func(man);
		
		System.out.println();
		func(woman);
	}

}
