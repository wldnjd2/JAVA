package date0924;

public class Code04 {

	public static void main(String[] args) {
		ai ex =  new bi();
		System.out.println(ex.x());
	}

}
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