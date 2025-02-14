package cafe;

public class Coffee {
	
	// 필드
	private static String korBeverage;
	private static String engBeverage;
	private static int price;
	
	public Coffee() {
	}

	public Coffee(String korBeverage, String engBeverage, int price) {
		this.korBeverage = korBeverage;
		this.engBeverage = engBeverage;
		this.price = price;
	}

	public static String getKorBeverage() {
		return korBeverage;
	}

	public static void setKorBeverage(String korBeverage) {
		Coffee.korBeverage = korBeverage;
	}

	public static String getEngBeverage() {
		return engBeverage;
	}

	public static void setEngBeverage(String engBeverage) {
		Coffee.engBeverage = engBeverage;
	}

	public static int getPrice() {
		return price;
	}

	public static void setPrice(int price) {
		Coffee.price = price;
	}
	
	
}
