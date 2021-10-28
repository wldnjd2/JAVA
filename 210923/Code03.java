package date0923;

public class Code03 {// Ŭ���� �ȿ� Ŭ���� ���� �ʵ��� �����ϱ�

	public static void main(String[] args) {

		Child01 child = new Child01("�ڹ���", "����", 10);

		System.out.println("��ӹ��� ��: " + child.model);
		System.out.println("��ӹ��� ����: " + child.color);

		System.out.println("�ڽ� Ŭ���� ä��: " + child.channel);

		child.powerOn();
		child.bell();
		child.sendVoice("�ȳ��ϼ���.");
		child.receiveVoice("�ȳ��ϼ���!");
		child.sendVoice("������ �����Ű���?");
		child.hongUp();

		child.turnOn();
		child.changeChannel(56);
		child.turnOff();
	}

}

class Parent01 {// ���ϸ��� �ƴҶ��� �տ� public�� ������ �ȵ�
	String model;
	String color;

	void powerOn() {
		System.out.println("�������մϴ�.");
	}

	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}

	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}

	void sendVoice(String message) {
		System.out.println("�ڽ�: " + message);
	}

	void receiveVoice(String message) {
		System.out.println("����: " + message);
	}

	void hongUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
}

class Child01 extends Parent01 {
	int channel;

	Child01(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	void turnOn() {
		System.out.println("ä��:" + channel + "�� ����� �����մϴ�.");
	}

	void changeChannel(int channel) {
		System.out.println("ä���� " + channel + "������ �����մϴ�.");
	}

	void turnOff() {
		System.out.println("����� �ߴ��մϴ�.");
	}
}