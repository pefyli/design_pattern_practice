package design_pattern_practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleFactoryTest {
  @Test
  public void simpleFactoryTest() {
	  Adventurer adventurerA = TrainingSimpleFactory.trainAdventurer("warrior");
	  Assert.assertEquals(adventurerA.getType(), "Warrior");
  }
}