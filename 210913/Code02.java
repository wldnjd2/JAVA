package date0913;

import java.util.Scanner;

public class Code02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//양수 5개를 입력받아 배열에 저장하고, 제일 큰 수를 출력하세요.
	
		Scanner a = new Scanner(System.in);
		int[] b = new int[5];					//배열 생성과 선언
		int max = 0;
		System.out.println("양수 5개를 입력하세요.");		
		
		for(int i=0; i<5; i++) {				//입력받은 값을 배열에 저장
			b[i] = a.nextInt();
		
			if(max < b[i]) {					//최대값
				max = b[i];						//대입
			}	
		}		
		System.out.println("가장 큰 수는 : "+max);				
	}		
}


