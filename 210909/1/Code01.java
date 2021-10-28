package class0909;

public class Code01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//자동형변환 예제
		byte byteValue = 10;
		System.out.println(byteValue);
		
		int intValue = byteValue;		
		System.out.println(intValue);					//int로 형변환
		
		char charValue = '가';	
		intValue = charValue;							//변수대입	//char이 int로 형변환
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;;
		System.out.println(longValue);					//int가 long으로 형변환
		
		longValue = 100;
		float floatValue = longValue;					//long이 float으로 형변환
		System.out.println(floatValue);	
		
		floatValue = 100.5f;
		double doubleValue = floatValue; 				//float이 double로 형변환
		System.out.println(doubleValue);
		
		
	}

}
