package date0923;

public class Code05 {

	public static void main(String[] args) {
		Child03 child = new Child03();// ��ü ����
		child.m();
	}	
}
//�θ�Ŭ����
class Parent03 {
	public String lastName ="��";
	private String firstName = "����";
	private void method() {
		System.out.println("���� �θ�Ŭ���� �Դϴ�.");
		
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
//�ڽ�Ŭ����
class Child03 extends Parent03 {
	private String id = "Child";
	
	public void m() {
		System.out.print(super.lastName);
		//System.out.println(super.firstName); <-������: private�� Ŭ���� ���� ���� ����
		System.out.print(super.getFirstName());
	
	}
}