package date0927;



class Driver{
	public void drive(Vehicle vehicle){
		vehicle.run();
	}
}

class Bus implements Vehicle{
	public void run(){
		System.out.println("버스가 달립니다");
	}
}
class Taxi implements Vehicle{
	public void run(){
		System.out.println("택시가 달립니다");
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
