package date0928;

class Product{
	static String[] wishlist = {"TV","냉장고","세탁기","에어컨","컴퓨터","전자레인지"};
	
	public void rMethod(int a) {
		System.out.println("임의 선택 물품 : "+ wishlist[a]);
	}
	
	public void maxMethod(int index,int maxPrices){
		System.out.println("최고 비싼 물품 이름 : "+wishlist[index]);
		System.out.println("최고 비싼 물품 가격 : "+maxPrices);
		
	}
	public void puchasedMethod(int i){
		System.out.println("-"+wishlist[i]);
	}
}

public class Code02 { 
	public static void main(String[] args) {
		int prices[] = {240,250,120,75,100,25};
		Product product = new Product();
		
		//임의 선택 물품
		int num =(int)(Math.random()*6);//0<=x<6 012345
	
		//최고 비싼 물품
		int max=0;
		int index=0;
		for(int i=0; i<prices.length; i++) {
			if(max<prices[i]) {
				max = prices[i];
				index = i;	
			}
		}
		
		//평균보다 저렴한 물품
		int sum =0;
		float avr =0;
		for(int i=0; i<prices.length; i++) {
			sum += prices[i];
		}
		avr = sum/prices.length;
		
		//
		product.rMethod(num);
		product.maxMethod(index,max);
		System.out.println("평균보다 저렴한 물품 목록");
		for(int i=0; i<prices.length; i++) {
			if(avr>prices[i]) {
				product.puchasedMethod(i);
			}
		
		}
		
	}

}
