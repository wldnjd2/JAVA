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
		
		System.out.println("���� �ڷ����� ä����"+myTv.channel+", ������"+myTv.volume+", ���� ���´�"+myTv.onOff+"�Դϴ�.");
		System.out.println("���� �ڷ����� ä����"+yourTv.channel+", ������"+yourTv.volume+", ���� ���´�"+yourTv.onOff+"�Դϴ�.");
	}

}
