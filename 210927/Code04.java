package date0927;

//����Ʈ ��� ����� ����� ���� �������̽��� �����
//�Ｚ����Ʈ�� ��������Ʈ ��� ��±�� ������ �� �������̽��� ���� ����
//main Ŭ�������� ������ ����Ʈ�� �����ϰ� �μ⸦ �����Ѵ�
interface Printer {
	void print(String doc);
	
}
class Samsung implements Printer {
	@Override
	public void print(String doc) {
		System.out.println("Samsung ������");
		System.out.println(doc +"�� �μ��մϴ�");
	}
}
class Lg implements Printer {
	public void print(String doc) {
		System.out.println("LG ������");
		System.out.println(doc +"�� �μ��մϴ�");
	}
}
public class Code04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String doc = "�ڹ� �̷� ����";
		Samsung s = new Samsung();
		s.print(doc);
		System.out.println();
		
		Lg l = new Lg();
		l.print(doc);
		System.out.println();
	}

}
