package date0923;

public class Code05 {

	public static void main(String[] args) {
		Child03 child = new Child03();// 객체 생성
		child.m();
	}	
}
//부모클래스
class Parent03 {
	public String lastName ="김";
	private String firstName = "지원";
	private void method() {
		System.out.println("나는 부모클래스 입니다.");
		
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
//자식클래스
class Child03 extends Parent03 {
	private String id = "Child";
	
	public void m() {
		System.out.print(super.lastName);
		//System.out.println(super.firstName); <-에러남: private는 클래스 간에 공유 안함
		System.out.print(super.getFirstName());
	
	}
}