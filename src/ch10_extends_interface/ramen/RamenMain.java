package ch10_extends_interface.ramen;

public class RamenMain {

	public static void main(String[] args) {
		
//		Ramen ramen = new Ramen(); -> 추상 클래스는 객체로 만들 수 없음
		
		MepTaeng mep = new MepTaeng("맵탱", 1000);
		mep.printRecipe();
		
		Jjappagheti jja = new Jjappagheti("짜파게티", 1200);
		jja.printRecipe();

	}

}
