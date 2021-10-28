package date0927;

//프린트 출력 기능을 만들기 위한 인터페이스를 만든다
//삼성프린트와 엘지프린트 모두 출력기능 가져서 위 인터페이스를 구현 받음
//main 클래스에서 각각의 프린트를 생성하고 인쇄를 진행한다
interface Printer {
	void print(String doc);
	
}
class Samsung implements Printer {
	@Override
	public void print(String doc) {
		System.out.println("Samsung 프린터");
		System.out.println(doc +"를 인쇄합니다");
	}
}
class Lg implements Printer {
	public void print(String doc) {
		System.out.println("LG 프린터");
		System.out.println(doc +"를 인쇄합니다");
	}
}
public class Code04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String doc = "자바 이론 문서";
		Samsung s = new Samsung();
		s.print(doc);
		System.out.println();
		
		Lg l = new Lg();
		l.print(doc);
		System.out.println();
	}

}
