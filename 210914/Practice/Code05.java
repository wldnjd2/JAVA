package exam_date0914;

public class Code05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//8�� ����
//�־��� �� �迭�� ���� ��ġ�� ���ڸ� ���ļ� �ϳ��� �迭�� ����ϴ� �޼���
		int[] arr1 = {78,54,89,57,84};
		int[] arr2 = {95,74,91,84};
	
		finalArr a = new finalArr();//��ü ����
		int[] arr3 = a.Arraysum(arr1, arr2);
		
		System.out.print("���: ");
		for(int i = 0; i<arr3.length; i++) {
		System.out.print(arr3[i]+" ");
		}
	}

}
