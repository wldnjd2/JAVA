package date0910;

import java.util.Scanner;

public class Code08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5���� ���� �Է°� ������ ����� ���ϱ�
		//0�� �ԷµǸ� ����ȴ�
		
		//���1
		/*
		 * int y=0;								 //Ű����� �Է¹��� ���� �����ϴ� ���� 
		   int z=0;								 //���� 
		   int sum=0;							 //�հ� 
		 * Scanner x = new Scanner(System.in);
		 * 
		 * while((y=x.nextInt()) !=0) {    		 //�Է��� ���� 0�� �ƴϸ�
		 * sum+=y; 								 //�Է��� �� ���ϱ�
		 * z++; 								
		 * }//while�� ����
		 * 
		 * System.out.println("�Էµ� ���� ������ : "+ z); 
		 * System.out.println("�Էµ� ���� ����� : "+(sum/z));
		 * 
		 * 
		 * }
		 * }
		 */
		//���2
		int y = 0; 								//Ű����� �Է¹��� ���� �����ϴ� 
		int z = 0; 								//����
		int sum = 0; 							//�հ�
		Scanner x = new Scanner(System.in);

		while (true) { 							// ���ѷ���
			y = x.nextInt();
			if(y==0)break; 						//���ѷ��� ���
			sum+=y;
			z++;
			if (z > 100)
				break;
		} // while�� ����

		System.out.println("�Էµ� ���� ������ : " + z);
		System.out.println("�Էµ� ���� ����� : " + (sum / z));

	}

}
