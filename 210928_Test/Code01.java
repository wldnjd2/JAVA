package date0928;


class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	public int getTotal(){
		int sum = this.kor+this.eng+this.math;	
		return sum;
	}
	
	public 
	float getAverage(){
		float avg = Math.round(getTotal()/3.0f*10)/10.0f;
		return avg;
	}
	
	public void info() {
		System.out.println("�̸�: "+name);
		System.out.println("��: "+ban);
		System.out.println("��ȣ: "+no);
		System.out.println("��������: "+kor);
		System.out.println("��������: "+eng);
		System.out.println("��������: "+math);
		System.out.println("����: "+getTotal());
		System.out.println("���: "+getAverage());	
	}
}

public class Code01 {

	public static void main(String[] args) {
			Student std = new Student("������",3,20,100,90,80);
			std.info();
		
			
		
	}

}
