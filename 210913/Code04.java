package date0913;

public class Code04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�� 4�г� 2�б�
		int sum = 0;
	//	int x=0;
	//	int y=0;
		int[][] a = {{90,90},{80,80},{70,80},{90,70}};  //���� �г�, ���� �б� 
														//4X2
		for(int i=0; i<4;i++) {	 						//a.length	��
	//	x+=1;				
			for(int j=0; j<2; j++){						//a[i].length	��
				sum += a[i][j]; 						//s = s+a
	//			y +=1;  
			}
		}	
		int x =a.length;
		int y = a[0].length;
		System.out.println("����: "+sum);
		System.out.println("���: "+sum/(x*y));
		
	}

}
