package date0927;

interface Exam02{
	void makeThis();
	void makeThisWith(String name, int age);
}

class Exam02_implements implements Exam02{
	public void makeThis() {
		System.out.println("make This �޼��� ����");
	}
	public void makeThisWith(String name, int age) {
		System.out.println("With �ż��� ����,  �Ű�����: "+name+", "+age);
	}
}

public class Code09 {
	public static void main(String[] args) {
		
		Exam02_implements a = new Exam02_implements();
		a.makeThis();
		a.makeThisWith("����",50);
	}

}
