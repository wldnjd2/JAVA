
package class0909_2;

public class Code09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d =3, e = 6; 
		System.out.println("사각형의 넓이 : " + (d*e));
		
		double f = d*e/2; 									//자동형변환
		System.out.println("삼각형의 넓이 : " + f);
		System.out.println();
		
		
		float a =40, b=30, c=10;
		System.out.println("성적의 평균 : " + ((a+b+c)/3));
		System.out.println();
		
		int m =100;
		System.out.println("월급이 100일때 연봉은 : " + m*12);
		System.out.println();
		
		int t = 286;
		System.out.println("286초 = "+ t/60 + "분 " + t%60 + "초");
		System.out.println();
		
		int x =10, y = 5;
		boolean z, l;
		z = (x>7) && (y<=5);
		l = (x%3==0) || (y%2 != 1);		
		System.out.println("(x>7) && (y<=5) => " + z);
		System.out.println("(x%3==0) || (y%2!=1) => " + l);
		System.out.println();
		
		int p = 534, s = 30;
		System.out.println("한명당 "+(p/s)+"개를 가질 수 있고,"+(p%s)+" 개가 남음" );
		System.out.println();
		
		int value = 356;
		System.out.println(value/100*100);
		
		//System.out.println();  sysout 하고 ctrl + 스페이스 하면 바로 쳐짐
	
	}

}
