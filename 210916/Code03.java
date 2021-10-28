package date0916;

public class Code03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 =  new Car();
		Car car2 = new Car();			//객체생성
		
		System.out.println("차량의 색상: "+car1.color);
		System.out.println("차량의 색상: "+car2.color);
	
		System.out.println("======차량도색후=======");
	
		car1.color = "black";
		car2.color = "pink";
		
		System.out.println("차량의 색상: "+car1.color);
		System.out.println("차량의 색상: "+car2.color);

	}

}
