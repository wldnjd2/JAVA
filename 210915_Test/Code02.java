package exam;

import java.util.Scanner;

public class Code02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//����2
	
		gugudan g = new gugudan();	//��ü ����
		Scanner dan_0 = new Scanner(System.in);
		g.ggd();
		
		System.out.println("------------------------\n");
		System.out.println("����ϰ��� �ϴ� ���� �Է��ϼ���.");
		

		int dan = dan_0.nextInt();
		
		g.ggdan(dan);
		
		System.out.println("------------------------\n");
		System.out.println("�ΰ��� ���ڸ� �Է��ϼ���.");
		
		int num1 = dan_0.nextInt();
		int num2 = dan_0.nextInt();

		g.gudan(num1, num2 );
	}

}
