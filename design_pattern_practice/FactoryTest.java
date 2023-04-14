package design_pattern_practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import design_pattern_practice.Factory.TrainingFactory;
import design_pattern_practice.Factory.WarriorTrainingFactory;

public class FactoryTest {
  @Test
  public void factoryTest() {
	  TrainingFactory trainFactory = new WarriorTrainingFactory();
	  Assert.assertEquals(trainFactory.trainAdventurer().getType(), "Warrior");
  }
}
