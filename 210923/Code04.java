package date0923;

public class Code04 {

	public static void main(String[] args) {
		Child02 child = new Child02("���缮", "123456-1234567", 1);
		System.out.println("name: " + child.name);
		System.out.println("ssn: " + child.ssn);
		System.out.println("studentNo: " + child.studentNo);
	}
}

class Parent02 {
	String name;
	String ssn;

	public Parent02(String name, String ssn) {// ������
		this.name = name;
		this.ssn = ssn;
	}
}

class Child02 extends Parent02 {
	int studentNo;

	public Child02(String name, String ssn, int studentNo) {// ������
		super(name, ssn);
		this.studentNo = studentNo;
	}
}
