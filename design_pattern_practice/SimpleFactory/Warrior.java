package design_pattern_practice.SimpleFactory;

public class Warrior implements Adventurer{

	@Override
	public String getType() {
		return this.getClass().getSimpleName();
	}

}