package date0923;

public class Code07 {

	public static void main(String[] args) {
		Child child = new Child();
		child.info();

	}
}

class Parent{
	String name = "ȫ�浿";
	public void info() {
		System.out.println("�θ�ü info() �̸�: "+this.name);
	}
}

class Child extends Parent{
	int age = 25;
	@Override
	public void info() {
		System.out.println("�ڽİ�ü info() ����: "+this.name);
		System.out.println("�ڽİ�ü info() ����: "+this.age);
	}
}