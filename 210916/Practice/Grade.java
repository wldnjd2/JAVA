package practice;


public class Grade {
//7������
	private int math;
	private int science;
	private int english;
	float avr;

	
	Grade(int math, int science, int english ) {//������ �տ��� void�� ���̸� �ȵ� ������ ���ϰ� ����
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	
	float average(){
		avr = (float)(this.math+this.science+this.english)/3;
		return avr;
	}
}
