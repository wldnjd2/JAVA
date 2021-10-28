package date0927;
//�߻� Ŭ���� ����
abstract class Animal{
	protected String kind;
	
	public Animal(String kind) {
		this.kind =kind;
	}
	public void breathe() {
		System.out.println("���� ���ϴ�");
	}
	public abstract void sound();
	
}

class Cat extends Animal{
	public Cat() {
		super("�����");
	}
	@Override
	public void sound() {
		System.out.println("�߿�");
	}
}
class Dog extends Animal {
	public Dog() {
		super("��");
	}
	@Override
	public void sound() {
		System.out.println("�۸�");
	}
}
public class Code02 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
	}

}
