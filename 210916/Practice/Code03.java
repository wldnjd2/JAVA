package practice;

import java.util.Scanner;

public class Code03 {
//4번문제
//Book클래스를 활용하여
// 2개짜리 Book객체 배열을 만들고
//사용자로부터 책의 제목과 저자를 입력받아 배열완성
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] b = new Book[2];					//book객체 배열을 만들음
			
		for(int i=0; i<b.length; i++) {
			System.out.println("제목>>");
			String title = scan.nextLine();		//next가 공백을 인식하기 때문에 nextLine으로 해줘야함
			System.out.println("저자>>");
			String writer = scan.nextLine(); 				
			b[i] = new Book(title,writer); 									
		}						
		for(int i=0; i<b.length; i++) {
			//System.out.println(b[i]);   객체가 저장된 주소가 출력됨
			System.out.println("("+b[i].book +", "+ b[i].writer+")");
		}				
	}
}
