package design_pattern_practice.src.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import design_pattern_practice.src.main.SimpleFactory.Adventurer;
import design_pattern_practice.src.main.SimpleFactory.TrainingSimpleFactory;

public class SimpleFactoryTest {
  @Test
  public void simpleFactoryTest() {
	  Adventurer adventurerA = TrainingSimpleFactory.trainAdventurer("warrior");
	  Assert.assertEquals(adventurerA.getType(), "Warrior");
  }
}