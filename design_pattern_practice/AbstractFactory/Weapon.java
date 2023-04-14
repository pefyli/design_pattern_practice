package design_pattern_practice.AbstractFactory;

public abstract class Weapon {
	protected int attack;
	protected int range;
	
	public void display() {
		System.out.println(this.getClass().getSimpleName() + " attack = " + attack + ", range = " + range);
	}
	
	public int getAttack() {
		return this.attack;
	}
	
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public int getRange() {
		return this.range;
	}
	
	public void setRange(int range) {
		this.range = range;
	}
}
