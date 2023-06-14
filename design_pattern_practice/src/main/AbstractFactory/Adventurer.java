package design_pattern_practice.src.main.AbstractFactory;

public abstract class Adventurer {
	protected Weapon weapon;
	protected Clothes clothes;
	
	public abstract void display();
	
	public void setWeapon(Weapon weapon) {	
	}

	public void setClothes(Clothes clothes) {
	}
}
