package date0913;

public class Code01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {80, 90, 100};					//����� �ʱ�ȭ ���ÿ�
		
		System.out.println("score[0] : "+ score[0]);
		System.out.println("score[1] : "+ score[1]);
		System.out.println("score[2] : "+ score[2]);
		
		int sum = 0;
		int count = 0;
		for(int i=0; i<3; i++) {
			sum+=score[i];
			count ++;
		}
		System.out.println("���� : "+sum);
		double avg = (double)sum/count; 				//����� �ڵ���ȯ��
		System.out.println("��� : "+ avg);
	}

}
