package date0910;

import java.util.Scanner;

public class Code15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub     
//
//1, 2     
		int s = 0;
		int i;
		int s1 = 0;

		System.out.println("1������--------------------------");
		for (i = 1; i <= 100; i++) {
			s = s + i;
			s1 = s;
			if (s > 1000)
				break;
		}
		System.out.println("1���� 100���� �� :" + s1 + "\n");

		System.out.println("2������--------------------------");
		System.out.println(s + "\n");
//
//3
		System.out.println("3������--------------------------"); 
		System.out.println("���̵�� ��й�ȣ�� �Է��Ͻÿ� :");
		Scanner a = new Scanner(System.in);
		String myid = a.next();
		int mypw = a.nextInt();

		String id = "green";				// ����� ���̵�
		int pw = 123;						// ����� ��й�ȣ
		boolean x1 = id.equals(myid);		// ���ڿ� ��
		if ((x1 == true) && (pw == mypw)) {
			System.out.println("Ȯ�εǾ����ϴ�." + "\n");
		} else
			System.out.println("�ٽ� �Է��ϼ���");
	//	a.close();
//
//4   
		System.out.println("4������--------------------------");
		System.out.println("������_¦����");
		int x; 								// ��
		int y;
		for (x = 1; x < 10; x++) {
			if (x % 2 == 1)
				continue;
			for (y = 1; y < 10; y++) {
				System.out.println(x + " X " + y + " = " + (x * y));
			}  
			System.out.println();
		}
//		
//5
		System.out.println("5������--------------------------");
		System.out.println("����~����~��~!");
		// ����0 ����1 ��2  ���� ��Ī
		Scanner z1 = new Scanner(System.in);
		String t1 = z1.next();//t1�� ���� ���°�
		
			int d =(int)(Math.random()*3); //��ǻ�Ͱ��� ������ 0 1 2 ��µ�
			
			switch(t1) {//���� �Է��ϴ� ���
			case "����"://0
				if(d == 1) 	System.out.println("��");
				else if (d==2) System.out.println("��");
				else System.out.println("��");
				break;
			case "����"://1
				if(d == 1) 	System.out.println("��");
				else if (d==2) System.out.println("��");
				else System.out.println("��");
				break;
			case "��"://2
				if(d == 1) 	System.out.println("��");
				else if (d==2) System.out.println("��");
				else System.out.println("��");//else �ڿ��� ���ǹ��� �ȵ�
				break;
			}    
// 
				
	
	}//main�Լ�

}
