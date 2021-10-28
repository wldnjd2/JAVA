package date0914;

import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);  
		System.out.println("숫자를 두개 입력해주세요");
		System.out.println(">");
		int ai = scan.nextInt();
		
		System.out.println(">");
		int bi = scan.nextInt();
		
		maxNumber(ai,bi);
	}
	public static void maxNumber(int x, int y) {
		if (x>y) {
			System.out.println(x+" 와 "+y+" 중에 큰수는 ==> "+x);
			//return;
		}else if(x<y){
			System.out.println(x+" 와 "+y+" 중에 큰수는 ==> "+y);
			//return;
		}else  {												//두 수가 같을때
			System.out.println(x+" 와 "+y+" 는 같습니다");
			return;												//종료
			
		}
	}
}
