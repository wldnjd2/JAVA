package exam_date0914;

import java.util.Scanner;

public class Bank {
	Scanner money_0 = new Scanner(System.in);
	int mybalance = 0;//잔액
	
	void deposit(){//예금
		System.out.println("입금하실 금액을 입력하세요.");
		int money = money_0.nextInt();
		
		mybalance += money;//입금
		
		if(money>=1000000) {//잔액이 100만원이 넘으면
			System.out.println("잔액초과 입니다.");
			mybalance-=money;
		}else{//잔액이 100만원이 안넘으면
			System.out.println("입금되었습니다.");
		}
		
	}
	void withdraw(){//출금
		System.out.println("출금하실 금액을 입력하세요.");
		int money = money_0.nextInt();
		
		mybalance-=money;//출금
		if(mybalance<0) {
			System.out.println("잔액이 부족합니다.");
			mybalance+=money;
		}else {//mybalance>=0
			System.out.println("출금되었습니다");
		}
	}
	void balance(){
		
		System.out.println("잔액은 "+mybalance+" 원 입니다");
	}

}
