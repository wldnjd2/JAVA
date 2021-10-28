package date0910;

import java.util.Scanner;

public class Code15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub     
//
//1, 2     
		int s = 0;
		int i;
		int s1 = 0;

		System.out.println("1번문제--------------------------");
		for (i = 1; i <= 100; i++) {
			s = s + i;
			s1 = s;
			if (s > 1000)
				break;
		}
		System.out.println("1부터 100까지 합 :" + s1 + "\n");

		System.out.println("2번문제--------------------------");
		System.out.println(s + "\n");
//
//3
		System.out.println("3번문제--------------------------"); 
		System.out.println("아이디와 비밀번호를 입력하시오 :");
		Scanner a = new Scanner(System.in);
		String myid = a.next();
		int mypw = a.nextInt();

		String id = "green";				// 저장된 아이디
		int pw = 123;						// 저장된 비밀번호
		boolean x1 = id.equals(myid);		// 문자열 비교
		if ((x1 == true) && (pw == mypw)) {
			System.out.println("확인되었습니다." + "\n");
		} else
			System.out.println("다시 입력하세요");
	//	a.close();
//
//4   
		System.out.println("4번문제--------------------------");
		System.out.println("구구단_짝수단");
		int x; 								// 단
		int y;
		for (x = 1; x < 10; x++) {
			if (x % 2 == 1)
				continue;
			for (y = 1; y < 10; y++) {
				System.out.println(x + " X " + y + " = " + (x * y));
			}  
			System.out.println();
		}
//		
//5
		System.out.println("5번문제--------------------------");
		System.out.println("가위~바위~보~!");
		// 가위0 바위1 보2  숫자 매칭
		Scanner z1 = new Scanner(System.in);
		String t1 = z1.next();//t1은 내가 내는것
		
			int d =(int)(Math.random()*3); //컴퓨터값이 랜덤을 0 1 2 출력됨
			
			switch(t1) {//내가 입력하는 경우
			case "가위"://0
				if(d == 1) 	System.out.println("패");
				else if (d==2) System.out.println("승");
				else System.out.println("패");
				break;
			case "바위"://1
				if(d == 1) 	System.out.println("무");
				else if (d==2) System.out.println("패");
				else System.out.println("승");
				break;
			case "보"://2
				if(d == 1) 	System.out.println("승");
				else if (d==2) System.out.println("무");
				else System.out.println("패");//else 뒤에는 조건문이 안됨
				break;
			}    
// 
				
	
	}//main함수

}
