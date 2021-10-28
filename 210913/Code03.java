package date0913;

public class Code03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {83, 90, 87};//배열 선언과 초기화
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {				//length필드 사용
			sum += scores[i];
		}
		System.out.println("총합 : "+sum);
		double avg = (double) sum/scores.length;			//없어도 됨
		System.out.println("평균 : "+avg);
	}

}

