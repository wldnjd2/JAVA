package class0909;

public class VariableExchangeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =3;
		int y =5;
		
		System.out.println("x:" + x + ", y:" + y);
		
		int z = 3;
		x = y;								 //������ ���� �����ϱ�
		y = z;
		System.out.println("x:"+ x + ", y:" + y);

	}

}
