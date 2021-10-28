package exam_date0914;

public class Gugudan {
	
	
	void gugudan() {
		for(int i=2; i<10; i++ ) {
			System.out.println(i+"´Ü");
			for(int j =1; j<10; j++) {
				System.out.println(i+" x "+j+" = "+(i*j));
			}System.out.println(" ");
		}
	}
	
	void gugudan(int x) {
		System.out.println(x+"´Ü");
		for(int j =1; j<10; j++) {
			System.out.println(x+" x "+j+" = "+(x*j));
		}System.out.println(" ");
		
	}
	

}//class
