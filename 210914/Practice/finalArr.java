package exam_date0914;

public class finalArr {
//8������
//�־��� �� �迭�� ���� ��ġ�� ���ڸ� ���ļ�
//�ϳ��� �迭�� ����ϴ� �޼���
	
	 int[] Arraysum (int[]arr1, int[]arr2) {				//����Ÿ���� �迭�̱� ������ �迭�� �ٲ������
		 int[] arrS;
		if(arr1.length == arr2.length) {					//�迭�� ���̰� ������
			arrS = new int[arr1.length];					//�������� �迭 ����
			for(int x = 0; x<arr1.length; x++) {
				arrS[x] = arr1[x] + arr2[x];
			}
		}
		else if(arr1.length > arr2.length) {				//arr1�� �迭�� ũ�Ⱑ �� ũ��
			arrS = new int[arr1.length];
				for(int x = 0; x<arr2.length; x++) {		//�������� ���̿� ���߱�
					arrS[x] = arr1[x] + arr2[x];
				}
				int a = arr1.length-arr2.length;         	 //�迭�� ���� ����       
				arrS[arr1.length-a] = arr1[arr1.length-a];	 //�ٸ� ��ġ�� �ִ� ���� �迭 arrS�� ����
		}
		else {
			
			arrS = new int[arr2.length];
			for(int x = 0; x<arr1.length; x++) {
				arrS[x] = arr1[x] + arr2[x];
			}
			int a = arr2.length-arr1.length;         
			arrS[arr2.length-a] = arr2[arr2.length-a];
		}
		return  arrS;
		
	}
}
