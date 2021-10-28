package date0924;

class People2{
	public void printInfo() {
		System.out.println("나는 사람입니다");
	}
}

class Man extends People2{
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("그리고 남자입니다");
	}
	public void enlist() {
		System.out.println("내일 군대를 갑니다");
		System.out.println("충성");
	}
}

class Woman extends People2{
	public void printInfo(){
		super.printInfo();
		System.out.println("그리고 여자 입니다");
	}
	public void working(){
		System.out.println("일을 합니다");
		System.out.println("최선을 다해");
	}
}

public class Code08 {

	public static void main(String[] args) {
		People2 man = new Man();		
		People2 woman = new Woman();	
		 
		man.printInfo();
		((Man)man).enlist();			//강제타입변환
		System.out.println();
		woman.printInfo();
		((Woman)woman).working();		//강제타입변환
	}

}
