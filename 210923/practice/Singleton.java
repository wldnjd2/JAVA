package practice;
//2번문제
//생성자가 private 접근제어가 있을때 이 클래스의 인스턴스를 사용할수 있도록 getInstance 메소드 작성
public class Singleton {
	
	private static Singleton a = new Singleton();		//객체 생성
	private Singleton() {}								//private을 사용하려고 생성자

	public static Singleton getInstance() {
		return a;										//객체 주소를 가진 변수 반환
	}	
	
	private int number;

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}	
}
