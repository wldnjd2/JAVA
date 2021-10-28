package class0909_2;

import java.util.Scanner;

public class Code02 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String inputData = a.nextLine();				//공백도 같이 입력이 되어야 하기 때문에 nextLine
		System.out.println("입력된 문자열: \"" + inputData +"\"" );
		
		System.exit(1);									//1일때 프로그램 비정상 종료
														//0일때 정상종료
	}
}
