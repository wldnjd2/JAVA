package class0909;

public class Code01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�ڵ�����ȯ ����
		byte byteValue = 10;
		System.out.println(byteValue);
		
		int intValue = byteValue;		
		System.out.println(intValue);					//int�� ����ȯ
		
		char charValue = '��';	
		intValue = charValue;							//��������	//char�� int�� ����ȯ
		System.out.println("���� �����ڵ�: " + intValue);
		
		intValue = 50;
		long longValue = intValue;;
		System.out.println(longValue);					//int�� long���� ����ȯ
		
		longValue = 100;
		float floatValue = longValue;					//long�� float���� ����ȯ
		System.out.println(floatValue);	
		
		floatValue = 100.5f;
		double doubleValue = floatValue; 				//float�� double�� ����ȯ
		System.out.println(doubleValue);
		
		
	}

}
