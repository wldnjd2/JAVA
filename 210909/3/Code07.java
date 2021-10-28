package class0909_3;

import java.util.Scanner;

public class Code07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("과목을 선택해주세요.\n(1.수학 2.과학 3.영어 4.역사)\n과목번호 :");
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		
		switch(b) {
		case 1: System.out.println("101호 입니다."); break;
		case 2: System.out.println("102호 입니다."); break;
		case 3: System.out.println("203호 입니다."); break;
		case 4: System.out.println("202호 입니다."); break;
		default : System.out.println("상담원에게 문의해주세요."); break;
	}	
		a.close();
	}
}
