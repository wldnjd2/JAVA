package date0913;

import java.util.Scanner;

public class Code02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��� 5���� �Է¹޾� �迭�� �����ϰ�, ���� ū ���� ����ϼ���.
	
		Scanner a = new Scanner(System.in);
		int[] b = new int[5];					//�迭 ������ ����
		int max = 0;
		System.out.println("��� 5���� �Է��ϼ���.");		
		
		for(int i=0; i<5; i++) {				//�Է¹��� ���� �迭�� ����
			b[i] = a.nextInt();
		
			if(max < b[i]) {					//�ִ밪
				max = b[i];						//����
			}	
		}		
		System.out.println("���� ū ���� : "+max);				
	}		
}


