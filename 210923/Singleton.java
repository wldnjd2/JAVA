package date0923;

public class Singleton {
private Singleton() {}								//������ ����
	private static Singleton s = new Singleton();	//��ü ����
	public static Singleton getInstance() {
		/*����� ���α׷��� �������� ���ؼ�
		if(s==null) {				
			s = new Singleton();
		}*/		
		return s;//��ü �ּ� ��ȯ
		
	}
	private String field;
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field =  field;
	}//�ʵ忡 ���������� ������ �� ���� ������ get�ʵ� set �ʵ� ���
}
