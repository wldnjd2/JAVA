package class0909;

public class Code05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch2 = 'A' + 1;
		int i2 = ch2;		//�ڵ�����ȯ char->int 
		System.out.println(ch2); 	 //b
		System.out.println(i2);		 //�����ڵ� ��
		
		double d2 =10.1;
		int i3 = (int)d2;			//��������ȯ double->int		
		System.out.println(d2);
		System.out.println(i3);
		
		byte bb = (byte)128;	    //byte�� ������ -128~127 // 127�� �Ѿ -128�� ���ƿ�
		byte bbb =(byte)130;  		//
		System.out.println(bb);
		System.out.println(bbb);
		
		String str= "Hello";
		System.out.println(str);
				
		
	}

}
