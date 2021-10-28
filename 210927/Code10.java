package date0927;

interface OlderBrother{
	void playGame();
}

interface LittleBrother {
	void playSports();
}

interface MyBrother extends OlderBrother, LittleBrother {
	void playChess();
}

class Brotherhood implements MyBrother {
	public void playGame(){
		System.out.println("play game");
	}
	public void playSports() {
		System.out.println("play sports");
	}
	public void playChess() {
		System.out.println("play Chess");
	}
}

public class Code10 {
	public static void main(String[] args) {
		Brotherhood bro1 = new Brotherhood();
		Brotherhood bro2 = new Brotherhood();
		Brotherhood bro3 = new Brotherhood();
		Brotherhood bro4 = new Brotherhood();
		
		
		bro1.playGame();
		bro1.playSports();
		bro1.playChess();
		System.out.println("--------------------------------");
		
		bro2.playGame();
		System.out.println("--------------------------------");
		
		bro3.playSports();
		System.out.println("--------------------------------");
		
		bro4.playGame();
		bro4.playSports();
		bro4.playChess();
	}
}
