package date0923;

public class Code03 {// 클래스 안에 클래스 넣지 않도록 주의하기

	public static void main(String[] args) {

		Child01 child = new Child01("자바폰", "검정", 10);

		System.out.println("상속받은 모델: " + child.model);
		System.out.println("상속받은 색상: " + child.color);

		System.out.println("자식 클래스 채널: " + child.channel);

		child.powerOn();
		child.bell();
		child.sendVoice("안녕하세요.");
		child.receiveVoice("안녕하세요!");
		child.sendVoice("무슨일 있으신가요?");
		child.hongUp();

		child.turnOn();
		child.changeChannel(56);
		child.turnOff();
	}

}

class Parent01 {// 파일명이 아닐때는 앞에 public이 붙으면 안됨
	String model;
	String color;

	void powerOn() {
		System.out.println("전원을켭니다.");
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	void bell() {
		System.out.println("별이 울립니다.");
	}

	void sendVoice(String message) {
		System.out.println("자신: " + message);
	}

	void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}

	void hongUp() {
		System.out.println("전화를 끊습니다.");
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
		System.out.println("채널:" + channel + "번 방송을 수신합니다.");
	}

	void changeChannel(int channel) {
		System.out.println("채널을 " + channel + "번으로 변경합니다.");
	}

	void turnOff() {
		System.out.println("방송을 중단합니다.");
	}
}