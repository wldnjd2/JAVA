package date0910;

public class Code03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1���� 10���� ���ϱ�
		int i, sum;
		sum = 0;
		
		for(i=1;i<10;i++) {
			System.out.print(i+ "+");   //9+
			sum+=i;
			
			if(i==9) {
			i+=1; //i=10
			sum+=i;//sum =sum+10
			System.out.println(i+ "=" +sum); 
			}	
				
		}//for�� ��
	}
	
}//1+2+3+4+5+6+7+8+9+10=?

