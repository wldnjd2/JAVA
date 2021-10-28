package date0914;

import java.util.Scanner;

public class Code06 {
	public static int maxNumber(int x, int y) {
		if(x>y) return x;
		else if (x<y) return y;
		else return 1;					//같아서 아무거나 반환해도 됨
	}
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("숫자를 두개 입력해주세요.");
			
			int input1 = scan.nextInt();
			int input2 = scan.nextInt();
			
			int result = maxNumber(input1, input2);
			
			if(result==1) System.out.println("두 수는 같습니다");
			else System.out.println("큰 수는 "+result);
		// TODO Auto-generated method stub

	}

}
