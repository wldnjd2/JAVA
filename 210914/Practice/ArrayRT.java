package exam_date0914;

public class ArrayRT {
	//5������
	//���� ū ���� ��ȯ�ϴ� �޼���
	//�迭�� ���ڸ� �о ��ȯ
	//
	
	int a(int[] array11) {//rt��� �޼��� ���� //�ż����� �Ű������� �迭//return���� int�̱⶧���� int�� ����
	int max = 0;
		
	for(int i=0; i<array11.length; i++) {
		if(max<array11[i]) {
		max = array11[i];	
		}//max�� �迭������ ũ��
		//if
		}//for
		
		
		return max;//�޼��� ���� ���� 
	}//a
}//class
