package practice;
//3������
public class Member {
	
	
	Member() {}
	
	Member(String a, String b, String c, String d){
		setId(a);
		setPw(b);
		setName(c);
		setPhNum(d);
	}	

//�̸��� ��ȭ��ȣ ȣ��
	public void  prt(String e, String f){
		System.out.println("�̸�: "+e);
		System.out.println("��ȭ��ȣ: "+f);
	}
	
//�ʵ� ���̵� ��й�ȣ �̸� ��ȭ��ȣ
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
