package practice;
//6번문제
import java.util.Scanner;

public class Code04 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV myTV = new TV("LG",2017,32);//객체 생성 -> 생성자 호출
		//LG에서 만든 2017년 32인치
		myTV.show();
		
	}

}
