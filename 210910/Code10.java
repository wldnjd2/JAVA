package date0910;

public class Code10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a~z까지 출력

		char a = 'a'; 						// 변수a도 문자a로 초기화 해줘야함
		do {
			System.out.print(a);
			a = (char) (a + 1); 			//형변환

		} while (a <= 'z');				    // 조건 확인
	}

}
