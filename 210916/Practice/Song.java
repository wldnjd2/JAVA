package practice;

//8������
//������2�� �⺻�����ڿ� �Ű������� ��� �ʵ带 �ʱ�ȭ�ϴ� ������
//�뷡 ������ ����ϴ� show�޼ҵ�
public class Song {
	
	int year;
	String country;
	String artist;
	String title;
	//�ʵ�
	
	Song(int year, String country){
		this.year = year;
		this.country = country;
		
	}
	Song(int year, String country, String artist, String title){
		this(year, country);
		this.artist = artist;
		this.title = title;
	}
	
	void show(){
		System.out.println(year+"�� "+country+"�� "+artist+"�� �θ� "+title);
	}
	
	
	
}
