package exam_date0914;

import java.util.Scanner;

public class Code01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Gugudan ggd = new Gugudan();							//객체 생성
		Scanner dan_0 = new Scanner(System.in);
		
//1번문제	
		System.out.println("구구단 출력");
		ggd.gugudan();			
							
		

//2번문제	
		System.out.println("\n");
		System.out.println("출력하고 싶은 단을 입력하시오.(2~9단)");
		
		int dan = dan_0.nextInt(); //단을 입력받음
		
		ggd.gugudan(dan);

			
//3번문제
		System.out.println("두개의 숫자를 입력하시오.");
		int inputdan = dan_0.nextInt();	
		int inputdan_1 = dan_0.nextInt();
			
		if(inputdan<=inputdan_1){
			
			for(;inputdan<=inputdan_1; inputdan++) {
				ggd.gugudan(inputdan);
			}

		}
		else{
			for(;inputdan_1<=inputdan; inputdan_1++) {
				ggd.gugudan(inputdan_1);
			}
		}
		
		
//4번문제		
		System.out.println("숫자를 한개 입력하시오.");
 		int num = dan_0.nextInt();
 		ggd.gugudan(num);
 		
 		System.out.println("숫자를 두개 입력하세요");
		int num1 = dan_0.nextInt();	
		int num2 = dan_0.nextInt();
			
		if(num1<=num2){
			
			for(;num1<=num2; num1++) {
				ggd.gugudan(num1);
			}

		}
		else{
			for(;num2<=num1; num2++) {
				ggd.gugudan(num2);
			}
		}
 		System.out.println("");
		
	}//main

}//class
