package ch10_extends_interface.starcraft;

public class Marine extends StarUnit {
	
	public Marine() {
		this("마린", 6, 50, 0);
	}
	
	public Marine(String name, int damage, int hp, int armor) {
		super(name, damage, hp, armor);
	}
	
	public void stimpack() {
		System.out.println("우왕~!");
		// super. <- 부모 필드에 접근
		super.setHp(super.getHp() - 10);
		super.setDamage(getDamage() * 2); // 해당 인스턴스의 값만 바꿈
	}

	@Override
	public String toString() {
		return "Marine [getName()=" + getName() + ", getDamage()=" + getDamage() + ", getHp()=" + getHp()
				+ ", getArmor()=" + getArmor() + "]";
	}
	
}
