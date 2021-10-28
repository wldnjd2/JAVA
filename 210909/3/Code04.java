package class0909_3;

import java.util.Scanner;

public class Code04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자를 입력 해주세요");

		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		if (b < 0) {
			System.out.println("음수입니다");
		} else if (b==0) {
			System.out.println("0입니다");
		} else
			System.out.println("양수입니다");
	}
}
//ctrl+shift+f 누르면 공백 정리됨
