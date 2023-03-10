package design_pattern_practice;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton _instance;
	
    private ThreadSafeSingleton() {

	}
 
    public static ThreadSafeSingleton getInstance() {
    	if(_instance == null) {
    		synchronized(ThreadSafeSingleton.class) {
    			if(_instance == null) {
    				_instance = new ThreadSafeSingleton();
    			}
    		}
    	}
    	return _instance;
    }
}
