package date0910;

public class Code05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ ���
		for(int z=2; z<10; z++) {
		System.out.println("������ " + z + "�� ���");
		System.out.println();
			for(int i=1; i<10; i++) {
				System.out.println(z+" x "+i +" = "+ z*i);
				if(i==9) System.out.println();			
			}
			
		}
	}

}

