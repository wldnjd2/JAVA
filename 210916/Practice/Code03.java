package practice;

import java.util.Scanner;

public class Code03 {
//4������
//BookŬ������ Ȱ���Ͽ�
// 2��¥�� Book��ü �迭�� �����
//����ڷκ��� å�� ����� ���ڸ� �Է¹޾� �迭�ϼ�
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] b = new Book[2];					//book��ü �迭�� ������
			
		for(int i=0; i<b.length; i++) {
			System.out.println("����>>");
			String title = scan.nextLine();		//next�� ������ �ν��ϱ� ������ nextLine���� �������
			System.out.println("����>>");
			String writer = scan.nextLine(); 				
			b[i] = new Book(title,writer); 									
		}						
		for(int i=0; i<b.length; i++) {
			//System.out.println(b[i]);   ��ü�� ����� �ּҰ� ��µ�
			System.out.println("("+b[i].book +", "+ b[i].writer+")");
		}				
	}
}
