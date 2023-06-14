package design_pattern_practice.src.main.AbstractFactory;

public interface EquipFactory {
	
    Weapon produceWeapon();
    
    Clothes produceClothes();
}
