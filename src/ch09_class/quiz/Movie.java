package ch09_class.quiz;

public class Movie {
	
	private String title;  // 영화 제목
	private String quotes;  // 명대사
	private String actors;  // 배우
	private String word;    // 초성
	
	// 1. 기본 생성자(생성자 오버로딩 2)
	// 단축키 Shift + Alt + S
	public Movie() {
	}
	public Movie(String title, String quotes, String actors, String word) {
		this.title = title;
		this.quotes = quotes;
		this.actors = actors;
		this.word = word;
	}
	
	// 2. setter, getter 
	public String getTitle() {
		return title;
	}
	public void setTitles(String titles) {
		this.title = titles;
	}
	public String getQuotes() {
		return quotes;
	}
	public void setQuotes(String quotes) {
		this.quotes = quotes;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	
	// 3. toString
	@Override
	public String toString() {
		return "Movie [title=" + title + ", quotes=" + quotes + ", actors=" + actors + ", word=" + word + "]";
	}
	
	

	
	
}
