package date0924;

public class Code09 {

	public static void main(String[] args) {
		Parent parentA =  new Child();  		//Child�� ��ü�� Parent Ŭ������ ����
		method(parentA);
		
		Parent parentB = new Parent(); 			//Parent ��ü ����
		method(parentB);
	}
	
	public static void method(Parent parent) {
		if(parent instanceof Child) {		//parent��ü�� Child Ŭ������ ��ü�ΰ�?
			Child Child = (Child) parent;	//��������ȯ
			System.out.println("method1 - Child�� ��ȯ ����");
		}else {
			System.out.println("method1 - Child�� ��ȯ ����");
		}
	}
}
