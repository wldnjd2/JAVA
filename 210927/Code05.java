package date0927;

interface Tire{
	public void roll();
}

class HankookTire implements Tire {
	@Override
	public void roll() {
		System.out.println("�ѱ� Ÿ�̾ �������ϴ�.");
	}
}
class KumhoTire implements Tire{
	@Override
	public void roll() {
		System.out.println("��ȣ Ÿ�̾ �������ϴ�.");
	}
}
class Car {
	Tire frontLeftTire =  new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
public class Code05 {
	
	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		System.out.println();
		myCar.run();
	}
}
