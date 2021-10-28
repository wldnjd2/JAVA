package date0914;

public class Code07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car();					 //myCar라는 객체 생성 
												 //myCar 안에 Car 메소드가 있는것
		int g = 5;
		myCar.SetGas(g);						 //가스를 5만큼 주입
										    	 //gas =5
		System.out.println("가스를 "+ g+" 넣었습니다.");
		
		boolean a = myCar.isLeftGas();				//가스가 얼마나 있는지 확인
													//가스가 있으면 a = true가 됨

		if(true) {									//가스가 있다면
			System.out.println("출발합니다.");
				myCar.run();						//자동차 동작
		}
													//가스가 없어서 자동차가 멈춤
	//	if(myCar.isLeftGas()) {						//가스 없는지 확인
	//		System.out.println("가스를 주입할 필요가 없습니다");
	//	}
	//	else 
			System.out.println("가스를 주입하세요.");

	}//main
}//class

