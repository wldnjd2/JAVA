
package class0909_2;

public class Code09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d =3, e = 6; 
		System.out.println("�簢���� ���� : " + (d*e));
		
		double f = d*e/2; 									//�ڵ�����ȯ
		System.out.println("�ﰢ���� ���� : " + f);
		System.out.println();
		
		
		float a =40, b=30, c=10;
		System.out.println("������ ��� : " + ((a+b+c)/3));
		System.out.println();
		
		int m =100;
		System.out.println("������ 100�϶� ������ : " + m*12);
		System.out.println();
		
		int t = 286;
		System.out.println("286�� = "+ t/60 + "�� " + t%60 + "��");
		System.out.println();
		
		int x =10, y = 5;
		boolean z, l;
		z = (x>7) && (y<=5);
		l = (x%3==0) || (y%2 != 1);		
		System.out.println("(x>7) && (y<=5) => " + z);
		System.out.println("(x%3==0) || (y%2!=1) => " + l);
		System.out.println();
		
		int p = 534, s = 30;
		System.out.println("�Ѹ�� "+(p/s)+"���� ���� �� �ְ�,"+(p%s)+" ���� ����" );
		System.out.println();
		
		int value = 356;
		System.out.println(value/100*100);
		
		//System.out.println();  sysout �ϰ� ctrl + �����̽� �ϸ� �ٷ� ����
	
	}

}
