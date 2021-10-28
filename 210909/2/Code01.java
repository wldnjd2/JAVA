package class0909_2;

import java.util.Scanner;				//Scanner에 마우스 커서 대고, ctrl+shift+o 한번에 누르면 임포트 쉽게 가능

public class Code01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		
		String b = a.next();				//next는 공백을 기준으로 잘라줌을 의미
		String c = a.next();
		int d = a.nextInt();
		double e = a.nextDouble();
		boolean f = a.nextBoolean();

		System.out.println("이름: "+ b);
		System.out.println("거주지 : "+c);
		System.out.println("나이 : "+d);
		System.out.println("몸무게 : "+e);
		System.out.println("T or F : "+f);
	}

}
