package date0910;

public class Code06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;				//��
		int z = 0;					//����
		for(int i=1; i<=100; i++) {
			if(i%7 == 0) {			//7�� ����϶�
				z++; 				//����� ����
				sum+=i; 			//����� ��
				
			}//i�� �������� 7�� �������� 0�� �ƴϸ�
		
		}//for�� ��
		
		System.out.println("7�� ����� ���� : " + z);
		System.out.println("7�� ����� �� : " + sum);
		System.out.println("7�� ����� ��� : " + sum/z );
			
	}
 
}
