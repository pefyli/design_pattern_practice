package design_pattern_practice.AbstractFactory;

public class Warrior extends Adventurer{

	@Override
	public void display() {
		weapon.display();
		clothes.display();
	}

	@Override
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	@Override
	public void setClothes(Clothes clothes) {	
		this.clothes = clothes;
	}

}
