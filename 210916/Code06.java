package date0916;

public class Code06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television myTv = new Television ();
		Television yourTv = new Television ();
		
		myTv.channel = 7;
		myTv.volume = 9;
		myTv.onOff = true;
		myTv.print();
		
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;	
		yourTv.print();
	}

}
