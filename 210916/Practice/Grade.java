package practice;


public class Grade {
//7번문제
	private int math;
	private int science;
	private int english;
	float avr;

	
	Grade(int math, int science, int english ) {//생성자 앞에는 void를 붙이면 안됨 어차피 리턴값 없음
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	
	float average(){
		avr = (float)(this.math+this.science+this.english)/3;
		return avr;
	}
}
