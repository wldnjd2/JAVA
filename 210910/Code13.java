package date0910;

public class Code13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int cnt=1; cnt<=5;cnt++) {	
			System.out.println("cnt : "+cnt);
		}
		
		System.out.println();
		System.out.println("break 사용예");
		for(int cnt =1; cnt<=5; cnt++) {
			if(cnt==3) break;				
		System.out.println("cnt : "+cnt);
	}
		
	System.out.println();
	System.out.println("continue 사용예");
	for(int cnt=1; cnt<=5; cnt++) {
		if(cnt==3) continue;
		System.out.println("cnt : "+cnt);
	}

	}

}
