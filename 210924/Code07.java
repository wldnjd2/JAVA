package date0924;
//오버라이딩 예제
//Person을 상속받는 Professor라는 새로운 클래스를 만들고 
//Professor클래스에서 getPhone() 메소드를 재정의 하라
//그리고 이 메소드에서 슈퍼 클래스의 메소드를 호출

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
