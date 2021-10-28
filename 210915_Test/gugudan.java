package exam;

public class gugudan {
	
	void ggd() {
		while(true) {
			for(int i=2; i<10; i++) {
				for(int j=1; j<10;j++) {
					System.out.println(i+"x"+j+"="+(i*j));						
				} System.out.println(" ");
			}break;
		}//ggd
	}
	
	void ggdan(int i) {
		int j = 1;
		do{
			System.out.println(i+"x"+j+"="+(i*j));	
			j++;
			}while (j<10);
	}//ggd
	
	void gudan(int x, int y) {
			for( ;y<10; y*=2) {
				System.out.println(x+"x"+y+"="+(x*y));
			}System.out.println(" ");
	}
  
}//class
		
		
		
		
	

