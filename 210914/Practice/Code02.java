package exam_date0914;

public class Code02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//5번문제
//주어진 배열을 입력받아서 가장 큰 수를 반환하는 매서드를 만들기
		
		int[] array11 = {78,54,89,57,84,95,100 ,74,37,84,67,52,94,82};//배열을 생성과 초기화

		//객체 생성
		ArrayRT b = new ArrayRT(); //객체 rt1 생성	
		int max = b.a(array11);//a 메서드에 배열값 대입
		
		System.out.println("가장 큰 수는: "+ max);
		
		
	}
}


