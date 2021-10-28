package class0909_2;

public class Code08 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result;

		//AND 하나라도 0이면 0
		result =((num1+=10) < 0) && ((num2+=10)>0);
		System.out.println(result);
		System.out.println(num1);
		System.out.println(num2);
		
		//OR 하나라도 1이면 1
		result =((num1+=10) > 0) || ((num2+=10)>0); //한글
		System.out.println(result);
		System.out.println(num1);
		System.out.println(num2);
	}
}
