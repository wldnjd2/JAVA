package date0914;

public class Code04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Ű������� ������ �𸦰��
		//�迭 Ÿ������ ����
		
		int[] values = {1,2,3};				//�迭
		int sum = sum1(values);				//sum1 �޼ҵ� ȣ��
		System.out.println("���� ��: "+sum);  //sum1�� return��
	}
	
	public static int sum1 (int[] values) {
		int sum =0;
		for(int i=0; i<values.length;i++) {
			sum+=values[i];
		}
		System.out.println("�޼��� ��: "+sum);
		return sum;
	}
}
