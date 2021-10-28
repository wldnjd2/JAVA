package date0927;



class Driver{
	public void drive(Vehicle vehicle){
		vehicle.run();
	}
}

class Bus implements Vehicle{
	public void run(){
		System.out.println("������ �޸��ϴ�");
	}
}
class Taxi implements Vehicle{
	public void run(){
		System.out.println("�ýð� �޸��ϴ�");
	}
}

interface Vehicle{
	public void run();
}

public class Code06 {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);


	}

}
