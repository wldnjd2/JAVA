package date0916;

public class Code04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television myTv= new Television();
		myTv.channel= 7;
		myTv.volume = 9;
		myTv.onOff = true;
		System.out.println("채널은 "+myTv.channel+", "
				+ "볼륨은 "+myTv.volume+", "
						+ "현재 상태는 "+myTv.onOff+"입니다");
		
	}

}
