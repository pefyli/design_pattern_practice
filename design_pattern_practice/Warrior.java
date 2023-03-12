package design_pattern_practice;

public class Warrior implements Adventurer{

	@Override
	public String getType() {
		return this.getClass().getSimpleName();
	}

}