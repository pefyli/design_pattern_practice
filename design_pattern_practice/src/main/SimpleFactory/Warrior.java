package design_pattern_practice.src.main.SimpleFactory;

public class Warrior implements Adventurer{

	@Override
	public String getType() {
		return this.getClass().getSimpleName();
	}

}