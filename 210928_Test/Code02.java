package date0928;

class Product{
	static String[] wishlist = {"TV","�����","��Ź��","������","��ǻ��","���ڷ�����"};
	
	public void rMethod(int a) {
		System.out.println("���� ���� ��ǰ : "+ wishlist[a]);
	}
	
	public void maxMethod(int index,int maxPrices){
		System.out.println("�ְ� ��� ��ǰ �̸� : "+wishlist[index]);
		System.out.println("�ְ� ��� ��ǰ ���� : "+maxPrices);
		
	}
	public void puchasedMethod(int i){
		System.out.println("-"+wishlist[i]);
	}
}

public class Code02 { 
	public static void main(String[] args) {
		int prices[] = {240,250,120,75,100,25};
		Product product = new Product();
		
		//���� ���� ��ǰ
		int num =(int)(Math.random()*6);//0<=x<6 012345
	
		//�ְ� ��� ��ǰ
		int max=0;
		int index=0;
		for(int i=0; i<prices.length; i++) {
			if(max<prices[i]) {
				max = prices[i];
				index = i;	
			}
		}
		
		//��պ��� ������ ��ǰ
		int sum =0;
		float avr =0;
		for(int i=0; i<prices.length; i++) {
			sum += prices[i];
		}
		avr = sum/prices.length;
		
		//
		product.rMethod(num);
		product.maxMethod(index,max);
		System.out.println("��պ��� ������ ��ǰ ���");
		for(int i=0; i<prices.length; i++) {
			if(avr>prices[i]) {
				product.puchasedMethod(i);
			}
		
		}
		
	}

}
