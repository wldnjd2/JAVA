package date0914;

public class Code09 {

	public static void main(String[] args) {		//public ��𿡼��� ���
		// TODO Auto-generated method stub
		info("��浿");								//�̸��� ���� info �Լ� ȣ�� �޼ҵ� �����ε�
		info("��浿",25);
		info("asdf",1234);
		info(123, "�ڵ� ���ø�Ʈ");
		
	}
	private static void info(String name) { 		//private �ش� Ŭ�������� ��밡��
		System.out.println("�̸�: "+name);
	}	
	private static void info(String name, int age) {
		System.out.println("�̸�: "+name);
		System.out.println("����: "+age);
	}
	private static void info(String id, String pw) {
		System.out.println("���̵�: "+id);
		System.out.println("pw: "+pw);
	}
	private static void info(int number, String title) {
		System.out.println("number: "+number);
		System.out.println("title: "+title);
	}
}
