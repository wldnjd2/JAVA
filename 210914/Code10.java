package date0914;

public class Code10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OverloadingEx o1 = new OverloadingEx();
		//o1.plus(3,3);
		//o1.plus(3.5,3.5);
		//o1.plus(3,3.5);
		//�� �������� ������ �ذ��Ϸ��� �ؿ� plus �Լ� �տ� public void���� static�� �������!
		//��ü�� �������� ������ static �����̴�

		//���� Ŭ������ ������ �ż��� �տ� static�� �ٿ��ָ� 
		//Ŭ���� �� ������ ���������� ��ü�� �Ƚᵵ ��
		
		//�ٸ� Ŭ������ �������� ������ �Ұ��� �ϱ� ������
		//��ü�� ���� ������ ����Ѵ�
		
		plus(3,3);
		plus(3.5,3.5);
		plus(3,3.5);	
	}//main�Լ� ��

	
	
	
		private static void plus(int a, int b) {			//��ȯ�� ���� ��� void
			System.out.println("���� + ���� = "+(a+b));
		}
		private static void plus(double a, double b) {
			System.out.println("�Ǽ� + �Ǽ� = "+(a+b));
		}
		private static void plus(int a, double b) {
			System.out.println("���� + �Ǽ� = "+(a+b));
		}
	
}