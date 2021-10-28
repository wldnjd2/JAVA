package exam_date0914;

import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//6번문제
//크기 5의 배열의 값을 입력받아 총점을 구하는 메서드 만들기
//배열의 값을 입력받기
//배열의 총점을 구하는 매서드 호출
		
		System.out.println("숫자를 5개 입력하시오.");
		int[] array = new int[5];//배열 생성 
		Sum s = new Sum();//객체 생성
		
		for(int i = 0; i<array.length; i++) {
			Scanner num_0 = new Scanner(System.in);
			array[i] = num_0.nextInt();//배열에 숫자 대입
		}
		
		int b = s.total(array);
		System.out.println("총합: "+ b);
		
	}

}
