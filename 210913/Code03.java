package date0913;

public class Code03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {83, 90, 87};//�迭 ����� �ʱ�ȭ
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {				//length�ʵ� ���
			sum += scores[i];
		}
		System.out.println("���� : "+sum);
		double avg = (double) sum/scores.length;			//��� ��
		System.out.println("��� : "+avg);
	}

}

