package date0923;

public class Code02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s = Singleton.getInstance(); //반환된 주소를 s에 저장
		
		s.setField("안녕하세요");
		
		System.out.println(s.getField());
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2.getField());
	}

}
