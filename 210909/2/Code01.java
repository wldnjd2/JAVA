package class0909_2;

import java.util.Scanner;				//Scanner�� ���콺 Ŀ�� ���, ctrl+shift+o �ѹ��� ������ ����Ʈ ���� ����

public class Code01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		
		String b = a.next();				//next�� ������ �������� �߶����� �ǹ�
		String c = a.next();
		int d = a.nextInt();
		double e = a.nextDouble();
		boolean f = a.nextBoolean();

		System.out.println("�̸�: "+ b);
		System.out.println("������ : "+c);
		System.out.println("���� : "+d);
		System.out.println("������ : "+e);
		System.out.println("T or F : "+f);
	}

}
