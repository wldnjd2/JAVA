package date0923;

public class Code08 {

	public static void main(String[] args) {
		Child05 child = new Child05();			//��ü ����
		child.takeOff();
		child.fly();//flyMode!=SUPERSONIC
		child.flyMode = child.SUPERSONIC;//NORMAL=2
		child.fly();//
		child.flyMode = child.NORMAL;//NORMAL
		child.fly();
		child.land();
	}
}

class Parent05{
	public void land() {
		System.out.println("�����մϴ�.");
	}
	public void fly() {\
		System.out.println("�������Դϴ�.");
		
	}public void takeOff() {
		System.out.println("�̷��մϴ�.");
	}
}

class Child05 extends Parent05 {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC =2;
	
	public int flyMode =NORMAL;
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("������ ������ �Դϴ�.");
		}else {
			super.fly();
		}
	}
}