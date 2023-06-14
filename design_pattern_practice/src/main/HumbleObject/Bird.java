package design_pattern_practice.src.main.HumbleObject;

public class Bird implements IBird {
	private int minHeight = 0;
	private int maxHeight = 20;
	private int height = 0;
	
	public Bird() {}	
	
	public Bird(int minHeight, int maxHeight, int height) {
		this.minHeight = minHeight;
		this.maxHeight = maxHeight;
		this.height = height;
	}

	@Override
	public int getHeight() {
		return this.height;
	}

	@Override
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void setMaxHeight(int maxHeight) {
		this.maxHeight = maxHeight;
	}

	@Override
	public int getMaxHeight() {
		return maxHeight;
	}

	@Override
	public void setMinHeight(int minHeight) {
		this.minHeight = minHeight;
	}

	@Override
	public int getMinHeight() {
		return minHeight;
	}
}
