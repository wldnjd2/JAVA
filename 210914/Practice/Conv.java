package exam_date0914;

public class Conv {
//9번 문제
//char[]배열을 전달받아 배열 속의 공백('')문자를 ','로 대치하는 메소드를 작성
	
	 void exch(char[] arr) {
	
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==' ') {
				arr[i]=',';
			}
		}
		for(int i=0;i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		
		}
	}
}
