package exam_date0914;

public class Conv {
//9�� ����
//char[]�迭�� ���޹޾� �迭 ���� ����('')���ڸ� ','�� ��ġ�ϴ� �޼ҵ带 �ۼ�
	
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
