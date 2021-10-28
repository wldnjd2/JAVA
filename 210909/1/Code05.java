package class0909;

public class Code05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch2 = 'A' + 1;
		int i2 = ch2;		//자동형변환 char->int 
		System.out.println(ch2); 	 //b
		System.out.println(i2);		 //유니코드 값
		
		double d2 =10.1;
		int i3 = (int)d2;			//강제형변환 double->int		
		System.out.println(d2);
		System.out.println(i3);
		
		byte bb = (byte)128;	    //byte의 범위는 -128~127 // 127을 넘어서 -128로 돌아옴
		byte bbb =(byte)130;  		//
		System.out.println(bb);
		System.out.println(bbb);
		
		String str= "Hello";
		System.out.println(str);
				
		
	}

}
