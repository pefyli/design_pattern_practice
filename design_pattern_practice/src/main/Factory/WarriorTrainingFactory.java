package design_pattern_practice.src.main.Factory;

import design_pattern_practice.src.main.SimpleFactory.Adventurer;
import design_pattern_practice.src.main.SimpleFactory.Warrior;

public class WarriorTrainingFactory implements TrainingFactory{

	@Override
	public Adventurer trainAdventurer() {
		return new Warrior();
	}

}
