package class0909;

public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;				//로컬변수 v1, v2
		int v2=0;					//
		
		if(v1>10) {	
			//int v2 = 0; 			//if문 블록에서 변수를 선언하게되면 if문 밖에서는 사용하지 못함
			v2 = v1-10;
			}
		
		int v3 = v1+ v2 +5; 		//v2변수를 if문 안에 선언하게 된다면 에러발생 									//
		System.out.println(v3);
	}

}
