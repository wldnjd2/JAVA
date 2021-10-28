package date0914;

public class Code04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//매개변수의 개수를 모를경우
		//배열 타입으로 선언
		
		int[] values = {1,2,3};				//배열
		int sum = sum1(values);				//sum1 메소드 호출
		System.out.println("메인 합: "+sum);  //sum1의 return값
	}
	
	public static int sum1 (int[] values) {
		int sum =0;
		for(int i=0; i<values.length;i++) {
			sum+=values[i];
		}
		System.out.println("메서드 합: "+sum);
		return sum;
	}
}
