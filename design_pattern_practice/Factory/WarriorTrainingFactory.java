package design_pattern_practice.Factory;

import design_pattern_practice.SimpleFactory.Adventurer;
import design_pattern_practice.SimpleFactory.Warrior;

public class WarriorTrainingFactory implements TrainingFactory{

	@Override
	public Adventurer trainAdventurer() {
		return new Warrior();
	}

}
