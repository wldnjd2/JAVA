package practice;
//1번문제
public class Card {
	
	int num =1;
	boolean k =true;
	String c;
	String d;
			
	Card(int a, boolean b){						//생성자//객체 초기화//객체 생성시 단 한번만 실행
		num =a;									//3,false
		k =b;
	}	
	Card() {
	}	
	String info(){
		if(k == false) {
			c ="3";
			return c;
		}
		else { 	
			d = String.valueOf(num)+"K";		//string.valueof(num)//스트링으로 바꿔줌
			//d="1k";//틀림
			return d;							//조건에 따라서 리턴값이 바뀔수 있음
		}  
	}
}

//card1.info() =3
//card2.info()=1k