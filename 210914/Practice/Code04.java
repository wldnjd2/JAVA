package exam_date0914;

import java.util.Scanner;

public class Code04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//7������
	//ũ�� 5�� �迭�� ���� �Է¹޾� ����� ���ϴ� �޼��� �����

		System.out.println("���ڸ� 5�� �Է��Ͻÿ�.");
		int[] array = new int[5];//�迭 ���� 
		Avr a = new Avr();//��ü ����
			
		for(int i = 0; i<array.length; i++) {
			Scanner num_0 = new Scanner(System.in);
			array[i] = num_0.nextInt();//�迭�� ���� ����
		}
		int b = a.average(array);
		System.out.println("���: "+ b);	
		}
}
