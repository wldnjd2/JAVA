package date0914;

import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);  
		System.out.println("���ڸ� �ΰ� �Է����ּ���");
		System.out.println(">");
		int ai = scan.nextInt();
		
		System.out.println(">");
		int bi = scan.nextInt();
		
		maxNumber(ai,bi);
	}
	public static void maxNumber(int x, int y) {
		if (x>y) {
			System.out.println(x+" �� "+y+" �߿� ū���� ==> "+x);
			//return;
		}else if(x<y){
			System.out.println(x+" �� "+y+" �߿� ū���� ==> "+y);
			//return;
		}else  {												//�� ���� ������
			System.out.println(x+" �� "+y+" �� �����ϴ�");
			return;												//����
			
		}
	}
}
