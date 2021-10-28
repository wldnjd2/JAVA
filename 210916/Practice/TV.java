package practice;
//6번 문제
public class TV {
	String brand;
	int year;
	int inch;
	
	
	TV(String brand, int year, int inch){//생성자
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	void show(){
		System.out.println(brand+"에서 만든 "+year+"년형 "+inch+"인치 TV");
	}
}
