package class0909_2;

import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름 나이 오늘날짜 핸드폰번호를 빈칸으로 분리하여 입력하시오");
		
		Scanner a = new Scanner(System.in);
		String b = a.next();
		int c = a.nextInt();
		int d = a.nextInt();
		String e = a.next();
		
		System.out.println("당신의 이름은 " + b + "입니다.");
		System.out.println("당신의 나이는 "+ c + "입니다.");
		System.out.println("오늘의 날짜는 "+ d + "일 입니다.");
		System.out.println("당신의 핸드폰 번호는 +" + e + "입니다.");
		a.close();
		
	}

}
