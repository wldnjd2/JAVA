package date0916;

public class Code03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 =  new Car();
		Car car2 = new Car();			//��ü����
		
		System.out.println("������ ����: "+car1.color);
		System.out.println("������ ����: "+car2.color);
	
		System.out.println("======����������=======");
	
		car1.color = "black";
		car2.color = "pink";
		
		System.out.println("������ ����: "+car1.color);
		System.out.println("������ ����: "+car2.color);

	}

}
