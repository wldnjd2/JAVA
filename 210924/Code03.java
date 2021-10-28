package date0924;

public class Code03 {
	public static void main(String[] args) {
		a ex = new b();
		ex.x();
		//ex.y();   에러발생
	}
}
class a {
	public String x() {
		return "x";
	}
}
class b extends a{
	public String y () {
		return "y";
	}
}