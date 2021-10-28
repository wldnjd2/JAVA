package date0923;

public class Code07 {

	public static void main(String[] args) {
		Child child = new Child();
		child.info();

	}
}

class Parent{
	String name = "홍길동";
	public void info() {
		System.out.println("부모객체 info() 이름: "+this.name);
	}
}

class Child extends Parent{
	int age = 25;
	@Override
	public void info() {
		System.out.println("자식객체 info() 나이: "+this.name);
		System.out.println("자식객체 info() 나이: "+this.age);
	}
}