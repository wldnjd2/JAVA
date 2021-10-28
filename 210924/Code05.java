package date0924;

class ai{
	public String x() {
		return "ai.x";
	}
}
class bi extends ai{
	@Override
	public String x() {
		return "bi.x";
	}
	public String y() {
		return "y";
	}
}

class bi2 extends ai{
	@Override
	public String x() {
		return "bi2.x";
	}
}

public class Code05 {

	public static void main(String[] args) {
		ai ex =  new bi();
		ai ex2 = new bi2();
		System.out.println(ex.x());
		System.out.println(ex2.x());
	}

}
