package practice;
//2������
//main
public class Code01 {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();//s���� a������ �ּҰ��� (a �������� ��ü�� �ּҰ�) �������
		s.setNumber(100);
		System.out.println(s.getNumber());

	}

}
