package date0914;

public class Calc {
	void powerOn() {					//전원온
		System.out.println("전원을 켭니다.");
	}
	int plus(int x, int y) {			//덧셈
		int result = x+y;
		return result;	
	}
	double divide(int x, int y) {		//나누기
		double result= (double)x/(double)y;
		return result;
		
	}
	void powerOff() {					//전원오프
		System.out.println("전원을 끕니다.");
	}
}
