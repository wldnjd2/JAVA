package date0923;

public class Code06 {

	public static void main(String[] args) {
		Child04 child = new Child04();//��ü ����
		child.info();
	}
}

class Parent04{
	String name = "ȫ�浿";
	public void info() {
		System.out.println("�θ�ü info() �̸�: "+ this.name);
	}
}

class Child04 extends Parent04 {
	int age = 25;
	@Override
	public void info() {
		System.out.println("�ڽİ�ü info() �̸�:" + this.name);
		System.out.println("�ڽİ�ü info() ����: " + this.age);
	}
}
