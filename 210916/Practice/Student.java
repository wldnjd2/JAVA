package practice;
//���� 2-1��, 2-3��
public class Student {
	String name;
	int ban;
	int	no;
	int kor;
	int eng;
	int math;
	
	int total;
	float avr;
	
	Student(){ 															//�⺻������	
	}
	
	Student(String name, int ban,int no,int kor,int eng, int math){		//������
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
