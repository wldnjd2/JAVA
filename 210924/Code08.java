package date0924;

class People2{
	public void printInfo() {
		System.out.println("���� ����Դϴ�");
	}
}

class Man extends People2{
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("�׸��� �����Դϴ�");
	}
	public void enlist() {
		System.out.println("���� ���븦 ���ϴ�");
		System.out.println("�漺");
	}
}

class Woman extends People2{
	public void printInfo(){
		super.printInfo();
		System.out.println("�׸��� ���� �Դϴ�");
	}
	public void working(){
		System.out.println("���� �մϴ�");
		System.out.println("�ּ��� ����");
	}
}

public class Code08 {

	public static void main(String[] args) {
		People2 man = new Man();		
		People2 woman = new Woman();	
		 
		man.printInfo();
		((Man)man).enlist();			//����Ÿ�Ժ�ȯ
		System.out.println();
		woman.printInfo();
		((Woman)woman).working();		//����Ÿ�Ժ�ȯ
	}

}
