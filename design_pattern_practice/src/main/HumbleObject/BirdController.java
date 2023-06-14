package design_pattern_practice.src.main.HumbleObject;

public class BirdController {
    private IBird ibird;
    
    public BirdController(IBird bird) {
    	ibird = bird;
    }
    
	public void move(int height) {
		if(height < ibird.getMaxHeight() && height > ibird.getMinHeight()) {
			ibird.setHeight(ibird.getHeight() + height);
		}
	}
}
