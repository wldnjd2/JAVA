package practice;

import java.util.Scanner;
//3������
//�α��� ������ �̸��� ��ȭ��ȣ ���
public class Code02 {
	
	public static Member array []= new Member[100];//�迭 ���� ����� ��ü�� ��
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b=0;//�迭 �ε���
		boolean f = true;
		while(f) {
			System.out.println("1. ȸ������");
			System.out.println("2. �α���");
			System.out.println("3. ����");
			int menu = scan.nextInt();
			
			switch(menu) {
			case 1://ȸ������
				System.out.print("ID: ");
				String id = scan.next();
				System.out.print("password: ");
				String pw = scan.next();
				System.out.print("name: ");
				String name = scan.next();
				System.out.print("phNum: ");
				String phNum = scan.next();
				System.out.println(" ");
				 
				Member myMember = new Member(id, pw, name, phNum); 	//��ü ����
				
				for(int i=0; i<array.length; i++) {					//��ü ���� �迭�� �־���
					if(array==null) {
						array[i] = myMember;
					} break;
				}
				break;
			
			case 2://�α���
				System.out.print("ID: ");
				String logid = scan.next();
				System.out.print("password: ");
				String logpw = scan.next();
				System.out.println(" ");
			
				//ȸ�������� �Ǿ��ִ��� Ȯ��
				for(int i=0; i<array.length; i++) {
					if(array[i]==null) {
						continue;					
					}else if(array[i].getId().equals(logid)&&array[i].getPw().equals(logpw)) {
						b=i; 
					System.out.println("�α��� ����");
					}
					else System.out.println("���̵�� �н����尡 Ʋ��"); 
						break;	
				}
			
				//���
				array[b].prt(array[b].getName(), array[b].getPhNum());
				break;
				
			case 3://����
				System.out.println("����");
				f = false;
				break;
			
			}
			
		}
	}

}