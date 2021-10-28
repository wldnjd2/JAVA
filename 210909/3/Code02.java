package class0909_3;

public class Code02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 75;
		
		if(score>= 90) {
			System.out.println("점수가 100-90입니다.");
		    System.out.println("등급은 A");
		    
		} else if(score >= 80) {
			System.out.println("점수가 80-89 입니다.");
			System.out.println("등급은 B");
			
		} else if (score >= 70) {
			System.out.println("점수가 70-79 입니다.");
			System.out.println("등급 C");
			
		} else {									//else 뒤에는 조건문이 오지 않음
		System.out.println("점수가 70미만 입니다.");
		System.out.println("등급은 D ");
		}  
	}
	

}
