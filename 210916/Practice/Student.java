package practice;
//문제 2-1번, 2-3번
public class Student {
	String name;
	int ban;
	int	no;
	int kor;
	int eng;
	int math;
	
	int total;
	float avr;
	
	Student(){ 															//기본생성자	
	}
	
	Student(String name, int ban,int no,int kor,int eng, int math){		//생성자
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal(){
		this.total =this.kor+this.eng+this.math;
		return total;
	}
	float getAverage(){
		this.avr = this.total/3;
		return avr;
	} 
	
	void info() {
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
