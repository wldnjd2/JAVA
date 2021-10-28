package date0910;

public class Code11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//구구단 2단-9단
		
		for(int i = 2; i<10; i++) {
			System.out.println(i+"단");

			for(int j=1; j<10; j++) {
				System.out.print(i + " x ");
				System.out.print(j+ " = "+(i*j));
				System.out.println();
			}//j_for문 끝
			
			System.out.println();
		}//i_for문 끝			
	}

}
