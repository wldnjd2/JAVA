package class0909_3;

import java.util.Scanner;

public class Code07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ �������ּ���.\n(1.���� 2.���� 3.���� 4.����)\n�����ȣ :");
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		
		switch(b) {
		case 1: System.out.println("101ȣ �Դϴ�."); break;
		case 2: System.out.println("102ȣ �Դϴ�."); break;
		case 3: System.out.println("203ȣ �Դϴ�."); break;
		case 4: System.out.println("202ȣ �Դϴ�."); break;
		default : System.out.println("�������� �������ּ���."); break;
	}	
		a.close();
	}
}
