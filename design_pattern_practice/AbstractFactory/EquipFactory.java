package design_pattern_practice.AbstractFactory;

public interface EquipFactory {
	
    Weapon produceWeapon();
    
    Clothes produceClothes();
}
