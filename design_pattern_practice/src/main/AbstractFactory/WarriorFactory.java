package design_pattern_practice.src.main.AbstractFactory;


public class WarriorFactory implements TrainingFactory{
	private static EquipFactory factory = new WarriorEquipFactory();

	@Override
	public Adventurer trainAdventurer() {
		Warrior warrior = new Warrior();
		warrior.setWeapon(factory.produceWeapon());
		warrior.setClothes(factory.produceClothes());
		return warrior;
	}
}
