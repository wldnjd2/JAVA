package practice;

//8번문제
//생성자2개 기본생성자와 매개변수로 모든 필드를 초기화하는 생성자
//노래 정보를 출력하는 show메소드
public class Song {
	
	int year;
	String country;
	String artist;
	String title;
	//필드
	
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
		System.out.println(year+"년 "+country+"의 "+artist+"가 부른 "+title);
	}
	
	
	
}
