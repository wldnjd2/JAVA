package date0910;

import java.util.Scanner;

public class Code14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//다섯개의 정수를 입력받고 양수 합을 구하여 출력
		
		System.out.println("다섯개의 정수를 입력하시오");
		Scanner a = new Scanner(System.in);
		int s = 0;									//합의 값을 저장하는 변수
		int b;										//입력받은 정수를 저장하는 변수
		for (int i = 0; i < 5; i++) {				//5개의 정수를 입력받음
			if ((b = a.nextInt()) > 0) {			//양수인지 확인
				s += b;								//양수라면 합
			}//if문 끝
			else continue;							//다시 for문으로 돌아감
		}//for문 끝
		System.out.println(s);

	}

}
