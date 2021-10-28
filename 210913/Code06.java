package date0913;

public class Code06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oldArray = {1,2,3};
		int[] newArray = new int[5];
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		System.out.print("새로운 배열 값: ");
		for(int i =0; i<newArray.length; i++) {
			System.out.println(newArray[i]+" ");
		}
		/*int[] oldArray1 = {1,2,3};
		int[] newArray1 = new int[5];
		System.arraycopy(oldArray1, 0, newArray1, 1, oldArray1.length);
		System.out.print("새로운 배열 값: ");
		for(int j =0; j<newArray1.length; j++) {
			System.out.println(newArray1[j]+" ");
	}

}
