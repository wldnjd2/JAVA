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
		System.out.println("이름: "+name);
		System.out.println("반: "+ban);
		System.out.println("번호: "+no);
		System.out.println("국어점수: "+kor);
		System.out.println("영어점수: "+eng);
		System.out.println("수학점수: "+math);
		System.out.println("총점: "+getTotal());
		System.out.println("평균: "+getAverage());	
	}
}

public class Code01 {

	public static void main(String[] args) {
			Student std = new Student("김지원",3,20,100,90,80);
			std.info();
		
			
		
	}

}
