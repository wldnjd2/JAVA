package date0916;

public class Code11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 Car1 = new Car2();
		System.out.println("Car1.company: "+Car1.company);
		System.out.println();
		
		Car2 Car2 = new Car2("窖鸥其");
		System.out.println("Car2.company: "+Car2.company);
		System.out.println("Car2.company: "+Car2.model);
		System.out.println();

		Car2 Car3 = new Car2("酒馆都", "white");
		System.out.println("Car3.company: "+Car3.company);
		System.out.println("Car3.model: "+Car3.model);
		System.out.println("Car3.color: "+Car3.color);
		System.out.println();
		
		Car2 Car4 = new Car2("力匙矫胶","black",3000);
		System.out.println("Car4.company: "+Car4.company);
		System.out.println("Car4.model: "+Car4.model);
		System.out.println("Car4.color: "+Car4.color);
		System.out.println("Car4.maxSpeed: "+Car4.maxSpeed);
		System.out.println();
	}
//按眉 4俺 积己
}
