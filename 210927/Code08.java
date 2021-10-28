package date0927;

//삼성 프린터가 세계 최초 컬러 프린터 기능을 추가했다고 가정
//printable 인터페이스에 기능 추가하는  것으로 끝나지가 않는다
//위 형태로 추상 메소드를 추가한 경우 컬러기능이 존재하지 않는 
//lg 프린터에도 오버라이딩을 해줘야하는 문제 발생
//이런 문제를 상속으로 처리 가능
interface Printer {
	void print(String doc);
}
interface ColorPrintable extends Printer{
	void printCMYK(String doc);
}

class SamsungPrt implements ColorPrintable {
	@Override
	public void print(String doc) {
		System.out.println("삼성 프린터");
		System.out.println(doc+"를 인쇄합니다");
	}
	@Override
	public void printCMYK(String doc) {
		System.out.println("삼성 프린터");
		System.out.println("컬러로 "+doc+"를 인쇄합니다.");
	}
}

class LGPrt implements Printer {
	public void print(String doc) {
		System.out.println("LG 프린터");
		System.out.println(doc +"를 인쇄합니다");
	}
}

public class Code08 {

	public static void main(String[] args) {
		String doc = "자바 이론 문서";
		
		SamsungPrt s = new SamsungPrt();
		s.print(doc);
		s.printCMYK(doc);
		System.out.println();
		
		LGPrt l = new LGPrt();
		l.print(doc);
		System.out.println();
	}

}
