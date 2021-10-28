package exam_date0914;

public class ArrayRT {
	//5번문제
	//가장 큰 수를 반환하는 메서드
	//배열의 숫자를 읽어서 반환
	//
	
	int a(int[] array11) {//rt라는 메서드 생성 //매서드의 매개변수로 배열//return값이 int이기때문에 int로 설정
	int max = 0;
		
	for(int i=0; i<array11.length; i++) {
		if(max<array11[i]) {
		max = array11[i];	
		}//max가 배열값보다 크면
		//if
		}//for
		
		
		return max;//메서드 종료 전에 
	}//a
}//class
