package exam_date0914;

import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//6������
//ũ�� 5�� �迭�� ���� �Է¹޾� ������ ���ϴ� �޼��� �����
//�迭�� ���� �Է¹ޱ�
//�迭�� ������ ���ϴ� �ż��� ȣ��
		
		System.out.println("���ڸ� 5�� �Է��Ͻÿ�.");
		int[] array = new int[5];//�迭 ���� 
		Sum s = new Sum();//��ü ����
		
		for(int i = 0; i<array.length; i++) {
			Scanner num_0 = new Scanner(System.in);
			array[i] = num_0.nextInt();//�迭�� ���� ����
		}
		
		int b = s.total(array);
		System.out.println("����: "+ b);
		
	}

}
