package design_pattern_practice.src.main.Factory;

import design_pattern_practice.src.main.SimpleFactory.Adventurer;

public interface TrainingFactory {
	/**
	 *The interface TrainingFacotry is a concept and standard, 
	 *the detail of implementation is implemented by subclass
	 **/
	public Adventurer trainAdventurer();
}