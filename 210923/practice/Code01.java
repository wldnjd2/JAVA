package practice;
//2번문제
//main
public class Code01 {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();//s에는 a변수의 주소값이 (a 변수에는 객체의 주소값) 들어있음
		s.setNumber(100);
		System.out.println(s.getNumber());

	}

}
