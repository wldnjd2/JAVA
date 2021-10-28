package date0927;

interface Exam02{
	void makeThis();
	void makeThisWith(String name, int age);
}

class Exam02_implements implements Exam02{
	public void makeThis() {
		System.out.println("make This 메서드 실행");
	}
	public void makeThisWith(String name, int age) {
		System.out.println("With 매서드 실행,  매개변수: "+name+", "+age);
	}
}

public class Code09 {
	public static void main(String[] args) {
		
		Exam02_implements a = new Exam02_implements();
		a.makeThis();
		a.makeThisWith("유진",50);
	}

}
