package date0924;

class Product12 {
	int price;//제품가격
	int bonusPoint;//보너스점수
	
	Product12(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}
class Buyer{//물건을 사는 사람
	int money = 1000;//소유금액
	int bonusPoint = 0;//물건을 샀을때 받는 점수

	void buy(Product12 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint +=p.bonusPoint;
		System.out.println(p.toString()+"을/를 구입하셨습니다.");
	}
}
//자식클래스
class Tv12 extends Product12 {
	Tv12(){
		super(100); 
	}
	public String toString() {
		return "Tv12";		
	}
}	
class Computer12 extends Product12 {
	Computer12(){
		super(200);
	}
	public String toString() {	//오버로딩 된고
		return "Computer12";
	}
}
class Audio extends Product12 {
	Audio(){
		super(300);
	}
	public String toString() {
		return "Audio";
	}
}
//main
public class Code12 {

	public static void main(String[] args) {
		Product12 tv = new Tv12();
		Product12 computer =new Computer12();
		Product12 audio = new Audio();
		Buyer buyer1 = new Buyer();
		buyer1.buy(tv);
		buyer1.buy(computer);
		System.out.println("현재 남은 돈은 "+ buyer1.money +"만원 입니다.");
		System.out.println("현재 보너스 점수는 "+ buyer1.bonusPoint +"점 입니다.");
	}

}
