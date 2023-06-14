package design_pattern_practice.src.main.Singleton.NonThreadSafe;

public class NonThreadSafeSingleton {
    private static NonThreadSafeSingleton _instance;
	
    private NonThreadSafeSingleton() {

	}
 
    public static NonThreadSafeSingleton getInstance() {
    	if(_instance == null) {
    		_instance = new NonThreadSafeSingleton();
    	}
    	return _instance;
    }
}
