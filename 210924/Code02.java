package date0924;

public class Code02 {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent  = child;
		parent.method1();
		parent.method2();
		//parent.method3(); ȣ�� �Ұ�
	}

}
class Parent{
	public void method1() {
		System.out.println("Parent Method1");
	}
	public void method2() {
		System.out.println("Parent Method2");
	}
}

class Child extends Parent{
	public void method2() {						//�޼��� �������̵�(������)
		System.out.println("Child Method2");
	}
	public void method3() {
		System.out.println("Child Method3");
	}
}