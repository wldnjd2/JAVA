package practice;

public class Code05 {
//����2-2��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student();						//��ü ����
		student1.name = "��浿";
		student1.ban = 3;
		student1.no = 17;
		student1.kor = 92;
		student1.eng = 63;
		student1.math = 74;
		
		System.out.println("�̸� :"+student1.name);
		System.out.println("���� : "+student1.getTotal());
		System.out.println("��� : "+student1.getAverage());
	
		
//2-3��		
		Student student2 = new Student("��浿",3,17,92,63,74);
		
		student1.info();
				
	}
}
