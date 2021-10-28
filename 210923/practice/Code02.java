package practice;

import java.util.Scanner;
//3번문제
//로그인 성공시 이름과 전화번호 출력
public class Code02 {
	
	public static Member array []= new Member[100];//배열 생성 멤버로 객체가 들어감
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b=0;//배열 인덱스
		boolean f = true;
		while(f) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 종료");
			int menu = scan.nextInt();
			
			switch(menu) {
			case 1://회원가입
				System.out.print("ID: ");
				String id = scan.next();
				System.out.print("password: ");
				String pw = scan.next();
				System.out.print("name: ");
				String name = scan.next();
				System.out.print("phNum: ");
				String phNum = scan.next();
				System.out.println(" ");
				 
				Member myMember = new Member(id, pw, name, phNum); 	//객체 생성
				
				for(int i=0; i<array.length; i++) {					//객체 값을 배열에 넣어줌
					if(array==null) {
						array[i] = myMember;
					} break;
				}
				break;
			
			case 2://로그인
				System.out.print("ID: ");
				String logid = scan.next();
				System.out.print("password: ");
				String logpw = scan.next();
				System.out.println(" ");
			
				//회원가입이 되어있는지 확인
				for(int i=0; i<array.length; i++) {
					if(array[i]==null) {
						continue;					
					}else if(array[i].getId().equals(logid)&&array[i].getPw().equals(logpw)) {
						b=i; 
					System.out.println("로그인 성공");
					}
					else System.out.println("아이디와 패스워드가 틀림"); 
						break;	
				}
			
				//출력
				array[b].prt(array[b].getName(), array[b].getPhNum());
				break;
				
			case 3://종료
				System.out.println("종료");
				f = false;
				break;
			
			}
			
		}
	}

}