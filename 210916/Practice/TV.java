package practice;
//6�� ����
public class TV {
	String brand;
	int year;
	int inch;
	
	
	TV(String brand, int year, int inch){//������
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	void show(){
		System.out.println(brand+"���� ���� "+year+"���� "+inch+"��ġ TV");
	}
}
