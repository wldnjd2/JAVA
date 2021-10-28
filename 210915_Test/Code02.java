package exam;

import java.util.Scanner;

public class Code02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//문제2
	
		gugudan g = new gugudan();	//객체 생성
		Scanner dan_0 = new Scanner(System.in);
		g.ggd();
		
		System.out.println("------------------------\n");
		System.out.println("출력하고자 하는 단을 입력하세요.");
		

		int dan = dan_0.nextInt();
		
		g.ggdan(dan);
		
		System.out.println("------------------------\n");
		System.out.println("두개의 숫자를 입력하세요.");
		
		int num1 = dan_0.nextInt();
		int num2 = dan_0.nextInt();

		g.gudan(num1, num2 );
	}

}
