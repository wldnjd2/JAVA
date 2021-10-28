package class0909;

public class VariableExchangeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =3;
		int y =5;
		
		System.out.println("x:" + x + ", y:" + y);
		
		int z = 3;
		x = y;								 //변수에 변수 저장하기
		y = z;
		System.out.println("x:"+ x + ", y:" + y);

	}

}
