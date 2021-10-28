package date0910;

import java.util.Scanner;

public class Code16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("6번문제--------------------------");
		int c1 = 0;// 통장 잔고 초기화
		while (true) {
			System.out.println("***********00은행에 오신걸 환영합니다 ^-^**********");
			System.out.println("           원하시는 메뉴를 선택해주세요\n"
					+ "");
			System.out.println("                  예금\n                  출금\n                 잔액조회\n         "
					+ "         종료\n");
			Scanner s = new Scanner(System.in);
			String s1 = s.next(); // s1 메뉴 선택 변수

			switch (s1) {
			case "예금":
				System.out.println("입금 금액을 입력하시오");
				// s.close();
				Scanner s2 = new Scanner(System.in);
				int s3 = s2.nextInt(); // 입금 금액을 변수 s3에 저장
				if (s3 > 0) {
					System.out.println("예금완료");
					c1 += s3; // 잔액을 초기화
					System.out.println("남은 금액은 "+c1+"원 입니다.\n\n");
				} else {
					System.out.println("잘못입력했습니다\n\n");
				}
				break;

			case "출금":
				System.out.println("출금할 금액을 입력하시오");
				Scanner s4 = new Scanner(System.in);
				int s5 = s4.nextInt(); // 출금 금액 변수 s5에 저장
				if (s5 > c1)
					System.out.println("잔액 부족\n\n");
				else {
					System.out.println("출금완료");
					c1 -= s5;
					System.out.println("남은 금액은 "+c1+"원 입니다.\n\n");
				}
				break;
			// continue;
			case "잔액조회":
				System.out.println("잔고 :" + c1 + "원\n\n");
				break;
			case "종료":
				System.out.println("프로그램을 종료합니다.");
				while(true);
			default: {
				System.out.println("잘못 입력했습니다. 다시 선택해주세요.\n\n");
				break;

			} // 스위치문

			// System.out.println();
			}

		}

	}// main함수

}// class
