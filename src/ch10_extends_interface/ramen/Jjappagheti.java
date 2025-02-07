package ch10_extends_interface.ramen;

public class Jjappagheti extends Ramen{
	
	public Jjappagheti(String name, int price) {
		super(name, price);
	}

	@Override
	public void printRecipe() {
		System.out.println("끓는 물에 면을 삶은 후 물은 버리고 스프를 비벼드세요!");
		System.out.println("tip! 스프를 비빌 때에는 물을 끄고 하시는 게 더욱 맛있게 즐길 수 있습니다! ! !");
	}

}
