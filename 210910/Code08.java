package date0910;

import java.util.Scanner;

public class Code08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5개의 수를 입력고 갯수와 평균을 구하기
		//0이 입력되면 종료된다
		
		//방법1
		/*
		 * int y=0;								 //키보드로 입력받은 수를 저장하는 변수 
		   int z=0;								 //갯수 
		   int sum=0;							 //합계 
		 * Scanner x = new Scanner(System.in);
		 * 
		 * while((y=x.nextInt()) !=0) {    		 //입력한 수가 0이 아니면
		 * sum+=y; 								 //입력한 수 더하기
		 * z++; 								
		 * }//while문 종료
		 * 
		 * System.out.println("입력된 수의 갯수는 : "+ z); 
		 * System.out.println("입력된 수의 평균은 : "+(sum/z));
		 * 
		 * 
		 * }
		 * }
		 */
		//방법2
		int y = 0; 								//키보드로 입력받은 수를 저장하는 
		int z = 0; 								//갯수
		int sum = 0; 							//합계
		Scanner x = new Scanner(System.in);

		while (true) { 							// 무한루프
			y = x.nextInt();
			if(y==0)break; 						//무한루프 벗어남
			sum+=y;
			z++;
			if (z > 100)
				break;
		} // while문 종료

		System.out.println("입력된 수의 갯수는 : " + z);
		System.out.println("입력된 수의 평균은 : " + (sum / z));

	}

}
