package class0909_3;

public class Code02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 75;
		
		if(score>= 90) {
			System.out.println("������ 100-90�Դϴ�.");
		    System.out.println("����� A");
		    
		} else if(score >= 80) {
			System.out.println("������ 80-89 �Դϴ�.");
			System.out.println("����� B");
			
		} else if (score >= 70) {
			System.out.println("������ 70-79 �Դϴ�.");
			System.out.println("��� C");
			
		} else {									//else �ڿ��� ���ǹ��� ���� ����
		System.out.println("������ 70�̸� �Դϴ�.");
		System.out.println("����� D ");
		}  
	}
	

}
