package design_pattern_practice.AbstractFactory;

public abstract class Clothes {
	protected int defense;
	
	public void display() {
		System.out.println(this.getClass().getSimpleName() + " defense = " + defense);
	}
	
	public int getDefense() {
		return this.defense;
	}
	
	public void setDefense(final int defense) {
		this.defense = defense;
	}
}
