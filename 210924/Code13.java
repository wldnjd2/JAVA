package date0924;

//Product2
class Product {
	int price;
	int bonusPoint;
	
	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int) (price/10);
	}
}
//Buyer
class Buyer{
	Product[] cart = new Product[3];
	int money = 10000;
	int bonusPoint =0;
	int i;
	
	public void buy(Product p) {
		if(money <= p.price) {
			System.out.println("잔액이 부족하여 물건을 구매하실 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"을 구입하셨습니다.");
		add(p);
	}
	
	public void add(Product p) {
		
		if(i>= cart.length) {
			Product[] temp = new Product[cart.length*2];
			System.arraycopy(cart, 0, temp, 0, cart.length);
			cart = temp;
		}
		cart[i++] = p;
		return;
	}
	
	void summary() {
		String itemList ="";
		int sum =0;
		for(int i =0;i<cart.length;i++) {
			if(cart[i]==null)
				break;
			itemList += cart[i]+",";
			sum += cart[i].price;
		}
	System.out.println("구입한 물건: "+itemList);
	System.out.println("사용한 금액: "+sum);
	System.out.println("보너스 포인트: "+bonusPoint);
	System.out.println("남은 금액:"+money);
	
	}	
}

//Audio
class Audio extends Product {
	public Audio() {
		super(40);
	}
	public String toString() {
		return "Audio";
	}
}
//Computer
class Computer extends Product {
	public Computer() {
		super(300);
	}
	public String toString() {
		return "Computer";
	}

}
//Tv
class Tv extends Product{
	public Tv() {
		super(420);
	}
	public String toString() {
		return "Tv";
		
	}
}
//PlayStation
class PlayStation extends Product {
	public PlayStation() {
		super(120);
	}
	public String toString() {
		return "Play Station";
	}
}



//main
class Code13 {

	public static void main(String[] args) {
		Buyer casher = new Buyer();
		
		casher.buy(new Audio());
		casher.buy(new Tv());
		casher.buy(new Computer());
		casher.buy(new Tv());
		casher.buy(new Audio());
		casher.buy(new PlayStation());
		casher.buy(new Computer());
		casher.summary();
	}
}
