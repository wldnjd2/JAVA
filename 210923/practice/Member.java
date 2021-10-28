package practice;
//3번문제
public class Member {
	
	
	Member() {}
	
	Member(String a, String b, String c, String d){
		setId(a);
		setPw(b);
		setName(c);
		setPhNum(d);
	}	

//이름과 전화번호 호출
	public void  prt(String e, String f){
		System.out.println("이름: "+e);
		System.out.println("전화번호: "+f);
	}
	
//필드 아이디 비밀번호 이름 전화번호
	private String id;
	private String pw;
	private String name;
	private String phNum;				

/////////////getter setter/////////////////////////
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhNum() {
		return phNum;
	}

	public void setPhNum(String phNum) {
		this.phNum = phNum;
	}
////////////////////////////////////////////////

	
}
