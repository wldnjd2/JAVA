package exam_date0914;

import java.util.Scanner;

public class Code07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//10�� ����
//���� ���� ��� ��ȸ ����� ���� �޼���� �����
//���ᰡ ���õ��� ������ �޴��� �ݺ������� ��µǵ��� �Ͻÿ�
//�ִ� �ݰ� �׼��� 100������ �� �̻����δ� �� �Ա� �Ұ���
//�ܾ� 90������ 11������ �Ա��ϸ� 100���� �̻��̹Ƿ� �Ա� �ź�

		Bank Jbank = new Bank(); //��ü ����
		
		boolean f = true;
		while(f) {
			System.out.println("---------------J Bank--------------");
			System.out.println("      �޴��� �����Ͻÿ�.");
			System.out.println("          ����\n          ���\n        �ܾ� ��ȸ\n          ����\n");
			Scanner input_0 = new Scanner(System.in);
			String input = input_0.next();
			int mybalance = 0;//�ܾ�
			
			switch(input) {
			case "����"://�Ա��ϰ����� �ܾ���100������ ������
				//�Աݱݾ� �ʰ�
				//100���� �ȳ����� �Ա�
				//�ܾ��� �󸶳��Ҵ��� �����ֱ�
				Jbank.deposit();
				Jbank.balance();
				
				break;//switch�� ��������
			case "���":
				//����ϰ��� �ܾ��� <0 ����
				//�ܾ��� �����մϴ�
				//>0
				//�ܾ��� �󸶳��Ҵ��� �����ֱ�
				Jbank.withdraw();
				Jbank.balance();
				break;
			case "�ܾ���ȸ":
				//�ܾ��� �󸶳��Ҵ��� �����ֱ�
				Jbank.balance();
				break;							
			case "����":
				f = false;
				break;
			default : System.out.println("�߸��������ϴ�.");break;
		
			}	
		}
	}

}
