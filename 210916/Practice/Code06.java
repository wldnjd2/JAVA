package practice;

import java.util.Scanner;

public class Code06 {
//7������
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����, ����, ���� ������ 3���� ���� �Է� >> ");
		int math =sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		
		Grade me = new Grade(math,science,english);//��ü ����, ������ ȣ��
		System.out.println("����� "+me.average());  //average�� ����� ����Ͽ� ����
		
		sc.close();
	}

}
