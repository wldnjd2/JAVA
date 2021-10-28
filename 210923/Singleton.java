package date0923;

public class Singleton {
private Singleton() {}								//생성자 선언
	private static Singleton s = new Singleton();	//객체 생성
	public static Singleton getInstance() {
		/*없어도됨 프로그램의 안전성을 위해서
		if(s==null) {				
			s = new Singleton();
		}*/		
		return s;//객체 주소 반환
		
	}
	private String field;
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field =  field;
	}//필드에 직접적으로 접근할 수 없기 때문에 get필드 set 필드 사용
}
