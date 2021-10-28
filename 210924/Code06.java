package date0924;

class Object {
	public Object() {
	}
	public void draw() {
		System.out.println("Object draw");
	}
}
class Line extends Object {
	@Override
	public void draw() {
		System.out.println("Line draw");
	}
}
class Rect extends Object {
	@Override
	public void draw() {
		System.out.println("Rect draw");
	}
}
class Circle extends Object{
	@Override
	public void draw() {
		System.out.println("Circle draw");
	}
}

public class Code06 {

	public static void main(String[] args) {
		Object obj = new Object();
		Line line = new Line();
		Object p = new Line();
		Object r =line;
		obj.draw();
		line.draw();
		p.draw();
		r.draw();
		
		Object rect = new Rect();
		Object Circle = new Circle();
		rect.draw();
		Circle.draw();

	}

}
