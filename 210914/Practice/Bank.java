package exam_date0914;

import java.util.Scanner;

public class Bank {
	Scanner money_0 = new Scanner(System.in);
	int mybalance = 0;//�ܾ�
	
	void deposit(){//����
		System.out.println("�Ա��Ͻ� �ݾ��� �Է��ϼ���.");
		int money = money_0.nextInt();
		
		mybalance += money;//�Ա�
		
		if(money>=1000000) {//�ܾ��� 100������ ������
			System.out.println("�ܾ��ʰ� �Դϴ�.");
			mybalance-=money;
		}else{//�ܾ��� 100������ �ȳ�����
			System.out.println("�ԱݵǾ����ϴ�.");
		}
		
	}
	void withdraw(){//���
		System.out.println("����Ͻ� �ݾ��� �Է��ϼ���.");
		int money = money_0.nextInt();
		
		mybalance-=money;//���
		if(mybalance<0) {
			System.out.println("�ܾ��� �����մϴ�.");
			mybalance+=money;
		}else {//mybalance>=0
			System.out.println("��ݵǾ����ϴ�");
		}
	}
	void balance(){
		
		System.out.println("�ܾ��� "+mybalance+" �� �Դϴ�");
	}

}
