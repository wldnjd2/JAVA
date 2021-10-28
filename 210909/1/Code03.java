package class0909;

public class Code03 {
	public static void main(String[] args) {
		
		//강제 타입 변환 예제
		int intValue = 44032;
		char charValue = (char)intValue;		//작은타입 = (작은타입)큰 타입
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		System.out.println(doubleValue);
		
		intValue = (int)doubleValue;
		System.out.println(intValue);
	
	}
}
