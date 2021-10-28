package date0927;

//�Ｚ �����Ͱ� ���� ���� �÷� ������ ����� �߰��ߴٰ� ����
//printable �������̽��� ��� �߰��ϴ�  ������ �������� �ʴ´�
//�� ���·� �߻� �޼ҵ带 �߰��� ��� �÷������ �������� �ʴ� 
//lg �����Ϳ��� �������̵��� ������ϴ� ���� �߻�
//�̷� ������ ������� ó�� ����
interface Printer {
	void print(String doc);
}
interface ColorPrintable extends Printer{
	void printCMYK(String doc);
}

class SamsungPrt implements ColorPrintable {
	@Override
	public void print(String doc) {
		System.out.println("�Ｚ ������");
		System.out.println(doc+"�� �μ��մϴ�");
	}
	@Override
	public void printCMYK(String doc) {
		System.out.println("�Ｚ ������");
		System.out.println("�÷��� "+doc+"�� �μ��մϴ�.");
	}
}

class LGPrt implements Printer {
	public void print(String doc) {
		System.out.println("LG ������");
		System.out.println(doc +"�� �μ��մϴ�");
	}
}

public class Code08 {

	public static void main(String[] args) {
		String doc = "�ڹ� �̷� ����";
		
		SamsungPrt s = new SamsungPrt();
		s.print(doc);
		s.printCMYK(doc);
		System.out.println();
		
		LGPrt l = new LGPrt();
		l.print(doc);
		System.out.println();
	}

}
