package date0924;

class People11{
	public void printInfo() {
		System.out.println("나는 사람입니다");
	}
}

class Man11 extends People11{
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

class Woman11 extends People11{
	public void printInfo() {
		super.printInfo();
		System.out.println("그리고 여자입니다.");
	}
	public void working() {
		System.out.println("일을 합니다");
		System.out.println("최선을 다해");
	}
}

public class Code11 {

	public static void func(People11 people) {
		people.printInfo();
		if(people instanceof Man11) {	 //people객체가 Man11클래스의 인스턴스인지 확인
			((Man11)people).enlist(); 	 //강제 형변환
		}
		if(people instanceof Woman11) {
			((Woman11)people).working();
		}
	}

	public static void main(String[] args) {
		People11 man = new Man11();		//타입변환
		People11 woman = new Woman11();
		func(man);
		
		System.out.println();
		func(woman);
	}

}
