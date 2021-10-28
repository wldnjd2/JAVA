package date0914;

public class Computer {
	int sum1(int[] values) {				//sum1 매서드 생성	//객체가 들어감
		int sum =0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	int sum2(int ...values) {				//sum2 매서드 생성
		int sum=0;							//int ...values배열인데 객체가 안들어가도 배열로 인식
		for(int i=0;i<values.length;i++) {
			sum +=values[i];
		}
		return sum;
	}
}
