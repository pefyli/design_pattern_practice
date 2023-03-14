package design_pattern_practice;

public class WarriorTrainingFactory implements TrainingFactory{

	@Override
	public Adventurer trainAdventurer() {
		return new Warrior();
	}

}
