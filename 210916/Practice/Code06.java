package practice;

import java.util.Scanner;

public class Code06 {
//7번문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
		int math =sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		
		Grade me = new Grade(math,science,english);//객체 생성, 생성자 호출
		System.out.println("평균은 "+me.average());  //average는 평균을 계산하여 리턴
		
		sc.close();
	}

}
