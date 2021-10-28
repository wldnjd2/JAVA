package exam_date0914;

public class Code05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//8번 문제
//주어진 두 배열의 같은 위치의 숫자를 합쳐서 하나의 배열로 출력하는 메서드
		int[] arr1 = {78,54,89,57,84};
		int[] arr2 = {95,74,91,84};
	
		finalArr a = new finalArr();//객체 생성
		int[] arr3 = a.Arraysum(arr1, arr2);
		
		System.out.print("출력: ");
		for(int i = 0; i<arr3.length; i++) {
		System.out.print(arr3[i]+" ");
		}
	}

}
