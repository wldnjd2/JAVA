package date0914;

public class Code05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer com = new Computer();					//com ��ü ����
		int[] values = {1,2,3};							//values �迭 ����
		
		int result = com.sum1(values);					//sum1�Լ��� �迭 �Ű�����
		System.out.println("result: "+ result);			//result�� ��ȯ�� ȣ��
		
		int result2 = com.sum1(new int[] {1,2,3,4,5});	//sum1 �Ű������� ��ü ����
		System.out.println("result2: "+ result2);
		
		int result3 = com.sum2(values);					//sum2 �ż��� ȣ��
		System.out.println("result3: "+ result3);
		
		int result4 = com.sum2(1,2,3,4,5);				//sum2 �ż��忡 �Ű������� ��Ҹ� ���� ����
		System.out.println("result4: "+ result4);
	}

}

