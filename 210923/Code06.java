package date0923;

public class Code06 {

	public static void main(String[] args) {
		Child04 child = new Child04();//객체 생성
		child.info();
	}
}

class Parent04{
	String name = "홍길동";
	public void info() {
		System.out.println("부모객체 info() 이름: "+ this.name);
	}
}

class Child04 extends Parent04 {
	int age = 25;
	@Override
	public void info() {
		System.out.println("자식객체 info() 이름:" + this.name);
		System.out.println("자식객체 info() 나이: " + this.age);
	}
}
