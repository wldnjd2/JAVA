package class0909;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float var2 = 3.14f;						 //float타입은 f를 붙여서 컴파일러가 float타입임을 나타내야함
		double var3 = 3.14;						
		float var4 = 0.123456789123456789f;    
		double var5 = 0.123456789123456789;		//float와 double의 메모리 허용 가능 범위가 달라서 결과값이 다름
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);

		double var6 = 3e6;						//e는 제곱  3*10^6
		float var7 = 3e6f;						//3*10^6
		double var8 = 2e-3;						//2*10^(-6)
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
	}

}
