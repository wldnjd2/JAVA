package date0914;

public class Code07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car();					 //myCar��� ��ü ���� 
												 //myCar �ȿ� Car �޼ҵ尡 �ִ°�
		int g = 5;
		myCar.SetGas(g);						 //������ 5��ŭ ����
										    	 //gas =5
		System.out.println("������ "+ g+" �־����ϴ�.");
		
		boolean a = myCar.isLeftGas();				//������ �󸶳� �ִ��� Ȯ��
													//������ ������ a = true�� ��

		if(true) {									//������ �ִٸ�
			System.out.println("����մϴ�.");
				myCar.run();						//�ڵ��� ����
		}
													//������ ��� �ڵ����� ����
	//	if(myCar.isLeftGas()) {						//���� ������ Ȯ��
	//		System.out.println("������ ������ �ʿ䰡 �����ϴ�");
	//	}
	//	else 
			System.out.println("������ �����ϼ���.");

	}//main
}//class

