package date0916;

public class Television {
	int channel;
	int volume;
	boolean onOff;//필드가 세개, 붕어빵 틀
	
	public void print(){
		System.out.println("나의 텔레비전 채널은"+channel+", 볼륨은"+volume+", 현재 상태는"+onOff+"입니다.");
	}
	int getChannel() {// 만든이유 private 사용할때 접근하려고		
	return channel;
	}
	void setchannel(int a) {
		channel = a;
	}
	
	//필드
	//필드는 초기화를 하지 않아도 사용가능
	//값을 메서드 안에서 넣어줄수 있음
	//변수
	//초기화해서 사용 가능
}
