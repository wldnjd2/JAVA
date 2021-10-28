package date0924;

class People{
	public void printInfo() {
		System.out.println("나는 사람입니다");
	}
}

class Man1 extends People{
	@Override
	public void printInfo() {		
		super.printInfo();				
			System.out.println("그리고 남자입니다.");		
	}
	
	public void enlist() {
		System.out.println("내일 군대를 갑니다.");
		System.out.println("충성!");
	}
}

class Woman1 extends People{
	public void printInfo() {
		super.printInfo();
		System.out.println("그리고 여자입니다.");
	}
	public void working() {
		System.out.println("일을 합니다");
		System.out.println("최선을 다해");
	}
}


public class Code10 {

	public static void func(People people) {//메소드 호출시 매개 값으로 객체 제공
		people.printInfo();
	}

	public static void main(String[] args) {
		People man = new Man1();		
		People woman = new Woman1();
		func(man);
		
		System.out.println();
		func(woman);
	}

}
