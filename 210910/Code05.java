package date0910;

public class Code05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//구구단 출력
		for(int z=2; z<10; z++) {
		System.out.println("구구단 " + z + "단 출력");
		System.out.println();
			for(int i=1; i<10; i++) {
				System.out.println(z+" x "+i +" = "+ z*i);
				if(i==9) System.out.println();			
			}
			
		}
	}

}

