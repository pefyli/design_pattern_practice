package design_pattern_practice.src.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import design_pattern_practice.src.main.Factory.TrainingFactory;
import design_pattern_practice.src.main.Factory.WarriorTrainingFactory;

public class FactoryTest {
  @Test
  public void factoryTest() {
	  TrainingFactory trainFactory = new WarriorTrainingFactory();
	  Assert.assertEquals(trainFactory.trainAdventurer().getType(), "Warrior");
  }
}
