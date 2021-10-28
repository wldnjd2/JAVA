package date0924;
//중간점검 예제
//person클래스의 private 필드 weight는 student클래스에서 접근 불가능
//슈퍼클래스인 getter setter통해서 조작 가능
public class Code01 {

	public static void main(String[] args) {
		Student std = new Student();
		std.info();
	}
}

class Person{
	int age;
	public String name;
	protected int height;					//protected 같은 패키지 자식 클래스
	private int weight;
	
	//getter setter
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}

class Student extends Person{
/*	age = 20;
	name = "김길동";
	height = 180;
	super.setWeight(80);
	필드에는 이렇게 선언 할수 없음 주의 (매서드나 생성자 안에서 정의를 해줘야함)*/
	
	void info() {
		age = 20;							//this.age도 가능 (메서드 안에서는 가능)
		name = "김길동";
		height = 180;
		super.setWeight(80);
		System.out.println(getWeight());
	}
	
}
