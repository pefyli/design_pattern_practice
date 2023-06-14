package design_pattern_practice.src.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import design_pattern_practice.src.main.AbstractFactory.*;

public class AbstractFactoryTest {
  private EquipFactory equipFactory;
  @Test
  public void FactoryTest() {
     equipFactory = new WarriorEquipFactory();
     Clothes armor = equipFactory.produceClothes();
     Weapon sword = equipFactory.produceWeapon();

     Assert.assertEquals(10, armor.getDefense());
     Assert.assertEquals(10, sword.getAttack());
     Assert.assertEquals(1, sword.getRange());  
  }
}
