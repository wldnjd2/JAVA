package date0910;

import java.util.Scanner;
public class Code01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��(1~12)�� �Է��Ͻÿ�: ");
		
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		
		switch(b) {
		case 1: case 12: case 11: case 2: 
			System.out.println("�ܿ��Դϴ�"); break;
		case 3: case 4: case 5: 
			System.out.println("���Դϴ�");  break;
		case 6: case 7: case 8:
			System.out.println("�����Դϴ�");  break;
		case 9: case 10: 
			System.out.println("�����Դϴ�");  break;
		}
		a.close();
	}

}
