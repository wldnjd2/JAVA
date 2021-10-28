package date0914;

public class Code05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer com = new Computer();					//com 객체 생성
		int[] values = {1,2,3};							//values 배열 생성
		
		int result = com.sum1(values);					//sum1함수에 배열 매개변수
		System.out.println("result: "+ result);			//result로 반환값 호출
		
		int result2 = com.sum1(new int[] {1,2,3,4,5});	//sum1 매개변수에 객체 넣음
		System.out.println("result2: "+ result2);
		
		int result3 = com.sum2(values);					//sum2 매서드 호출
		System.out.println("result3: "+ result3);
		
		int result4 = com.sum2(1,2,3,4,5);				//sum2 매서드에 매개변수를 요소를 직접 넣음
		System.out.println("result4: "+ result4);
	}

}

