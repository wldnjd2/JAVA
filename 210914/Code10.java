package date0914;

public class Code10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OverloadingEx o1 = new OverloadingEx();
		//o1.plus(3,3);
		//o1.plus(3.5,3.5);
		//o1.plus(3,3.5);
		//위 구문으로 문제를 해결하려면 밑에 plus 함수 앞에 public void으로 static을 빼줘야함!
		//객체를 생성해준 이유는 static 때문이다

		//같은 클래스에 있을때 매서드 앞에 static을 붙여주면 
		//클래스 내 공유가 가능해져서 객체를 안써도 됨
		
		//다른 클래스에 있을때는 공유가 불가능 하기 때문에
		//객체를 따로 생성해 줘야한다
		
		plus(3,3);
		plus(3.5,3.5);
		plus(3,3.5);	
	}//main함수 끝

	
	
	
		private static void plus(int a, int b) {			//반환이 없는 경우 void
			System.out.println("정수 + 정수 = "+(a+b));
		}
		private static void plus(double a, double b) {
			System.out.println("실수 + 실수 = "+(a+b));
		}
		private static void plus(int a, double b) {
			System.out.println("정수 + 실수 = "+(a+b));
		}
	
}