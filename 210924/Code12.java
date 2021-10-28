package date0924;

class Product12 {
	int price;//��ǰ����
	int bonusPoint;//���ʽ�����
	
	Product12(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}
class Buyer{//������ ��� ���
	int money = 1000;//�����ݾ�
	int bonusPoint = 0;//������ ������ �޴� ����

	void buy(Product12 p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint +=p.bonusPoint;
		System.out.println(p.toString()+"��/�� �����ϼ̽��ϴ�.");
	}
}
//�ڽ�Ŭ����
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
	public String toString() {	//�����ε� �Ȱ�
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
		System.out.println("���� ���� ���� "+ buyer1.money +"���� �Դϴ�.");
		System.out.println("���� ���ʽ� ������ "+ buyer1.bonusPoint +"�� �Դϴ�.");
	}

}
