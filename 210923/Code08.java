package date0923;

public class Code08 {

	public static void main(String[] args) {
		Child05 child = new Child05();			//객체 생성
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
		System.out.println("착륙합니다.");
	}
	public void fly() {\
		System.out.println("비행중입니다.");
		
	}public void takeOff() {
		System.out.println("이륙합니다.");
	}
}

class Child05 extends Parent05 {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC =2;
	
	public int flyMode =NORMAL;
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행중 입니다.");
		}else {
			super.fly();
		}
	}
}