package date0913;

public class Code05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oldArray = {1, 2, 3};
		int[] newArray = new int[5];
		
		for(int i=0; i<oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}												//�迭 ����
		
		System.out.println("���ο� �迭 ��: ");
		for(int i=0; i<newArray.length; i++) {
			System.out.print(newArray[i]+ " ");
		}												//���ο� �迭�� ������ ���
	}

}
