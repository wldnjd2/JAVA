package date0916;

public class Code05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television myTv = new Television ();
		Television yourTv = new Television ();
		
		myTv.channel = 7;
		myTv.volume = 9;
		myTv.onOff = true;

		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;	
		
		System.out.println("나의 텔레비전 채널은"+myTv.channel+", 볼륨은"+myTv.volume+", 현재 상태는"+myTv.onOff+"입니다.");
		System.out.println("너의 텔레비전 채널은"+yourTv.channel+", 볼륨은"+yourTv.volume+", 현재 상태는"+yourTv.onOff+"입니다.");
	}

}
