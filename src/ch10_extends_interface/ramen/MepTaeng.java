package ch10_extends_interface.ramen;

public class MepTaeng extends Ramen {

	public MepTaeng(String name, int price) {
		super(name, price);
	}

	@Override
	public void printRecipe() {
		System.out.println("끓는 물에 면과 스프를 넣고 4분 후에 드세요!!!");
		System.out.println("tip! 물은 550ml(한강라면은 430ml으로 즐겨요!");
		
	}
	
}
