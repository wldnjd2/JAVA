package practice;
//1������
public class Card {
	
	int num =1;
	boolean k =true;
	String c;
	String d;
			
	Card(int a, boolean b){						//������//��ü �ʱ�ȭ//��ü ������ �� �ѹ��� ����
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
			d = String.valueOf(num)+"K";		//string.valueof(num)//��Ʈ������ �ٲ���
			//d="1k";//Ʋ��
			return d;							//���ǿ� ���� ���ϰ��� �ٲ�� ����
		}  
	}
}

//card1.info() =3
//card2.info()=1k