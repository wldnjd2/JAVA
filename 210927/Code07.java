package date0927;
interface A{
	public void methodA();
	
}
interface B{
	public void methodB();
}
interface C extends A,B {
	public void methodC();
}

class implementationC implements C{
	public void methodA() {
		System.out.println("methodA 실체도 있어야 한다");
	}
	public void methodB() {
		System.out.println("methodB 실체도 있어야 한다");
	}
	public void methodC() {
		System.out.println("methodC 실체도 있어야 한다");
	}
}

public class Code07 {
	public static void main(String[] args) {
		implementationC impl = new implementationC();
		A ia = impl;
		ia.methodA();
		System.out.println();
	
		B ib = impl;
		ib.methodB();
		System.out.println();
	
		C ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}