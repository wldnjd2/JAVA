package date0914;

import java.util.Scanner;

public class Code06 {
	public static int maxNumber(int x, int y) {
		if(x>y) return x;
		else if (x<y) return y;
		else return 1;					//���Ƽ� �ƹ��ų� ��ȯ�ص� ��
	}
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("���ڸ� �ΰ� �Է����ּ���.");
			
			int input1 = scan.nextInt();
			int input2 = scan.nextInt();
			
			int result = maxNumber(input1, input2);
			
			if(result==1) System.out.println("�� ���� �����ϴ�");
			else System.out.println("ū ���� "+result);
		// TODO Auto-generated method stub

	}

}
