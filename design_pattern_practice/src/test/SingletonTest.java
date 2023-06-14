package design_pattern_practice.src.test;

import java.util.HashSet;
import java.util.Set;
import org.testng.Assert;
import org.testng.annotations.Test;

import design_pattern_practice.src.main.Singleton.ThreadSafe.ThreadSafeSingleton;

public class SingletonTest extends Thread {
	static Set<Integer> code = new HashSet<>();
	
    public void run() {
		ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
		SingletonTest.code.add(singleton.hashCode());
	}

	@Test
	public void threadSafeTest() throws InterruptedException {

		Thread th1 = new SingletonTest();
		Thread th2 = new SingletonTest();

		//Race-condition in that the state when printing depends on 
		//the execution speed of the two independent threads. 
		//adding sleep(100) to make sure we get hashcode
		th1.start();
		sleep(1000);
		
		th2.start();
		sleep(1000);
		
		//make sure we don't have duplicates in the hash code set.
		Assert.assertEquals(code.size(), 1);
		
	}
}
