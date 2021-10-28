package packages;

public class Exam02Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		packages.Exam02 ex1 = new packages.Exam02();
		packages.dto.Exam02 ex2 = new packages.dto.Exam02();
		
		System.out.println("public"+ex1.field1);
		System.out.println("public"+ex1.field2);
		System.out.println("public"+ex1.field3);
	
		ex1.method1();
		ex1.method2();
		ex1.method3();
		
		System.out.println("public"+ex2.field1);
		System.out.println("public"+ex2.field2);
		System.out.println("public"+ex2.field3);
	
		ex1.method1();
		ex1.method2();
		ex1.method3();
		
	}

}
