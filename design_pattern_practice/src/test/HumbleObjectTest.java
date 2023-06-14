package design_pattern_practice.src.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import design_pattern_practice.src.main.HumbleObject.BirdController;
import design_pattern_practice.src.main.HumbleObject.IBird;
import design_pattern_practice.src.main.HumbleObject.MockBird;

public class HumbleObjectTest {
  @Test
  public void humbleTest() {
	  IBird ibird = new MockBird(0, 100, 5);
	  BirdController birdController = new BirdController(ibird);
	  birdController.move(15);
	  Assert.assertEquals(ibird.getHeight(), 20);
  }
}
