package class0909_3;

public class Code06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		
		switch(grade) {
		case 'a':
		case 'A':
			System.out.println("우수회원입니다");
		    break;
		case 'b':
		case 'B':
			System.out.println("일반회원입니다");
			break;
		default:
			System.out.println("손님입니다");
		}
	}

}
