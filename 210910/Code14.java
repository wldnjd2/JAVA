package date0910;

import java.util.Scanner;

public class Code14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ټ����� ������ �Է¹ް� ��� ���� ���Ͽ� ���
		
		System.out.println("�ټ����� ������ �Է��Ͻÿ�");
		Scanner a = new Scanner(System.in);
		int s = 0;									//���� ���� �����ϴ� ����
		int b;										//�Է¹��� ������ �����ϴ� ����
		for (int i = 0; i < 5; i++) {				//5���� ������ �Է¹���
			if ((b = a.nextInt()) > 0) {			//������� Ȯ��
				s += b;								//������ ��
			}//if�� ��
			else continue;							//�ٽ� for������ ���ư�
		}//for�� ��
		System.out.println(s);

	}

}
