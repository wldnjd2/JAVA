package date0924;

class People11{
	public void printInfo() {
		System.out.println("���� ����Դϴ�");
	}
}

class Man11 extends People11{
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

class Woman11 extends People11{
	public void printInfo() {
		super.printInfo();
		System.out.println("�׸��� �����Դϴ�.");
	}
	public void working() {
		System.out.println("���� �մϴ�");
		System.out.println("�ּ��� ����");
	}
}

public class Code11 {

	public static void func(People11 people) {
		people.printInfo();
		if(people instanceof Man11) {	 //people��ü�� Man11Ŭ������ �ν��Ͻ����� Ȯ��
			((Man11)people).enlist(); 	 //���� ����ȯ
		}
		if(people instanceof Woman11) {
			((Woman11)people).working();
		}
	}

	public static void main(String[] args) {
		People11 man = new Man11();		//Ÿ�Ժ�ȯ
		People11 woman = new Woman11();
		func(man);
		
		System.out.println();
		func(woman);
	}

}
