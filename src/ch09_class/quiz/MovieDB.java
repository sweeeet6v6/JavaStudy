package ch09_class.quiz;

import java.util.ArrayList;

public class MovieDB {
	
	private ArrayList<Movie> movieList = new ArrayList<>();
	
	// private 생성자 -> 해당 클래스에서만 생성할 수 있음
	// 인스턴스를 1개만 만들게 하는 방법으로, 최초에 한 번만 메모리에 할당하여
	// 메모리 낭비를 방지할 수 있고 단 하나의 객체로 존재해도 되는 클래스에 적용
	// 이와 같은 방법을 싱글톤 패턴이라고 한다.
	private MovieDB() {
		movieList.add(new Movie("신세계", "거 죽기 딱 좋은 날씨네", "박성웅", "ㅅㅅㄱ"));
		movieList.add(new Movie("기생충", "넌 계획이 다 있구나", "송강호", "ㄱㅅㅊ"));
	}
	
	// static <- 외부에서 사용할 수 있도록
	private static MovieDB instance = new MovieDB();
	
	public static MovieDB getInstance() {
		return instance;
	}
	
	public ArrayList<Movie> getMovieList(){
		return movieList;
	}

}
