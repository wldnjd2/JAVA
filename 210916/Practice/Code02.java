package practice;

public class Code02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//3������
//��ü 5���� ������ �迭�� �����ϰ� 
//��ü �������� 0~4���� ���� ������ 
//������ ���	
		//Circle a = new Circle();//���� a�� ����
		//int[] Array = new int[5];
		//������ �ƴϰ� ��ü�� �迭 ���ÿ� ���� ����
				
		Circle[] a = new Circle[5];			//a �迭 ����, �ʱ�ȭ�� ���� ������
		for(int i=0; i<a.length; i++) {
			a[i] = new	Circle(i);			//��ü ����, ��ü ���� �迭�� �־���
		}									//��ü �����ϸ� ������ ȣ��
											//i�� ������
		for(int i=0;i<a.length;i++)	{
			System.out.println("������"+i+"  " +"���� ���� : "+a[i].width);			
		}		
	}
}
