package date0924;
//�������̵� ����
//Person�� ��ӹ޴� Professor��� ���ο� Ŭ������ ����� 
//ProfessorŬ�������� getPhone() �޼ҵ带 ������ �϶�
//�׸��� �� �޼ҵ忡�� ���� Ŭ������ �޼ҵ带 ȣ��

class Person1 {
	String phone;
	
	String getPhone() {
		return phone;
	}
	void setPhone(String phone) {
		this.phone = phone;
	}
}

class Professor extends Person1 {
	@Override
	String getPhone(){	
	return "Professor getPhone: " + super.getPhone();
	}
}


public class Code07 {

	public static void main(String[] args) {
		Professor a = new Professor();
		a.setPhone("010-1234-1234");
		System.out.println(a.getPhone());
		Person1 p = a;									//Person1 p = new Professor();
		System.out.println(p.getPhone());				
	}

}
