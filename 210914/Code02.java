package date0914;

public class Code02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc myCalc = new Calc();				//°´Ã¼ myCalc »ý¼º
		myCalc.powerOn();
		
		int result = myCalc.plus(5, 6);
		System.out.println("result: "+ result);
		
		byte x=10;
		byte y=4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: "+result2);
		
		myCalc.powerOff();
	}

}
