package date0927;
//Ãß»ó Å¬·¡½º ¿¹Á¦
abstract class Animal{
	protected String kind;
	
	public Animal(String kind) {
		this.kind =kind;
	}
	public void breathe() {
		System.out.println("¼ûÀ» ½±´Ï´Ù");
	}
	public abstract void sound();
	
}

class Cat extends Animal{
	public Cat() {
		super("°í¾çÀÌ");
	}
	@Override
	public void sound() {
		System.out.println("¾ß¿Ë");
	}
}
class Dog extends Animal {
	public Dog() {
		super("°³");
	}
	@Override
	public void sound() {
		System.out.println("¸Û¸Û");
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
