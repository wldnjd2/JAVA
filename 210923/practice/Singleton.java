package practice;
//2������
//�����ڰ� private ������� ������ �� Ŭ������ �ν��Ͻ��� ����Ҽ� �ֵ��� getInstance �޼ҵ� �ۼ�
public class Singleton {
	
	private static Singleton a = new Singleton();		//��ü ����
	private Singleton() {}								//private�� ����Ϸ��� ������

	public static Singleton getInstance() {
		return a;										//��ü �ּҸ� ���� ���� ��ȯ
	}	
	
	private int number;

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}	
}
