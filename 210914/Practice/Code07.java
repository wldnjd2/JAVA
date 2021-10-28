package exam_date0914;

import java.util.Scanner;

public class Code07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//10번 문제
//은행 예금 출금 조회 기능을 각각 메서드로 만들기
//종료가 선택되지 않으면 메뉴가 반복적으로 출력되도록 하시오
//최대 금고 액수는 100만원임 그 이상으로는 돈 입금 불가능
//잔액 90만원시 11만원을 입금하면 100만원 이상이므로 입금 거부

		Bank Jbank = new Bank(); //객체 생성
		
		boolean f = true;
		while(f) {
			System.out.println("---------------J Bank--------------");
			System.out.println("      메뉴를 선택하시오.");
			System.out.println("          예금\n          출금\n        잔액 조회\n          종료\n");
			Scanner input_0 = new Scanner(System.in);
			String input = input_0.next();
			int mybalance = 0;//잔액
			
			switch(input) {
			case "예금"://입금하고나서의 잔액이100만원이 넘으면
				//입금금액 초과
				//100만원 안넘으면 입금
				//잔액이 얼마남았는지 말해주기
				Jbank.deposit();
				Jbank.balance();
				
				break;//switch문 빠져나감
			case "출금":
				//출금하고나서 잔액이 <0 으면
				//잔액이 부족합니다
				//>0
				//잔액이 얼마남았는지 말해주기
				Jbank.withdraw();
				Jbank.balance();
				break;
			case "잔액조회":
				//잔액이 얼마남았는지 말해주기
				Jbank.balance();
				break;							
			case "종료":
				f = false;
				break;
			default : System.out.println("잘못눌렀습니다.");break;
		
			}	
		}
	}

}
