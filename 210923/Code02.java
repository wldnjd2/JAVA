package date0923;

public class Code02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s = Singleton.getInstance(); //��ȯ�� �ּҸ� s�� ����
		
		s.setField("�ȳ��ϼ���");
		
		System.out.println(s.getField());
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2.getField());
	}

}
