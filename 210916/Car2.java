package date0916;

public class Car2 {
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;						//�ʵ�	
		
	Car2(){   }
	Car2(String model){
		this.model= model;
	}
	Car2(String model, String color){
		this.model= model;
		this.color =color;
	}	
	Car2(String model,String color, int maxSpeed){	
		this.model= model;				//this.model�� model�� �ʵ��� ���� ��Ÿ��
		this.color =color;
		this.maxSpeed= maxSpeed;
	}
	//
}
