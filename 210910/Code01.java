package date0910;

import java.util.Scanner;
public class Code01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("월(1~12)을 입력하시오: ");
		
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		
		switch(b) {
		case 1: case 12: case 11: case 2: 
			System.out.println("겨울입니다"); break;
		case 3: case 4: case 5: 
			System.out.println("봄입니다");  break;
		case 6: case 7: case 8:
			System.out.println("여름입니다");  break;
		case 9: case 10: 
			System.out.println("가을입니다");  break;
		}
		a.close();
	}

}
