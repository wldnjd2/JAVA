package practice;

public class Code02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//3번문제
//객체 5개를 가지는 배열을 생성하고 
//객체 반지름을 0~4까지 각각 지정후 
//면적을 출력	
		//Circle a = new Circle();//변수 a에 저장
		//int[] Array = new int[5];
		//위에가 아니고 객체와 배열 동시에 생성 선언
				
		Circle[] a = new Circle[5];			//a 배열 생성, 초기화는 아직 안했음
		for(int i=0; i<a.length; i++) {
			a[i] = new	Circle(i);			//객체 생성, 객체 값을 배열에 넣어줌
		}									//객체 생성하면 생성자 호출
											//i는 반지름
		for(int i=0;i<a.length;i++)	{
			System.out.println("반지름"+i+"  " +"원의 넓이 : "+a[i].width);			
		}		
	}
}
