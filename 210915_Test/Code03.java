package exam;

import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] seats = {0,0,0,0,0,0,0,0}; 						//seats.length = 8
		Scanner a_0 = new Scanner(System.in);
		int sum=0;//�����
		
		boolean i=true;
		while(i) {
			System.out.println("1. ����");
			System.out.println("2. ����");
			int a = a_0.nextInt();
			
			if(a == 1) { 										//����
				
				System.out.println("�¼� ��ȣ�� �Է��ϼ���.(1-8)");
				int seatsNum = a_0.nextInt();
			
				//�¼� ���� Ȯ��
				if(seats[seatsNum-1]==0){						//�¼� ��
					seats[seatsNum-1]=1;	
					System.out.println("���ŵǾ����ϴ�.");
					sum++;
				}
				else if(seats[seatsNum-1]==1) {					//�¼� ��
					System.out.println("�̹� ���ŵ� �¼��Դϴ�");
				}
			}
			if(a ==2) {//����
				System.out.println("���α׷��� �����մϴ�");
				System.out.println("�� �����: "+ sum*12000);
				break;
			}
			
			
		}//while
	}//main
}//class
