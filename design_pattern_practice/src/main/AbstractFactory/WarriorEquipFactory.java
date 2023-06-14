package design_pattern_practice.src.main.AbstractFactory;

public class WarriorEquipFactory implements EquipFactory{

	@Override
	public Weapon produceWeapon() {
		LongSword longSword = new LongSword();
		longSword.setAttack(10);
		longSword.setRange(1);
		return longSword;
	}

	@Override
	public Clothes produceClothes() {
		Armor armor = new Armor();
		armor.setDefense(10);
		return armor;
	}

}
