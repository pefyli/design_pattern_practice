package design_pattern_practice.SimpleFactory;

public class TrainingSimpleFactory {
	public static Adventurer trainAdventurer(String type) {
		switch(type) {
			case "warrior":
				System.out.println("train a warrior");
				return new Warrior();
			default:
				return null;
		}
	}
}