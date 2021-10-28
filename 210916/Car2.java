package date0916;

public class Car2 {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;						//필드	
		
	Car2(){   }
	Car2(String model){
		this.model= model;
	}
	Car2(String model, String color){
		this.model= model;
		this.color =color;
	}	
	Car2(String model,String color, int maxSpeed){	
		this.model= model;				//this.model의 model은 필드의 모델을 나타냄
		this.color =color;
		this.maxSpeed= maxSpeed;
	}
	//
}
