package cafe;

public class Coffee {
	
	// 필드
	private String korBeverage;
	private String engBeverage;
	private int price;
	
	public Coffee() {
	}

	public Coffee(String korBeverage, String engBeverage, int price) {
		this.korBeverage = korBeverage;
		this.engBeverage = engBeverage;
		this.price = price;
	}

	public String getKorBeverage() {
		return korBeverage;
	}

	public void setKorBeverage(String korBeverage) {
		this.korBeverage = korBeverage;
	}

	public String getEngBeverage() {
		return engBeverage;
	}

	public void setEngBeverage(String engBeverage) {
		this.engBeverage = engBeverage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "[" + korBeverage + "(" + engBeverage + ") : " + price + "원]";
	}
	
	
}
