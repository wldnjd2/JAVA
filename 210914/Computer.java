package date0914;

public class Computer {
	int sum1(int[] values) {				//sum1 �ż��� ����	//��ü�� ��
		int sum =0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	int sum2(int ...values) {				//sum2 �ż��� ����
		int sum=0;							//int ...values�迭�ε� ��ü�� �ȵ��� �迭�� �ν�
		for(int i=0;i<values.length;i++) {
			sum +=values[i];
		}
		return sum;
	}
}
