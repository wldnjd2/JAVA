package date0914;

public class Code09 {

	public static void main(String[] args) {		//public 어디에서나 사용
		// TODO Auto-generated method stub
		info("고길동");								//이름이 같은 info 함수 호출 메소드 오버로딩
		info("고길동",25);
		info("asdf",1234);
		info(123, "코드 컴플리트");
		
	}
	private static void info(String name) { 		//private 해당 클래스에만 사용가능
		System.out.println("이름: "+name);
	}	
	private static void info(String name, int age) {
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
	}
	private static void info(String id, String pw) {
		System.out.println("아이디: "+id);
		System.out.println("pw: "+pw);
	}
	private static void info(int number, String title) {
		System.out.println("number: "+number);
		System.out.println("title: "+title);
	}
}
