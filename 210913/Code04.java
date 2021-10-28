package date0913;

public class Code04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//총 4학년 2학기
		int sum = 0;
	//	int x=0;
	//	int y=0;
		int[][] a = {{90,90},{80,80},{70,80},{90,70}};  //행은 학년, 열은 학기 
														//4X2
		for(int i=0; i<4;i++) {	 						//a.length	행
	//	x+=1;				
			for(int j=0; j<2; j++){						//a[i].length	열
				sum += a[i][j]; 						//s = s+a
	//			y +=1;  
			}
		}	
		int x =a.length;
		int y = a[0].length;
		System.out.println("총점: "+sum);
		System.out.println("평균: "+sum/(x*y));
		
	}

}
