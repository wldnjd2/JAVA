package exam_date0914;

import java.util.Scanner;

public class Code01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Gugudan ggd = new Gugudan();							//��ü ����
		Scanner dan_0 = new Scanner(System.in);
		
//1������	
		System.out.println("������ ���");
		ggd.gugudan();			
							
		

//2������	
		System.out.println("\n");
		System.out.println("����ϰ� ���� ���� �Է��Ͻÿ�.(2~9��)");
		
		int dan = dan_0.nextInt(); //���� �Է¹���
		
		ggd.gugudan(dan);

			
//3������
		System.out.println("�ΰ��� ���ڸ� �Է��Ͻÿ�.");
		int inputdan = dan_0.nextInt();	
		int inputdan_1 = dan_0.nextInt();
			
		if(inputdan<=inputdan_1){
			
			for(;inputdan<=inputdan_1; inputdan++) {
				ggd.gugudan(inputdan);
			}

		}
		else{
			for(;inputdan_1<=inputdan; inputdan_1++) {
				ggd.gugudan(inputdan_1);
			}
		}
		
		
//4������		
		System.out.println("���ڸ� �Ѱ� �Է��Ͻÿ�.");
 		int num = dan_0.nextInt();
 		ggd.gugudan(num);
 		
 		System.out.println("���ڸ� �ΰ� �Է��ϼ���");
		int num1 = dan_0.nextInt();	
		int num2 = dan_0.nextInt();
			
		if(num1<=num2){
			
			for(;num1<=num2; num1++) {
				ggd.gugudan(num1);
			}

		}
		else{
			for(;num2<=num1; num2++) {
				ggd.gugudan(num2);
			}
		}
 		System.out.println("");
		
	}//main

}//class
