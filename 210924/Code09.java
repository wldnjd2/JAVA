package date0924;

public class Code09 {

	public static void main(String[] args) {
		Parent parentA =  new Child();  		//Child의 객체를 Parent 클래스에 넣음
		method(parentA);
		
		Parent parentB = new Parent(); 			//Parent 객체 생성
		method(parentB);
	}
	
	public static void method(Parent parent) {
		if(parent instanceof Child) {		//parent객체가 Child 클래스의 객체인가?
			Child Child = (Child) parent;	//강제형변환
			System.out.println("method1 - Child로 변환 성공");
		}else {
			System.out.println("method1 - Child로 변환 실패");
		}
	}
}
