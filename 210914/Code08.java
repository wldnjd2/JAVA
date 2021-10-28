package date0914;

public class Code08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메소드 오버로딩
		//이름이 같은 메소드가 있어도 변수와 타입이 다르면 메소드를 정의 할 수 있는것
		
		System.out.println("int형 add : "+ add(3,5));
		System.out.println("double형 add : "+add(3.14,5.78));
		
	}
	public static int add(int a, int b) {
		return a+b;
	}
	public static double add(double a, double b) {
		return a+b;
	}
}
