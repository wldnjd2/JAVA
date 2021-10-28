package date0927;

class Audio implements RemoteControl {
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�");
	}
	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�");
	}
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume <RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else this.volume = volume;
	System.out.println("���� Audio ����: "+this.volume);			
	}
}
public class Television implements RemoteControl {
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	@Override
	public void setVolume (int volume) {
		if(volume >RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume <RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else this.volume =volume;
	System.out.println("���� TV ����: "+this.volume);
	}
}
public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
		void turnOn();
		void turnOff();
		void setVolume (int volume);
}

public class Code03 {
	public static void main(String[] args) {		
		RemoteControl rc= new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}
}
	