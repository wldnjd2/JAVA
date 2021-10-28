package packages;
import packages.dto.TestDto;

import packages.vo.TestVo;
public class Main03 {
//TestDto와 TestVo는 다른 패키지
//TestDto는 퍼블릭 클래스   모든 패키지
//TestVo는 디폴트 클래스  같은 패키지
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDto testdto = new TestDto();
		TestVo testvo = new TestVo();				//에러남
	}

}
