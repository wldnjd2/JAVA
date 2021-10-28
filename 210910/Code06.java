package date0910;

public class Code06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;				//합
		int z = 0;					//갯수
		for(int i=1; i<=100; i++) {
			if(i%7 == 0) {			//7의 배수일때
				z++; 				//배수의 갯수
				sum+=i; 			//배수의 합
				
			}//i의 나머지가 7로 나눴을때 0이 아니면
		
		}//for문 끝
		
		System.out.println("7의 배수의 갯수 : " + z);
		System.out.println("7의 배수의 합 : " + sum);
		System.out.println("7의 배수의 평균 : " + sum/z );
			
	}
 
}
