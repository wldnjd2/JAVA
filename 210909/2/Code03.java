package class0909_2;

import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�̸� ���� ���ó�¥ �ڵ�����ȣ�� ��ĭ���� �и��Ͽ� �Է��Ͻÿ�");
		
		Scanner a = new Scanner(System.in);
		String b = a.next();
		int c = a.nextInt();
		int d = a.nextInt();
		String e = a.next();
		
		System.out.println("����� �̸��� " + b + "�Դϴ�.");
		System.out.println("����� ���̴� "+ c + "�Դϴ�.");
		System.out.println("������ ��¥�� "+ d + "�� �Դϴ�.");
		System.out.println("����� �ڵ��� ��ȣ�� +" + e + "�Դϴ�.");
		a.close();
		
	}

}
