package exam;

import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] seats = {0,0,0,0,0,0,0,0}; 						//seats.length = 8
		Scanner a_0 = new Scanner(System.in);
		int sum=0;//매출액
		
		boolean i=true;
		while(i) {
			System.out.println("1. 예매");
			System.out.println("2. 종료");
			int a = a_0.nextInt();
			
			if(a == 1) { 										//예매
				
				System.out.println("좌석 번호를 입력하세요.(1-8)");
				int seatsNum = a_0.nextInt();
			
				//좌석 유무 확인
				if(seats[seatsNum-1]==0){						//좌석 유
					seats[seatsNum-1]=1;	
					System.out.println("예매되었습니다.");
					sum++;
				}
				else if(seats[seatsNum-1]==1) {					//좌석 무
					System.out.println("이미 예매된 좌석입니다");
				}
			}
			if(a ==2) {//종료
				System.out.println("프로그램을 종료합니다");
				System.out.println("총 매출액: "+ sum*12000);
				break;
			}
			
			
		}//while
	}//main
}//class
